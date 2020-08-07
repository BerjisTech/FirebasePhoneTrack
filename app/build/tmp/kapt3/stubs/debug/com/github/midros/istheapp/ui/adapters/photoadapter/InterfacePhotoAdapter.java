package com.github.midros.istheapp.ui.adapters.photoadapter;

import java.lang.System;

/**
 * Created by luis rafael on 20/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J \u0010\f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\r"}, d2 = {"Lcom/github/midros/istheapp/ui/adapters/photoadapter/InterfacePhotoAdapter;", "Lcom/github/midros/istheapp/ui/adapters/basedapter/InterfaceAdapter;", "onItemClick", "", "url", "", "keyFileName", "childName", "holder", "Lcom/github/midros/istheapp/ui/adapters/photoadapter/PhotoViewHolder;", "position", "", "onLongClickDeleteFilePhoto", "app_debug"})
public abstract interface InterfacePhotoAdapter extends com.github.midros.istheapp.ui.adapters.basedapter.InterfaceAdapter {
    
    public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.lang.String keyFileName, @org.jetbrains.annotations.NotNull()
    java.lang.String childName, @org.jetbrains.annotations.NotNull()
    com.github.midros.istheapp.ui.adapters.photoadapter.PhotoViewHolder holder, int position);
    
    public abstract void onLongClickDeleteFilePhoto(@org.jetbrains.annotations.NotNull()
    java.lang.String keyFileName, @org.jetbrains.annotations.NotNull()
    java.lang.String childName, int position);
}