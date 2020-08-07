package com.github.midros.istheapp.data.rxFirebase;

import java.lang.System;

/**
 * Created by luis rafael on 28/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002JC\u0010\u0003\u001a\f\u0012\b\u0012\u00060\u0005R\u00020\u00060\u0004*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2%\b\u0002\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000bJC\u0010\u0010\u001a\f\u0012\b\u0012\u00060\u0011R\u00020\u00120\u0004*\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00142%\b\u0002\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000b\u00a8\u0006\u0015"}, d2 = {"Lcom/github/midros/istheapp/data/rxFirebase/RxFirebaseStorage;", "", "()V", "rxGetFile", "Lio/reactivex/Single;", "Lcom/google/firebase/storage/FileDownloadTask$TaskSnapshot;", "Lcom/google/firebase/storage/FileDownloadTask;", "Lcom/google/firebase/storage/StorageReference;", "destinationFile", "Ljava/io/File;", "progress", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "", "rxPutFile", "Lcom/google/firebase/storage/UploadTask$TaskSnapshot;", "Lcom/google/firebase/storage/UploadTask;", "uri", "Landroid/net/Uri;", "app_debug"})
public final class RxFirebaseStorage {
    public static final com.github.midros.istheapp.data.rxFirebase.RxFirebaseStorage INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.google.firebase.storage.FileDownloadTask.TaskSnapshot> rxGetFile(@org.jetbrains.annotations.NotNull()
    com.google.firebase.storage.StorageReference $this$rxGetFile, @org.jetbrains.annotations.NotNull()
    java.io.File destinationFile, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> progress) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.google.firebase.storage.UploadTask.TaskSnapshot> rxPutFile(@org.jetbrains.annotations.NotNull()
    com.google.firebase.storage.StorageReference $this$rxPutFile, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> progress) {
        return null;
    }
    
    private RxFirebaseStorage() {
        super();
    }
}