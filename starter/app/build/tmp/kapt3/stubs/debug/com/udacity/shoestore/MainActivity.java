package com.udacity.shoestore;

import java.lang.System;

/**
 * Will be used only as a container for the fragments and responsible for listening liveData that are common between the fragments. Like hide keyboard or display a Toast
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0010"}, d2 = {"Lcom/udacity/shoestore/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "mNavController", "Landroidx/navigation/NavController;", "mViewModel", "Lcom/udacity/shoestore/viewmodels/MainActivityViewModel;", "getMViewModel", "()Lcom/udacity/shoestore/viewmodels/MainActivityViewModel;", "mViewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "subscribeToLiveData", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private androidx.navigation.NavController mNavController;
    private final kotlin.Lazy mViewModel$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.udacity.shoestore.viewmodels.MainActivityViewModel getMViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void subscribeToLiveData() {
    }
    
    public MainActivity() {
        super();
    }
}