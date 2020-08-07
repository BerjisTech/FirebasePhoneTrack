package com.github.midros.istheapp.services.sms;

import java.lang.System;

/**
 * Created by luis rafael on 22/09/19.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/github/midros/istheapp/services/sms/SmsObserver;", "Landroid/database/ContentObserver;", "context", "Landroid/content/Context;", "handler", "Landroid/os/Handler;", "(Landroid/content/Context;Landroid/os/Handler;)V", "onChange", "", "selfChange", "", "uri", "Landroid/net/Uri;", "app_debug"})
public final class SmsObserver extends android.database.ContentObserver {
    private final android.content.Context context = null;
    
    @java.lang.Override()
    public void onChange(boolean selfChange, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
    }
    
    public SmsObserver(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.os.Handler handler) {
        super(null);
    }
}