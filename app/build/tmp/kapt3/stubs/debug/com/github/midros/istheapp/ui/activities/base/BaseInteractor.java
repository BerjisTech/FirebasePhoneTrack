package com.github.midros.istheapp.ui.activities.base;

import java.lang.System;

/**
 * Created by luis rafael on 9/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\u000f\u001a\u00020\u0007H\u0016J\b\u0010\u0010\u001a\u00020\fH\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\u000f\u0010\u0012\u001a\u0004\u0018\u00018\u0000H\u0016\u00a2\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\fH\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0015\u0010\u001a\u001a\u00020\u00162\u0006\u0010\r\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u001bJ\u0016\u0010\u001c\u001a\u00020\u00162\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016J\b\u0010 \u001a\u00020\u0016H\u0016J\u0010\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\fH\u0016J\b\u0010#\u001a\u00020\u0016H\u0016J\u0010\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010\'\u001a\u00020\u0016H\u0016J\b\u0010(\u001a\u00020\u0016H\u0016J\b\u0010)\u001a\u00020\u0016H\u0016J\n\u0010*\u001a\u0004\u0018\u00010+H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00018\u0000X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000e\u00a8\u0006,"}, d2 = {"Lcom/github/midros/istheapp/ui/activities/base/BaseInteractor;", "V", "Lcom/github/midros/istheapp/ui/activities/base/InterfaceView;", "Lcom/github/midros/istheapp/ui/activities/base/InterfaceInteractor;", "supportFragment", "Landroidx/fragment/app/FragmentManager;", "context", "Landroid/content/Context;", "firebase", "Lcom/github/midros/istheapp/data/rxFirebase/InterfaceFirebase;", "(Landroidx/fragment/app/FragmentManager;Landroid/content/Context;Lcom/github/midros/istheapp/data/rxFirebase/InterfaceFirebase;)V", "isMultiSelect", "", "view", "Lcom/github/midros/istheapp/ui/activities/base/InterfaceView;", "getContext", "getMultiSelected", "getSupportFragmentManager", "getView", "()Lcom/github/midros/istheapp/ui/activities/base/InterfaceView;", "isNullView", "notifyDataSetChanged", "", "notifyItemChanged", "position", "", "onAttach", "(Lcom/github/midros/istheapp/ui/activities/base/InterfaceView;)V", "onDeleteData", "data", "", "Lcom/github/midros/istheapp/data/model/DataDelete;", "onDetach", "setMultiSelected", "selected", "setRecyclerAdapter", "setSearchQuery", "query", "", "startRecyclerAdapter", "stopRecyclerAdapter", "stopRecyclerAdapterQuery", "user", "Lcom/google/firebase/auth/FirebaseUser;", "app_debug"})
public class BaseInteractor<V extends com.github.midros.istheapp.ui.activities.base.InterfaceView> implements com.github.midros.istheapp.ui.activities.base.InterfaceInteractor<V> {
    private V view;
    private boolean isMultiSelect;
    private androidx.fragment.app.FragmentManager supportFragment;
    private android.content.Context context;
    private com.github.midros.istheapp.data.rxFirebase.InterfaceFirebase firebase;
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    V view) {
    }
    
    @java.lang.Override()
    public void onDetach() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public V getView() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isNullView() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.fragment.app.FragmentManager getSupportFragmentManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.github.midros.istheapp.data.rxFirebase.InterfaceFirebase firebase() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.google.firebase.auth.FirebaseUser user() {
        return null;
    }
    
    @java.lang.Override()
    public void setMultiSelected(boolean selected) {
    }
    
    @java.lang.Override()
    public boolean getMultiSelected() {
        return false;
    }
    
    @java.lang.Override()
    public void onDeleteData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.github.midros.istheapp.data.model.DataDelete> data) {
    }
    
    @java.lang.Override()
    public void setRecyclerAdapter() {
    }
    
    @java.lang.Override()
    public void startRecyclerAdapter() {
    }
    
    @java.lang.Override()
    public void stopRecyclerAdapter() {
    }
    
    @java.lang.Override()
    public void notifyDataSetChanged() {
    }
    
    @java.lang.Override()
    public void notifyItemChanged(int position) {
    }
    
    @java.lang.Override()
    public void setSearchQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    @java.lang.Override()
    public void stopRecyclerAdapterQuery() {
    }
    
    @javax.inject.Inject()
    public BaseInteractor(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager supportFragment, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.github.midros.istheapp.data.rxFirebase.InterfaceFirebase firebase) {
        super();
    }
}