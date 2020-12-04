package com.udacity.shoestore.screens

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.*
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.bumptech.glide.Glide
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentShoeListBinding
import com.udacity.shoestore.models.Shoe
import com.udacity.shoestore.viewmodels.MainActivityViewModel
import kotlinx.android.synthetic.main.list_item_shoe.view.*
import timber.log.Timber

class ShoeListFragment : Fragment() {
    private val mViewModel: MainActivityViewModel by activityViewModels()
    private lateinit var mBinding: FragmentShoeListBinding
    private lateinit var mInflater: LayoutInflater

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        mBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_shoe_list, container, false)
        setHasOptionsMenu(true)
        mBinding.fab.setOnClickListener{findNavController().navigate(ShoeListFragmentDirections.actionShoeListFragmentToShoeDetailsFragment())}
        populateLayoutWithShoes()
        Timber.d("---------------- OnCreateView -------------")
        subscribeToLiveData()
        return mBinding.root
    }

    private fun populateLayoutWithShoes() {
        mInflater = requireActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        mViewModel.shoes.forEach {addViewToLayout(it)}
        mBinding.invalidateAll()
    }

    private fun subscribeToLiveData() {
        mViewModel.newShoeLD.observe(viewLifecycleOwner, {
            addViewToLayout(it)
        })
    }

    @SuppressLint("InflateParams")
    private fun addViewToLayout(shoe: Shoe){
        val listItemShoe: View = mInflater.inflate(R.layout.list_item_shoe, null)
        listItemShoe.apply {
            tv_name.text = shoe.name
            tv_company.text = shoe.company
            tv_description.text = shoe.description
            tv_size.text = shoe.size.toString()
            Glide.with(requireActivity().applicationContext).load(ContextCompat.getDrawable(requireContext(),shoe.images[0]))
        }
        mBinding.llShoesContainer.addView(listItemShoe)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.main_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item, findNavController()) || super.onOptionsItemSelected(item)
    }
}