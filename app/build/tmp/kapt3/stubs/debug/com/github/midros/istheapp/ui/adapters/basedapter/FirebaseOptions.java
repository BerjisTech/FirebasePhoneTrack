package com.github.midros.istheapp.ui.adapters.basedapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\fB\u001f\b\u0002\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\r"}, d2 = {"Lcom/github/midros/istheapp/ui/adapters/basedapter/FirebaseOptions;", "T", "", "snapshots", "Lcom/firebase/ui/database/ObservableSnapshotArray;", "owner", "Landroidx/lifecycle/LifecycleOwner;", "(Lcom/firebase/ui/database/ObservableSnapshotArray;Landroidx/lifecycle/LifecycleOwner;)V", "getOwner", "()Landroidx/lifecycle/LifecycleOwner;", "getSnapshots", "()Lcom/firebase/ui/database/ObservableSnapshotArray;", "Builder", "app_debug"})
public final class FirebaseOptions<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private final com.firebase.ui.database.ObservableSnapshotArray<T> snapshots = null;
    @org.jetbrains.annotations.Nullable()
    private final androidx.lifecycle.LifecycleOwner owner = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.firebase.ui.database.ObservableSnapshotArray<T> getSnapshots() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.LifecycleOwner getOwner() {
        return null;
    }
    
    private FirebaseOptions(com.firebase.ui.database.ObservableSnapshotArray<T> snapshots, androidx.lifecycle.LifecycleOwner owner) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005JI\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0016\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00120\u0014\"\u0004\u0018\u00010\u0012\u00a2\u0006\u0002\u0010\u0015R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/github/midros/istheapp/ui/adapters/basedapter/FirebaseOptions$Builder;", "T", "", "()V", "mOwner", "Landroidx/lifecycle/LifecycleOwner;", "mSnapshots", "Lcom/firebase/ui/database/ObservableSnapshotArray;", "build", "Lcom/github/midros/istheapp/ui/adapters/basedapter/FirebaseOptions;", "setLifecycleOwner", "owner", "setQuery", "query", "Lcom/google/firebase/database/Query;", "modelClass", "Ljava/lang/Class;", "filter", "", "child", "", "(Lcom/google/firebase/database/Query;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/String;)Lcom/github/midros/istheapp/ui/adapters/basedapter/FirebaseOptions$Builder;", "app_debug"})
    public static final class Builder<T extends java.lang.Object> {
        private com.firebase.ui.database.ObservableSnapshotArray<T> mSnapshots;
        private androidx.lifecycle.LifecycleOwner mOwner;
        
        @org.jetbrains.annotations.NotNull()
        public final com.github.midros.istheapp.ui.adapters.basedapter.FirebaseOptions.Builder<T> setQuery(@org.jetbrains.annotations.NotNull()
        com.google.firebase.database.Query query, @org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass, @org.jetbrains.annotations.Nullable()
        java.lang.String filter, @org.jetbrains.annotations.NotNull()
        java.lang.String... child) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.github.midros.istheapp.ui.adapters.basedapter.FirebaseOptions.Builder<T> setLifecycleOwner(@org.jetbrains.annotations.Nullable()
        androidx.lifecycle.LifecycleOwner owner) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.github.midros.istheapp.ui.adapters.basedapter.FirebaseOptions<T> build() {
            return null;
        }
        
        public Builder() {
            super();
        }
    }
}