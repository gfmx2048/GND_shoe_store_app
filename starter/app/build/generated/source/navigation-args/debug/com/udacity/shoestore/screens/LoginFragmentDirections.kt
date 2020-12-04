package com.udacity.shoestore.screens

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.udacity.shoestore.R

public class LoginFragmentDirections private constructor() {
  public companion object {
    public fun actionLoginFragmentToWelcomeFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_loginFragment_to_welcomeFragment)
  }
}
