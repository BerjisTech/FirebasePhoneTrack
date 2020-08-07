package com.github.midros.istheapp.data.rxFirebase;

import java.lang.System;

/**
 * Created by luis rafael on 8/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&JI\u0010\u0007\u001a\f\u0012\b\u0012\u00060\tR\u00020\n0\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2%\b\u0002\u0010\r\u001a\u001f\u0012\u0013\u0012\u00110\u000f\u00a2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000eH&J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0006H&J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H&JI\u0010\u0017\u001a\f\u0012\b\u0012\u00060\u0018R\u00020\u00190\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001b2%\b\u0002\u0010\r\u001a\u001f\u0012\u0013\u0012\u00110\u000f\u00a2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000eH&J&\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H&J\u001e\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u001d2\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006H&J\b\u0010%\u001a\u00020\u0012H&J\u001e\u0010&\u001a\b\u0012\u0004\u0012\u00020\"0\u001d2\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006H&J\u0016\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u001e0(2\u0006\u0010\u0005\u001a\u00020\u0006H&J\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001e0(H&J*\u0010*\u001a\b\u0012\u0004\u0012\u0002H+0(\"\u0004\b\u0000\u0010+2\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010,\u001a\b\u0012\u0004\u0012\u0002H+0-H&\u00a8\u0006."}, d2 = {"Lcom/github/midros/istheapp/data/rxFirebase/InterfaceFirebase;", "", "getDatabaseAcount", "Lcom/google/firebase/database/DatabaseReference;", "getDatabaseReference", "child", "", "getFile", "Lio/reactivex/Single;", "Lcom/google/firebase/storage/FileDownloadTask$TaskSnapshot;", "Lcom/google/firebase/storage/FileDownloadTask;", "file", "Ljava/io/File;", "progress", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "", "getStorageReference", "Lcom/google/firebase/storage/StorageReference;", "getUser", "Lcom/google/firebase/auth/FirebaseUser;", "putFile", "Lcom/google/firebase/storage/UploadTask$TaskSnapshot;", "Lcom/google/firebase/storage/UploadTask;", "uri", "Landroid/net/Uri;", "queryValueEventSingle", "Lio/reactivex/Maybe;", "Lcom/google/firebase/database/DataSnapshot;", "value", "id", "signIn", "Lcom/google/firebase/auth/AuthResult;", "email", "password", "signOut", "signUp", "valueEvent", "Lio/reactivex/Flowable;", "valueEventAccount", "valueEventModel", "T", "clazz", "Ljava/lang/Class;", "app_debug"})
public abstract interface InterfaceFirebase {
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.google.firebase.auth.FirebaseUser getUser();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Maybe<com.google.firebase.auth.AuthResult> signIn(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Maybe<com.google.firebase.auth.AuthResult> signUp(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password);
    
    public abstract void signOut();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<com.google.firebase.database.DataSnapshot> valueEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String child);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<com.google.firebase.database.DataSnapshot> valueEventAccount();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Maybe<com.google.firebase.database.DataSnapshot> queryValueEventSingle(@org.jetbrains.annotations.NotNull()
    java.lang.String child, @org.jetbrains.annotations.NotNull()
    java.lang.String value, @org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract <T extends java.lang.Object>io.reactivex.Flowable<T> valueEventModel(@org.jetbrains.annotations.NotNull()
    java.lang.String child, @org.jetbrains.annotations.NotNull()
    java.lang.Class<T> clazz);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.google.firebase.database.DatabaseReference getDatabaseReference(@org.jetbrains.annotations.NotNull()
    java.lang.String child);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.google.firebase.database.DatabaseReference getDatabaseAcount();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.google.firebase.storage.StorageReference getStorageReference(@org.jetbrains.annotations.NotNull()
    java.lang.String child);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<com.google.firebase.storage.FileDownloadTask.TaskSnapshot> getFile(@org.jetbrains.annotations.NotNull()
    java.lang.String child, @org.jetbrains.annotations.NotNull()
    java.io.File file, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> progress);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<com.google.firebase.storage.UploadTask.TaskSnapshot> putFile(@org.jetbrains.annotations.NotNull()
    java.lang.String child, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> progress);
    
    /**
     * Created by luis rafael on 8/03/18.
     */
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}