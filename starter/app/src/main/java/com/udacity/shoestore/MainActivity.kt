package com.udacity.shoestore

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.udacity.shoestore.databinding.ActivityMainBinding
import com.udacity.shoestore.viewmodels.MainActivityViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var mNavController: NavController
    private val mViewModel: MainActivityViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        val toolbar = binding.toolbar
        setSupportActionBar(toolbar)
        mNavController = this.findNavController(R.id.nav_host_fragment)
        val appBarConfiguration = AppBarConfiguration(mNavController.graph)
        toolbar.setupWithNavController(mNavController, appBarConfiguration)
        subscribeToLiveData()
    }

    private fun subscribeToLiveData() {
        //This observer will observer the errors from the {LoginFragment.kt} and the {ShoeDetailFragment.kt}
        //Another way was each fragment observes it's errors.
        mViewModel.error.observe(this, {
            it?.let {
                Toast.makeText(this, getString(it), Toast.LENGTH_SHORT).show()
                mViewModel.clearError()
            }
        })

        //Sam as above
        mViewModel.hideKeyboard.observe(this, {
            it?.let {
                if(it) {
                    hideKeyboard()
                    mViewModel.clearHideKeyboard()
                }
            }
        })
    }
}
