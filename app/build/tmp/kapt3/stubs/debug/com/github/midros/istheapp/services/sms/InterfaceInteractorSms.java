package com.github.midros.istheapp.services.sms;

import java.lang.System;

/**
 * Created by luis rafael on 27/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bg\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lcom/github/midros/istheapp/services/sms/InterfaceInteractorSms;", "S", "Lcom/github/midros/istheapp/services/sms/InterfaceServiceSms;", "Lcom/github/midros/istheapp/services/base/InterfaceInteractorService;", "setPushSms", "", "smsAddress", "", "smsBody", "type", "", "app_debug"})
@com.github.midros.istheapp.di.PerService()
public abstract interface InterfaceInteractorSms<S extends com.github.midros.istheapp.services.sms.InterfaceServiceSms> extends com.github.midros.istheapp.services.base.InterfaceInteractorService<S> {
    
    public abstract void setPushSms(@org.jetbrains.annotations.NotNull()
    java.lang.String smsAddress, @org.jetbrains.annotations.NotNull()
    java.lang.String smsBody, int type);
}