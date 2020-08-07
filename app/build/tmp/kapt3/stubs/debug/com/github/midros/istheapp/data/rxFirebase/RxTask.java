package com.github.midros.istheapp.data.rxFirebase;

import java.lang.System;

/**
 * Created by luis rafael on 28/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u0013*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004:\u0001\u0013B\u0015\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0006\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016J\u0014\u0010\f\u001a\u00020\t2\n\u0010\r\u001a\u00060\u000ej\u0002`\u000fH\u0016J\u0017\u0010\u0010\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00018\u0000H\u0016\u00a2\u0006\u0002\u0010\u0012R\u0016\u0010\u0005\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/github/midros/istheapp/data/rxFirebase/RxTask;", "T", "Lcom/google/android/gms/tasks/OnSuccessListener;", "Lcom/google/android/gms/tasks/OnFailureListener;", "Lcom/google/android/gms/tasks/OnCompleteListener;", "emitter", "Lio/reactivex/MaybeEmitter;", "(Lio/reactivex/MaybeEmitter;)V", "onComplete", "", "task", "Lcom/google/android/gms/tasks/Task;", "onFailure", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccess", "res", "(Ljava/lang/Object;)V", "Companion", "app_debug"})
public final class RxTask<T extends java.lang.Object> implements com.google.android.gms.tasks.OnSuccessListener<T>, com.google.android.gms.tasks.OnFailureListener, com.google.android.gms.tasks.OnCompleteListener<T> {
    private final io.reactivex.MaybeEmitter<? super T> emitter = null;
    public static final com.github.midros.istheapp.data.rxFirebase.RxTask.Companion Companion = null;
    
    @java.lang.Override()
    public void onSuccess(@org.jetbrains.annotations.Nullable()
    T res) {
    }
    
    @java.lang.Override()
    public void onComplete(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.tasks.Task<T> task) {
    }
    
    @java.lang.Override()
    public void onFailure(@org.jetbrains.annotations.NotNull()
    java.lang.Exception e) {
    }
    
    public RxTask(@org.jetbrains.annotations.NotNull()
    io.reactivex.MaybeEmitter<? super T> emitter) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u0004\"\u0004\b\u0001\u0010\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u0002H\u00050\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\t\u00a8\u0006\n"}, d2 = {"Lcom/github/midros/istheapp/data/rxFirebase/RxTask$Companion;", "", "()V", "assignOnTask", "", "T", "emitter", "Lio/reactivex/MaybeEmitter;", "task", "Lcom/google/android/gms/tasks/Task;", "app_debug"})
    public static final class Companion {
        
        public final <T extends java.lang.Object>void assignOnTask(@org.jetbrains.annotations.NotNull()
        io.reactivex.MaybeEmitter<? super T> emitter, @org.jetbrains.annotations.NotNull()
        com.google.android.gms.tasks.Task<T> task) {
        }
        
        private Companion() {
            super();
        }
    }
}