package com.github.midros.istheapp.ui.activities.base;

import java.lang.System;

/**
 * Created by luis rafael on 8/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\n\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\b\u0010\u0011\u001a\u00020\u0003H&J*\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0017H&J*\u0010\u0018\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bH&J2\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u00172\b\b\u0002\u0010\"\u001a\u00020\u0017H&JT\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u00172\b\u0010&\u001a\u0004\u0018\u00010\b2\b\u0010\'\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010(\u001a\u00020\u001b2\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00030)\u00a2\u0006\u0002\b*H&\u00a2\u0006\u0002\u0010+J\u0010\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\bH&J\u0010\u0010.\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u0017H&J\u0010\u0010.\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\bH&J\u0018\u0010/\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u00172\u0006\u00100\u001a\u000201H&J\u0018\u0010/\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\b2\u0006\u00100\u001a\u000201H&J.\u00102\u001a\u00020\u00032\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\b2\u0006\u00106\u001a\u00020\b2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000308H&J\u001a\u00109\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u001b2\b\b\u0002\u0010;\u001a\u00020\u001bH&\u00a8\u0006<"}, d2 = {"Lcom/github/midros/istheapp/ui/activities/base/InterfaceView;", "", "addDisposable", "", "disposable", "Lio/reactivex/disposables/Disposable;", "changeChild", "fragmentTag", "", "clearDisposable", "failedResult", "throwable", "", "getComponent", "Lcom/github/midros/istheapp/di/component/ActivityComponent;", "getPermissions", "Lcom/tbruyelle/rxpermissions2/RxPermissions;", "hideDialog", "onItemClick", "key", "child", "file", "position", "", "onItemLongClick", "setActionToolbar", "action", "", "setToolbar", "toolbar", "Lcom/github/midros/istheapp/ui/widget/toolbar/CustomToolbar;", "showSearch", "title", "showItemMenu", "hint", "showDialog", "Lcn/pedant/SweetAlert/SweetAlertDialog;", "alertType", "msg", "txtPositiveButton", "cancellable", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(IILjava/lang/String;Ljava/lang/Integer;ZLkotlin/jvm/functions/Function1;)Lcn/pedant/SweetAlert/SweetAlertDialog;", "showError", "message", "showMessage", "showSnackbar", "v", "Landroid/view/View;", "subscribePermission", "permission", "Lcom/tbruyelle/rxpermissions2/Permission;", "msgRationale", "msgDenied", "granted", "Lkotlin/Function0;", "successResult", "result", "filter", "app_debug"})
public abstract interface InterfaceView {
    
    public abstract void setToolbar(@org.jetbrains.annotations.NotNull()
    com.github.midros.istheapp.ui.widget.toolbar.CustomToolbar toolbar, boolean showSearch, int title, int showItemMenu, int hint);
    
    public abstract void setActionToolbar(boolean action);
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.github.midros.istheapp.di.component.ActivityComponent getComponent();
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.tbruyelle.rxpermissions2.RxPermissions getPermissions();
    
    public abstract void subscribePermission(@org.jetbrains.annotations.NotNull()
    com.tbruyelle.rxpermissions2.Permission permission, @org.jetbrains.annotations.NotNull()
    java.lang.String msgRationale, @org.jetbrains.annotations.NotNull()
    java.lang.String msgDenied, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> granted);
    
    @org.jetbrains.annotations.NotNull()
    public abstract cn.pedant.SweetAlert.SweetAlertDialog showDialog(int alertType, int title, @org.jetbrains.annotations.Nullable()
    java.lang.String msg, @org.jetbrains.annotations.Nullable()
    java.lang.Integer txtPositiveButton, boolean cancellable, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super cn.pedant.SweetAlert.SweetAlertDialog, kotlin.Unit> action);
    
    public abstract void hideDialog();
    
    public abstract void showError(@org.jetbrains.annotations.NotNull()
    java.lang.String message);
    
    public abstract void showMessage(int message);
    
    public abstract void showMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message);
    
    public abstract void showSnackbar(int message, @org.jetbrains.annotations.NotNull()
    android.view.View v);
    
    public abstract void showSnackbar(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    android.view.View v);
    
    public abstract void addDisposable(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.Disposable disposable);
    
    public abstract void clearDisposable();
    
    public abstract void successResult(boolean result, boolean filter);
    
    public abstract void failedResult(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable);
    
    public abstract void onItemClick(@org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String child, @org.jetbrains.annotations.NotNull()
    java.lang.String file, int position);
    
    public abstract void onItemLongClick(@org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String child, @org.jetbrains.annotations.NotNull()
    java.lang.String file, int position);
    
    public abstract void changeChild(@org.jetbrains.annotations.NotNull()
    java.lang.String fragmentTag);
    
    /**
     * Created by luis rafael on 8/03/18.
     */
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}