package com.github.midros.istheapp.ui.adapters.basedapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u00032\u00020\u0004B=\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\f\"\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u0002J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u0002J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u0019H\u0014J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u001a\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u00132\b\u0010 \u001a\u0004\u0018\u00010\nH\u0017J\u001a\u0010!\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u00132\b\u0010 \u001a\u0004\u0018\u00010\nH\u0017J\u001a\u0010\"\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u00132\b\u0010 \u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010#\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u0013H\u0016J\b\u0010$\u001a\u00020\u001bH\u0014J\u0010\u0010%\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u0013H\u0016J\b\u0010&\u001a\u00020\u001bH\u0014R\u001d\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\f\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/github/midros/istheapp/ui/adapters/basedapter/FirebaseArray;", "T", "Lcom/firebase/ui/database/ObservableSnapshotArray;", "Lcom/google/firebase/database/ChildEventListener;", "Lcom/google/firebase/database/ValueEventListener;", "mQuery", "Lcom/google/firebase/database/Query;", "parser", "Lcom/firebase/ui/database/SnapshotParser;", "filter", "", "child", "", "(Lcom/google/firebase/database/Query;Lcom/firebase/ui/database/SnapshotParser;Ljava/lang/String;[Ljava/lang/String;)V", "getChild", "()[Ljava/lang/String;", "[Ljava/lang/String;", "mSnapshots", "Ljava/util/ArrayList;", "Lcom/google/firebase/database/DataSnapshot;", "getIndexForKey", "", "key", "getIndexKey", "getSnapshots", "", "onCancelled", "", "error", "Lcom/google/firebase/database/DatabaseError;", "onChildAdded", "snapshot", "previousChildKey", "onChildChanged", "onChildMoved", "onChildRemoved", "onCreate", "onDataChange", "onDestroy", "app_debug"})
public final class FirebaseArray<T extends java.lang.Object> extends com.firebase.ui.database.ObservableSnapshotArray<T> implements com.google.firebase.database.ChildEventListener, com.google.firebase.database.ValueEventListener {
    private final java.util.ArrayList<com.google.firebase.database.DataSnapshot> mSnapshots = null;
    private final com.google.firebase.database.Query mQuery = null;
    private final java.lang.String filter = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String[] child = null;
    
    @java.lang.Override()
    protected void onCreate() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @android.annotation.SuppressLint(value = {"DefaultLocale"})
    @java.lang.Override()
    public void onChildAdded(@org.jetbrains.annotations.NotNull()
    com.google.firebase.database.DataSnapshot snapshot, @org.jetbrains.annotations.Nullable()
    java.lang.String previousChildKey) {
    }
    
    @android.annotation.SuppressLint(value = {"DefaultLocale"})
    @java.lang.Override()
    public void onChildChanged(@org.jetbrains.annotations.NotNull()
    com.google.firebase.database.DataSnapshot snapshot, @org.jetbrains.annotations.Nullable()
    java.lang.String previousChildKey) {
    }
    
    @java.lang.Override()
    public void onChildRemoved(@org.jetbrains.annotations.NotNull()
    com.google.firebase.database.DataSnapshot snapshot) {
    }
    
    @java.lang.Override()
    public void onChildMoved(@org.jetbrains.annotations.NotNull()
    com.google.firebase.database.DataSnapshot snapshot, @org.jetbrains.annotations.Nullable()
    java.lang.String previousChildKey) {
    }
    
    @java.lang.Override()
    public void onDataChange(@org.jetbrains.annotations.NotNull()
    com.google.firebase.database.DataSnapshot snapshot) {
    }
    
    @java.lang.Override()
    public void onCancelled(@org.jetbrains.annotations.NotNull()
    com.google.firebase.database.DatabaseError error) {
    }
    
    private final int getIndexForKey(java.lang.String key) {
        return 0;
    }
    
    private final int getIndexKey(java.lang.String key) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected java.util.List<com.google.firebase.database.DataSnapshot> getSnapshots() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] getChild() {
        return null;
    }
    
    public FirebaseArray(@org.jetbrains.annotations.NotNull()
    com.google.firebase.database.Query mQuery, @org.jetbrains.annotations.NotNull()
    com.firebase.ui.database.SnapshotParser<T> parser, @org.jetbrains.annotations.Nullable()
    java.lang.String filter, @org.jetbrains.annotations.NotNull()
    java.lang.String... child) {
        super(null);
    }
    
    @java.lang.Override()
    public java.lang.Object removeAt(int p0) {
        return null;
    }
    
    @java.lang.Override()
    public final T remove(int p0) {
        return null;
    }
    
    @java.lang.Override()
    public int getSize() {
        return 0;
    }
    
    @java.lang.Override()
    public final int size() {
        return 0;
    }
}