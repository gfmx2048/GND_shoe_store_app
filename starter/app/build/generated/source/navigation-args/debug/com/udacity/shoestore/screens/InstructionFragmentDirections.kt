package com.udacity.shoestore.screens

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.udacity.shoestore.MainNavigationDirections
import com.udacity.shoestore.R

class InstructionFragmentDirections private constructor() {
    companion object {
        fun actionInstructionFragmentToShoeListFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_instructionFragment_to_shoeListFragment)

        fun actionLogout(): NavDirections = MainNavigationDirections.actionLogout()
    }
}
