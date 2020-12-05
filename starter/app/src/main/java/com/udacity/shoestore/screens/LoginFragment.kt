package com.udacity.shoestore.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentLoginBinding
import com.udacity.shoestore.viewmodels.MainActivityViewModel

/**
 * First fragment of the flow. I have created 2 different layouts, for portrait and landscape mode with constrainLayout.
 */
class LoginFragment : Fragment() {
    private val mViewModel: MainActivityViewModel by activityViewModels()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val binding: FragmentLoginBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_login, container, false)
        binding.viewModel = mViewModel
        binding.lifecycleOwner = this
        subscribeToLiveData()
        return binding.root
    }

    private fun subscribeToLiveData() {
        mViewModel.login.observe(viewLifecycleOwner, {
            it?.let {
                if(it) {
                    findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToWelcomeFragment())
                }
                //Clear the response so when we return back here the livedata won't be called again
                mViewModel.clearLogin()
            }
        })
    }
}