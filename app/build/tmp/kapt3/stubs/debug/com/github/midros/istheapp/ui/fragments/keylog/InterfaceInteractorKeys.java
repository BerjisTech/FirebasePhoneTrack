package com.github.midros.istheapp.ui.fragments.keylog;

import java.lang.System;

/**
 * Created by luis rafael on 18/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bg\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/github/midros/istheapp/ui/fragments/keylog/InterfaceInteractorKeys;", "V", "Lcom/github/midros/istheapp/ui/fragments/keylog/InterfaceViewKeys;", "Lcom/github/midros/istheapp/ui/activities/base/InterfaceInteractor;", "valueEventEnableKeys", "", "app_debug"})
@com.github.midros.istheapp.di.PerActivity()
public abstract interface InterfaceInteractorKeys<V extends com.github.midros.istheapp.ui.fragments.keylog.InterfaceViewKeys> extends com.github.midros.istheapp.ui.activities.base.InterfaceInteractor<V> {
    
    public abstract void valueEventEnableKeys();
}