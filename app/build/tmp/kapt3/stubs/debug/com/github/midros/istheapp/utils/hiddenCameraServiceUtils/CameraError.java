package com.github.midros.istheapp.utils.hiddenCameraServiceUtils;

import java.lang.System;

/**
 * Created by luis rafael on 20/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/github/midros/istheapp/utils/hiddenCameraServiceUtils/CameraError;", "", "()V", "CameraErrorCodes", "Companion", "app_debug"})
public final class CameraError {
    public static final int ERROR_CAMERA_OPEN_FAILED = 1122;
    public static final int ERROR_CAMERA_PERMISSION_NOT_AVAILABLE = 5472;
    public static final int ERROR_DOES_NOT_HAVE_OVERDRAW_PERMISSION = 3136;
    public static final int ERROR_DOES_NOT_HAVE_FRONT_CAMERA = 8722;
    public static final int ERROR_IMAGE_WRITE_FAILED = 9854;
    public static final com.github.midros.istheapp.utils.hiddenCameraServiceUtils.CameraError.Companion Companion = null;
    
    private CameraError() {
        super();
    }
    
    @androidx.annotation.IntDef(value = {5472, 1122, 8722, 3136, 9854})
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000\u00a8\u0006\u0002"}, d2 = {"Lcom/github/midros/istheapp/utils/hiddenCameraServiceUtils/CameraError$CameraErrorCodes;", "", "app_debug"})
    @java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.SOURCE)
    public static abstract @interface CameraErrorCodes {
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/github/midros/istheapp/utils/hiddenCameraServiceUtils/CameraError$Companion;", "", "()V", "ERROR_CAMERA_OPEN_FAILED", "", "ERROR_CAMERA_PERMISSION_NOT_AVAILABLE", "ERROR_DOES_NOT_HAVE_FRONT_CAMERA", "ERROR_DOES_NOT_HAVE_OVERDRAW_PERMISSION", "ERROR_IMAGE_WRITE_FAILED", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}