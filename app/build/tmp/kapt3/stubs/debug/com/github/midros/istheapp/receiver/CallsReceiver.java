package com.github.midros.istheapp.receiver;

import java.lang.System;

/**
 * Created by luis rafael on 13/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0014\u0010\f\u001a\u00020\u0007*\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0014\u0010\u000f\u001a\u00020\u0007*\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002J\u0014\u0010\u0011\u001a\u00020\u0007*\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/github/midros/istheapp/receiver/CallsReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "extraState", "", "phoneNumber", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "setIntent", "callType", "", "setIntentType", "type", "startCallService", "app_debug"})
public final class CallsReceiver extends android.content.BroadcastReceiver {
    private java.lang.String phoneNumber;
    private java.lang.String extraState;
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    private final void startCallService(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$startCallService, android.content.Intent intent) {
    }
    
    private final void setIntentType(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$setIntentType, int type) {
    }
    
    private final void setIntent(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$setIntent, int callType) {
    }
    
    public CallsReceiver() {
        super();
    }
}