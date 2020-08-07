package com.github.midros.istheapp.ui.activities.mainparent;

import java.lang.System;

/**
 * Created by luis rafael on 9/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bg\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH&J\n\u0010\f\u001a\u0004\u0018\u00010\rH&J\b\u0010\u000e\u001a\u00020\u0005H&J\b\u0010\u000f\u001a\u00020\u0005H&J\b\u0010\u0010\u001a\u00020\u0005H&J\b\u0010\u0011\u001a\u00020\u0005H&J\b\u0010\u0012\u001a\u00020\u0005H&J\b\u0010\u0013\u001a\u00020\u0005H&J\b\u0010\u0014\u001a\u00020\u0005H&J\b\u0010\u0015\u001a\u00020\u0005H&J\b\u0010\u0016\u001a\u00020\u0005H&J\b\u0010\u0017\u001a\u00020\u0005H&J\b\u0010\u0018\u001a\u00020\u0005H&J\b\u0010\u0019\u001a\u00020\u0005H&J\b\u0010\u001a\u001a\u00020\u0005H&J\b\u0010\u001b\u001a\u00020\u0005H&J\u0010\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001eH&J\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020!H&\u00a8\u0006\""}, d2 = {"Lcom/github/midros/istheapp/ui/activities/mainparent/InterfaceInteractorMainParent;", "V", "Lcom/github/midros/istheapp/ui/activities/mainparent/InterfaceViewMainParent;", "Lcom/github/midros/istheapp/ui/activities/base/InterfaceInteractor;", "cancelCountDownTimer", "", "getDatabaseReference", "Lcom/google/firebase/database/DatabaseReference;", "child", "", "getStorageReference", "Lcom/google/firebase/storage/StorageReference;", "getUser", "Lcom/google/firebase/auth/FirebaseUser;", "initializeCountDownTimer", "restartCountDownTimer", "setFragmentAbout", "setFragmentCalls", "setFragmentKeylog", "setFragmentLocation", "setFragmentNotifyMessage", "setFragmentPhotos", "setFragmentRecords", "setFragmentSetting", "setFragmentSms", "setFragmentSocial", "signOut", "startCountDownTimer", "uploadPhotoChild", "photo", "Ljava/io/File;", "valueAccounts", "firstTime", "", "app_debug"})
@com.github.midros.istheapp.di.PerActivity()
public abstract interface InterfaceInteractorMainParent<V extends com.github.midros.istheapp.ui.activities.mainparent.InterfaceViewMainParent> extends com.github.midros.istheapp.ui.activities.base.InterfaceInteractor<V> {
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.google.firebase.auth.FirebaseUser getUser();
    
    public abstract void signOut();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.google.firebase.database.DatabaseReference getDatabaseReference(@org.jetbrains.annotations.NotNull()
    java.lang.String child);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.google.firebase.storage.StorageReference getStorageReference(@org.jetbrains.annotations.NotNull()
    java.lang.String child);
    
    public abstract void valueAccounts(boolean firstTime);
    
    public abstract void uploadPhotoChild(@org.jetbrains.annotations.NotNull()
    java.io.File photo);
    
    public abstract void initializeCountDownTimer();
    
    public abstract void startCountDownTimer();
    
    public abstract void restartCountDownTimer();
    
    public abstract void cancelCountDownTimer();
    
    public abstract void setFragmentLocation();
    
    public abstract void setFragmentCalls();
    
    public abstract void setFragmentSms();
    
    public abstract void setFragmentRecords();
    
    public abstract void setFragmentPhotos();
    
    public abstract void setFragmentKeylog();
    
    public abstract void setFragmentSocial();
    
    public abstract void setFragmentSetting();
    
    public abstract void setFragmentNotifyMessage();
    
    public abstract void setFragmentAbout();
}