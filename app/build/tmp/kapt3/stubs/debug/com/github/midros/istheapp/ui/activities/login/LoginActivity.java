package com.github.midros.istheapp.ui.activities.login;

import java.lang.System;

/**
 * Created by luis rafael on 7/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010+\u001a\u00020,2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0.H\u0002J\u0016\u0010/\u001a\u00020,2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0.H\u0003J\u0010\u00100\u001a\u00020,2\u0006\u00101\u001a\u000202H\u0016J\b\u00103\u001a\u00020,H\u0002J\b\u00104\u001a\u00020,H\u0002J\u0012\u00105\u001a\u00020,2\b\u00106\u001a\u0004\u0018\u000107H\u0014J\b\u00108\u001a\u00020,H\u0014J\b\u00109\u001a\u00020,H\u0014J\u0010\u0010:\u001a\u00020,2\u0006\u0010;\u001a\u00020<H\u0016J\b\u0010=\u001a\u00020,H\u0002J\u0018\u0010>\u001a\u00020,2\u0006\u0010?\u001a\u00020<2\u0006\u0010@\u001a\u00020<H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0016\u0010\u0013R\u001b\u0010\u0018\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u0019\u0010\u0013R$\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001b\u0010!\u001a\u00020\"8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b%\u0010\n\u001a\u0004\b#\u0010$R\u001b\u0010&\u001a\u00020\'8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b*\u0010\n\u001a\u0004\b(\u0010)\u00a8\u0006A"}, d2 = {"Lcom/github/midros/istheapp/ui/activities/login/LoginActivity;", "Lcom/github/midros/istheapp/ui/activities/base/BaseActivity;", "Lcom/github/midros/istheapp/ui/activities/login/InterfaceViewLogin;", "Lcom/github/midros/istheapp/utils/KeyboardUtils$SoftKeyboardToggleListener;", "()V", "btnSignIn", "Landroid/widget/Button;", "getBtnSignIn", "()Landroid/widget/Button;", "btnSignIn$delegate", "Lkotlin/properties/ReadOnlyProperty;", "btnSignUp", "Landroid/widget/TextView;", "getBtnSignUp", "()Landroid/widget/TextView;", "btnSignUp$delegate", "edtEmail", "Landroid/widget/EditText;", "getEdtEmail", "()Landroid/widget/EditText;", "edtEmail$delegate", "edtNewChild", "getEdtNewChild", "edtNewChild$delegate", "edtPass", "getEdtPass", "edtPass$delegate", "interactor", "Lcom/github/midros/istheapp/ui/activities/login/InterfaceInteractorLogin;", "getInteractor", "()Lcom/github/midros/istheapp/ui/activities/login/InterfaceInteractorLogin;", "setInteractor", "(Lcom/github/midros/istheapp/ui/activities/login/InterfaceInteractorLogin;)V", "scroll", "Landroid/widget/ScrollView;", "getScroll", "()Landroid/widget/ScrollView;", "scroll$delegate", "spinnerType", "Lcom/jaredrummler/materialspinner/MaterialSpinner;", "getSpinnerType", "()Lcom/jaredrummler/materialspinner/MaterialSpinner;", "spinnerType$delegate", "checkData", "", "func", "Lkotlin/Function0;", "checkPermissionType", "failedResult", "throwable", "", "initializeSpinner", "onClickLogin", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onStart", "onToggleSoftKeyboard", "isVisible", "", "signIn", "successResult", "result", "filter", "app_debug"})
public final class LoginActivity extends com.github.midros.istheapp.ui.activities.base.BaseActivity implements com.github.midros.istheapp.ui.activities.login.InterfaceViewLogin, com.github.midros.istheapp.utils.KeyboardUtils.SoftKeyboardToggleListener {
    private final kotlin.properties.ReadOnlyProperty edtEmail$delegate = null;
    private final kotlin.properties.ReadOnlyProperty edtPass$delegate = null;
    private final kotlin.properties.ReadOnlyProperty btnSignIn$delegate = null;
    private final kotlin.properties.ReadOnlyProperty btnSignUp$delegate = null;
    private final kotlin.properties.ReadOnlyProperty spinnerType$delegate = null;
    private final kotlin.properties.ReadOnlyProperty edtNewChild$delegate = null;
    private final kotlin.properties.ReadOnlyProperty scroll$delegate = null;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.github.midros.istheapp.ui.activities.login.InterfaceInteractorLogin<com.github.midros.istheapp.ui.activities.login.InterfaceViewLogin> interactor;
    private java.util.HashMap _$_findViewCache;
    
    private final android.widget.EditText getEdtEmail() {
        return null;
    }
    
    private final android.widget.EditText getEdtPass() {
        return null;
    }
    
    private final android.widget.Button getBtnSignIn() {
        return null;
    }
    
    private final android.widget.TextView getBtnSignUp() {
        return null;
    }
    
    private final com.jaredrummler.materialspinner.MaterialSpinner getSpinnerType() {
        return null;
    }
    
    private final android.widget.EditText getEdtNewChild() {
        return null;
    }
    
    private final android.widget.ScrollView getScroll() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.github.midros.istheapp.ui.activities.login.InterfaceInteractorLogin<com.github.midros.istheapp.ui.activities.login.InterfaceViewLogin> getInteractor() {
        return null;
    }
    
    public final void setInteractor(@org.jetbrains.annotations.NotNull()
    com.github.midros.istheapp.ui.activities.login.InterfaceInteractorLogin<com.github.midros.istheapp.ui.activities.login.InterfaceViewLogin> p0) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onToggleSoftKeyboard(boolean isVisible) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    private final void onClickLogin() {
    }
    
    private final void checkData(kotlin.jvm.functions.Function0<kotlin.Unit> func) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    private final void checkPermissionType(kotlin.jvm.functions.Function0<kotlin.Unit> func) {
    }
    
    private final void signIn() {
    }
    
    private final void initializeSpinner() {
    }
    
    @java.lang.Override()
    public void successResult(boolean result, boolean filter) {
    }
    
    @java.lang.Override()
    public void failedResult(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable) {
    }
    
    public LoginActivity() {
        super(0);
    }
}