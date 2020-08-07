package com.github.midros.istheapp.ui.fragments.recording;

import java.lang.System;

/**
 * Created by luis rafael on 17/03/19.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00b6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u0000 w2\u00020\u00012\u00020\u0002:\u0001wB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020OH\u0017J\"\u0010P\u001a\u00020M2\b\u0010Q\u001a\u0004\u0018\u00010R2\u0006\u0010S\u001a\u00020R2\u0006\u0010T\u001a\u00020RH\u0002J\u0010\u0010U\u001a\u00020M2\u0006\u0010V\u001a\u000201H\u0016J\u0012\u0010W\u001a\u00020M2\b\u0010X\u001a\u0004\u0018\u00010YH\u0016J\b\u0010Z\u001a\u000201H\u0016J\u0010\u0010[\u001a\u00020M2\u0006\u0010\\\u001a\u00020]H\u0016J\b\u0010^\u001a\u00020MH\u0016J\b\u0010_\u001a\u00020MH\u0002J\b\u0010`\u001a\u00020MH\u0016J\b\u0010a\u001a\u00020MH\u0016J*\u0010b\u001a\u00020M2\b\u0010Q\u001a\u0004\u0018\u00010R2\u0006\u0010S\u001a\u00020R2\u0006\u0010T\u001a\u00020R2\u0006\u0010c\u001a\u00020]H\u0016J*\u0010d\u001a\u00020M2\b\u0010Q\u001a\u0004\u0018\u00010R2\u0006\u0010S\u001a\u00020R2\u0006\u0010T\u001a\u00020R2\u0006\u0010c\u001a\u00020]H\u0016J\u0010\u0010e\u001a\u00020M2\u0006\u0010f\u001a\u00020gH\u0016J\b\u0010h\u001a\u00020MH\u0016J\b\u0010i\u001a\u00020MH\u0016J\b\u0010j\u001a\u00020MH\u0002J\u0010\u0010k\u001a\u00020M2\u0006\u00102\u001a\u000203H\u0016J\u0010\u0010l\u001a\u00020M2\u0006\u0010m\u001a\u00020nH\u0016J\u0010\u0010o\u001a\u00020M2\u0006\u0010p\u001a\u00020qH\u0016J\b\u0010r\u001a\u00020MH\u0002J\u0018\u0010s\u001a\u00020M2\u0006\u0010t\u001a\u0002012\u0006\u0010u\u001a\u000201H\u0016J\b\u0010v\u001a\u00020MH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\t\u001a\u0004\b\u0018\u0010\rR$\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u00020!8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001b\u0010&\u001a\u00020\'8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b*\u0010\t\u001a\u0004\b(\u0010)R\u001b\u0010+\u001a\u00020,8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b/\u0010\t\u001a\u0004\b-\u0010.R\u000e\u00100\u001a\u000201X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u000103X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u00104\u001a\u0002058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b8\u0010\t\u001a\u0004\b6\u00107R\u001b\u00109\u001a\u00020:8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b=\u0010\t\u001a\u0004\b;\u0010<R\u001b\u0010>\u001a\u00020:8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b@\u0010\t\u001a\u0004\b?\u0010<R\u001b\u0010A\u001a\u00020B8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bE\u0010\t\u001a\u0004\bC\u0010DR\u001b\u0010F\u001a\u00020B8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bH\u0010\t\u001a\u0004\bG\u0010DR\u001b\u0010I\u001a\u00020B8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bK\u0010\t\u001a\u0004\bJ\u0010D\u00a8\u0006x"}, d2 = {"Lcom/github/midros/istheapp/ui/fragments/recording/RecordingFragment;", "Lcom/github/midros/istheapp/ui/fragments/base/BaseFragment;", "Lcom/github/midros/istheapp/ui/fragments/recording/InterfaceViewRecording;", "()V", "appBar", "Lcom/google/android/material/appbar/AppBarLayout;", "getAppBar", "()Lcom/google/android/material/appbar/AppBarLayout;", "appBar$delegate", "Lkotlin/properties/ReadOnlyProperty;", "buttonAddRecord", "Lcom/github/clans/fab/FloatingActionButton;", "getButtonAddRecord", "()Lcom/github/clans/fab/FloatingActionButton;", "buttonAddRecord$delegate", "content", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getContent", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "content$delegate", "dataList", "", "Lcom/github/midros/istheapp/data/model/DataDelete;", "floatingButton", "getFloatingButton", "floatingButton$delegate", "interactor", "Lcom/github/midros/istheapp/ui/fragments/recording/InterfaceInteractorRecording;", "getInteractor", "()Lcom/github/midros/istheapp/ui/fragments/recording/InterfaceInteractorRecording;", "setInteractor", "(Lcom/github/midros/istheapp/ui/fragments/recording/InterfaceInteractorRecording;)V", "layoutM", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getLayoutM", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "setLayoutM", "(Landroidx/recyclerview/widget/LinearLayoutManager;)V", "list", "Lcom/github/midros/istheapp/ui/widget/CustomRecyclerView;", "getList", "()Lcom/github/midros/istheapp/ui/widget/CustomRecyclerView;", "list$delegate", "main", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "getMain", "()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "main$delegate", "recording", "", "recyclerAdapter", "Lcom/github/midros/istheapp/ui/adapters/recordingadapter/RecordingRecyclerAdapter;", "toolbar", "Lcom/github/midros/istheapp/ui/widget/toolbar/CustomToolbar;", "getToolbar", "()Lcom/github/midros/istheapp/ui/widget/toolbar/CustomToolbar;", "toolbar$delegate", "txtFailed", "Landroid/widget/TextView;", "getTxtFailed", "()Landroid/widget/TextView;", "txtFailed$delegate", "txtNotHave", "getTxtNotHave", "txtNotHave$delegate", "viewFailed", "Landroid/widget/LinearLayout;", "getViewFailed", "()Landroid/widget/LinearLayout;", "viewFailed$delegate", "viewNotHave", "getViewNotHave", "viewNotHave$delegate", "viewProgress", "getViewProgress", "viewProgress$delegate", "failedResult", "", "throwable", "", "itemSelected", "key", "", "child", "file", "onActionStateChanged", "enabled", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onBackPressed", "onButtonClicked", "buttonCode", "", "onChangeHeight", "onClick", "onDetach", "onHideFragment", "onItemClick", "position", "onItemLongClick", "onSearchConfirmed", "text", "", "onStart", "onStop", "recyclerPosition", "setRecyclerAdapter", "setValueState", "dataSnapshot", "Lcom/google/firebase/database/DataSnapshot;", "setValueTimerRecording", "timer", "", "startData", "successResult", "result", "filter", "timeConnection", "Companion", "app_debug"})
public final class RecordingFragment extends com.github.midros.istheapp.ui.fragments.base.BaseFragment implements com.github.midros.istheapp.ui.fragments.recording.InterfaceViewRecording {
    private java.util.List<com.github.midros.istheapp.data.model.DataDelete> dataList;
    private boolean recording;
    private final kotlin.properties.ReadOnlyProperty viewProgress$delegate = null;
    private final kotlin.properties.ReadOnlyProperty viewNotHave$delegate = null;
    private final kotlin.properties.ReadOnlyProperty viewFailed$delegate = null;
    private final kotlin.properties.ReadOnlyProperty txtNotHave$delegate = null;
    private final kotlin.properties.ReadOnlyProperty txtFailed$delegate = null;
    private final kotlin.properties.ReadOnlyProperty list$delegate = null;
    private final kotlin.properties.ReadOnlyProperty buttonAddRecord$delegate = null;
    private final kotlin.properties.ReadOnlyProperty floatingButton$delegate = null;
    private final kotlin.properties.ReadOnlyProperty content$delegate = null;
    private final kotlin.properties.ReadOnlyProperty appBar$delegate = null;
    private final kotlin.properties.ReadOnlyProperty toolbar$delegate = null;
    private final kotlin.properties.ReadOnlyProperty main$delegate = null;
    private com.github.midros.istheapp.ui.adapters.recordingadapter.RecordingRecyclerAdapter recyclerAdapter;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.github.midros.istheapp.ui.fragments.recording.InterfaceInteractorRecording<com.github.midros.istheapp.ui.fragments.recording.InterfaceViewRecording> interactor;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.recyclerview.widget.LinearLayoutManager layoutM;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "RecordingFragment";
    public static final com.github.midros.istheapp.ui.fragments.recording.RecordingFragment.Companion Companion = null;
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
    
    private final com.github.clans.fab.FloatingActionButton getButtonAddRecord() {
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
    public final com.github.midros.istheapp.ui.fragments.recording.InterfaceInteractorRecording<com.github.midros.istheapp.ui.fragments.recording.InterfaceViewRecording> getInteractor() {
        return null;
    }
    
    public final void setInteractor(@org.jetbrains.annotations.NotNull()
    com.github.midros.istheapp.ui.fragments.recording.InterfaceInteractorRecording<com.github.midros.istheapp.ui.fragments.recording.InterfaceViewRecording> p0) {
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
    
    private final void startData() {
    }
    
    private final void onClick() {
    }
    
    private final void timeConnection() {
    }
    
    @java.lang.Override()
    public void onStart() {
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
    com.github.midros.istheapp.ui.adapters.recordingadapter.RecordingRecyclerAdapter recyclerAdapter) {
    }
    
    private final void recyclerPosition() {
    }
    
    @java.lang.Override()
    public void setValueState(@org.jetbrains.annotations.NotNull()
    com.google.firebase.database.DataSnapshot dataSnapshot) {
    }
    
    @java.lang.Override()
    public void setValueTimerRecording(long timer) {
    }
    
    @java.lang.Override()
    public void onSearchConfirmed(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text) {
    }
    
    @java.lang.Override()
    public void onButtonClicked(int buttonCode) {
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
    
    private final void itemSelected(java.lang.String key, java.lang.String child, java.lang.String file) {
    }
    
    @java.lang.Override()
    public void onActionStateChanged(boolean enabled) {
    }
    
    @java.lang.Override()
    public boolean onBackPressed() {
        return false;
    }
    
    @java.lang.Override()
    public void onHideFragment() {
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
    
    public RecordingFragment() {
        super(0);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/github/midros/istheapp/ui/fragments/recording/RecordingFragment$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}