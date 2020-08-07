package com.github.midros.istheapp.utils;

import java.lang.System;

/**
 * Created by luis rafael on 17/06/19.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0018\u00010\nR\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/github/midros/istheapp/utils/HomeWatcher;", "", "mContext", "Landroid/content/Context;", "listener", "Lcom/github/midros/istheapp/utils/HomeWatcher$OnHomePressedListener;", "(Landroid/content/Context;Lcom/github/midros/istheapp/utils/HomeWatcher$OnHomePressedListener;)V", "mFilter", "Landroid/content/IntentFilter;", "mReceiver", "Lcom/github/midros/istheapp/utils/HomeWatcher$InnerReceiver;", "startWatch", "", "stopWatch", "InnerReceiver", "OnHomePressedListener", "app_debug"})
public final class HomeWatcher {
    private final android.content.IntentFilter mFilter = null;
    private com.github.midros.istheapp.utils.HomeWatcher.InnerReceiver mReceiver;
    private final android.content.Context mContext = null;
    private final com.github.midros.istheapp.utils.HomeWatcher.OnHomePressedListener listener = null;
    
    public final void startWatch() {
    }
    
    public final void stopWatch() {
    }
    
    public HomeWatcher(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext, @org.jetbrains.annotations.NotNull()
    com.github.midros.istheapp.utils.HomeWatcher.OnHomePressedListener listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lcom/github/midros/istheapp/utils/HomeWatcher$OnHomePressedListener;", "", "onHomePressed", "", "onRecentApps", "app_debug"})
    public static abstract interface OnHomePressedListener {
        
        public abstract void onHomePressed();
        
        public abstract void onRecentApps();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/github/midros/istheapp/utils/HomeWatcher$InnerReceiver;", "Landroid/content/BroadcastReceiver;", "(Lcom/github/midros/istheapp/utils/HomeWatcher;)V", "SYSTEM_DIALOG_REASON_HOME_KEY", "", "SYSTEM_DIALOG_REASON_KEY", "SYSTEM_DIALOG_REASON_RECENT_APPS", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_debug"})
    public final class InnerReceiver extends android.content.BroadcastReceiver {
        private final java.lang.String SYSTEM_DIALOG_REASON_KEY = "reason";
        private final java.lang.String SYSTEM_DIALOG_REASON_HOME_KEY = "homekey";
        private final java.lang.String SYSTEM_DIALOG_REASON_RECENT_APPS = "recentapps";
        
        @java.lang.Override()
        public void onReceive(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.content.Intent intent) {
        }
        
        public InnerReceiver() {
            super();
        }
    }
}