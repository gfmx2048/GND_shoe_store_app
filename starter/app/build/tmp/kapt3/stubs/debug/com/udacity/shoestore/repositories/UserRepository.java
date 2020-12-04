package com.udacity.shoestore.repositories;

import java.lang.System;

/**
 * A singleton userRepository so we can keep temporary in memory our user.
 * This repository should be responsible in the future to get The user from our Local Db,SharedPreferences or from an online DB.
 * It will be used as our single source of truth
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/udacity/shoestore/repositories/UserRepository;", "", "()V", "user", "Lcom/udacity/shoestore/models/User;", "getUser", "()Lcom/udacity/shoestore/models/User;", "setUser", "(Lcom/udacity/shoestore/models/User;)V", "app_debug"})
public final class UserRepository {
    @org.jetbrains.annotations.NotNull()
    private static com.udacity.shoestore.models.User user;
    @org.jetbrains.annotations.NotNull()
    public static final com.udacity.shoestore.repositories.UserRepository INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.udacity.shoestore.models.User getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.NotNull()
    com.udacity.shoestore.models.User p0) {
    }
    
    private UserRepository() {
        super();
    }
}