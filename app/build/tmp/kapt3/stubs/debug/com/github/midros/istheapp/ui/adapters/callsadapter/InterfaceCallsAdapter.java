package com.github.midros.istheapp.ui.adapters.callsadapter;

import java.lang.System;

/**
 * Created by luis rafael on 28/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J8\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J \u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH&J(\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH&\u00a8\u0006\u0011"}, d2 = {"Lcom/github/midros/istheapp/ui/adapters/callsadapter/InterfaceCallsAdapter;", "Lcom/github/midros/istheapp/ui/adapters/basedapter/InterfaceAdapter;", "onCheckPermissionAudioCalls", "", "key", "", "file", "Ljava/io/File;", "childName", "fileName", "holder", "Lcom/github/midros/istheapp/ui/adapters/callsadapter/CallsViewHolder;", "position", "", "onClickDownloadAudioCall", "onLongClickDeleteFileCall", "keyFileName", "app_debug"})
public abstract interface InterfaceCallsAdapter extends com.github.midros.istheapp.ui.adapters.basedapter.InterfaceAdapter {
    
    public abstract void onCheckPermissionAudioCalls(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.io.File file, @org.jetbrains.annotations.NotNull()
    java.lang.String childName, @org.jetbrains.annotations.NotNull()
    java.lang.String fileName, @org.jetbrains.annotations.NotNull()
    com.github.midros.istheapp.ui.adapters.callsadapter.CallsViewHolder holder, int position);
    
    public abstract void onClickDownloadAudioCall(@org.jetbrains.annotations.NotNull()
    java.io.File file, @org.jetbrains.annotations.NotNull()
    java.lang.String childName, @org.jetbrains.annotations.NotNull()
    com.github.midros.istheapp.ui.adapters.callsadapter.CallsViewHolder holder);
    
    public abstract void onLongClickDeleteFileCall(@org.jetbrains.annotations.NotNull()
    java.lang.String keyFileName, @org.jetbrains.annotations.NotNull()
    java.lang.String fileName, @org.jetbrains.annotations.NotNull()
    java.lang.String childName, int position);
}