package com.github.midros.istheapp.utils.hiddenCameraServiceUtils.config;

import java.lang.System;

/**
 * Created by luis rafael on 20/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/github/midros/istheapp/utils/hiddenCameraServiceUtils/config/CameraResolution;", "", "()V", "Companion", "SupportedResolution", "app_debug"})
public final class CameraResolution {
    public static final int MEDIUM_RESOLUTION = 2006;
    public static final int SLOW_RESOLUTION = 7895;
    public static final com.github.midros.istheapp.utils.hiddenCameraServiceUtils.config.CameraResolution.Companion Companion = null;
    
    public CameraResolution() {
        super();
    }
    
    @androidx.annotation.IntDef(value = {2006, 7895})
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000\u00a8\u0006\u0002"}, d2 = {"Lcom/github/midros/istheapp/utils/hiddenCameraServiceUtils/config/CameraResolution$SupportedResolution;", "", "app_debug"})
    @java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.SOURCE)
    public static abstract @interface SupportedResolution {
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/github/midros/istheapp/utils/hiddenCameraServiceUtils/config/CameraResolution$Companion;", "", "()V", "MEDIUM_RESOLUTION", "", "SLOW_RESOLUTION", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}