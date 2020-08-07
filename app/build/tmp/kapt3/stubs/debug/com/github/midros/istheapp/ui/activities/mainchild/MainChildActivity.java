package com.github.midros.istheapp.ui.activities.mainchild;

import java.lang.System;

/**
 * Created by luis rafael on 27/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\f\u00107\u001a\b\u0012\u0004\u0012\u00020208H\u0002J\b\u00109\u001a\u000202H\u0002J\b\u0010:\u001a\u000202H\u0002J*\u0010;\u001a\u0002022\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020=2\u0010\b\u0002\u0010?\u001a\n\u0012\u0004\u0012\u000202\u0018\u000108H\u0002J\u0010\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u000204H\u0002J\b\u0010C\u001a\u000202H\u0002J\b\u0010D\u001a\u000202H\u0002J\u0012\u0010E\u001a\u0002022\b\u0010F\u001a\u0004\u0018\u00010GH\u0014J\b\u0010H\u001a\u000202H\u0014J\b\u0010I\u001a\u000202H\u0014R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\b\u001a\u0004\b\r\u0010\u0006R\u001b\u0010\u000f\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\b\u001a\u0004\b\u0010\u0010\u0006R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\b\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\b\u001a\u0004\b\u0018\u0010\u0006R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b$\u0010\b\u001a\u0004\b\"\u0010#R\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\'\u0010\b\u001a\u0004\b&\u0010#R\u001b\u0010(\u001a\u00020!8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b*\u0010\b\u001a\u0004\b)\u0010#R\u001b\u0010+\u001a\u00020!8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b-\u0010\b\u001a\u0004\b,\u0010#R\u001b\u0010.\u001a\u00020!8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b0\u0010\b\u001a\u0004\b/\u0010#\u00a8\u0006J"}, d2 = {"Lcom/github/midros/istheapp/ui/activities/mainchild/MainChildActivity;", "Lcom/github/midros/istheapp/ui/activities/base/BaseActivity;", "()V", "btnEnableNotificationListener", "Landroid/widget/RelativeLayout;", "getBtnEnableNotificationListener", "()Landroid/widget/RelativeLayout;", "btnEnableNotificationListener$delegate", "Lkotlin/properties/ReadOnlyProperty;", "btnEnableOverDraw", "getBtnEnableOverDraw", "btnEnableOverDraw$delegate", "btnEnableService", "getBtnEnableService", "btnEnableService$delegate", "btnEnableUsageStats", "getBtnEnableUsageStats", "btnEnableUsageStats$delegate", "btnHideApp", "Landroid/widget/Button;", "getBtnHideApp", "()Landroid/widget/Button;", "btnHideApp$delegate", "btnWhitelist", "getBtnWhitelist", "btnWhitelist$delegate", "firebase", "Lcom/github/midros/istheapp/data/rxFirebase/InterfaceFirebase;", "getFirebase", "()Lcom/github/midros/istheapp/data/rxFirebase/InterfaceFirebase;", "setFirebase", "(Lcom/github/midros/istheapp/data/rxFirebase/InterfaceFirebase;)V", "switchAccessibility", "Landroid/widget/Switch;", "getSwitchAccessibility", "()Landroid/widget/Switch;", "switchAccessibility$delegate", "switchNotificationListener", "getSwitchNotificationListener", "switchNotificationListener$delegate", "switchOverDraw", "getSwitchOverDraw", "switchOverDraw$delegate", "switchUsageStats", "getSwitchUsageStats", "switchUsageStats$delegate", "switchWhitelist", "getSwitchWhitelist", "switchWhitelist$delegate", "activatePermissionRoot", "", "command", "", "showDialog", "", "activate", "Lkotlin/Function0;", "checkPermissions", "checkSwitchPermissions", "dialog", "type", "", "msg", "action", "getReference", "Lcom/google/firebase/database/DatabaseReference;", "child", "init", "onClickApp", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onResume", "app_debug"})
public final class MainChildActivity extends com.github.midros.istheapp.ui.activities.base.BaseActivity {
    private final kotlin.properties.ReadOnlyProperty btnHideApp$delegate = null;
    private final kotlin.properties.ReadOnlyProperty btnEnableService$delegate = null;
    private final kotlin.properties.ReadOnlyProperty btnEnableOverDraw$delegate = null;
    private final kotlin.properties.ReadOnlyProperty btnEnableUsageStats$delegate = null;
    private final kotlin.properties.ReadOnlyProperty btnEnableNotificationListener$delegate = null;
    private final kotlin.properties.ReadOnlyProperty btnWhitelist$delegate = null;
    private final kotlin.properties.ReadOnlyProperty switchOverDraw$delegate = null;
    private final kotlin.properties.ReadOnlyProperty switchUsageStats$delegate = null;
    private final kotlin.properties.ReadOnlyProperty switchAccessibility$delegate = null;
    private final kotlin.properties.ReadOnlyProperty switchNotificationListener$delegate = null;
    private final kotlin.properties.ReadOnlyProperty switchWhitelist$delegate = null;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.github.midros.istheapp.data.rxFirebase.InterfaceFirebase firebase;
    private java.util.HashMap _$_findViewCache;
    
    private final android.widget.Button getBtnHideApp() {
        return null;
    }
    
    private final android.widget.RelativeLayout getBtnEnableService() {
        return null;
    }
    
    private final android.widget.RelativeLayout getBtnEnableOverDraw() {
        return null;
    }
    
    private final android.widget.RelativeLayout getBtnEnableUsageStats() {
        return null;
    }
    
    private final android.widget.RelativeLayout getBtnEnableNotificationListener() {
        return null;
    }
    
    private final android.widget.RelativeLayout getBtnWhitelist() {
        return null;
    }
    
    private final android.widget.Switch getSwitchOverDraw() {
        return null;
    }
    
    private final android.widget.Switch getSwitchUsageStats() {
        return null;
    }
    
    private final android.widget.Switch getSwitchAccessibility() {
        return null;
    }
    
    private final android.widget.Switch getSwitchNotificationListener() {
        return null;
    }
    
    private final android.widget.Switch getSwitchWhitelist() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.github.midros.istheapp.data.rxFirebase.InterfaceFirebase getFirebase() {
        return null;
    }
    
    public final void setFirebase(@org.jetbrains.annotations.NotNull()
    com.github.midros.istheapp.data.rxFirebase.InterfaceFirebase p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    private final void init() {
    }
    
    private final void checkSwitchPermissions() {
    }
    
    private final void onClickApp() {
    }
    
    private final com.google.firebase.database.DatabaseReference getReference(java.lang.String child) {
        return null;
    }
    
    private final void checkPermissions() {
    }
    
    private final void activatePermissionRoot(java.lang.String command, boolean showDialog, kotlin.jvm.functions.Function0<kotlin.Unit> activate) {
    }
    
    private final void dialog(int type, int msg, kotlin.jvm.functions.Function0<kotlin.Unit> action) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public MainChildActivity() {
        super(0);
    }
}