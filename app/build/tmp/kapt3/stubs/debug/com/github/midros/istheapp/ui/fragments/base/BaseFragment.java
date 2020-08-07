package com.github.midros.istheapp.ui.fragments.base;

import java.lang.System;

/**
 * Created by luis rafael on 9/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 R2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002QRB\u000f\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\rH\u0016J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\n\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\rH\u0016J\u0010\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0012\u0010\u001f\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020\u001eH\u0016J\u0010\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u0006H\u0016J\b\u0010%\u001a\u00020\rH\u0016J\b\u0010&\u001a\u00020\rH\u0016J*\u0010\'\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010\u00122\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\u0006H\u0016J*\u0010,\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010\u00122\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\u0006H\u0016J\u0010\u0010-\u001a\u00020\r2\u0006\u0010.\u001a\u00020/H\u0016J\u0010\u00100\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u00101\u001a\u00020\r2\u0006\u00102\u001a\u00020\u001eH\u0016J0\u00103\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u001e2\u0006\u00105\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u0006H\u0016JR\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00062\b\u0010;\u001a\u0004\u0018\u00010\u00122\b\u0010<\u001a\u0004\u0018\u00010\u00062\u0006\u0010=\u001a\u00020\u001e2\u0017\u00102\u001a\u0013\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\r0>\u00a2\u0006\u0002\b?H\u0016\u00a2\u0006\u0002\u0010@J\u0010\u0010A\u001a\u00020\r2\u0006\u0010B\u001a\u00020\u0012H\u0016J\u0010\u0010C\u001a\u00020\r2\u0006\u0010B\u001a\u00020\u0006H\u0016J\u0010\u0010C\u001a\u00020\r2\u0006\u0010B\u001a\u00020\u0012H\u0016J\u0018\u0010D\u001a\u00020\r2\u0006\u0010B\u001a\u00020\u00062\u0006\u0010E\u001a\u00020FH\u0016J\u0018\u0010D\u001a\u00020\r2\u0006\u0010B\u001a\u00020\u00122\u0006\u0010E\u001a\u00020FH\u0016J.\u0010G\u001a\u00020\r2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020\u00122\u0006\u0010K\u001a\u00020\u00122\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\r0MH\u0016J\u0018\u0010N\u001a\u00020\r2\u0006\u0010O\u001a\u00020\u001e2\u0006\u0010P\u001a\u00020\u001eH\u0016R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006S"}, d2 = {"Lcom/github/midros/istheapp/ui/fragments/base/BaseFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/github/midros/istheapp/ui/activities/base/InterfaceView;", "Lcom/github/midros/istheapp/ui/widget/toolbar/CustomToolbar$OnToolbarActionListener;", "Lcom/github/midros/istheapp/ui/fragments/base/IOnFragmentListener;", "layout", "", "(I)V", "hintInt", "titleInt", "toolbar", "Lcom/github/midros/istheapp/ui/widget/toolbar/CustomToolbar;", "addDisposable", "", "disposable", "Lio/reactivex/disposables/Disposable;", "changeChild", "fragmentTag", "", "clearDisposable", "failedResult", "throwable", "", "getComponent", "Lcom/github/midros/istheapp/di/component/ActivityComponent;", "getPermissions", "Lcom/tbruyelle/rxpermissions2/RxPermissions;", "hideDialog", "onActionStateChanged", "enabled", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onBackPressed", "onButtonClicked", "buttonCode", "onChangeHeight", "onHideFragment", "onItemClick", "key", "child", "file", "position", "onItemLongClick", "onSearchConfirmed", "text", "", "onSearchStateChanged", "setActionToolbar", "action", "setToolbar", "showSearch", "title", "showItemMenu", "hint", "showDialog", "Lcn/pedant/SweetAlert/SweetAlertDialog;", "alertType", "msg", "txtPositiveButton", "cancellable", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(IILjava/lang/String;Ljava/lang/Integer;ZLkotlin/jvm/functions/Function1;)Lcn/pedant/SweetAlert/SweetAlertDialog;", "showError", "message", "showMessage", "showSnackbar", "v", "Landroid/view/View;", "subscribePermission", "permission", "Lcom/tbruyelle/rxpermissions2/Permission;", "msgRationale", "msgDenied", "granted", "Lkotlin/Function0;", "successResult", "result", "filter", "Callback", "Companion", "app_debug"})
public abstract class BaseFragment extends androidx.fragment.app.Fragment implements com.github.midros.istheapp.ui.activities.base.InterfaceView, com.github.midros.istheapp.ui.widget.toolbar.CustomToolbar.OnToolbarActionListener, com.github.midros.istheapp.ui.fragments.base.IOnFragmentListener {
    private com.github.midros.istheapp.ui.widget.toolbar.CustomToolbar toolbar;
    private int titleInt;
    private int hintInt;
    @org.jetbrains.annotations.Nullable()
    private static com.github.midros.istheapp.ui.activities.base.BaseActivity baseActivity;
    public static final com.github.midros.istheapp.ui.fragments.base.BaseFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
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
    
    @java.lang.Override()
    public void showMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void showMessage(int message) {
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
    public void addDisposable(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.Disposable disposable) {
    }
    
    @java.lang.Override()
    public void clearDisposable() {
    }
    
    @java.lang.Override()
    public void changeChild(@org.jetbrains.annotations.NotNull()
    java.lang.String fragmentTag) {
    }
    
    @java.lang.Override()
    public void setToolbar(@org.jetbrains.annotations.NotNull()
    com.github.midros.istheapp.ui.widget.toolbar.CustomToolbar toolbar, boolean showSearch, int title, int showItemMenu, int hint) {
    }
    
    @java.lang.Override()
    public void onSearchStateChanged(boolean enabled) {
    }
    
    @java.lang.Override()
    public void onSearchConfirmed(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text) {
    }
    
    @java.lang.Override()
    public void onButtonClicked(int buttonCode) {
    }
    
    @java.lang.Override()
    public void onActionStateChanged(boolean enabled) {
    }
    
    @java.lang.Override()
    public void setActionToolbar(boolean action) {
    }
    
    @java.lang.Override()
    public void onChangeHeight() {
    }
    
    @java.lang.Override()
    public void onHideFragment() {
    }
    
    @java.lang.Override()
    public boolean onBackPressed() {
        return false;
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
    
    public BaseFragment(@androidx.annotation.LayoutRes()
    int layout) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final com.github.midros.istheapp.ui.activities.base.BaseActivity getBaseActivity() {
        return null;
    }
    
    public static final void setBaseActivity(@org.jetbrains.annotations.Nullable()
    com.github.midros.istheapp.ui.activities.base.BaseActivity p0) {
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&\u00a8\u0006\t"}, d2 = {"Lcom/github/midros/istheapp/ui/fragments/base/BaseFragment$Callback;", "", "openDrawer", "", "setDrawerLock", "setDrawerUnLock", "setMenu", "menu", "Landroidx/appcompat/widget/PopupMenu;", "app_debug"})
    public static abstract interface Callback {
        
        public abstract void setDrawerLock();
        
        public abstract void setDrawerUnLock();
        
        public abstract void openDrawer();
        
        public abstract void setMenu(@org.jetbrains.annotations.Nullable()
        androidx.appcompat.widget.PopupMenu menu);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/github/midros/istheapp/ui/fragments/base/BaseFragment$Companion;", "", "()V", "baseActivity", "Lcom/github/midros/istheapp/ui/activities/base/BaseActivity;", "baseActivity$annotations", "getBaseActivity", "()Lcom/github/midros/istheapp/ui/activities/base/BaseActivity;", "setBaseActivity", "(Lcom/github/midros/istheapp/ui/activities/base/BaseActivity;)V", "app_debug"})
    public static final class Companion {
        
        public static void baseActivity$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.github.midros.istheapp.ui.activities.base.BaseActivity getBaseActivity() {
            return null;
        }
        
        public final void setBaseActivity(@org.jetbrains.annotations.Nullable()
        com.github.midros.istheapp.ui.activities.base.BaseActivity p0) {
        }
        
        private Companion() {
            super();
        }
    }
}