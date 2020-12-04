package com.udacity.shoestore.screens

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.udacity.shoestore.R

public class WelcomeFragmentDirections private constructor() {
  public companion object {
    public fun actionWelcomeFragmentToInstructionFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_welcomeFragment_to_instructionFragment)
  }
}
