package com.github.midros.istheapp.ui.fragments.maps;

import java.lang.System;

/**
 * Created by luis rafael on 9/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 C2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001CB\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010/\u001a\u000200H\u0002J\u0012\u00101\u001a\u0002002\b\u00102\u001a\u0004\u0018\u000103H\u0016J\u0010\u00104\u001a\u0002002\u0006\u00105\u001a\u000206H\u0016J\b\u00107\u001a\u000200H\u0003J\b\u00108\u001a\u000200H\u0016J\u0010\u00109\u001a\u0002002\u0006\u0010:\u001a\u00020#H\u0016J\b\u0010;\u001a\u000200H\u0016J\u0010\u0010<\u001a\u0002002\u0006\u0010=\u001a\u00020>H\u0016J\u0010\u0010?\u001a\u0002002\u0006\u0010@\u001a\u00020AH\u0016J\u0010\u0010B\u001a\u0002002\u0006\u0010@\u001a\u00020AH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0011\u0010\u000eR$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00148\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u001bR\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\n\u001a\u0004\b\u001f\u0010 R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010$\u001a\u00020%8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001b\u0010*\u001a\u00020+8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b.\u0010\n\u001a\u0004\b,\u0010-\u00a8\u0006D"}, d2 = {"Lcom/github/midros/istheapp/ui/fragments/maps/MapsFragment;", "Lcom/github/midros/istheapp/ui/fragments/base/BaseFragment;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "Lcom/github/midros/istheapp/ui/fragments/maps/InterfaceViewMaps;", "()V", "appBar", "Lcom/google/android/material/appbar/AppBarLayout;", "getAppBar", "()Lcom/google/android/material/appbar/AppBarLayout;", "appBar$delegate", "Lkotlin/properties/ReadOnlyProperty;", "btnExport", "Lcom/github/clans/fab/FloatingActionButton;", "getBtnExport", "()Lcom/github/clans/fab/FloatingActionButton;", "btnExport$delegate", "btnLocation", "getBtnLocation", "btnLocation$delegate", "interactor", "Lcom/github/midros/istheapp/ui/fragments/maps/InterfaceInteractorMaps;", "getInteractor", "()Lcom/github/midros/istheapp/ui/fragments/maps/InterfaceInteractorMaps;", "setInteractor", "(Lcom/github/midros/istheapp/ui/fragments/maps/InterfaceInteractorMaps;)V", "latitude", "", "Ljava/lang/Double;", "longitude", "main", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "getMain", "()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "main$delegate", "maps", "Lcom/google/android/gms/maps/GoogleMap;", "mapsFragment", "Lcom/google/android/gms/maps/SupportMapFragment;", "getMapsFragment", "()Lcom/google/android/gms/maps/SupportMapFragment;", "setMapsFragment", "(Lcom/google/android/gms/maps/SupportMapFragment;)V", "toolbar", "Lcom/github/midros/istheapp/ui/widget/toolbar/CustomToolbar;", "getToolbar", "()Lcom/github/midros/istheapp/ui/widget/toolbar/CustomToolbar;", "toolbar$delegate", "initializeMaps", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onButtonClicked", "buttonCode", "", "onClick", "onDetach", "onMapReady", "map", "onStart", "setLocation", "location", "Lcom/github/midros/istheapp/data/model/Location;", "setValuePermission", "dataSnapshot", "Lcom/google/firebase/database/DataSnapshot;", "setValueState", "Companion", "app_debug"})
public final class MapsFragment extends com.github.midros.istheapp.ui.fragments.base.BaseFragment implements com.google.android.gms.maps.OnMapReadyCallback, com.github.midros.istheapp.ui.fragments.maps.InterfaceViewMaps {
    private final kotlin.properties.ReadOnlyProperty toolbar$delegate = null;
    private final kotlin.properties.ReadOnlyProperty btnLocation$delegate = null;
    private final kotlin.properties.ReadOnlyProperty btnExport$delegate = null;
    private final kotlin.properties.ReadOnlyProperty appBar$delegate = null;
    private final kotlin.properties.ReadOnlyProperty main$delegate = null;
    private java.lang.Double latitude;
    private java.lang.Double longitude;
    private com.google.android.gms.maps.GoogleMap maps;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.google.android.gms.maps.SupportMapFragment mapsFragment;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.github.midros.istheapp.ui.fragments.maps.InterfaceInteractorMaps<com.github.midros.istheapp.ui.fragments.maps.InterfaceViewMaps> interactor;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "MapsFragment";
    public static final com.github.midros.istheapp.ui.fragments.maps.MapsFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.github.midros.istheapp.ui.widget.toolbar.CustomToolbar getToolbar() {
        return null;
    }
    
    private final com.github.clans.fab.FloatingActionButton getBtnLocation() {
        return null;
    }
    
    private final com.github.clans.fab.FloatingActionButton getBtnExport() {
        return null;
    }
    
    private final com.google.android.material.appbar.AppBarLayout getAppBar() {
        return null;
    }
    
    private final androidx.coordinatorlayout.widget.CoordinatorLayout getMain() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.maps.SupportMapFragment getMapsFragment() {
        return null;
    }
    
    public final void setMapsFragment(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.SupportMapFragment p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.github.midros.istheapp.ui.fragments.maps.InterfaceInteractorMaps<com.github.midros.istheapp.ui.fragments.maps.InterfaceViewMaps> getInteractor() {
        return null;
    }
    
    public final void setInteractor(@org.jetbrains.annotations.NotNull()
    com.github.midros.istheapp.ui.fragments.maps.InterfaceInteractorMaps<com.github.midros.istheapp.ui.fragments.maps.InterfaceViewMaps> p0) {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    private final void onClick() {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    private final void initializeMaps() {
    }
    
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap map) {
    }
    
    @java.lang.Override()
    public void setLocation(@org.jetbrains.annotations.NotNull()
    com.github.midros.istheapp.data.model.Location location) {
    }
    
    @java.lang.Override()
    public void setValueState(@org.jetbrains.annotations.NotNull()
    com.google.firebase.database.DataSnapshot dataSnapshot) {
    }
    
    @java.lang.Override()
    public void setValuePermission(@org.jetbrains.annotations.NotNull()
    com.google.firebase.database.DataSnapshot dataSnapshot) {
    }
    
    @java.lang.Override()
    public void onButtonClicked(int buttonCode) {
    }
    
    @java.lang.Override()
    public void onDetach() {
    }
    
    public MapsFragment() {
        super(0);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/github/midros/istheapp/ui/fragments/maps/MapsFragment$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}