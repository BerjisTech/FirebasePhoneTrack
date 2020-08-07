package com.github.midros.istheapp.ui.adapters.basedapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00020\u00042\b\u0012\u0004\u0012\u0002H\u00010\u0005B\u0015\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0015\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\nH\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016J\u001d\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00028\u00012\u0006\u0010\u0012\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u001aJ%\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00028\u00012\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u001cJ(\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\nH\u0016J\b\u0010$\u001a\u00020\u000eH\u0016J\u0010\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\'H\u0016J\u0015\u0010(\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00028\u0001H\u0016\u00a2\u0006\u0002\u0010)J\b\u0010*\u001a\u00020\u000eH\u0016J\b\u0010+\u001a\u00020\u000eH\u0017J\b\u0010,\u001a\u00020\u000eH\u0017J\u0014\u0010-\u001a\u00020\u000e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lcom/github/midros/istheapp/ui/adapters/basedapter/BaseAdapter;", "T", "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/github/midros/istheapp/ui/adapters/basedapter/BaseInterfaceAdapter;", "options", "Lcom/github/midros/istheapp/ui/adapters/basedapter/FirebaseOptions;", "(Lcom/github/midros/istheapp/ui/adapters/basedapter/FirebaseOptions;)V", "lastPosition", "", "mSnapshots", "Lcom/firebase/ui/database/ObservableSnapshotArray;", "cleanup", "", "source", "Landroidx/lifecycle/LifecycleOwner;", "getItem", "position", "(I)Ljava/lang/Object;", "getItemCount", "getRef", "Lcom/google/firebase/database/DatabaseReference;", "getSnapshots", "onBindViewHolder", "holder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "model", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/lang/Object;)V", "onChildChanged", "type", "Lcom/firebase/ui/common/ChangeEventType;", "snapshot", "Lcom/google/firebase/database/DataSnapshot;", "newIndex", "oldIndex", "onDataChanged", "onError", "e", "Lcom/google/firebase/database/DatabaseError;", "onViewDetachedFromWindow", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "startFilter", "startListening", "stopListening", "updateOptions", "app_debug"})
public abstract class BaseAdapter<T extends java.lang.Object, VH extends androidx.recyclerview.widget.RecyclerView.ViewHolder> extends androidx.recyclerview.widget.RecyclerView.Adapter<VH> implements com.github.midros.istheapp.ui.adapters.basedapter.BaseInterfaceAdapter<T> {
    private int lastPosition;
    private com.firebase.ui.database.ObservableSnapshotArray<T> mSnapshots;
    private com.github.midros.istheapp.ui.adapters.basedapter.FirebaseOptions<T> options;
    
    @java.lang.Override()
    @androidx.lifecycle.OnLifecycleEvent(value = androidx.lifecycle.Lifecycle.Event.ON_START)
    public void startListening() {
    }
    
    @java.lang.Override()
    @androidx.lifecycle.OnLifecycleEvent(value = androidx.lifecycle.Lifecycle.Event.ON_STOP)
    public void stopListening() {
    }
    
    @androidx.lifecycle.OnLifecycleEvent(value = androidx.lifecycle.Lifecycle.Event.ON_DESTROY)
    public final void cleanup(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner source) {
    }
    
    @java.lang.Override()
    public void onChildChanged(@org.jetbrains.annotations.NotNull()
    com.firebase.ui.common.ChangeEventType type, @org.jetbrains.annotations.NotNull()
    com.google.firebase.database.DataSnapshot snapshot, int newIndex, int oldIndex) {
    }
    
    @java.lang.Override()
    public void onDataChanged() {
    }
    
    @java.lang.Override()
    public void startFilter() {
    }
    
    @java.lang.Override()
    public void onError(@org.jetbrains.annotations.NotNull()
    com.google.firebase.database.DatabaseError e) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.firebase.ui.database.ObservableSnapshotArray<T> getSnapshots() {
        return null;
    }
    
    @java.lang.Override()
    public T getItem(int position) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.google.firebase.database.DatabaseReference getRef(int position) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void updateOptions(@org.jetbrains.annotations.NotNull()
    com.github.midros.istheapp.ui.adapters.basedapter.FirebaseOptions<T> options) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    VH holder, int position) {
    }
    
    @java.lang.Override()
    public void onViewDetachedFromWindow(@org.jetbrains.annotations.NotNull()
    VH holder) {
    }
    
    public abstract void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    VH holder, int position, T model);
    
    public BaseAdapter(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    com.github.midros.istheapp.ui.adapters.basedapter.FirebaseOptions<T> options) {
        super();
    }
}