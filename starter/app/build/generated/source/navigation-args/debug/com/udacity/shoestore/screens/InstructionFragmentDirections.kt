package com.udacity.shoestore.screens

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.udacity.shoestore.R

public class InstructionFragmentDirections private constructor() {
  public companion object {
    public fun actionInstructionFragmentToShoeListFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_instructionFragment_to_shoeListFragment)
  }
}
