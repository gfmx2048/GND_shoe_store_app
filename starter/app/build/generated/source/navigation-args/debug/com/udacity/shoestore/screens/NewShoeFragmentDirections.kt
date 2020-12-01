package com.udacity.shoestore.screens

import androidx.navigation.NavDirections
import com.udacity.shoestore.MainNavigationDirections

class NewShoeFragmentDirections private constructor() {
    companion object {
        fun actionLogout(): NavDirections = MainNavigationDirections.actionLogout()
    }
}
