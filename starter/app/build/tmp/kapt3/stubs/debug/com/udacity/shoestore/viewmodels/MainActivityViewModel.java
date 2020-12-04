package com.udacity.shoestore.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010%\u001a\u00020&J\u0006\u0010\'\u001a\u00020&J\u0006\u0010(\u001a\u00020&J\u0006\u0010)\u001a\u00020&J\u0006\u0010*\u001a\u00020&J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001c2\u0006\u0010,\u001a\u00020\u0007H\u0002J\u0010\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0007H\u0002J\u0006\u00100\u001a\u00020&J\u0006\u00101\u001a\u00020&J\u0006\u00102\u001a\u00020&R\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0019\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u000fR\u0019\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0016\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u000fR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\"\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$\u00a8\u00063"}, d2 = {"Lcom/udacity/shoestore/viewmodels/MainActivityViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_closeFrag", "Landroidx/lifecycle/MutableLiveData;", "", "_error", "", "_hideKeyboard", "_login", "_newShoeLD", "Lcom/udacity/shoestore/models/Shoe;", "closeFrag", "Landroidx/lifecycle/LiveData;", "getCloseFrag", "()Landroidx/lifecycle/LiveData;", "error", "getError", "hideKeyboard", "getHideKeyboard", "login", "getLogin", "newShoe", "getNewShoe", "()Lcom/udacity/shoestore/models/Shoe;", "newShoeLD", "getNewShoeLD", "shoes", "", "getShoes", "()Ljava/util/List;", "setShoes", "(Ljava/util/List;)V", "user", "Lcom/udacity/shoestore/models/User;", "getUser", "()Lcom/udacity/shoestore/models/User;", "clearClose", "", "clearError", "clearHideKeyboard", "clearLogin", "close", "createRandomShoes", "numberOfShoes", "getRandomString", "", "length", "loginAlreadyExistingUser", "loginUser", "saveShoe", "app_debug"})
public final class MainActivityViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.udacity.shoestore.models.Shoe> shoes;
    @org.jetbrains.annotations.NotNull()
    private final com.udacity.shoestore.models.User user = null;
    @org.jetbrains.annotations.NotNull()
    private final com.udacity.shoestore.models.Shoe newShoe = null;
    private final androidx.lifecycle.MutableLiveData<com.udacity.shoestore.models.Shoe> _newShoeLD = null;
    
    /**
     * We are going to return the resource id of the string, so as to avoid passing context in viewModel.
     * We could extend :AndroidViewModel and get the applicationContext if it was necessary
     */
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _error = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _closeFrag = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _hideKeyboard = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _login = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.udacity.shoestore.models.Shoe> getShoes() {
        return null;
    }
    
    public final void setShoes(@org.jetbrains.annotations.NotNull()
    java.util.List<com.udacity.shoestore.models.Shoe> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.udacity.shoestore.models.User getUser() {
        return null;
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
    public final androidx.lifecycle.LiveData<java.lang.Integer> getError() {
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
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getLogin() {
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
    
    public final void clearLogin() {
    }
    
    public final void loginUser() {
    }
    
    public final void loginAlreadyExistingUser() {
    }
    
    public MainActivityViewModel() {
        super();
    }
}