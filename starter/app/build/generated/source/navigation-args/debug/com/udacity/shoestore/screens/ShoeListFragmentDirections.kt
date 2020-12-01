package com.udacity.shoestore.screens

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.udacity.shoestore.MainNavigationDirections
import com.udacity.shoestore.R

class ShoeListFragmentDirections private constructor() {
    companion object {
        fun actionShoeListFragmentToNewShoeFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_shoeListFragment_to_newShoeFragment)

        fun actionLogout(): NavDirections = MainNavigationDirections.actionLogout()
    }
}
