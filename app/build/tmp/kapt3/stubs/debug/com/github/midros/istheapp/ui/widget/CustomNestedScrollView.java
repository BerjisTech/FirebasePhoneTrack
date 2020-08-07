package com.github.midros.istheapp.ui.widget;

import java.lang.System;

/**
 * Created by luis rafael on 15/06/19.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0012H\u0016J\u0012\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u000e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\u0019\u001a\u00020\tH\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/github/midros/istheapp/ui/widget/CustomNestedScrollView;", "Landroidx/core/widget/NestedScrollView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "appBar", "Lcom/google/android/material/appbar/AppBarLayout;", "fitSystemWindows", "", "insets", "Landroid/graphics/Rect;", "init", "", "isScrollable", "onAttachedToWindow", "onInterceptTouchEvent", "e", "Landroid/view/MotionEvent;", "setAppBar", "topView", "app_debug"})
public final class CustomNestedScrollView extends androidx.core.widget.NestedScrollView {
    private com.google.android.material.appbar.AppBarLayout appBar;
    private java.util.HashMap _$_findViewCache;
    
    private final void init() {
    }
    
    @java.lang.Override()
    public void onAttachedToWindow() {
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
    public boolean onInterceptTouchEvent(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent e) {
        return false;
    }
    
    public final void setAppBar(@org.jetbrains.annotations.NotNull()
    com.google.android.material.appbar.AppBarLayout appBar) {
    }
    
    private final void isScrollable() {
    }
    
    public CustomNestedScrollView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public CustomNestedScrollView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public CustomNestedScrollView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
}