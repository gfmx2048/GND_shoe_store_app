package com.udacity.shoestore;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0006\u001a\f\u0010\u0007\u001a\u00020\b*\u0004\u0018\u00010\t\u00a8\u0006\n"}, d2 = {"hideKeyboard", "", "Landroid/app/Activity;", "Landroid/content/Context;", "view", "Landroid/view/View;", "Landroidx/fragment/app/Fragment;", "isValidEmail", "", "", "app_debug"})
public final class ExtensionsKt {
    
    /**
     * Extension function that hides the keyboard on a Fragment
     */
    public static final void hideKeyboard(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$hideKeyboard) {
    }
    
    /**
     * Extension function that hides the keyboard on an Activity
     */
    public static final void hideKeyboard(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$hideKeyboard) {
    }
    
    /**
     * Extension function that hides the keyboard, use from fragment and activity [hideKeyboard]
     */
    public static final void hideKeyboard(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$hideKeyboard, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    /**
     * Extension function that checks the validity of an email address
     */
    public static final boolean isValidEmail(@org.jetbrains.annotations.Nullable()
    java.lang.String $this$isValidEmail) {
        return false;
    }
}