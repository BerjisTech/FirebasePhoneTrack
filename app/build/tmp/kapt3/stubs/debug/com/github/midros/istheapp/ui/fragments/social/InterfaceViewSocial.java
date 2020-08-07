package com.github.midros.istheapp.ui.fragments.social;

import java.lang.System;

/**
 * Created by luis rafael on 20/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/github/midros/istheapp/ui/fragments/social/InterfaceViewSocial;", "Lcom/github/midros/istheapp/ui/activities/base/InterfaceView;", "setValuePermission", "", "dataSnapshot", "Lcom/google/firebase/database/DataSnapshot;", "successResult", "app_debug"})
public abstract interface InterfaceViewSocial extends com.github.midros.istheapp.ui.activities.base.InterfaceView {
    
    public abstract void setValuePermission(@org.jetbrains.annotations.NotNull()
    com.google.firebase.database.DataSnapshot dataSnapshot);
    
    public abstract void successResult(@org.jetbrains.annotations.NotNull()
    com.google.firebase.database.DataSnapshot dataSnapshot);
}