package com.udacity.shoestore.screens

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.udacity.shoestore.R

public class ShoeDetailsFragmentDirections private constructor() {
  public companion object {
    public fun actionShoeDetailsFragmentToShoeListFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_shoeDetailsFragment_to_shoeListFragment)
  }
}
