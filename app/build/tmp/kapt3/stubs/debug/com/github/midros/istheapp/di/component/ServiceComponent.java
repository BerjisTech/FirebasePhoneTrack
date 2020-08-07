package com.github.midros.istheapp.di.component;

import java.lang.System;

/**
 * Created by luis rafael on 13/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lcom/github/midros/istheapp/di/component/ServiceComponent;", "", "inject", "", "callsService", "Lcom/github/midros/istheapp/services/calls/CallsService;", "smsService", "Lcom/github/midros/istheapp/services/sms/SmsService;", "monitorService", "Lcom/github/midros/istheapp/services/social/MonitorService;", "app_debug"})
@dagger.Component(dependencies = {com.github.midros.istheapp.di.component.AppComponent.class}, modules = {com.github.midros.istheapp.di.module.ServiceModule.class})
@com.github.midros.istheapp.di.PerService()
public abstract interface ServiceComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.github.midros.istheapp.services.calls.CallsService callsService);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.github.midros.istheapp.services.sms.SmsService smsService);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.github.midros.istheapp.services.social.MonitorService monitorService);
}