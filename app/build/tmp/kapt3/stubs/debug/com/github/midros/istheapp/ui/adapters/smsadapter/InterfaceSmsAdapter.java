package com.github.midros.istheapp.ui.adapters.smsadapter;

import java.lang.System;

/**
 * Created by luis rafael on 20/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\t"}, d2 = {"Lcom/github/midros/istheapp/ui/adapters/smsadapter/InterfaceSmsAdapter;", "Lcom/github/midros/istheapp/ui/adapters/basedapter/InterfaceAdapter;", "onItemClick", "", "keySms", "", "position", "", "onItemLongClick", "app_debug"})
public abstract interface InterfaceSmsAdapter extends com.github.midros.istheapp.ui.adapters.basedapter.InterfaceAdapter {
    
    public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
    java.lang.String keySms, int position);
    
    public abstract void onItemLongClick(@org.jetbrains.annotations.NotNull()
    java.lang.String keySms, int position);
}