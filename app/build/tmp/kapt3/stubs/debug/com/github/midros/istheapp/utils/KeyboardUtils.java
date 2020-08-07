package com.github.midros.istheapp.utils;

import java.lang.System;

/**
 * Created by luis rafael on 17/06/19.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\u0012B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/github/midros/istheapp/utils/KeyboardUtils;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "activity", "Landroid/app/Activity;", "callback", "Lcom/github/midros/istheapp/utils/KeyboardUtils$SoftKeyboardToggleListener;", "(Landroid/app/Activity;Lcom/github/midros/istheapp/utils/KeyboardUtils$SoftKeyboardToggleListener;)V", "prevValue", "", "Ljava/lang/Boolean;", "rootView", "Landroid/view/View;", "screenDensity", "", "onGlobalLayout", "", "removeListener", "Companion", "SoftKeyboardToggleListener", "app_debug"})
public final class KeyboardUtils implements android.view.ViewTreeObserver.OnGlobalLayoutListener {
    private final android.view.View rootView = null;
    private java.lang.Boolean prevValue;
    private float screenDensity;
    private com.github.midros.istheapp.utils.KeyboardUtils.SoftKeyboardToggleListener callback;
    private static final int MAGIC_NUMBER = 200;
    private static final java.util.HashMap<com.github.midros.istheapp.utils.KeyboardUtils.SoftKeyboardToggleListener, com.github.midros.istheapp.utils.KeyboardUtils> sListenerMap = null;
    public static final com.github.midros.istheapp.utils.KeyboardUtils.Companion Companion = null;
    
    @java.lang.Override()
    public void onGlobalLayout() {
    }
    
    private final void removeListener() {
    }
    
    private KeyboardUtils(android.app.Activity activity, com.github.midros.istheapp.utils.KeyboardUtils.SoftKeyboardToggleListener callback) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/github/midros/istheapp/utils/KeyboardUtils$SoftKeyboardToggleListener;", "", "onToggleSoftKeyboard", "", "isVisible", "", "app_debug"})
    public static abstract interface SoftKeyboardToggleListener {
        
        public abstract void onToggleSoftKeyboard(boolean isVisible);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0007H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/github/midros/istheapp/utils/KeyboardUtils$Companion;", "", "()V", "MAGIC_NUMBER", "", "sListenerMap", "Ljava/util/HashMap;", "Lcom/github/midros/istheapp/utils/KeyboardUtils$SoftKeyboardToggleListener;", "Lcom/github/midros/istheapp/utils/KeyboardUtils;", "addKeyboardToggleListener", "", "activity", "Landroid/app/Activity;", "listener", "removeKeyboardToggleListener", "app_debug"})
    public static final class Companion {
        
        public final void addKeyboardToggleListener(@org.jetbrains.annotations.NotNull()
        android.app.Activity activity, @org.jetbrains.annotations.NotNull()
        com.github.midros.istheapp.utils.KeyboardUtils.SoftKeyboardToggleListener listener) {
        }
        
        private final void removeKeyboardToggleListener(com.github.midros.istheapp.utils.KeyboardUtils.SoftKeyboardToggleListener listener) {
        }
        
        private Companion() {
            super();
        }
    }
}