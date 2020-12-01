package com.udacity.shoestore.screens

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.udacity.shoestore.MainNavigationDirections
import com.udacity.shoestore.R

class WelcomeFragmentDirections private constructor() {
    companion object {
        fun actionWelcomeFragmentToInstructionFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_welcomeFragment_to_instructionFragment)

        fun actionLogout(): NavDirections = MainNavigationDirections.actionLogout()
    }
}
