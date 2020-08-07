package com.github.midros.istheapp.ui.activities.base;

import java.lang.System;

/**
 * Created by luis rafael on 9/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\u000f\u0010\f\u001a\u0004\u0018\u00018\u0000H&\u00a2\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\tH&J\b\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0015\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0016J\u0016\u0010\u0017\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H&J\b\u0010\u001b\u001a\u00020\u0010H&J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\tH&J\b\u0010\u001e\u001a\u00020\u0010H&J\u0010\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020!H&J\b\u0010\"\u001a\u00020\u0010H&J\b\u0010#\u001a\u00020\u0010H&J\b\u0010$\u001a\u00020\u0010H&J\n\u0010%\u001a\u0004\u0018\u00010&H&\u00a8\u0006\'"}, d2 = {"Lcom/github/midros/istheapp/ui/activities/base/InterfaceInteractor;", "V", "Lcom/github/midros/istheapp/ui/activities/base/InterfaceView;", "", "firebase", "Lcom/github/midros/istheapp/data/rxFirebase/InterfaceFirebase;", "getContext", "Landroid/content/Context;", "getMultiSelected", "", "getSupportFragmentManager", "Landroidx/fragment/app/FragmentManager;", "getView", "()Lcom/github/midros/istheapp/ui/activities/base/InterfaceView;", "isNullView", "notifyDataSetChanged", "", "notifyItemChanged", "position", "", "onAttach", "view", "(Lcom/github/midros/istheapp/ui/activities/base/InterfaceView;)V", "onDeleteData", "data", "", "Lcom/github/midros/istheapp/data/model/DataDelete;", "onDetach", "setMultiSelected", "selected", "setRecyclerAdapter", "setSearchQuery", "query", "", "startRecyclerAdapter", "stopRecyclerAdapter", "stopRecyclerAdapterQuery", "user", "Lcom/google/firebase/auth/FirebaseUser;", "app_debug"})
public abstract interface InterfaceInteractor<V extends com.github.midros.istheapp.ui.activities.base.InterfaceView> {
    
    public abstract void onAttach(@org.jetbrains.annotations.NotNull()
    V view);
    
    public abstract void onDetach();
    
    @org.jetbrains.annotations.Nullable()
    public abstract V getView();
    
    public abstract boolean isNullView();
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.Context getContext();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.fragment.app.FragmentManager getSupportFragmentManager();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.github.midros.istheapp.data.rxFirebase.InterfaceFirebase firebase();
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.google.firebase.auth.FirebaseUser user();
    
    public abstract void setMultiSelected(boolean selected);
    
    public abstract boolean getMultiSelected();
    
    public abstract void onDeleteData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.github.midros.istheapp.data.model.DataDelete> data);
    
    public abstract void setRecyclerAdapter();
    
    public abstract void startRecyclerAdapter();
    
    public abstract void stopRecyclerAdapter();
    
    public abstract void notifyDataSetChanged();
    
    public abstract void notifyItemChanged(int position);
    
    public abstract void setSearchQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String query);
    
    public abstract void stopRecyclerAdapterQuery();
}