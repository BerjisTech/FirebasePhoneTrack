package com.github.midros.istheapp.utils.hiddenCameraServiceUtils;

import java.lang.System;

/**
 * Created by luis rafael on 20/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0018\u001a\u00060\u0019R\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068@@BX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\u0002\u001a\u0004\b\t\u0010\nR\"\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u000b@BX\u0080\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR&\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068@@BX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\nR&\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068@@BX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0014\u0010\nR&\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068@@BX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0002\u001a\u0004\b\u0017\u0010\n\u00a8\u0006\u001b"}, d2 = {"Lcom/github/midros/istheapp/utils/hiddenCameraServiceUtils/CameraConfig;", "", "()V", "context", "Landroid/content/Context;", "<set-?>", "", "facing", "facing$annotations", "getFacing$app_debug", "()I", "Ljava/io/File;", "imageFile", "getImageFile$app_debug", "()Ljava/io/File;", "imageFormat", "imageFormat$annotations", "getImageFormat$app_debug", "imageRotation", "imageRotation$annotations", "getImageRotation$app_debug", "resolution", "resolution$annotations", "getResolution$app_debug", "builder", "Lcom/github/midros/istheapp/utils/hiddenCameraServiceUtils/CameraConfig$Builder;", "Builder", "app_debug"})
public final class CameraConfig {
    private android.content.Context context;
    private int resolution;
    private int facing;
    private int imageFormat;
    private int imageRotation;
    @org.jetbrains.annotations.Nullable()
    private java.io.File imageFile;
    
    @com.github.midros.istheapp.utils.hiddenCameraServiceUtils.config.CameraResolution.SupportedResolution()
    public static void resolution$annotations() {
    }
    
    @com.github.midros.istheapp.utils.hiddenCameraServiceUtils.config.CameraResolution.SupportedResolution()
    public final int getResolution$app_debug() {
        return 0;
    }
    
    @com.github.midros.istheapp.utils.hiddenCameraServiceUtils.config.CameraFacing.SupportedCameraFacing()
    public static void facing$annotations() {
    }
    
    @com.github.midros.istheapp.utils.hiddenCameraServiceUtils.config.CameraFacing.SupportedCameraFacing()
    public final int getFacing$app_debug() {
        return 0;
    }
    
    @com.github.midros.istheapp.utils.hiddenCameraServiceUtils.config.CameraImageFormat.SupportedImageFormat()
    public static void imageFormat$annotations() {
    }
    
    @com.github.midros.istheapp.utils.hiddenCameraServiceUtils.config.CameraImageFormat.SupportedImageFormat()
    public final int getImageFormat$app_debug() {
        return 0;
    }
    
    @com.github.midros.istheapp.utils.hiddenCameraServiceUtils.config.CameraRotation.SupportedRotation()
    public static void imageRotation$annotations() {
    }
    
    @com.github.midros.istheapp.utils.hiddenCameraServiceUtils.config.CameraRotation.SupportedRotation()
    public final int getImageRotation$app_debug() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.io.File getImageFile$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.github.midros.istheapp.utils.hiddenCameraServiceUtils.CameraConfig.Builder builder(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public CameraConfig() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0012\u0010\u0005\u001a\u00060\u0000R\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u0012\u0010\b\u001a\u00060\u0000R\u00020\u00042\u0006\u0010\t\u001a\u00020\u0007\u00a8\u0006\n"}, d2 = {"Lcom/github/midros/istheapp/utils/hiddenCameraServiceUtils/CameraConfig$Builder;", "", "(Lcom/github/midros/istheapp/utils/hiddenCameraServiceUtils/CameraConfig;)V", "build", "Lcom/github/midros/istheapp/utils/hiddenCameraServiceUtils/CameraConfig;", "setCameraFacing", "cameraFacing", "", "setImageRotation", "rotation", "app_debug"})
    public final class Builder {
        
        @org.jetbrains.annotations.NotNull()
        public final com.github.midros.istheapp.utils.hiddenCameraServiceUtils.CameraConfig.Builder setCameraFacing(@com.github.midros.istheapp.utils.hiddenCameraServiceUtils.config.CameraFacing.SupportedCameraFacing()
        int cameraFacing) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.github.midros.istheapp.utils.hiddenCameraServiceUtils.CameraConfig.Builder setImageRotation(@com.github.midros.istheapp.utils.hiddenCameraServiceUtils.config.CameraRotation.SupportedRotation()
        int rotation) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.github.midros.istheapp.utils.hiddenCameraServiceUtils.CameraConfig build() {
            return null;
        }
        
        public Builder() {
            super();
        }
    }
}