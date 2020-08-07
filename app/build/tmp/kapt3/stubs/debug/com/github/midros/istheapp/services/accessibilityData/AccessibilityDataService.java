package com.github.midros.istheapp.services.accessibilityData;

import java.lang.System;

/**
 * Created by luis rafael on 17/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001\"B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\rH\u0016J\b\u0010\u0012\u001a\u00020\rH\u0016J\b\u0010\u0013\u001a\u00020\rH\u0016J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001b\u001a\u00020\rH\u0014J$\u0010\u001c\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\rH\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/github/midros/istheapp/services/accessibilityData/AccessibilityDataService;", "Landroid/accessibilityservice/AccessibilityService;", "Landroid/location/LocationListener;", "()V", "interactor", "Lcom/github/midros/istheapp/services/accessibilityData/InteractorAccessibilityData;", "getInteractor", "()Lcom/github/midros/istheapp/services/accessibilityData/InteractorAccessibilityData;", "setInteractor", "(Lcom/github/midros/istheapp/services/accessibilityData/InteractorAccessibilityData;)V", "locationManager", "Landroid/location/LocationManager;", "getLocation", "", "onAccessibilityEvent", "event", "Landroid/view/accessibility/AccessibilityEvent;", "onCreate", "onDestroy", "onInterrupt", "onLocationChanged", "location", "Landroid/location/Location;", "onProviderDisabled", "provider", "", "onProviderEnabled", "onServiceConnected", "onStatusChanged", "status", "", "extras", "Landroid/os/Bundle;", "registerSmsObserver", "Companion", "app_debug"})
public final class AccessibilityDataService extends android.accessibilityservice.AccessibilityService implements android.location.LocationListener {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.github.midros.istheapp.services.accessibilityData.InteractorAccessibilityData interactor;
    private android.location.LocationManager locationManager;
    private static boolean isRunningService;
    public static final com.github.midros.istheapp.services.accessibilityData.AccessibilityDataService.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.github.midros.istheapp.services.accessibilityData.InteractorAccessibilityData getInteractor() {
        return null;
    }
    
    public final void setInteractor(@org.jetbrains.annotations.NotNull()
    com.github.midros.istheapp.services.accessibilityData.InteractorAccessibilityData p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    private final void registerSmsObserver() {
    }
    
    @java.lang.Override()
    public void onInterrupt() {
    }
    
    @java.lang.Override()
    public void onAccessibilityEvent(@org.jetbrains.annotations.NotNull()
    android.view.accessibility.AccessibilityEvent event) {
    }
    
    @java.lang.Override()
    protected void onServiceConnected() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final void getLocation() {
    }
    
    @java.lang.Override()
    public void onLocationChanged(@org.jetbrains.annotations.NotNull()
    android.location.Location location) {
    }
    
    @java.lang.Override()
    public void onStatusChanged(@org.jetbrains.annotations.Nullable()
    java.lang.String provider, int status, @org.jetbrains.annotations.Nullable()
    android.os.Bundle extras) {
    }
    
    @java.lang.Override()
    public void onProviderEnabled(@org.jetbrains.annotations.Nullable()
    java.lang.String provider) {
    }
    
    @java.lang.Override()
    public void onProviderDisabled(@org.jetbrains.annotations.Nullable()
    java.lang.String provider) {
    }
    
    public AccessibilityDataService() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/github/midros/istheapp/services/accessibilityData/AccessibilityDataService$Companion;", "", "()V", "isRunningService", "", "()Z", "setRunningService", "(Z)V", "app_debug"})
    public static final class Companion {
        
        public final boolean isRunningService() {
            return false;
        }
        
        public final void setRunningService(boolean p0) {
        }
        
        private Companion() {
            super();
        }
    }
}