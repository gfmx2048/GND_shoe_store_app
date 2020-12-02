package com.udacity.shoestore.screens

import android.content.Context
import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentShoeDetailsBinding
import com.udacity.shoestore.databinding.FragmentShoeListBinding
import com.udacity.shoestore.viewmodels.MainActivityViewModel
import kotlinx.android.synthetic.main.list_item_shoe.view.*

class ShoeListFragment : Fragment() {
    private val mViewModel: MainActivityViewModel by activityViewModels()
    private lateinit var mBinding: FragmentShoeListBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        mBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_shoe_list, container, false)
        setHasOptionsMenu(true)
        mBinding.fab.setOnClickListener{findNavController().navigate(ShoeListFragmentDirections.actionShoeListFragmentToShoeDetailsFragment())}
        subscribeToLiveData()
        return mBinding.root
    }

    private fun subscribeToLiveData() {
        mViewModel.shoes.observe(viewLifecycleOwner, Observer {
            mBinding.llShoesContainer.removeAllViews()
            val inflater = requireActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            it.forEach { shoe->
                val listItemShoe: View = inflater.inflate(R.layout.list_item_shoe, null)
                listItemShoe.apply {
                    tv_name.text = shoe.name
                    tv_company.text = shoe.company
                    tv_description.text = shoe.description
                    tv_size.text = shoe.size.toString()
                }
                mBinding.llShoesContainer.addView(listItemShoe)
            }
            mBinding.invalidateAll()
        })
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.main_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item, findNavController()) || super.onOptionsItemSelected(item)
    }
}