package com.udacity.shoestore

import android.app.Activity
import android.content.Context
import android.text.TextUtils
import android.util.Patterns
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.fragment.app.Fragment

/**
 * Extension function that hides the keyboard on a Fragment
 */
fun Fragment.hideKeyboard() {
    view?.let { activity?.hideKeyboard(it) }
}

/**
 * Extension function that hides the keyboard on an Activity
 */
fun Activity.hideKeyboard() {
    if (currentFocus == null) View(this) else currentFocus?.let { hideKeyboard(it) }
}

/**
 * Extension function that hides the keyboard, use from fragment and activity [hideKeyboard]
 */
fun Context.hideKeyboard(view: View) {
    val inputMethodManager = getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
    inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
}

/**
 * Extension function that checks the validity of an email address
 */
fun String?.isValidEmail() = if(this==null) false else !TextUtils.isEmpty(this) && Patterns.EMAIL_ADDRESS.matcher(this).matches()