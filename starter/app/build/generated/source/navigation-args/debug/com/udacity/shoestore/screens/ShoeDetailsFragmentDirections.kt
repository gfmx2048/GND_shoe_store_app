package com.udacity.shoestore.screens

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.udacity.shoestore.R

class ShoeDetailsFragmentDirections private constructor() {
    companion object {
        fun actionShoeDetailsFragmentToShoeListFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_shoeDetailsFragment_to_shoeListFragment)
    }
}
