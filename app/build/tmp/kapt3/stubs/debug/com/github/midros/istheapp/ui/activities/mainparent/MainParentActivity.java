package com.github.midros.istheapp.ui.activities.mainparent;

import java.lang.System;

/**
 * Created by luis rafael on 7/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0003J\b\u0010 \u001a\u00020\u001eH\u0016J\u0010\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u001eH\u0002J\b\u0010%\u001a\u00020\u001eH\u0002J\"\u0010&\u001a\u00020\u001e2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010+H\u0014J\b\u0010,\u001a\u00020\u001eH\u0016J\u0012\u0010-\u001a\u00020\u001e2\b\u0010.\u001a\u0004\u0018\u00010/H\u0014J\b\u00100\u001a\u00020\u001eH\u0014J\b\u00101\u001a\u00020\u001eH\u0016J\b\u00102\u001a\u00020\u001eH\u0016J\u0010\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0016J\u0012\u00107\u001a\u00020\u001e2\b\u0010.\u001a\u0004\u0018\u00010/H\u0014J\b\u00108\u001a\u00020\u001eH\u0016J\b\u00109\u001a\u00020\u001eH\u0016J\b\u0010:\u001a\u00020\u001eH\u0016J\b\u0010;\u001a\u00020\u001eH\u0016J\u0010\u0010<\u001a\u00020\u001e2\u0006\u0010=\u001a\u00020(H\u0016J\u0010\u0010>\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020?H\u0016J\b\u0010@\u001a\u00020\u001eH\u0002J\b\u0010A\u001a\u00020\u001eH\u0016J\b\u0010B\u001a\u00020\u001eH\u0016J\u0010\u0010C\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0012\u0010D\u001a\u00020\u001e2\b\u0010E\u001a\u0004\u0018\u00010FH\u0016J*\u0010G\u001a\u00020\u001e2\u0006\u0010H\u001a\u00020(2\u0006\u0010I\u001a\u00020\u000f2\u0010\b\u0002\u0010J\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010KH\u0002J\b\u0010L\u001a\u00020\u001eH\u0016J\u0018\u0010M\u001a\u00020\u001e2\u0006\u0010N\u001a\u0002042\u0006\u0010O\u001a\u000204H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00138\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006P"}, d2 = {"Lcom/github/midros/istheapp/ui/activities/mainparent/MainParentActivity;", "Lcom/github/midros/istheapp/ui/activities/base/BaseActivity;", "Lcom/github/midros/istheapp/ui/activities/mainparent/InterfaceViewMainParent;", "Lcom/google/android/material/navigation/NavigationView$OnNavigationItemSelectedListener;", "Lcom/github/midros/istheapp/utils/HomeWatcher$OnHomePressedListener;", "()V", "dialog", "Landroidx/appcompat/app/AlertDialog;", "drawerLayout", "Landroidx/drawerlayout/widget/DrawerLayout;", "getDrawerLayout", "()Landroidx/drawerlayout/widget/DrawerLayout;", "drawerLayout$delegate", "Lkotlin/properties/ReadOnlyProperty;", "fragmentTag", "", "homeWatcher", "Lcom/github/midros/istheapp/utils/HomeWatcher;", "interactorParent", "Lcom/github/midros/istheapp/ui/activities/mainparent/InterfaceInteractorMainParent;", "getInteractorParent", "()Lcom/github/midros/istheapp/ui/activities/mainparent/InterfaceInteractorMainParent;", "setInteractorParent", "(Lcom/github/midros/istheapp/ui/activities/mainparent/InterfaceInteractorMainParent;)V", "navView", "Lcom/google/android/material/navigation/NavigationView;", "getNavView", "()Lcom/google/android/material/navigation/NavigationView;", "navView$delegate", "changeChild", "", "checkPermissionStorage", "closeNavigationDrawer", "failedResult", "throwable", "", "initializeDrawerLayout", "initializeHomeWatcher", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onFinishCount", "onHomePressed", "onNavigationItemSelected", "", "p0", "Landroid/view/MenuItem;", "onPostCreate", "onRecentApps", "onUserInteraction", "openDrawer", "requestApplyInsets", "setCheckedNavigationItem", "id", "setDataAccounts", "Lcom/google/firebase/database/DataSnapshot;", "setDataUser", "setDrawerLock", "setDrawerUnLock", "setFragmentTag", "setMenu", "menu", "Landroidx/appcompat/widget/PopupMenu;", "showDialogClearLogList", "msg", "child", "action", "Lkotlin/Function0;", "signOutView", "successResult", "result", "filter", "app_debug"})
public final class MainParentActivity extends com.github.midros.istheapp.ui.activities.base.BaseActivity implements com.github.midros.istheapp.ui.activities.mainparent.InterfaceViewMainParent, com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener, com.github.midros.istheapp.utils.HomeWatcher.OnHomePressedListener {
    private final kotlin.properties.ReadOnlyProperty drawerLayout$delegate = null;
    private final kotlin.properties.ReadOnlyProperty navView$delegate = null;
    private com.github.midros.istheapp.utils.HomeWatcher homeWatcher;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.github.midros.istheapp.ui.activities.mainparent.InterfaceInteractorMainParent<com.github.midros.istheapp.ui.activities.mainparent.InterfaceViewMainParent> interactorParent;
    private androidx.appcompat.app.AlertDialog dialog;
    private java.lang.String fragmentTag;
    private java.util.HashMap _$_findViewCache;
    
    private final androidx.drawerlayout.widget.DrawerLayout getDrawerLayout() {
        return null;
    }
    
    private final com.google.android.material.navigation.NavigationView getNavView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.github.midros.istheapp.ui.activities.mainparent.InterfaceInteractorMainParent<com.github.midros.istheapp.ui.activities.mainparent.InterfaceViewMainParent> getInteractorParent() {
        return null;
    }
    
    public final void setInteractorParent(@org.jetbrains.annotations.NotNull()
    com.github.midros.istheapp.ui.activities.mainparent.InterfaceInteractorMainParent<com.github.midros.istheapp.ui.activities.mainparent.InterfaceViewMainParent> p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initializeHomeWatcher() {
    }
    
    @java.lang.Override()
    public void onHomePressed() {
    }
    
    @java.lang.Override()
    public void onRecentApps() {
    }
    
    @java.lang.Override()
    protected void onPostCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setDataUser() {
    }
    
    @java.lang.Override()
    public void setDataAccounts(@org.jetbrains.annotations.NotNull()
    com.google.firebase.database.DataSnapshot data) {
    }
    
    @java.lang.Override()
    public void changeChild(@org.jetbrains.annotations.NotNull()
    java.lang.String fragmentTag) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    private final void checkPermissionStorage() {
    }
    
    @java.lang.Override()
    public void onUserInteraction() {
    }
    
    private final void initializeDrawerLayout() {
    }
    
    @java.lang.Override()
    public void openDrawer() {
    }
    
    @java.lang.Override()
    public void setMenu(@org.jetbrains.annotations.Nullable()
    androidx.appcompat.widget.PopupMenu menu) {
    }
    
    @java.lang.Override()
    public boolean onNavigationItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem p0) {
        return false;
    }
    
    private final void setFragmentTag(java.lang.String fragmentTag) {
    }
    
    @java.lang.Override()
    public void closeNavigationDrawer() {
    }
    
    @java.lang.Override()
    public void setDrawerLock() {
    }
    
    @java.lang.Override()
    public void setDrawerUnLock() {
    }
    
    @java.lang.Override()
    public void requestApplyInsets() {
    }
    
    @java.lang.Override()
    public void setCheckedNavigationItem(int id) {
    }
    
    private final void showDialogClearLogList(int msg, java.lang.String child, kotlin.jvm.functions.Function0<kotlin.Unit> action) {
    }
    
    @java.lang.Override()
    public void signOutView() {
    }
    
    @java.lang.Override()
    public void successResult(boolean result, boolean filter) {
    }
    
    @java.lang.Override()
    public void failedResult(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable) {
    }
    
    @java.lang.Override()
    public void onFinishCount() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public MainParentActivity() {
        super(0);
    }
}