package com.udacity.shoestore.screens

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.udacity.shoestore.R

public class ShoeListFragmentDirections private constructor() {
  public companion object {
    public fun actionShoeListFragmentToShoeDetailsFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_shoeListFragment_to_shoeDetailsFragment)
  }
}
