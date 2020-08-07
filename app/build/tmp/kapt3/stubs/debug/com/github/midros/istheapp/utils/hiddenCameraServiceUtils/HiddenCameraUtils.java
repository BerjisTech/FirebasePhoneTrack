package com.github.midros.istheapp.utils.hiddenCameraServiceUtils;

import java.lang.System;

/**
 * Created by luis rafael on 20/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0007J\n\u0010\u0006\u001a\u00020\u0007*\u00020\u0005J\n\u0010\b\u001a\u00020\u0004*\u00020\u0005J\n\u0010\t\u001a\u00020\n*\u00020\u0005J\u0019\u0010\u000b\u001a\u00020\f*\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0001\u00a2\u0006\u0002\b\u000fJ!\u0010\u0010\u001a\u00020\u0004*\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eH\u0000\u00a2\u0006\u0002\b\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/github/midros/istheapp/utils/hiddenCameraServiceUtils/HiddenCameraUtils;", "", "()V", "canOverDrawOtherApps", "", "Landroid/content/Context;", "getFileName", "", "isFrontCameraAvailable", "openDrawOverPermissionSetting", "", "rotateBitmap", "Landroid/graphics/Bitmap;", "rotation", "", "rotateBitmap$app_debug", "saveImageFromFile", "fileToSave", "Ljava/io/File;", "imageFormat", "saveImageFromFile$app_debug", "app_debug"})
public final class HiddenCameraUtils {
    public static final com.github.midros.istheapp.utils.hiddenCameraServiceUtils.HiddenCameraUtils INSTANCE = null;
    
    @android.annotation.SuppressLint(value = {"NewApi"})
    public final boolean canOverDrawOtherApps(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$canOverDrawOtherApps) {
        return false;
    }
    
    public final void openDrawOverPermissionSetting(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$openDrawOverPermissionSetting) {
    }
    
    public final boolean isFrontCameraAvailable(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$isFrontCameraAvailable) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFileName(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getFileName) throws java.lang.Exception {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.WorkerThread()
    public final android.graphics.Bitmap rotateBitmap$app_debug(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap $this$rotateBitmap, @com.github.midros.istheapp.utils.hiddenCameraServiceUtils.config.CameraRotation.SupportedRotation()
    int rotation) {
        return null;
    }
    
    public final boolean saveImageFromFile$app_debug(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap $this$saveImageFromFile, @org.jetbrains.annotations.NotNull()
    java.io.File fileToSave, @com.github.midros.istheapp.utils.hiddenCameraServiceUtils.config.CameraImageFormat.SupportedImageFormat()
    int imageFormat) {
        return false;
    }
    
    private HiddenCameraUtils() {
        super();
    }
}