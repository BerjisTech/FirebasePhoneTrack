package com.github.midros.istheapp.services.base;

import java.lang.System;

/**
 * Created by luis rafael on 22/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u000f\u0010\b\u001a\u0004\u0018\u00018\u0000H&\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH&J\u0015\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\rH&J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0012H&\u00a8\u0006\u0013"}, d2 = {"Lcom/github/midros/istheapp/services/base/InterfaceInteractorService;", "S", "Lcom/github/midros/istheapp/services/base/InterfaceService;", "", "firebase", "Lcom/github/midros/istheapp/data/rxFirebase/InterfaceFirebase;", "getContext", "Landroid/content/Context;", "getService", "()Lcom/github/midros/istheapp/services/base/InterfaceService;", "isNullService", "", "onAttach", "", "service", "(Lcom/github/midros/istheapp/services/base/InterfaceService;)V", "onDetach", "user", "Lcom/google/firebase/auth/FirebaseUser;", "app_debug"})
public abstract interface InterfaceInteractorService<S extends com.github.midros.istheapp.services.base.InterfaceService> {
    
    public abstract void onAttach(@org.jetbrains.annotations.NotNull()
    S service);
    
    public abstract void onDetach();
    
    @org.jetbrains.annotations.Nullable()
    public abstract S getService();
    
    public abstract boolean isNullService();
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.Context getContext();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.github.midros.istheapp.data.rxFirebase.InterfaceFirebase firebase();
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.google.firebase.auth.FirebaseUser user();
}