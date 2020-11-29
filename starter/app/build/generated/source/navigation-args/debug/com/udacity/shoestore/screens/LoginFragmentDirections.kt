package com.udacity.shoestore.screens

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.udacity.shoestore.R

class LoginFragmentDirections private constructor() {
    companion object {
        fun actionLoginFragmentToWelcomeFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_loginFragment_to_welcomeFragment)
    }
}
