package com.github.midros.istheapp.ui.widget;

import java.lang.System;

/**
 * Created by luis rafael on 20/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ(\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H\u0014J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u000eH\u0014J\b\u0010\u001a\u001a\u00020\u000eH\u0014J\u0012\u0010\u001b\u001a\u00020\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0016\u0010\u001e\u001a\u00020\u000e2\f\u0010\u001f\u001a\b\u0012\u0002\b\u0003\u0018\u00010 H\u0016J\u000e\u0010!\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u0007H\u0002J\b\u0010$\u001a\u00020\u0007H\u0002J\b\u0010%\u001a\u00020\u000eH\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/github/midros/istheapp/ui/widget/CustomRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "appBar", "Lcom/google/android/material/appbar/AppBarLayout;", "dataObserver", "Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "attachLayoutAnimationParameters", "", "child", "Landroid/view/View;", "params", "Landroid/view/ViewGroup$LayoutParams;", "index", "count", "fitSystemWindows", "", "insets", "Landroid/graphics/Rect;", "onAttachedToWindow", "onFinishInflate", "onInterceptTouchEvent", "e", "Landroid/view/MotionEvent;", "setAdapter", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "setAppBar", "setScrollPosition", "positionStart", "topView", "turnOffNestedScrollingIfEnoughItems", "app_debug"})
public final class CustomRecyclerView extends androidx.recyclerview.widget.RecyclerView {
    private com.google.android.material.appbar.AppBarLayout appBar;
    private final androidx.recyclerview.widget.RecyclerView.AdapterDataObserver dataObserver = null;
    private java.util.HashMap _$_findViewCache;
    
    public final void setAppBar(@org.jetbrains.annotations.NotNull()
    com.google.android.material.appbar.AppBarLayout appBar) {
    }
    
    @java.lang.Override()
    protected void onAttachedToWindow() {
    }
    
    @java.lang.Override()
    protected boolean fitSystemWindows(@org.jetbrains.annotations.NotNull()
    android.graphics.Rect insets) {
        return false;
    }
    
    private final int topView() {
        return 0;
    }
    
    @java.lang.Override()
    protected void onFinishInflate() {
    }
    
    @java.lang.Override()
    public boolean onInterceptTouchEvent(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent e) {
        return false;
    }
    
    private final void turnOffNestedScrollingIfEnoughItems() {
    }
    
    @java.lang.Override()
    protected void attachLayoutAnimationParameters(@org.jetbrains.annotations.NotNull()
    android.view.View child, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup.LayoutParams params, int index, int count) {
    }
    
    private final void setScrollPosition(int positionStart) {
    }
    
    @java.lang.Override()
    public void setAdapter(@org.jetbrains.annotations.Nullable()
    androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter) {
    }
    
    public CustomRecyclerView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyle) {
        super(null);
    }
    
    public CustomRecyclerView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public CustomRecyclerView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
}