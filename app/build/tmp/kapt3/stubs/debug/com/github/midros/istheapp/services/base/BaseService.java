package com.github.midros.istheapp.services.base;

import java.lang.System;

/**
 * Created by luis rafael on 13/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u00122\u00020\u00012\u00020\u0002:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/github/midros/istheapp/services/base/BaseService;", "Landroid/app/Service;", "Lcom/github/midros/istheapp/services/base/InterfaceService;", "()V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "addDisposable", "", "disposable", "Lio/reactivex/disposables/Disposable;", "clearDisposable", "getComponent", "Lcom/github/midros/istheapp/di/component/ServiceComponent;", "onBind", "Landroid/os/IBinder;", "p0", "Landroid/content/Intent;", "onCreate", "Companion", "app_debug"})
public abstract class BaseService extends android.app.Service implements com.github.midros.istheapp.services.base.InterfaceService {
    private io.reactivex.disposables.CompositeDisposable compositeDisposable;
    @org.jetbrains.annotations.NotNull()
    public static com.github.midros.istheapp.di.component.ServiceComponent serviceComponent;
    public static final com.github.midros.istheapp.services.base.BaseService.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.os.IBinder onBind(@org.jetbrains.annotations.Nullable()
    android.content.Intent p0) {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.github.midros.istheapp.di.component.ServiceComponent getComponent() {
        return null;
    }
    
    @java.lang.Override()
    public void addDisposable(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.Disposable disposable) {
    }
    
    @java.lang.Override()
    public void clearDisposable() {
    }
    
    public BaseService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.github.midros.istheapp.di.component.ServiceComponent getServiceComponent() {
        return null;
    }
    
    public static final void setServiceComponent(@org.jetbrains.annotations.NotNull()
    com.github.midros.istheapp.di.component.ServiceComponent p0) {
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/github/midros/istheapp/services/base/BaseService$Companion;", "", "()V", "serviceComponent", "Lcom/github/midros/istheapp/di/component/ServiceComponent;", "serviceComponent$annotations", "getServiceComponent", "()Lcom/github/midros/istheapp/di/component/ServiceComponent;", "setServiceComponent", "(Lcom/github/midros/istheapp/di/component/ServiceComponent;)V", "app_debug"})
    public static final class Companion {
        
        public static void serviceComponent$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.github.midros.istheapp.di.component.ServiceComponent getServiceComponent() {
            return null;
        }
        
        public final void setServiceComponent(@org.jetbrains.annotations.NotNull()
        com.github.midros.istheapp.di.component.ServiceComponent p0) {
        }
        
        private Companion() {
            super();
        }
    }
}