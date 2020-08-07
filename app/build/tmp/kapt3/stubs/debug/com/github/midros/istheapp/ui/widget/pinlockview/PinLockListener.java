package com.github.midros.istheapp.ui.widget.pinlockview;

import java.lang.System;

/**
 * Created by luis rafael on 01/05/19.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/github/midros/istheapp/ui/widget/pinlockview/PinLockListener;", "", "onComplete", "", "pin", "", "app_debug"})
public abstract interface PinLockListener {
    
    public abstract void onComplete(@org.jetbrains.annotations.NotNull()
    java.lang.String pin);
}