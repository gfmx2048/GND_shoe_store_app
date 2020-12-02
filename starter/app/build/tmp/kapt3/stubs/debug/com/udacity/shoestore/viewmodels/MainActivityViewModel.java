package com.udacity.shoestore.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u001fJ\u0006\u0010!\u001a\u00020\u001fJ\u0006\u0010\"\u001a\u00020\u001fJ\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020\u00072\u0006\u0010\'\u001a\u00020%H\u0002J\u0006\u0010(\u001a\u00020\u001fR\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0019\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0013\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u000eR \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006)"}, d2 = {"Lcom/udacity/shoestore/viewmodels/MainActivityViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_closeFrag", "Landroidx/lifecycle/MutableLiveData;", "", "_error", "", "_hideKeyboard", "_newShoeLD", "Lcom/udacity/shoestore/models/Shoe;", "closeFrag", "Landroidx/lifecycle/LiveData;", "getCloseFrag", "()Landroidx/lifecycle/LiveData;", "error", "getError", "hideKeyboard", "getHideKeyboard", "newShoe", "getNewShoe", "()Lcom/udacity/shoestore/models/Shoe;", "newShoeLD", "getNewShoeLD", "shoes", "", "getShoes", "()Ljava/util/List;", "setShoes", "(Ljava/util/List;)V", "clearClose", "", "clearError", "clearHideKeyboard", "close", "createRandomShoes", "numberOfShoes", "", "getRandomString", "length", "saveShoe", "app_debug"})
public final class MainActivityViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.udacity.shoestore.models.Shoe> shoes;
    @org.jetbrains.annotations.NotNull()
    private final com.udacity.shoestore.models.Shoe newShoe = null;
    private final androidx.lifecycle.MutableLiveData<com.udacity.shoestore.models.Shoe> _newShoeLD = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _error = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _closeFrag = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _hideKeyboard = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.udacity.shoestore.models.Shoe> getShoes() {
        return null;
    }
    
    public final void setShoes(@org.jetbrains.annotations.NotNull()
    java.util.List<com.udacity.shoestore.models.Shoe> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.udacity.shoestore.models.Shoe getNewShoe() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.udacity.shoestore.models.Shoe> getNewShoeLD() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getCloseFrag() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getHideKeyboard() {
        return null;
    }
    
    private final java.util.List<com.udacity.shoestore.models.Shoe> createRandomShoes(int numberOfShoes) {
        return null;
    }
    
    private final java.lang.String getRandomString(int length) {
        return null;
    }
    
    public final void saveShoe() {
    }
    
    public final void clearError() {
    }
    
    public final void close() {
    }
    
    public final void clearClose() {
    }
    
    public final void clearHideKeyboard() {
    }
    
    public MainActivityViewModel() {
        super();
    }
}