package com.github.midros.istheapp.ui.activities.mainparent;

import java.lang.System;

/**
 * Created by luis rafael on 9/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u001f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0016H\u0016J\b\u0010 \u001a\u00020\u0016H\u0016J\u0010\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020#H\u0002J\u0018\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u001aH\u0002J\b\u0010\'\u001a\u00020\u0016H\u0016J\b\u0010(\u001a\u00020\u0016H\u0016J\b\u0010)\u001a\u00020\u0016H\u0016J\b\u0010*\u001a\u00020\u0016H\u0016J\b\u0010+\u001a\u00020\u0016H\u0016J\b\u0010,\u001a\u00020\u0016H\u0016J\b\u0010-\u001a\u00020\u0016H\u0016J\b\u0010.\u001a\u00020\u0016H\u0016J\b\u0010/\u001a\u00020\u0016H\u0016J\b\u00100\u001a\u00020\u0016H\u0016J\b\u00101\u001a\u00020\u0016H\u0016J\b\u00102\u001a\u00020\u0016H\u0016J\u0010\u00103\u001a\u00020\u00162\u0006\u00104\u001a\u000205H\u0016J\u0010\u00106\u001a\u00020\u00162\u0006\u00107\u001a\u000208H\u0016R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00069"}, d2 = {"Lcom/github/midros/istheapp/ui/activities/mainparent/InteractorMainParent;", "V", "Lcom/github/midros/istheapp/ui/activities/mainparent/InterfaceViewMainParent;", "Lcom/github/midros/istheapp/ui/activities/base/BaseInteractor;", "Lcom/github/midros/istheapp/ui/activities/mainparent/InterfaceInteractorMainParent;", "supportFragment", "Landroidx/fragment/app/FragmentManager;", "context", "Landroid/content/Context;", "firebase", "Lcom/github/midros/istheapp/data/rxFirebase/InterfaceFirebase;", "(Landroidx/fragment/app/FragmentManager;Landroid/content/Context;Lcom/github/midros/istheapp/data/rxFirebase/InterfaceFirebase;)V", "alertDialog", "Lcn/pedant/SweetAlert/SweetAlertDialog;", "fragmentPrevious", "Landroidx/fragment/app/Fragment;", "interval", "", "myCountDownTimer", "Lcom/github/midros/istheapp/utils/MyCountDownTimer;", "startTime", "cancelCountDownTimer", "", "getDatabaseReference", "Lcom/google/firebase/database/DatabaseReference;", "child", "", "getStorageReference", "Lcom/google/firebase/storage/StorageReference;", "getUser", "Lcom/google/firebase/auth/FirebaseUser;", "initializeCountDownTimer", "restartCountDownTimer", "setCheckedNavigation", "itemId", "", "setFragment", "fragment", "fragmentTag", "setFragmentAbout", "setFragmentCalls", "setFragmentKeylog", "setFragmentLocation", "setFragmentNotifyMessage", "setFragmentPhotos", "setFragmentRecords", "setFragmentSetting", "setFragmentSms", "setFragmentSocial", "signOut", "startCountDownTimer", "uploadPhotoChild", "photo", "Ljava/io/File;", "valueAccounts", "firstTime", "", "app_debug"})
public final class InteractorMainParent<V extends com.github.midros.istheapp.ui.activities.mainparent.InterfaceViewMainParent> extends com.github.midros.istheapp.ui.activities.base.BaseInteractor<V> implements com.github.midros.istheapp.ui.activities.mainparent.InterfaceInteractorMainParent<V> {
    private long startTime;
    private long interval;
    private com.github.midros.istheapp.utils.MyCountDownTimer myCountDownTimer;
    private cn.pedant.SweetAlert.SweetAlertDialog alertDialog;
    private androidx.fragment.app.Fragment fragmentPrevious;
    
    @java.lang.Override()
    public void initializeCountDownTimer() {
    }
    
    @java.lang.Override()
    public void startCountDownTimer() {
    }
    
    @java.lang.Override()
    public void restartCountDownTimer() {
    }
    
    @java.lang.Override()
    public void cancelCountDownTimer() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.google.firebase.database.DatabaseReference getDatabaseReference(@org.jetbrains.annotations.NotNull()
    java.lang.String child) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.google.firebase.storage.StorageReference getStorageReference(@org.jetbrains.annotations.NotNull()
    java.lang.String child) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.google.firebase.auth.FirebaseUser getUser() {
        return null;
    }
    
    @java.lang.Override()
    public void signOut() {
    }
    
    @java.lang.Override()
    public void valueAccounts(boolean firstTime) {
    }
    
    @java.lang.Override()
    public void uploadPhotoChild(@org.jetbrains.annotations.NotNull()
    java.io.File photo) {
    }
    
    @java.lang.Override()
    public void setFragmentLocation() {
    }
    
    @java.lang.Override()
    public void setFragmentCalls() {
    }
    
    @java.lang.Override()
    public void setFragmentSms() {
    }
    
    @java.lang.Override()
    public void setFragmentRecords() {
    }
    
    @java.lang.Override()
    public void setFragmentPhotos() {
    }
    
    @java.lang.Override()
    public void setFragmentKeylog() {
    }
    
    @java.lang.Override()
    public void setFragmentSocial() {
    }
    
    @java.lang.Override()
    public void setFragmentNotifyMessage() {
    }
    
    @java.lang.Override()
    public void setFragmentSetting() {
    }
    
    @java.lang.Override()
    public void setFragmentAbout() {
    }
    
    private final void setCheckedNavigation(int itemId) {
    }
    
    private final void setFragment(androidx.fragment.app.Fragment fragment, java.lang.String fragmentTag) {
    }
    
    @javax.inject.Inject()
    public InteractorMainParent(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager supportFragment, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.github.midros.istheapp.data.rxFirebase.InterfaceFirebase firebase) {
        super(null, null, null);
    }
}