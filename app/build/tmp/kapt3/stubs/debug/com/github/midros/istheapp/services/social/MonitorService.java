package com.github.midros.istheapp.services.social;

import java.lang.System;

/**
 * Created by luis rafael on 27/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\"\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\b\u0010\u0014\u001a\u00020\fH\u0002J\b\u0010\u0015\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lcom/github/midros/istheapp/services/social/MonitorService;", "Lcom/github/midros/istheapp/services/base/BaseService;", "()V", "appChecker", "Lcom/github/midros/istheapp/utils/checkForegroundApp/CheckApp;", "interactor", "Lcom/github/midros/istheapp/services/social/InteractorMonitorService;", "getInteractor", "()Lcom/github/midros/istheapp/services/social/InteractorMonitorService;", "setInteractor", "(Lcom/github/midros/istheapp/services/social/InteractorMonitorService;)V", "onCreate", "", "onDestroy", "onStartCommand", "", "intent", "Landroid/content/Intent;", "flags", "startId", "startApp", "startAppChecker", "app_debug"})
public final class MonitorService extends com.github.midros.istheapp.services.base.BaseService {
    private com.github.midros.istheapp.utils.checkForegroundApp.CheckApp appChecker;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.github.midros.istheapp.services.social.InteractorMonitorService interactor;
    
    @org.jetbrains.annotations.NotNull()
    public final com.github.midros.istheapp.services.social.InteractorMonitorService getInteractor() {
        return null;
    }
    
    public final void setInteractor(@org.jetbrains.annotations.NotNull()
    com.github.midros.istheapp.services.social.InteractorMonitorService p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final void startAppChecker() {
    }
    
    private final void startApp() {
    }
    
    public MonitorService() {
        super();
    }
}