package com.github.midros.istheapp.ui.activities.base;

import java.lang.System;

/**
 * Created by luis rafael on 7/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00b0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 a2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001aB\u000f\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0015H\u0016J\u0010\u0010\u000b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dH\u0003J\u000e\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dJ\u0010\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020!H\u0016J\n\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\n\u0010$\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010%\u001a\u00020\u0015H\u0016J\b\u0010&\u001a\u00020\u0015H\u0002J\u0010\u0010\'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u001dH\u0007J\u0012\u0010)\u001a\u00020\u00152\b\u0010*\u001a\u0004\u0018\u00010+H\u0014J*\u0010,\u001a\u00020\u00152\b\u0010-\u001a\u0004\u0018\u00010\u001a2\u0006\u0010.\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020\u001a2\u0006\u00100\u001a\u00020\u0005H\u0016J*\u00101\u001a\u00020\u00152\b\u0010-\u001a\u0004\u0018\u00010\u001a2\u0006\u0010.\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020\u001a2\u0006\u00100\u001a\u00020\u0005H\u0016J\b\u00102\u001a\u00020\u0015H\u0014J\b\u00103\u001a\u00020\u0015H\u0016J\u0010\u0010\u000e\u001a\u00020\u00152\u0006\u00104\u001a\u00020\u001dH\u0003J\u000e\u00105\u001a\u00020\u00152\u0006\u00104\u001a\u00020\u001dJ\u0010\u00106\u001a\u00020\u00152\u0006\u00107\u001a\u00020\rH\u0016J\b\u00108\u001a\u00020\u0015H\u0016J\b\u00109\u001a\u00020\u0015H\u0016J\u0012\u0010:\u001a\u00020\u00152\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J0\u0010=\u001a\u00020\u00152\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\r2\u0006\u0010A\u001a\u00020\u00052\u0006\u0010B\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u0005H\u0016JR\u0010D\u001a\u00020\b2\u0006\u0010E\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00052\b\u0010F\u001a\u0004\u0018\u00010\u001a2\b\u0010G\u001a\u0004\u0018\u00010\u00052\u0006\u0010H\u001a\u00020\r2\u0017\u00107\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00150I\u00a2\u0006\u0002\bJH\u0016\u00a2\u0006\u0002\u0010KJ\u0010\u0010L\u001a\u00020\u00152\u0006\u0010M\u001a\u00020\u001aH\u0016J\u0010\u0010N\u001a\u00020\u00152\u0006\u0010M\u001a\u00020\u0005H\u0016J\u0010\u0010N\u001a\u00020\u00152\u0006\u0010M\u001a\u00020\u001aH\u0016J\u0018\u0010O\u001a\u00020\u00152\u0006\u0010M\u001a\u00020\u00052\u0006\u0010P\u001a\u00020QH\u0016J\u0018\u0010O\u001a\u00020\u00152\u0006\u0010M\u001a\u00020\u001a2\u0006\u0010P\u001a\u00020QH\u0016J\u0010\u0010R\u001a\u00020\u00152\u0006\u0010S\u001a\u00020TH\u0003J\u000e\u0010U\u001a\u00020\u00152\u0006\u0010S\u001a\u00020TJ.\u0010V\u001a\u00020\u00152\u0006\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020\u001a2\u0006\u0010Z\u001a\u00020\u001a2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00150\\H\u0016J\u0018\u0010]\u001a\u00020\u00152\u0006\u0010^\u001a\u00020\r2\u0006\u0010_\u001a\u00020\rH\u0016J\u0006\u0010`\u001a\u00020\u0015R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006b"}, d2 = {"Lcom/github/midros/istheapp/ui/activities/base/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/github/midros/istheapp/ui/activities/base/InterfaceView;", "Lcom/github/midros/istheapp/ui/fragments/base/BaseFragment$Callback;", "layout", "", "(I)V", "alertDialog", "Lcn/pedant/SweetAlert/SweetAlertDialog;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "emailObservable", "Lio/reactivex/Observable;", "", "passObservable", "rxPermissions", "Lcom/tbruyelle/rxpermissions2/RxPermissions;", "signInEnabled", "snackbar", "Lcom/google/android/material/snackbar/Snackbar;", "addDisposable", "", "disposable", "Lio/reactivex/disposables/Disposable;", "changeChild", "fragmentTag", "", "clearDisposable", "edtEmail", "Landroid/widget/EditText;", "emailValidationObservable", "failedResult", "throwable", "", "getComponent", "Lcom/github/midros/istheapp/di/component/ActivityComponent;", "getPermissions", "hideDialog", "initializeActivityComponent", "newChildValidationObservable", "newChild", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onItemClick", "key", "child", "file", "position", "onItemLongClick", "onResume", "openDrawer", "edtPass", "passValidationObservable", "setActionToolbar", "action", "setDrawerLock", "setDrawerUnLock", "setMenu", "menu", "Landroidx/appcompat/widget/PopupMenu;", "setToolbar", "toolbar", "Lcom/github/midros/istheapp/ui/widget/toolbar/CustomToolbar;", "showSearch", "title", "showItemMenu", "hint", "showDialog", "alertType", "msg", "txtPositiveButton", "cancellable", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(IILjava/lang/String;Ljava/lang/Integer;ZLkotlin/jvm/functions/Function1;)Lcn/pedant/SweetAlert/SweetAlertDialog;", "showError", "message", "showMessage", "showSnackbar", "v", "Landroid/view/View;", "signInEnableObservable", "btnSignIn", "Landroid/widget/Button;", "signInValidationObservable", "subscribePermission", "permission", "Lcom/tbruyelle/rxpermissions2/Permission;", "msgRationale", "msgDenied", "granted", "Lkotlin/Function0;", "successResult", "result", "filter", "windowLightStatusBar", "Companion", "app_debug"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity implements com.github.midros.istheapp.ui.activities.base.InterfaceView, com.github.midros.istheapp.ui.fragments.base.BaseFragment.Callback {
    private cn.pedant.SweetAlert.SweetAlertDialog alertDialog;
    private io.reactivex.disposables.CompositeDisposable compositeDisposable;
    private com.tbruyelle.rxpermissions2.RxPermissions rxPermissions;
    private com.google.android.material.snackbar.Snackbar snackbar;
    private io.reactivex.Observable<java.lang.Boolean> emailObservable;
    private io.reactivex.Observable<java.lang.Boolean> passObservable;
    private io.reactivex.Observable<java.lang.Boolean> signInEnabled;
    @org.jetbrains.annotations.Nullable()
    private static com.github.midros.istheapp.di.component.ActivityComponent activityComponent;
    public static final com.github.midros.istheapp.ui.activities.base.BaseActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void windowLightStatusBar() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    private final void initializeActivityComponent() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.github.midros.istheapp.di.component.ActivityComponent getComponent() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.tbruyelle.rxpermissions2.RxPermissions getPermissions() {
        return null;
    }
    
    @java.lang.Override()
    public void subscribePermission(@org.jetbrains.annotations.NotNull()
    com.tbruyelle.rxpermissions2.Permission permission, @org.jetbrains.annotations.NotNull()
    java.lang.String msgRationale, @org.jetbrains.annotations.NotNull()
    java.lang.String msgDenied, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> granted) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public cn.pedant.SweetAlert.SweetAlertDialog showDialog(int alertType, int title, @org.jetbrains.annotations.Nullable()
    java.lang.String msg, @org.jetbrains.annotations.Nullable()
    java.lang.Integer txtPositiveButton, boolean cancellable, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super cn.pedant.SweetAlert.SweetAlertDialog, kotlin.Unit> action) {
        return null;
    }
    
    @java.lang.Override()
    public void hideDialog() {
    }
    
    @java.lang.Override()
    public void showError(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void showMessage(int message) {
    }
    
    @java.lang.Override()
    public void showMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void showSnackbar(int message, @org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    @java.lang.Override()
    public void showSnackbar(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    @java.lang.Override()
    public void addDisposable(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.Disposable disposable) {
    }
    
    @java.lang.Override()
    public void clearDisposable() {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final void newChildValidationObservable(@org.jetbrains.annotations.NotNull()
    android.widget.EditText newChild) {
    }
    
    /**
     * Email validation
     */
    public final void emailValidationObservable(@org.jetbrains.annotations.NotNull()
    android.widget.EditText edtEmail) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    private final void emailObservable(android.widget.EditText edtEmail) {
    }
    
    /**
     * Password validation
     */
    public final void passValidationObservable(@org.jetbrains.annotations.NotNull()
    android.widget.EditText edtPass) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    private final void passObservable(android.widget.EditText edtPass) {
    }
    
    /**
     * Sign In observer
     */
    public final void signInValidationObservable(@org.jetbrains.annotations.NotNull()
    android.widget.Button btnSignIn) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    private final void signInEnableObservable(android.widget.Button btnSignIn) {
    }
    
    @java.lang.Override()
    public void setActionToolbar(boolean action) {
    }
    
    @java.lang.Override()
    public void successResult(boolean result, boolean filter) {
    }
    
    @java.lang.Override()
    public void failedResult(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable) {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String child, @org.jetbrains.annotations.NotNull()
    java.lang.String file, int position) {
    }
    
    @java.lang.Override()
    public void onItemLongClick(@org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String child, @org.jetbrains.annotations.NotNull()
    java.lang.String file, int position) {
    }
    
    @java.lang.Override()
    public void setDrawerLock() {
    }
    
    @java.lang.Override()
    public void setDrawerUnLock() {
    }
    
    @java.lang.Override()
    public void openDrawer() {
    }
    
    @java.lang.Override()
    public void setMenu(@org.jetbrains.annotations.Nullable()
    androidx.appcompat.widget.PopupMenu menu) {
    }
    
    @java.lang.Override()
    public void changeChild(@org.jetbrains.annotations.NotNull()
    java.lang.String fragmentTag) {
    }
    
    @java.lang.Override()
    public void setToolbar(@org.jetbrains.annotations.NotNull()
    com.github.midros.istheapp.ui.widget.toolbar.CustomToolbar toolbar, boolean showSearch, int title, int showItemMenu, int hint) {
    }
    
    public BaseActivity(@androidx.annotation.LayoutRes()
    int layout) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final com.github.midros.istheapp.di.component.ActivityComponent getActivityComponent() {
        return null;
    }
    
    public static final void setActivityComponent(@org.jetbrains.annotations.Nullable()
    com.github.midros.istheapp.di.component.ActivityComponent p0) {
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/github/midros/istheapp/ui/activities/base/BaseActivity$Companion;", "", "()V", "activityComponent", "Lcom/github/midros/istheapp/di/component/ActivityComponent;", "activityComponent$annotations", "getActivityComponent", "()Lcom/github/midros/istheapp/di/component/ActivityComponent;", "setActivityComponent", "(Lcom/github/midros/istheapp/di/component/ActivityComponent;)V", "app_debug"})
    public static final class Companion {
        
        public static void activityComponent$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.github.midros.istheapp.di.component.ActivityComponent getActivityComponent() {
            return null;
        }
        
        public final void setActivityComponent(@org.jetbrains.annotations.Nullable()
        com.github.midros.istheapp.di.component.ActivityComponent p0) {
        }
        
        private Companion() {
            super();
        }
    }
}