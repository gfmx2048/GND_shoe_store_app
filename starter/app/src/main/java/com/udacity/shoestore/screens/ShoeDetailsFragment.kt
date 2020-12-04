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
import timber.log.Timber

class ShoeDetailsFragment : Fragment() {

    private val mViewModel: MainActivityViewModel by activityViewModels()
    private lateinit var mBinding: FragmentShoeDetailsBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        mBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_shoe_details, container, false)
        mBinding.viewModel = mViewModel

        // Specify the current activity as the lifecycle owner of the binding. This is used so that
        // the binding can observe LiveData updates
        mBinding.lifecycleOwner = this
        Timber.d("---------------- OnCreateView Details -------------")
        subscribeToLiveData()
        return mBinding.root
    }

    private fun subscribeToLiveData() {
        mViewModel.closeFrag.observe(viewLifecycleOwner, {
            it?.let {
                if(it){
                    findNavController().navigateUp()
                    mViewModel.clearClose()
                }
            }
        })
    }
}