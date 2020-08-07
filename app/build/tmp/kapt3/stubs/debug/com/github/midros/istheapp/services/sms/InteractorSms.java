package com.github.midros.istheapp.services.sms;

import java.lang.System;

/**
 * Created by luis rafael on 27/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0017\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016\u00a8\u0006\u0011"}, d2 = {"Lcom/github/midros/istheapp/services/sms/InteractorSms;", "S", "Lcom/github/midros/istheapp/services/sms/InterfaceServiceSms;", "Lcom/github/midros/istheapp/services/base/BaseInteractorService;", "Lcom/github/midros/istheapp/services/sms/InterfaceInteractorSms;", "context", "Landroid/content/Context;", "firebase", "Lcom/github/midros/istheapp/data/rxFirebase/InterfaceFirebase;", "(Landroid/content/Context;Lcom/github/midros/istheapp/data/rxFirebase/InterfaceFirebase;)V", "setPushSms", "", "smsAddress", "", "smsBody", "type", "", "app_debug"})
public final class InteractorSms<S extends com.github.midros.istheapp.services.sms.InterfaceServiceSms> extends com.github.midros.istheapp.services.base.BaseInteractorService<S> implements com.github.midros.istheapp.services.sms.InterfaceInteractorSms<S> {
    
    @java.lang.Override()
    public void setPushSms(@org.jetbrains.annotations.NotNull()
    java.lang.String smsAddress, @org.jetbrains.annotations.NotNull()
    java.lang.String smsBody, int type) {
    }
    
    @javax.inject.Inject()
    public InteractorSms(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.github.midros.istheapp.data.rxFirebase.InterfaceFirebase firebase) {
        super(null, null);
    }
}