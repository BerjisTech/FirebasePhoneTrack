package com.github.midros.istheapp.ui.activities.register;

import java.lang.System;

/**
 * Created by luis rafael on 8/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020(H\u0003J\b\u0010,\u001a\u00020(H\u0002J\u0012\u0010-\u001a\u00020(2\b\u0010.\u001a\u0004\u0018\u00010/H\u0014J\b\u00100\u001a\u00020(H\u0014J\u001a\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106H\u0016J\u0010\u00107\u001a\u00020(2\u0006\u00108\u001a\u000202H\u0016J\u0018\u00109\u001a\u00020(2\u0006\u0010:\u001a\u0002022\u0006\u0010;\u001a\u000202H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0014\u0010\u0011R\u001b\u0010\u0016\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u0017\u0010\u0011R\u001b\u0010\u0019\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\n\u001a\u0004\b\u001a\u0010\u0011R$\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b&\u0010\n\u001a\u0004\b$\u0010%\u00a8\u0006<"}, d2 = {"Lcom/github/midros/istheapp/ui/activities/register/RegisterActivity;", "Lcom/github/midros/istheapp/ui/activities/base/BaseActivity;", "Lcom/github/midros/istheapp/ui/activities/register/InterfaceViewRegister;", "Lcom/github/midros/istheapp/utils/KeyboardUtils$SoftKeyboardToggleListener;", "()V", "btnHaveAccount", "Landroid/widget/Button;", "getBtnHaveAccount", "()Landroid/widget/Button;", "btnHaveAccount$delegate", "Lkotlin/properties/ReadOnlyProperty;", "btnSignUp", "getBtnSignUp", "btnSignUp$delegate", "edtEmail", "Landroid/widget/EditText;", "getEdtEmail", "()Landroid/widget/EditText;", "edtEmail$delegate", "edtNewChild", "getEdtNewChild", "edtNewChild$delegate", "edtPass", "getEdtPass", "edtPass$delegate", "edtPassRepeat", "getEdtPassRepeat", "edtPassRepeat$delegate", "interactor", "Lcom/github/midros/istheapp/ui/activities/register/InterfaceInteractorRegister;", "getInteractor", "()Lcom/github/midros/istheapp/ui/activities/register/InterfaceInteractorRegister;", "setInteractor", "(Lcom/github/midros/istheapp/ui/activities/register/InterfaceInteractorRegister;)V", "scroll", "Landroid/widget/ScrollView;", "getScroll", "()Landroid/widget/ScrollView;", "scroll$delegate", "failedResult", "", "throwable", "", "login", "onClickRegister", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onKeyDown", "", "keyCode", "", "event", "Landroid/view/KeyEvent;", "onToggleSoftKeyboard", "isVisible", "successResult", "result", "filter", "app_debug"})
public final class RegisterActivity extends com.github.midros.istheapp.ui.activities.base.BaseActivity implements com.github.midros.istheapp.ui.activities.register.InterfaceViewRegister, com.github.midros.istheapp.utils.KeyboardUtils.SoftKeyboardToggleListener {
    private final kotlin.properties.ReadOnlyProperty edtNewChild$delegate = null;
    private final kotlin.properties.ReadOnlyProperty edtEmail$delegate = null;
    private final kotlin.properties.ReadOnlyProperty edtPass$delegate = null;
    private final kotlin.properties.ReadOnlyProperty edtPassRepeat$delegate = null;
    private final kotlin.properties.ReadOnlyProperty btnSignUp$delegate = null;
    private final kotlin.properties.ReadOnlyProperty btnHaveAccount$delegate = null;
    private final kotlin.properties.ReadOnlyProperty scroll$delegate = null;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.github.midros.istheapp.ui.activities.register.InterfaceInteractorRegister<com.github.midros.istheapp.ui.activities.register.InterfaceViewRegister> interactor;
    private java.util.HashMap _$_findViewCache;
    
    private final android.widget.EditText getEdtNewChild() {
        return null;
    }
    
    private final android.widget.EditText getEdtEmail() {
        return null;
    }
    
    private final android.widget.EditText getEdtPass() {
        return null;
    }
    
    private final android.widget.EditText getEdtPassRepeat() {
        return null;
    }
    
    private final android.widget.Button getBtnSignUp() {
        return null;
    }
    
    private final android.widget.Button getBtnHaveAccount() {
        return null;
    }
    
    private final android.widget.ScrollView getScroll() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.github.midros.istheapp.ui.activities.register.InterfaceInteractorRegister<com.github.midros.istheapp.ui.activities.register.InterfaceViewRegister> getInteractor() {
        return null;
    }
    
    public final void setInteractor(@org.jetbrains.annotations.NotNull()
    com.github.midros.istheapp.ui.activities.register.InterfaceInteractorRegister<com.github.midros.istheapp.ui.activities.register.InterfaceViewRegister> p0) {
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
    
    private final void onClickRegister() {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    private final void login() {
    }
    
    @java.lang.Override()
    public void successResult(boolean result, boolean filter) {
    }
    
    @java.lang.Override()
    public void failedResult(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable) {
    }
    
    @java.lang.Override()
    public boolean onKeyDown(int keyCode, @org.jetbrains.annotations.Nullable()
    android.view.KeyEvent event) {
        return false;
    }
    
    public RegisterActivity() {
        super(0);
    }
}