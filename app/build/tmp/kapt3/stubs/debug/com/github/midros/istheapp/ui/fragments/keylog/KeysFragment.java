package com.github.midros.istheapp.ui.fragments.keylog;

import java.lang.System;

/**
 * Created by luis rafael on 17/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 a2\u00020\u00012\u00020\u0002:\u0001aB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020GH\u0017J\u0012\u0010H\u001a\u00020E2\b\u0010I\u001a\u0004\u0018\u00010JH\u0016J\b\u0010K\u001a\u00020LH\u0016J\u0010\u0010M\u001a\u00020E2\u0006\u0010N\u001a\u00020OH\u0016J\b\u0010P\u001a\u00020EH\u0016J\b\u0010Q\u001a\u00020EH\u0016J\u0010\u0010R\u001a\u00020E2\u0006\u0010S\u001a\u00020TH\u0016J\b\u0010U\u001a\u00020EH\u0016J\b\u0010V\u001a\u00020EH\u0016J\b\u0010W\u001a\u00020EH\u0002J\u0010\u0010X\u001a\u00020E2\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010Y\u001a\u00020E2\u0006\u0010Z\u001a\u00020[H\u0016J\b\u0010\\\u001a\u00020EH\u0002J\u0018\u0010]\u001a\u00020E2\u0006\u0010^\u001a\u00020L2\u0006\u0010_\u001a\u00020LH\u0016J\b\u0010`\u001a\u00020EH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b$\u0010\t\u001a\u0004\b\"\u0010#R\u001b\u0010%\u001a\u00020&8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b)\u0010\t\u001a\u0004\b\'\u0010(R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010,\u001a\u00020-8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b0\u0010\t\u001a\u0004\b.\u0010/R\u001b\u00101\u001a\u0002028BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b5\u0010\t\u001a\u0004\b3\u00104R\u001b\u00106\u001a\u0002028BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b8\u0010\t\u001a\u0004\b7\u00104R\u001b\u00109\u001a\u00020:8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b=\u0010\t\u001a\u0004\b;\u0010<R\u001b\u0010>\u001a\u00020:8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b@\u0010\t\u001a\u0004\b?\u0010<R\u001b\u0010A\u001a\u00020:8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bC\u0010\t\u001a\u0004\bB\u0010<\u00a8\u0006b"}, d2 = {"Lcom/github/midros/istheapp/ui/fragments/keylog/KeysFragment;", "Lcom/github/midros/istheapp/ui/fragments/base/BaseFragment;", "Lcom/github/midros/istheapp/ui/fragments/keylog/InterfaceViewKeys;", "()V", "appBar", "Lcom/google/android/material/appbar/AppBarLayout;", "getAppBar", "()Lcom/google/android/material/appbar/AppBarLayout;", "appBar$delegate", "Lkotlin/properties/ReadOnlyProperty;", "content", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getContent", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "content$delegate", "floatingButton", "Lcom/github/clans/fab/FloatingActionButton;", "getFloatingButton", "()Lcom/github/clans/fab/FloatingActionButton;", "floatingButton$delegate", "interactor", "Lcom/github/midros/istheapp/ui/fragments/keylog/InterfaceInteractorKeys;", "getInteractor", "()Lcom/github/midros/istheapp/ui/fragments/keylog/InterfaceInteractorKeys;", "setInteractor", "(Lcom/github/midros/istheapp/ui/fragments/keylog/InterfaceInteractorKeys;)V", "layoutM", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getLayoutM", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "setLayoutM", "(Landroidx/recyclerview/widget/LinearLayoutManager;)V", "list", "Lcom/github/midros/istheapp/ui/widget/CustomRecyclerView;", "getList", "()Lcom/github/midros/istheapp/ui/widget/CustomRecyclerView;", "list$delegate", "main", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "getMain", "()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "main$delegate", "recyclerAdapter", "Lcom/github/midros/istheapp/ui/adapters/keysadapter/KeysRecyclerAdapter;", "toolbar", "Lcom/github/midros/istheapp/ui/widget/toolbar/CustomToolbar;", "getToolbar", "()Lcom/github/midros/istheapp/ui/widget/toolbar/CustomToolbar;", "toolbar$delegate", "txtFailed", "Landroid/widget/TextView;", "getTxtFailed", "()Landroid/widget/TextView;", "txtFailed$delegate", "txtNotHave", "getTxtNotHave", "txtNotHave$delegate", "viewFailed", "Landroid/widget/LinearLayout;", "getViewFailed", "()Landroid/widget/LinearLayout;", "viewFailed$delegate", "viewNotHave", "getViewNotHave", "viewNotHave$delegate", "viewProgress", "getViewProgress", "viewProgress$delegate", "failedResult", "", "throwable", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onBackPressed", "", "onButtonClicked", "buttonCode", "", "onChangeHeight", "onDetach", "onSearchConfirmed", "text", "", "onStart", "onStop", "recyclerPosition", "setRecyclerAdapter", "setValueState", "dataSnapshot", "Lcom/google/firebase/database/DataSnapshot;", "startData", "successResult", "result", "filter", "timeConnection", "Companion", "app_debug"})
public final class KeysFragment extends com.github.midros.istheapp.ui.fragments.base.BaseFragment implements com.github.midros.istheapp.ui.fragments.keylog.InterfaceViewKeys {
    private final kotlin.properties.ReadOnlyProperty viewProgress$delegate = null;
    private final kotlin.properties.ReadOnlyProperty viewNotHave$delegate = null;
    private final kotlin.properties.ReadOnlyProperty viewFailed$delegate = null;
    private final kotlin.properties.ReadOnlyProperty txtNotHave$delegate = null;
    private final kotlin.properties.ReadOnlyProperty txtFailed$delegate = null;
    private final kotlin.properties.ReadOnlyProperty list$delegate = null;
    private final kotlin.properties.ReadOnlyProperty floatingButton$delegate = null;
    private final kotlin.properties.ReadOnlyProperty content$delegate = null;
    private final kotlin.properties.ReadOnlyProperty appBar$delegate = null;
    private final kotlin.properties.ReadOnlyProperty toolbar$delegate = null;
    private final kotlin.properties.ReadOnlyProperty main$delegate = null;
    private com.github.midros.istheapp.ui.adapters.keysadapter.KeysRecyclerAdapter recyclerAdapter;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.github.midros.istheapp.ui.fragments.keylog.InterfaceInteractorKeys<com.github.midros.istheapp.ui.fragments.keylog.InterfaceViewKeys> interactor;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.recyclerview.widget.LinearLayoutManager layoutM;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "KeysFragment";
    public static final com.github.midros.istheapp.ui.fragments.keylog.KeysFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final android.widget.LinearLayout getViewProgress() {
        return null;
    }
    
    private final android.widget.LinearLayout getViewNotHave() {
        return null;
    }
    
    private final android.widget.LinearLayout getViewFailed() {
        return null;
    }
    
    private final android.widget.TextView getTxtNotHave() {
        return null;
    }
    
    private final android.widget.TextView getTxtFailed() {
        return null;
    }
    
    private final com.github.midros.istheapp.ui.widget.CustomRecyclerView getList() {
        return null;
    }
    
    private final com.github.clans.fab.FloatingActionButton getFloatingButton() {
        return null;
    }
    
    private final androidx.constraintlayout.widget.ConstraintLayout getContent() {
        return null;
    }
    
    private final com.google.android.material.appbar.AppBarLayout getAppBar() {
        return null;
    }
    
    private final com.github.midros.istheapp.ui.widget.toolbar.CustomToolbar getToolbar() {
        return null;
    }
    
    private final androidx.coordinatorlayout.widget.CoordinatorLayout getMain() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.github.midros.istheapp.ui.fragments.keylog.InterfaceInteractorKeys<com.github.midros.istheapp.ui.fragments.keylog.InterfaceViewKeys> getInteractor() {
        return null;
    }
    
    public final void setInteractor(@org.jetbrains.annotations.NotNull()
    com.github.midros.istheapp.ui.fragments.keylog.InterfaceInteractorKeys<com.github.midros.istheapp.ui.fragments.keylog.InterfaceViewKeys> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.LinearLayoutManager getLayoutM() {
        return null;
    }
    
    public final void setLayoutM(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.LinearLayoutManager p0) {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void timeConnection() {
    }
    
    private final void startData() {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void setValueState(@org.jetbrains.annotations.NotNull()
    com.google.firebase.database.DataSnapshot dataSnapshot) {
    }
    
    @java.lang.Override()
    public void successResult(boolean result, boolean filter) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    public void failedResult(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable) {
    }
    
    @java.lang.Override()
    public void setRecyclerAdapter(@org.jetbrains.annotations.NotNull()
    com.github.midros.istheapp.ui.adapters.keysadapter.KeysRecyclerAdapter recyclerAdapter) {
    }
    
    private final void recyclerPosition() {
    }
    
    @java.lang.Override()
    public void onSearchConfirmed(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text) {
    }
    
    @java.lang.Override()
    public void onButtonClicked(int buttonCode) {
    }
    
    @java.lang.Override()
    public boolean onBackPressed() {
        return false;
    }
    
    @java.lang.Override()
    public void onChangeHeight() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onDetach() {
    }
    
    public KeysFragment() {
        super(0);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/github/midros/istheapp/ui/fragments/keylog/KeysFragment$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}