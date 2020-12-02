package com.udacity.shoestore.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentShoeDetailsBinding
import com.udacity.shoestore.viewmodels.MainActivityViewModel

class ShoeDetailsFragment : Fragment() {

    private val mViewModel: MainActivityViewModel by activityViewModels()
    private lateinit var mBinding: FragmentShoeDetailsBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        mBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_shoe_details, container, false)
        mBinding.btSdCreate.setOnClickListener {
            validateTextsAndSave()
        }
        mBinding.btSdCancel.setOnClickListener{findNavController().navigate(ShoeDetailsFragmentDirections.actionShoeDetailsFragmentToShoeListFragment())}
        return mBinding.root
    }

    private fun validateTextsAndSave() {
        if(mBinding.etSdName.text.toString().isEmpty()){
            Toast.makeText(requireContext(),"Please add a shoe name",Toast.LENGTH_SHORT).show()
            return
        }

        if(mBinding.etSdCompany.text.toString().isEmpty()){
            Toast.makeText(requireContext(),"Please add a company",Toast.LENGTH_SHORT).show()
            return
        }

        if(mBinding.etSdDescription.text.toString().isEmpty()){
            Toast.makeText(requireContext(),"Please add a description",Toast.LENGTH_SHORT).show()
            return
        }

        //I will use a check for europeans size here :)
        if(mBinding.etSdSize.text.toString().toDouble() < 20.0){
            Toast.makeText(requireContext(),"Please add a valid shoe size",Toast.LENGTH_SHORT).show()
            return
        }

        mViewModel.saveShoe(mBinding.etSdName.text.toString(),mBinding.etSdCompany.text.toString(),mBinding.etSdDescription.text.toString(),mBinding.etSdSize.text.toString().toDouble())
        findNavController().popBackStack()
    }
}