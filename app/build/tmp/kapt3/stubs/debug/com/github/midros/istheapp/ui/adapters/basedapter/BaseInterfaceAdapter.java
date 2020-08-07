package com.github.midros.istheapp.ui.adapters.basedapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\'J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\rH&J\b\u0010\u000f\u001a\u00020\rH&\u00a8\u0006\u0010"}, d2 = {"Lcom/github/midros/istheapp/ui/adapters/basedapter/BaseInterfaceAdapter;", "T", "Lcom/firebase/ui/database/ChangeEventListener;", "Landroidx/lifecycle/LifecycleObserver;", "getItem", "position", "", "(I)Ljava/lang/Object;", "getRef", "Lcom/google/firebase/database/DatabaseReference;", "getSnapshots", "Lcom/firebase/ui/database/ObservableSnapshotArray;", "startFilter", "", "startListening", "stopListening", "app_debug"})
public abstract interface BaseInterfaceAdapter<T extends java.lang.Object> extends com.firebase.ui.database.ChangeEventListener, androidx.lifecycle.LifecycleObserver {
    
    public abstract void startListening();
    
    public abstract void stopListening();
    
    public abstract void startFilter();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    public abstract com.firebase.ui.database.ObservableSnapshotArray<T> getSnapshots();
    
    @androidx.annotation.NonNull()
    public abstract T getItem(int position);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    public abstract com.google.firebase.database.DatabaseReference getRef(int position);
}