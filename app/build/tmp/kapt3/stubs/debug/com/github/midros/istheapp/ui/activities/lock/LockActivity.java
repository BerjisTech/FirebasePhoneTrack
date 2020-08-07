package com.github.midros.istheapp.ui.activities.lock;

import java.lang.System;

/**
 * Created by luis rafael on 28/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\u001a\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\u0017H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/github/midros/istheapp/ui/activities/lock/LockActivity;", "Lcom/github/midros/istheapp/ui/activities/base/BaseActivity;", "Lcom/github/midros/istheapp/ui/widget/pinlockview/PinLockListener;", "()V", "indicators", "Lcom/github/midros/istheapp/ui/widget/pinlockview/IndicatorDots;", "getIndicators", "()Lcom/github/midros/istheapp/ui/widget/pinlockview/IndicatorDots;", "indicators$delegate", "Lkotlin/properties/ReadOnlyProperty;", "lockView", "Lcom/github/midros/istheapp/ui/widget/pinlockview/CustomPinLockView;", "getLockView", "()Lcom/github/midros/istheapp/ui/widget/pinlockview/CustomPinLockView;", "lockView$delegate", "txtMsg", "Landroid/widget/TextView;", "getTxtMsg", "()Landroid/widget/TextView;", "txtMsg$delegate", "vibrator", "Landroid/os/Vibrator;", "initializeVibrator", "", "onComplete", "pin", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onKeyDown", "", "keyCode", "", "event", "Landroid/view/KeyEvent;", "startLock", "app_debug"})
public final class LockActivity extends com.github.midros.istheapp.ui.activities.base.BaseActivity implements com.github.midros.istheapp.ui.widget.pinlockview.PinLockListener {
    private final kotlin.properties.ReadOnlyProperty indicators$delegate = null;
    private final kotlin.properties.ReadOnlyProperty lockView$delegate = null;
    private final kotlin.properties.ReadOnlyProperty txtMsg$delegate = null;
    private android.os.Vibrator vibrator;
    private java.util.HashMap _$_findViewCache;
    
    private final com.github.midros.istheapp.ui.widget.pinlockview.IndicatorDots getIndicators() {
        return null;
    }
    
    private final com.github.midros.istheapp.ui.widget.pinlockview.CustomPinLockView getLockView() {
        return null;
    }
    
    private final android.widget.TextView getTxtMsg() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initializeVibrator() {
    }
    
    private final void startLock() {
    }
    
    @java.lang.Override()
    public void onComplete(@org.jetbrains.annotations.NotNull()
    java.lang.String pin) {
    }
    
    @java.lang.Override()
    public boolean onKeyDown(int keyCode, @org.jetbrains.annotations.Nullable()
    android.view.KeyEvent event) {
        return false;
    }
    
    public LockActivity() {
        super(0);
    }
}