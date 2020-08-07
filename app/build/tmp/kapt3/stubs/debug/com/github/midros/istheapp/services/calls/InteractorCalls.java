package com.github.midros.istheapp.services.calls;

import java.lang.System;

/**
 * Created by luis rafael on 27/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0017\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u0014H\u0002J\u001a\u0010\u0017\u001a\u00020\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0016R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/github/midros/istheapp/services/calls/InteractorCalls;", "S", "Lcom/github/midros/istheapp/services/calls/InterfaceServiceCalls;", "Lcom/github/midros/istheapp/services/base/BaseInteractorService;", "Lcom/github/midros/istheapp/services/calls/InterfaceInteractorCalls;", "context", "Landroid/content/Context;", "firebase", "Lcom/github/midros/istheapp/data/rxFirebase/InterfaceFirebase;", "(Landroid/content/Context;Lcom/github/midros/istheapp/data/rxFirebase/InterfaceFirebase;)V", "contact", "", "dateTime", "fileName", "phoneNumber", "recorder", "Lcom/github/midros/istheapp/utils/MediaRecorderUtils;", "type", "", "deleteFile", "", "sendFileCall", "setPushName", "startRecording", "stopRecording", "app_debug"})
public final class InteractorCalls<S extends com.github.midros.istheapp.services.calls.InterfaceServiceCalls> extends com.github.midros.istheapp.services.base.BaseInteractorService<S> implements com.github.midros.istheapp.services.calls.InterfaceInteractorCalls<S> {
    private com.github.midros.istheapp.utils.MediaRecorderUtils recorder;
    private java.lang.String fileName;
    private java.lang.String contact;
    private java.lang.String phoneNumber;
    private int type;
    private java.lang.String dateTime;
    
    @java.lang.Override()
    public void startRecording(@org.jetbrains.annotations.Nullable()
    java.lang.String phoneNumber, int type) {
    }
    
    @java.lang.Override()
    public void stopRecording() {
    }
    
    private final void deleteFile() {
    }
    
    private final void sendFileCall() {
    }
    
    private final void setPushName() {
    }
    
    @javax.inject.Inject()
    public InteractorCalls(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.github.midros.istheapp.data.rxFirebase.InterfaceFirebase firebase) {
        super(null, null);
    }
}