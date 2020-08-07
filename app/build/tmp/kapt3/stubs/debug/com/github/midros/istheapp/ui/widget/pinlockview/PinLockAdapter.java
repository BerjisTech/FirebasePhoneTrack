package com.github.midros.istheapp.ui.widget.pinlockview;

import java.lang.System;

/**
 * Created by luis rafael on 01/05/19.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004()*+B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0016\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0018\u00010\u0016R\u00020\u0000H\u0002J\u0016\u0010\u0017\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0018\u00010\u0018R\u00020\u0000H\u0002J\u001e\u0010\u0019\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0018\u00010\u001aR\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0005H\u0002J\u0010\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000bH\u0002J\b\u0010\u001e\u001a\u00020\u0005H\u0016J\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0005H\u0016J\u0018\u0010 \u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0005H\u0016J\u0018\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0005H\u0016J\u000e\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\tJ\u000e\u0010\'\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006,"}, d2 = {"Lcom/github/midros/istheapp/ui/widget/pinlockview/PinLockAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "()V", "VIEW_TYPE_DELETE", "", "VIEW_TYPE_NUMBER", "VIEW_TYPE_OK", "mCustomizationOptionsBundle", "Lcom/github/midros/istheapp/ui/widget/pinlockview/CustomizationOptionsBundle;", "mKeyValues", "", "onPinButtonClickListener", "Lcom/github/midros/istheapp/ui/widget/pinlockview/PinLockAdapter$OnPinButtonClickListener;", "pinLength", "getPinLength", "()I", "setPinLength", "(I)V", "configureDeleteButtonHolder", "", "holder", "Lcom/github/midros/istheapp/ui/widget/pinlockview/PinLockAdapter$DeleteViewHolder;", "configureDoneButtonHolder", "Lcom/github/midros/istheapp/ui/widget/pinlockview/PinLockAdapter$DoneViewHolder;", "configureNumberButtonHolder", "Lcom/github/midros/istheapp/ui/widget/pinlockview/PinLockAdapter$NumberViewHolder;", "position", "getAdjustKeyValues", "keyValues", "getItemCount", "getItemViewType", "onBindViewHolder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setCustomizationOptions", "customizationOptionsBundle", "setOnPinButtonClickListener", "DeleteViewHolder", "DoneViewHolder", "NumberViewHolder", "OnPinButtonClickListener", "app_debug"})
public final class PinLockAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final int VIEW_TYPE_NUMBER = 0;
    private final int VIEW_TYPE_DELETE = 1;
    private final int VIEW_TYPE_OK = 2;
    private com.github.midros.istheapp.ui.widget.pinlockview.CustomizationOptionsBundle mCustomizationOptionsBundle;
    private com.github.midros.istheapp.ui.widget.pinlockview.PinLockAdapter.OnPinButtonClickListener onPinButtonClickListener;
    private int pinLength;
    private final int[] mKeyValues = null;
    
    public final int getPinLength() {
        return 0;
    }
    
    public final void setPinLength(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    private final void configureNumberButtonHolder(com.github.midros.istheapp.ui.widget.pinlockview.PinLockAdapter.NumberViewHolder holder, int position) {
    }
    
    private final void configureDeleteButtonHolder(com.github.midros.istheapp.ui.widget.pinlockview.PinLockAdapter.DeleteViewHolder holder) {
    }
    
    private final void configureDoneButtonHolder(com.github.midros.istheapp.ui.widget.pinlockview.PinLockAdapter.DoneViewHolder holder) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    private final int[] getAdjustKeyValues(int[] keyValues) {
        return null;
    }
    
    public final void setCustomizationOptions(@org.jetbrains.annotations.NotNull()
    com.github.midros.istheapp.ui.widget.pinlockview.CustomizationOptionsBundle customizationOptionsBundle) {
    }
    
    public final void setOnPinButtonClickListener(@org.jetbrains.annotations.NotNull()
    com.github.midros.istheapp.ui.widget.pinlockview.PinLockAdapter.OnPinButtonClickListener onPinButtonClickListener) {
    }
    
    public PinLockAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lcom/github/midros/istheapp/ui/widget/pinlockview/PinLockAdapter$DoneViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/github/midros/istheapp/ui/widget/pinlockview/PinLockAdapter;Landroid/view/View;)V", "mButtonImage", "Landroid/widget/ImageView;", "getMButtonImage", "()Landroid/widget/ImageView;", "mButtonImage$delegate", "Lkotlin/properties/ReadOnlyProperty;", "app_debug"})
    public final class DoneViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.properties.ReadOnlyProperty mButtonImage$delegate = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getMButtonImage() {
            return null;
        }
        
        public DoneViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lcom/github/midros/istheapp/ui/widget/pinlockview/PinLockAdapter$NumberViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/github/midros/istheapp/ui/widget/pinlockview/PinLockAdapter;Landroid/view/View;)V", "mNumberButton", "Landroid/widget/Button;", "getMNumberButton", "()Landroid/widget/Button;", "mNumberButton$delegate", "Lkotlin/properties/ReadOnlyProperty;", "app_debug"})
    public final class NumberViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.properties.ReadOnlyProperty mNumberButton$delegate = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.Button getMNumberButton() {
            return null;
        }
        
        public NumberViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lcom/github/midros/istheapp/ui/widget/pinlockview/PinLockAdapter$DeleteViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/github/midros/istheapp/ui/widget/pinlockview/PinLockAdapter;Landroid/view/View;)V", "mButtonImage", "Landroid/widget/ImageView;", "getMButtonImage", "()Landroid/widget/ImageView;", "mButtonImage$delegate", "Lkotlin/properties/ReadOnlyProperty;", "app_debug"})
    public final class DeleteViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.properties.ReadOnlyProperty mButtonImage$delegate = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getMButtonImage() {
            return null;
        }
        
        public DeleteViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/github/midros/istheapp/ui/widget/pinlockview/PinLockAdapter$OnPinButtonClickListener;", "", "onConfirmClicked", "", "onDeleteClicked", "onDeleteLongClicked", "onNumberClicked", "keyValue", "", "app_debug"})
    public static abstract interface OnPinButtonClickListener {
        
        public abstract void onNumberClicked(int keyValue);
        
        public abstract void onConfirmClicked();
        
        public abstract void onDeleteClicked();
        
        public abstract void onDeleteLongClicked();
    }
}