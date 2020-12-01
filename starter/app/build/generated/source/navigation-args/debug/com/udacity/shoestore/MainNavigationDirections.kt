package com.udacity.shoestore

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

class MainNavigationDirections private constructor() {
    companion object {
        fun actionLogout(): NavDirections = ActionOnlyNavDirections(R.id.action_logout)
    }
}
