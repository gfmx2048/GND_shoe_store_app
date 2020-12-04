package com.udacity.shoestore.repositories

import com.udacity.shoestore.models.User

/**
 * A singleton userRepository so we can keep temporary in memory our user.
 * This repository should be responsible in the future to get The user from our Local Db,SharedPreferences or from an online DB.
 * It will be used as our single source of truth
 */
object UserRepository {
    var user = User() // Init a user. Not logged in yet
}