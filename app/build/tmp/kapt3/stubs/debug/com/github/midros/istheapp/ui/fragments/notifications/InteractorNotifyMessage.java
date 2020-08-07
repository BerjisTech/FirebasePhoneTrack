package com.github.midros.istheapp.ui.fragments.notifications;

import java.lang.System;

/**
 * Created by luis rafael on 17/03/19.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u0005B\u001f\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0016\u0010\u0017\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016J\"\u0010\u001b\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\"\u0010\u001f\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010 \u001a\u00020\u0010H\u0016J\u0010\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u001dH\u0016J\b\u0010#\u001a\u00020\u0010H\u0016J\b\u0010$\u001a\u00020\u0010H\u0016J\u0018\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\'H\u0016J\b\u0010)\u001a\u00020\u0010H\u0016R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/github/midros/istheapp/ui/fragments/notifications/InteractorNotifyMessage;", "V", "Lcom/github/midros/istheapp/ui/fragments/notifications/InterfaceViewNotifyMessage;", "Lcom/github/midros/istheapp/ui/activities/base/BaseInteractor;", "Lcom/github/midros/istheapp/ui/fragments/notifications/InterfaceInteractorNotifyMessage;", "Lcom/github/midros/istheapp/ui/adapters/notifyadapter/InterfaceNotifyMessageAdapter;", "supportFragment", "Landroidx/fragment/app/FragmentManager;", "context", "Landroid/content/Context;", "firebase", "Lcom/github/midros/istheapp/data/rxFirebase/InterfaceFirebase;", "(Landroidx/fragment/app/FragmentManager;Landroid/content/Context;Lcom/github/midros/istheapp/data/rxFirebase/InterfaceFirebase;)V", "recyclerAdapter", "Lcom/github/midros/istheapp/ui/adapters/notifyadapter/NotifyMessageRecyclerAdapter;", "failedResult", "", "error", "Lcom/google/firebase/database/DatabaseError;", "notifyDataSetChanged", "notifyItemChanged", "position", "", "onDeleteData", "data", "", "Lcom/github/midros/istheapp/data/model/DataDelete;", "onItemClick", "key", "", "child", "onItemLongClick", "setRecyclerAdapter", "setSearchQuery", "query", "startRecyclerAdapter", "stopRecyclerAdapter", "successResult", "result", "", "filter", "valueEventEnableNotifications", "app_debug"})
public final class InteractorNotifyMessage<V extends com.github.midros.istheapp.ui.fragments.notifications.InterfaceViewNotifyMessage> extends com.github.midros.istheapp.ui.activities.base.BaseInteractor<V> implements com.github.midros.istheapp.ui.fragments.notifications.InterfaceInteractorNotifyMessage<V>, com.github.midros.istheapp.ui.adapters.notifyadapter.InterfaceNotifyMessageAdapter {
    private com.github.midros.istheapp.ui.adapters.notifyadapter.NotifyMessageRecyclerAdapter recyclerAdapter;
    
    @java.lang.Override()
    public void setSearchQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    @java.lang.Override()
    public void setRecyclerAdapter() {
    }
    
    @java.lang.Override()
    public void notifyDataSetChanged() {
    }
    
    @java.lang.Override()
    public void notifyItemChanged(int position) {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String child, int position) {
    }
    
    @java.lang.Override()
    public void onItemLongClick(@org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String child, int position) {
    }
    
    @java.lang.Override()
    public void startRecyclerAdapter() {
    }
    
    @java.lang.Override()
    public void stopRecyclerAdapter() {
    }
    
    @java.lang.Override()
    public void successResult(boolean result, boolean filter) {
    }
    
    @java.lang.Override()
    public void failedResult(@org.jetbrains.annotations.NotNull()
    com.google.firebase.database.DatabaseError error) {
    }
    
    @java.lang.Override()
    public void onDeleteData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.github.midros.istheapp.data.model.DataDelete> data) {
    }
    
    @java.lang.Override()
    public void valueEventEnableNotifications() {
    }
    
    @javax.inject.Inject()
    public InteractorNotifyMessage(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager supportFragment, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.github.midros.istheapp.data.rxFirebase.InterfaceFirebase firebase) {
        super(null, null, null);
    }
}