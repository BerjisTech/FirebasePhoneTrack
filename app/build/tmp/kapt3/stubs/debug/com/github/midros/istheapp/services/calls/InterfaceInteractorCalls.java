package com.github.midros.istheapp.services.calls;

import java.lang.System;

/**
 * Created by luis rafael on 27/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bg\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0005H&\u00a8\u0006\u000b"}, d2 = {"Lcom/github/midros/istheapp/services/calls/InterfaceInteractorCalls;", "S", "Lcom/github/midros/istheapp/services/calls/InterfaceServiceCalls;", "Lcom/github/midros/istheapp/services/base/InterfaceInteractorService;", "startRecording", "", "phoneNumber", "", "type", "", "stopRecording", "app_debug"})
@com.github.midros.istheapp.di.PerService()
public abstract interface InterfaceInteractorCalls<S extends com.github.midros.istheapp.services.calls.InterfaceServiceCalls> extends com.github.midros.istheapp.services.base.InterfaceInteractorService<S> {
    
    public abstract void startRecording(@org.jetbrains.annotations.Nullable()
    java.lang.String phoneNumber, int type);
    
    public abstract void stopRecording();
}