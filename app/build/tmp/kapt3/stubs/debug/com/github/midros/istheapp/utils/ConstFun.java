package com.github.midros.istheapp.utils;

import java.lang.System;

/**
 * Created by luis rafael on 9/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00d6\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u001e\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011J0\u0010\u0013\u001a,\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\n0\n\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00160\u0016\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00160\u00160\u0014J2\u0010\u0017\u001a,\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\n0\n\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00160\u0016\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00160\u00160\u0014H\u0002JH\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u0019\"\u0006\b\u0000\u0010\u001a\u0018\u00012\u0006\u0010\u001b\u001a\u00020\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\n2\u0016\u0010\u001e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\u001f\"\u0004\u0018\u00010\nH\u0086\b\u00a2\u0006\u0002\u0010 J\b\u0010!\u001a\u00020\nH\u0007J\u0006\u0010\"\u001a\u00020\nJ\u0006\u0010#\u001a\u00020\nJ\u0006\u0010$\u001a\u00020\u0016J\b\u0010%\u001a\u00020\u0016H\u0002J\u0006\u0010&\u001a\u00020\u0016J\u0016\u0010\'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0016J\u0014\u0010+\u001a\u00020\n2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-J\u001c\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\f2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000403J\u0014\u00104\u001a\b\u0012\u0004\u0012\u00020.0-2\u0006\u00105\u001a\u00020\nJ\n\u00106\u001a\u00020\u0004*\u000207J\u001c\u00108\u001a\u000209*\u0002072\u0006\u0010:\u001a\u00020;2\b\b\u0002\u0010<\u001a\u00020\u0016JV\u00108\u001a\u00020=*\u0002072\u0006\u0010>\u001a\u00020\u00112\u0006\u0010?\u001a\u00020\u00112\b\u0010@\u001a\u0004\u0018\u00010\n2\b\u0010A\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010<\u001a\u00020\u00162\u0017\u00102\u001a\u0013\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\u00040B\u00a2\u0006\u0002\bC\u00a2\u0006\u0002\u0010DJ\u001a\u0010E\u001a\u00020\u0004*\u00020F2\u0006\u0010G\u001a\u00020\u00112\u0006\u0010H\u001a\u00020\u0011J(\u0010I\u001a\u0002HJ\"\n\b\u0000\u0010J\u0018\u0001*\u00020;*\u00020;2\b\b\u0001\u0010K\u001a\u00020\u0011H\u0086\b\u00a2\u0006\u0002\u0010LJ\n\u0010M\u001a\u00020\u0016*\u000207J\n\u0010N\u001a\u00020\u0016*\u000207J\u0012\u0010O\u001a\u00020\u0004*\u00020;2\u0006\u0010*\u001a\u00020\u0016J\n\u0010P\u001a\u00020Q*\u000207J\n\u0010R\u001a\u00020\u0004*\u000207J\n\u0010S\u001a\u00020Q*\u00020FJ\n\u0010T\u001a\u00020\u0004*\u000207J\n\u0010U\u001a\u00020Q*\u000207J\f\u0010V\u001a\u00020\u0004*\u000207H\u0007JW\u0010W\u001a,\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\n0\n\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00160\u0016\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00160\u00160\u0014*\u0002072!\u0010X\u001a\u001d\u0012\u0013\u0012\u00110\u0016\u00a2\u0006\f\bY\u0012\b\bZ\u0012\u0004\b\b(X\u0012\u0004\u0012\u00020\u00040BJ\u001a\u0010[\u001a\u00020\u0004*\u0002072\u0006\u0010\\\u001a\u00020\n2\u0006\u0010]\u001a\u00020\nJ\u0012\u0010^\u001a\u00020\u0004*\u00020_2\u0006\u0010`\u001a\u00020\u0011J\u001a\u0010a\u001a\u00020\u0004*\u00020_2\u0006\u0010b\u001a\u00020\n2\u0006\u0010c\u001a\u00020\u0011J\u0014\u0010d\u001a\u00020\u0004*\u0004\u0018\u00010;2\u0006\u0010e\u001a\u00020\bJ\u0012\u0010f\u001a\u00020\u0004*\u0002072\u0006\u0010g\u001a\u00020\fJ\u0014\u0010h\u001a\u00020\u0004*\u0002072\u0006\u0010*\u001a\u00020\u0016H\u0007J\u0012\u0010i\u001a\u00020\u0004*\u00020;2\u0006\u0010j\u001a\u00020\u0016J\u0019\u0010k\u001a\u00020\u0004\"\n\b\u0000\u0010\u001a\u0018\u0001*\u00020\u0001*\u00020FH\u0086\bJ)\u0010k\u001a\u00020\u0004\"\n\b\u0000\u0010\u001a\u0018\u0001*\u00020\u0001*\u00020F2\u0006\u0010G\u001a\u00020\u00112\u0006\u0010H\u001a\u00020\u0011H\u0086\bJ\u0012\u0010l\u001a\u00020\u0004*\u00020F2\u0006\u0010m\u001a\u00020\nJ1\u0010n\u001a\u00020\u0004\"\n\b\u0000\u0010o\u0018\u0001*\u00020\u0001*\u0002072\u0006\u0010p\u001a\u00020\n2\u0006\u0010q\u001a\u00020\n2\u0006\u0010r\u001a\u00020\u0011H\u0086\bJ\u001a\u0010s\u001a\u00020t*\u00020;2\u0006\u0010u\u001a\u00020v2\u0006\u0010w\u001a\u00020\f\u00a8\u0006x"}, d2 = {"Lcom/github/midros/istheapp/utils/ConstFun;", "", "()V", "contentGlobalLayout", "", "content", "Landroidx/constraintlayout/widget/ConstraintLayout;", "appBar", "Lcom/google/android/material/appbar/AppBarLayout;", "convertCurrentDuration", "", "currentDuration", "", "customAnimationMenu", "menu", "Lcom/github/clans/fab/FloatingActionMenu;", "drawableOpen", "", "drawableClose", "enableGpsRoot", "Landroid/os/AsyncTask;", "kotlin.jvm.PlatformType", "", "enableNetworkProviderRoot", "firebaseOptions", "Lcom/github/midros/istheapp/ui/adapters/basedapter/FirebaseOptions;", "T", "query", "Lcom/google/firebase/database/Query;", "filter", "child", "", "(Lcom/google/firebase/database/Query;Ljava/lang/String;[Ljava/lang/String;)Lcom/github/midros/istheapp/ui/adapters/basedapter/FirebaseOptions;", "getDateTime", "getPackageCheckSocial", "getRandomNumeric", "isAndroidM", "isAndroidO", "isRoot", "isScrollToolbar", "toolbar", "Lcom/github/midros/istheapp/ui/widget/toolbar/CustomToolbar;", "state", "listToStringChild", "list", "", "Lcom/github/midros/istheapp/data/model/Child;", "runThread", "Ljava/lang/Thread;", "sleep", "action", "Lkotlin/Function0;", "stringToListChild", "string", "adjustFontScale", "Landroid/content/Context;", "alertDialog", "Landroidx/appcompat/app/AlertDialog;", "v", "Landroid/view/View;", "cancellable", "Lcn/pedant/SweetAlert/SweetAlertDialog;", "alertType", "title", "msg", "txtPositiveButton", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Landroid/content/Context;IILjava/lang/String;Ljava/lang/Integer;ZLkotlin/jvm/functions/Function1;)Lcn/pedant/SweetAlert/SweetAlertDialog;", "animateActivity", "Landroid/app/Activity;", "enterAnim", "exitAnim", "find", "V", "id", "(Landroid/view/View;I)Landroid/view/View;", "isAddWhitelist", "isNotificationServiceRunning", "isShow", "openAccessibilitySettings", "Landroid/content/Intent;", "openAppSystemSettings", "openGallery", "openNotificationListenerSettings", "openUseAccessSettings", "openWhitelistSettings", "permissionRoot", "result", "Lkotlin/ParameterName;", "name", "sendToGoogleMaps", "latitude", "longitude", "setImageId", "Landroid/widget/ImageView;", "drawable", "setImageUrl", "url", "placeholder", "setPaddingCompass", "top", "setVibrate", "milliseconds", "showApp", "showKeyboard", "show", "startAnimateActivity", "startMain", "fragmentTag", "startServiceSms", "S", "smsAddress", "smsBody", "type", "viewAnimation", "Lcom/daimajia/androidanimations/library/YoYo$YoYoString;", "anim", "Lcom/daimajia/androidanimations/library/Techniques;", "duration", "app_debug"})
public final class ConstFun {
    public static final com.github.midros.istheapp.utils.ConstFun INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPackageCheckSocial() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRandomNumeric() {
        return null;
    }
    
    public final boolean isAndroidM() {
        return false;
    }
    
    private final boolean isAndroidO() {
        return false;
    }
    
    public final void setVibrate(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$setVibrate, long milliseconds) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.daimajia.androidanimations.library.YoYo.YoYoString viewAnimation(@org.jetbrains.annotations.NotNull()
    android.view.View $this$viewAnimation, @org.jetbrains.annotations.NotNull()
    com.daimajia.androidanimations.library.Techniques anim, long duration) {
        return null;
    }
    
    public final void startMain(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$startMain, @org.jetbrains.annotations.NotNull()
    java.lang.String fragmentTag) {
    }
    
    public final void animateActivity(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$animateActivity, int enterAnim, int exitAnim) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Intent openGallery(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$openGallery) {
        return null;
    }
    
    public final void isShow(@org.jetbrains.annotations.NotNull()
    android.view.View $this$isShow, boolean state) {
    }
    
    public final void openAppSystemSettings(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$openAppSystemSettings) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Thread runThread(long sleep, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> action) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public final java.lang.String getDateTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final cn.pedant.SweetAlert.SweetAlertDialog alertDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$alertDialog, int alertType, int title, @org.jetbrains.annotations.Nullable()
    java.lang.String msg, @org.jetbrains.annotations.Nullable()
    java.lang.Integer txtPositiveButton, boolean cancellable, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super cn.pedant.SweetAlert.SweetAlertDialog, kotlin.Unit> action) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.app.AlertDialog alertDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$alertDialog, @org.jetbrains.annotations.NotNull()
    android.view.View v, boolean cancellable) {
        return null;
    }
    
    public final void setImageUrl(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$setImageUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String url, int placeholder) {
    }
    
    public final void setImageId(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$setImageId, int drawable) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String convertCurrentDuration(long currentDuration) {
        return null;
    }
    
    public final void customAnimationMenu(@org.jetbrains.annotations.NotNull()
    com.github.clans.fab.FloatingActionMenu menu, int drawableOpen, int drawableClose) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Intent openAccessibilitySettings(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$openAccessibilitySettings) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Intent openUseAccessSettings(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$openUseAccessSettings) {
        return null;
    }
    
    public final void openNotificationListenerSettings(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$openNotificationListenerSettings) {
    }
    
    @android.annotation.SuppressLint(value = {"BatteryLife"})
    public final void openWhitelistSettings(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$openWhitelistSettings) {
    }
    
    public final boolean isRoot() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.os.AsyncTask<java.lang.String, java.lang.Boolean, java.lang.Boolean> permissionRoot(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$permissionRoot, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> result) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.os.AsyncTask<java.lang.String, java.lang.Boolean, java.lang.Boolean> enableGpsRoot() {
        return null;
    }
    
    private final android.os.AsyncTask<java.lang.String, java.lang.Boolean, java.lang.Boolean> enableNetworkProviderRoot() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"WrongConstant"})
    public final void showApp(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$showApp, boolean state) {
    }
    
    public final boolean isNotificationServiceRunning(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$isNotificationServiceRunning) {
        return false;
    }
    
    public final boolean isAddWhitelist(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$isAddWhitelist) {
        return false;
    }
    
    public final void showKeyboard(@org.jetbrains.annotations.NotNull()
    android.view.View $this$showKeyboard, boolean show) {
    }
    
    public final void contentGlobalLayout(@org.jetbrains.annotations.NotNull()
    androidx.constraintlayout.widget.ConstraintLayout content, @org.jetbrains.annotations.NotNull()
    com.google.android.material.appbar.AppBarLayout appBar) {
    }
    
    public final void adjustFontScale(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$adjustFontScale) {
    }
    
    public final void sendToGoogleMaps(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$sendToGoogleMaps, @org.jetbrains.annotations.NotNull()
    java.lang.String latitude, @org.jetbrains.annotations.NotNull()
    java.lang.String longitude) {
    }
    
    public final void isScrollToolbar(@org.jetbrains.annotations.NotNull()
    com.github.midros.istheapp.ui.widget.toolbar.CustomToolbar toolbar, boolean state) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String listToStringChild(@org.jetbrains.annotations.NotNull()
    java.util.List<com.github.midros.istheapp.data.model.Child> list) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.github.midros.istheapp.data.model.Child> stringToListChild(@org.jetbrains.annotations.NotNull()
    java.lang.String string) {
        return null;
    }
    
    public final void setPaddingCompass(@org.jetbrains.annotations.Nullable()
    android.view.View $this$setPaddingCompass, @org.jetbrains.annotations.NotNull()
    com.google.android.material.appbar.AppBarLayout top) {
    }
    
    private ConstFun() {
        super();
    }
}