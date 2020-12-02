package com.udacity.shoestore.screens

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.udacity.shoestore.R

class ShoeListFragmentDirections private constructor() {
    companion object {
        fun actionShoeListFragmentToShoeDetailsFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_shoeListFragment_to_shoeDetailsFragment)
    }
}
