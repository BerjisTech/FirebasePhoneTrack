package com.github.midros.istheapp.services.notificationService;

import java.lang.System;

/**
 * Created by luis rafael on 27/03/19.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0016J\u0012\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lcom/github/midros/istheapp/services/notificationService/NotificationService;", "Landroid/service/notification/NotificationListenerService;", "()V", "interactor", "Lcom/github/midros/istheapp/services/notificationService/InteractorNotificationService;", "getInteractor", "()Lcom/github/midros/istheapp/services/notificationService/InteractorNotificationService;", "setInteractor", "(Lcom/github/midros/istheapp/services/notificationService/InteractorNotificationService;)V", "matchTypeNotification", "", "packageName", "", "onCreate", "", "onListenerConnected", "onListenerDisconnected", "onNotificationPosted", "sbn", "Landroid/service/notification/StatusBarNotification;", "app_debug"})
public final class NotificationService extends android.service.notification.NotificationListenerService {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.github.midros.istheapp.services.notificationService.InteractorNotificationService interactor;
    
    @org.jetbrains.annotations.NotNull()
    public final com.github.midros.istheapp.services.notificationService.InteractorNotificationService getInteractor() {
        return null;
    }
    
    public final void setInteractor(@org.jetbrains.annotations.NotNull()
    com.github.midros.istheapp.services.notificationService.InteractorNotificationService p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    public void onListenerConnected() {
    }
    
    @java.lang.Override()
    public void onListenerDisconnected() {
    }
    
    @java.lang.Override()
    public void onNotificationPosted(@org.jetbrains.annotations.Nullable()
    android.service.notification.StatusBarNotification sbn) {
    }
    
    private final int matchTypeNotification(java.lang.String packageName) {
        return 0;
    }
    
    public NotificationService() {
        super();
    }
}