package com.github.midros.istheapp.services.base;

import java.lang.System;

/**
 * Created by luis rafael on 22/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH&\u00a8\u0006\t"}, d2 = {"Lcom/github/midros/istheapp/services/base/InterfaceService;", "", "addDisposable", "", "disposable", "Lio/reactivex/disposables/Disposable;", "clearDisposable", "getComponent", "Lcom/github/midros/istheapp/di/component/ServiceComponent;", "app_debug"})
public abstract interface InterfaceService {
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.github.midros.istheapp.di.component.ServiceComponent getComponent();
    
    public abstract void addDisposable(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.Disposable disposable);
    
    public abstract void clearDisposable();
}