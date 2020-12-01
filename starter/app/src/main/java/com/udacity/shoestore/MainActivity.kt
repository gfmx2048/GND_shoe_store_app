package com.udacity.shoestore

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavAction
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.udacity.shoestore.databinding.ActivityMainBinding
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    private lateinit var mNavController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        val toolbar = binding.toolbar
        setSupportActionBar(toolbar)
        mNavController = this.findNavController(R.id.nav_host_fragment)
        val appBarConfiguration = AppBarConfiguration(mNavController.graph)
//        mNavController.addOnDestinationChangedListener { controller, destination, _ ->
//            if(destination == controller.graph.findNode(R.id.shoeListFragment)){
//                    Timber.d("1")
//            }else{
//                Timber.d("0")
//            }
//        }

        toolbar.setupWithNavController(mNavController,appBarConfiguration)

    }
}
