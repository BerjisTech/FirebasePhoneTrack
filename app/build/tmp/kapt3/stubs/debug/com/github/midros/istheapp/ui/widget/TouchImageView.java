package com.github.midros.istheapp.ui.widget;

import java.lang.System;

/**
 * Created by luis rafael on 20/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00c8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b&\u0018\u0000 \u00b2\u00012\u00020\u0001:\u0014\u00b2\u0001\u00b3\u0001\u00b4\u0001\u00b5\u0001\u00b6\u0001\u00b7\u0001\u00b8\u0001\u00b9\u0001\u00ba\u0001\u00bb\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010f\u001a\u00020%2\u0006\u0010g\u001a\u00020\u0007H\u0016J\u0010\u0010h\u001a\u00020i2\u0006\u0010\u0002\u001a\u00020\u0003H\u0003J\b\u0010j\u001a\u00020iH\u0002J\r\u0010k\u001a\u00020iH\u0000\u00a2\u0006\u0002\blJ\r\u0010m\u001a\u00020iH\u0000\u00a2\u0006\u0002\bnJ%\u0010o\u001a\u00020\n2\u0006\u0010p\u001a\u00020\n2\u0006\u0010q\u001a\u00020\n2\u0006\u0010r\u001a\u00020\nH\u0000\u00a2\u0006\u0002\bsJ \u0010t\u001a\u00020\n2\u0006\u0010u\u001a\u00020\n2\u0006\u0010q\u001a\u00020\n2\u0006\u0010r\u001a\u00020\nH\u0002J\n\u0010v\u001a\u0004\u0018\u00010OH\u0016J\u0010\u0010w\u001a\u00020i2\u0006\u0010x\u001a\u00020yH\u0016J\u0010\u0010z\u001a\u00020i2\u0006\u0010{\u001a\u00020|H\u0014J\u0018\u0010}\u001a\u00020i2\u0006\u0010~\u001a\u00020\u00072\u0006\u0010\u007f\u001a\u00020\u0007H\u0014J\u0012\u0010\u0080\u0001\u001a\u00020i2\u0007\u0010T\u001a\u00030\u0081\u0001H\u0016J\f\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u0001H\u0016J\t\u0010\u0083\u0001\u001a\u00020iH\u0002J\t\u0010\u0084\u0001\u001a\u00020iH\u0002J4\u0010\u0085\u0001\u001a\u00020i2\b\u0010\u0086\u0001\u001a\u00030\u0087\u00012\u0007\u0010\u0088\u0001\u001a\u00020\n2\u0007\u0010\u0089\u0001\u001a\u00020\n2\u0007\u0010\u008a\u0001\u001a\u00020%H\u0000\u00a2\u0006\u0003\b\u008b\u0001J\u0013\u0010\u008c\u0001\u001a\u00020i2\b\u0010\u008d\u0001\u001a\u00030\u008e\u0001H\u0016J\u0015\u0010\u008f\u0001\u001a\u00020i2\n\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u0091\u0001H\u0016J\u0012\u0010\u0092\u0001\u001a\u00020i2\u0007\u0010\u0093\u0001\u001a\u00020\u0007H\u0016J\u0015\u0010\u0094\u0001\u001a\u00020i2\n\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0096\u0001H\u0016J\u0012\u0010\u0097\u0001\u001a\u00020i2\u0007\u0010\u0098\u0001\u001a\u00020>H\u0016J\u0014\u0010\u0099\u0001\u001a\u00020i2\t\u0010\u009a\u0001\u001a\u0004\u0018\u00010OH\u0016J\u0011\u0010\u009b\u0001\u001a\u00020i2\u0006\u0010T\u001a\u00020UH\u0002J$\u0010\u009c\u0001\u001a\u00020\u00072\u0007\u0010\u009d\u0001\u001a\u00020\u00072\u0007\u0010\u009e\u0001\u001a\u00020\u00072\u0007\u0010\u009f\u0001\u001a\u00020\u0007H\u0002J\u0012\u0010\u00a0\u0001\u001a\u00020i2\u0007\u0010\u00a1\u0001\u001a\u00020\u0000H\u0002J.\u0010\u00a0\u0001\u001a\u00020i2\u0007\u0010\u00a2\u0001\u001a\u00020\n2\u0007\u0010\u0088\u0001\u001a\u00020\n2\u0007\u0010\u0089\u0001\u001a\u00020\n2\b\u0010N\u001a\u0004\u0018\u00010OH\u0002J!\u0010\u00a3\u0001\u001a\u00020Q2\u0007\u0010\u00a4\u0001\u001a\u00020\n2\u0007\u0010\u00a5\u0001\u001a\u00020\nH\u0000\u00a2\u0006\u0003\b\u00a6\u0001J*\u0010\u00a7\u0001\u001a\u00020Q2\u0007\u0010\u00a8\u0001\u001a\u00020\n2\u0007\u0010\u00a9\u0001\u001a\u00020\n2\u0007\u0010\u00aa\u0001\u001a\u00020%H\u0000\u00a2\u0006\u0003\b\u00ab\u0001JF\u0010\u00ac\u0001\u001a\u00020i2\u0007\u0010\u00ad\u0001\u001a\u00020\u00072\u0006\u0010u\u001a\u00020\n2\u0007\u0010\u00ae\u0001\u001a\u00020\n2\u0007\u0010\u00af\u0001\u001a\u00020\n2\u0007\u0010\u00b0\u0001\u001a\u00020\u00072\u0006\u0010q\u001a\u00020\u00072\u0007\u0010\u00b1\u0001\u001a\u00020\u0007H\u0002R$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\b\u0018\u00010\u0019R\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\n8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b!\u0010\rR\u0014\u0010\"\u001a\u00020\n8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b#\u0010\rR\u000e\u0010$\u001a\u00020%X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u00020%8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b&\u0010\'R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u000e\u0010.\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u00100\u001a\u0004\u0018\u000101X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u00106\u001a\u00020\nX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\r\"\u0004\b8\u0010\u000fR\u001a\u00109\u001a\u00020\nX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\r\"\u0004\b;\u0010\u000fR\u000e\u0010<\u001a\u00020%X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010=\u001a\u0004\u0018\u00010>X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u000e\u0010C\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010E\u001a\u0004\u0018\u000101X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010H\u001a\u0004\u0018\u00010IX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0010\u0010N\u001a\u0004\u0018\u00010OX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010P\u001a\u0004\u0018\u00010Q8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\bR\u0010SR\u0010\u0010T\u001a\u0004\u0018\u00010UX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010X\u001a\u0004\u0018\u00010YX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u001a\u0010^\u001a\u00020\u0007X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u001a\u0010c\u001a\u00020\u0007X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bd\u0010`\"\u0004\be\u0010b\u00a8\u0006\u00bc\u0001"}, d2 = {"Lcom/github/midros/istheapp/ui/widget/TouchImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "<set-?>", "", "currentZoom", "getCurrentZoom", "()F", "setCurrentZoom$app_debug", "(F)V", "delayedZoomVariables", "Lcom/github/midros/istheapp/ui/widget/TouchImageView$ZoomVariables;", "doubleTapListener", "Landroid/view/GestureDetector$OnDoubleTapListener;", "getDoubleTapListener$app_debug", "()Landroid/view/GestureDetector$OnDoubleTapListener;", "setDoubleTapListener$app_debug", "(Landroid/view/GestureDetector$OnDoubleTapListener;)V", "fling", "Lcom/github/midros/istheapp/ui/widget/TouchImageView$Fling;", "gestureDetector", "Landroid/view/GestureDetector;", "getGestureDetector$app_debug", "()Landroid/view/GestureDetector;", "setGestureDetector$app_debug", "(Landroid/view/GestureDetector;)V", "imageHeight", "getImageHeight$app_debug", "imageWidth", "getImageWidth$app_debug", "isImageRenderedAtLeastOnce", "", "isZoomed", "()Z", "m", "", "getM$app_debug", "()[F", "setM$app_debug", "([F)V", "matchViewHeight", "matchViewWidth", "matrix", "Landroid/graphics/Matrix;", "getMatrix$app_debug", "()Landroid/graphics/Matrix;", "setMatrix$app_debug", "(Landroid/graphics/Matrix;)V", "maxScale", "getMaxScale$app_debug", "setMaxScale$app_debug", "minScale", "getMinScale$app_debug", "setMinScale$app_debug", "onDrawReady", "onTouchListener", "Landroid/view/View$OnTouchListener;", "getOnTouchListener$app_debug", "()Landroid/view/View$OnTouchListener;", "setOnTouchListener$app_debug", "(Landroid/view/View$OnTouchListener;)V", "prevMatchViewHeight", "prevMatchViewWidth", "prevMatrix", "prevViewHeight", "prevViewWidth", "scaleGestureDetector", "Landroid/view/ScaleGestureDetector;", "getScaleGestureDetector$app_debug", "()Landroid/view/ScaleGestureDetector;", "setScaleGestureDetector$app_debug", "(Landroid/view/ScaleGestureDetector;)V", "scaleType", "Landroid/widget/ImageView$ScaleType;", "scrollPosition", "Landroid/graphics/PointF;", "getScrollPosition", "()Landroid/graphics/PointF;", "state", "Lcom/github/midros/istheapp/ui/widget/TouchImageView$State;", "superMaxScale", "superMinScale", "touchImageViewListener", "Lcom/github/midros/istheapp/ui/widget/TouchImageView$OnTouchImageViewListener;", "getTouchImageViewListener$app_debug", "()Lcom/github/midros/istheapp/ui/widget/TouchImageView$OnTouchImageViewListener;", "setTouchImageViewListener$app_debug", "(Lcom/github/midros/istheapp/ui/widget/TouchImageView$OnTouchImageViewListener;)V", "viewHeight", "getViewHeight$app_debug", "()I", "setViewHeight$app_debug", "(I)V", "viewWidth", "getViewWidth$app_debug", "setViewWidth$app_debug", "canScrollHorizontally", "direction", "configureImageView", "", "fitImageToView", "fixScaleTrans", "fixScaleTrans$app_debug", "fixTrans", "fixTrans$app_debug", "getFixDragTrans", "delta", "viewSize", "contentSize", "getFixDragTrans$app_debug", "getFixTrans", "trans", "getScaleType", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onRestoreInstanceState", "Landroid/os/Parcelable;", "onSaveInstanceState", "resetZoom", "savePreviousImageValues", "scaleImage", "deltaScale", "", "focusX", "focusY", "stretchImageToSuper", "scaleImage$app_debug", "setImageBitmap", "bm", "Landroid/graphics/Bitmap;", "setImageDrawable", "drawable", "Landroid/graphics/drawable/Drawable;", "setImageResource", "resId", "setImageURI", "uri", "Landroid/net/Uri;", "setOnTouchListener", "l", "setScaleType", "type", "setState", "setViewSize", "mode", "size", "drawableWidth", "setZoom", "img", "scale", "transformCordBitmapToTouch", "bx", "by", "transformCordBitmapToTouch$app_debug", "transformCordTouchToBitmap", "x", "y", "clipToBitmap", "transformCordTouchToBitmap$app_debug", "translateMatrixAfterRotate", "axis", "prevImageSize", "imageSize", "prevViewSize", "drawableSize", "Companion", "CompatScroller", "DoubleTapZoom", "Fling", "GestureListener", "OnTouchImageViewListener", "PrivateOnTouchListener", "ScaleListener", "State", "ZoomVariables", "app_debug"})
public final class TouchImageView extends androidx.appcompat.widget.AppCompatImageView {
    @org.jetbrains.annotations.Nullable()
    private android.graphics.Matrix matrix;
    private android.graphics.Matrix prevMatrix;
    @org.jetbrains.annotations.Nullable()
    private float[] m;
    private com.github.midros.istheapp.ui.widget.TouchImageView.State state;
    private com.github.midros.istheapp.ui.widget.TouchImageView.Fling fling;
    private int viewWidth;
    private int viewHeight;
    private int prevViewWidth;
    private int prevViewHeight;
    private float currentZoom;
    private float minScale;
    private float maxScale;
    private float superMinScale;
    private float superMaxScale;
    @org.jetbrains.annotations.Nullable()
    private android.view.GestureDetector gestureDetector;
    @org.jetbrains.annotations.Nullable()
    private android.view.View.OnTouchListener onTouchListener;
    @org.jetbrains.annotations.Nullable()
    private android.view.ScaleGestureDetector scaleGestureDetector;
    @org.jetbrains.annotations.Nullable()
    private com.github.midros.istheapp.ui.widget.TouchImageView.OnTouchImageViewListener touchImageViewListener;
    @org.jetbrains.annotations.Nullable()
    private android.view.GestureDetector.OnDoubleTapListener doubleTapListener;
    private android.widget.ImageView.ScaleType scaleType;
    private com.github.midros.istheapp.ui.widget.TouchImageView.ZoomVariables delayedZoomVariables;
    private boolean isImageRenderedAtLeastOnce;
    private boolean onDrawReady;
    private float matchViewWidth;
    private float matchViewHeight;
    private float prevMatchViewWidth;
    private float prevMatchViewHeight;
    private static final float SUPER_MIN_MULTIPLIER = 0.75F;
    private static final float SUPER_MAX_MULTIPLIER = 1.25F;
    public static final com.github.midros.istheapp.ui.widget.TouchImageView.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Matrix getMatrix$app_debug() {
        return null;
    }
    
    public final void setMatrix$app_debug(@org.jetbrains.annotations.Nullable()
    android.graphics.Matrix p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final float[] getM$app_debug() {
        return null;
    }
    
    public final void setM$app_debug(@org.jetbrains.annotations.Nullable()
    float[] p0) {
    }
    
    public final int getViewWidth$app_debug() {
        return 0;
    }
    
    public final void setViewWidth$app_debug(int p0) {
    }
    
    public final int getViewHeight$app_debug() {
        return 0;
    }
    
    public final void setViewHeight$app_debug(int p0) {
    }
    
    public final float getCurrentZoom() {
        return 0.0F;
    }
    
    public final void setCurrentZoom$app_debug(float p0) {
    }
    
    public final float getMinScale$app_debug() {
        return 0.0F;
    }
    
    public final void setMinScale$app_debug(float p0) {
    }
    
    public final float getMaxScale$app_debug() {
        return 0.0F;
    }
    
    public final void setMaxScale$app_debug(float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.GestureDetector getGestureDetector$app_debug() {
        return null;
    }
    
    public final void setGestureDetector$app_debug(@org.jetbrains.annotations.Nullable()
    android.view.GestureDetector p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.View.OnTouchListener getOnTouchListener$app_debug() {
        return null;
    }
    
    public final void setOnTouchListener$app_debug(@org.jetbrains.annotations.Nullable()
    android.view.View.OnTouchListener p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.ScaleGestureDetector getScaleGestureDetector$app_debug() {
        return null;
    }
    
    public final void setScaleGestureDetector$app_debug(@org.jetbrains.annotations.Nullable()
    android.view.ScaleGestureDetector p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.github.midros.istheapp.ui.widget.TouchImageView.OnTouchImageViewListener getTouchImageViewListener$app_debug() {
        return null;
    }
    
    public final void setTouchImageViewListener$app_debug(@org.jetbrains.annotations.Nullable()
    com.github.midros.istheapp.ui.widget.TouchImageView.OnTouchImageViewListener p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.GestureDetector.OnDoubleTapListener getDoubleTapListener$app_debug() {
        return null;
    }
    
    public final void setDoubleTapListener$app_debug(@org.jetbrains.annotations.Nullable()
    android.view.GestureDetector.OnDoubleTapListener p0) {
    }
    
    private final boolean isZoomed() {
        return false;
    }
    
    private final android.graphics.PointF getScrollPosition() {
        return null;
    }
    
    public final float getImageWidth$app_debug() {
        return 0.0F;
    }
    
    public final float getImageHeight$app_debug() {
        return 0.0F;
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    private final void configureImageView(android.content.Context context) {
    }
    
    @java.lang.Override()
    public void setOnTouchListener(@org.jetbrains.annotations.NotNull()
    android.view.View.OnTouchListener l) {
    }
    
    @java.lang.Override()
    public void setImageResource(int resId) {
    }
    
    @java.lang.Override()
    public void setImageBitmap(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bm) {
    }
    
    @java.lang.Override()
    public void setImageDrawable(@org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable drawable) {
    }
    
    @java.lang.Override()
    public void setImageURI(@org.jetbrains.annotations.Nullable()
    android.net.Uri uri) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.widget.ImageView.ScaleType getScaleType() {
        return null;
    }
    
    @java.lang.Override()
    public void setScaleType(@org.jetbrains.annotations.Nullable()
    android.widget.ImageView.ScaleType type) {
    }
    
    private final void savePreviousImageValues() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.os.Parcelable onSaveInstanceState() {
        return null;
    }
    
    @java.lang.Override()
    public void onRestoreInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Parcelable state) {
    }
    
    @java.lang.Override()
    protected void onDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    @java.lang.Override()
    public void onConfigurationChanged(@org.jetbrains.annotations.NotNull()
    android.content.res.Configuration newConfig) {
    }
    
    private final void resetZoom() {
    }
    
    private final void setZoom(float scale, float focusX, float focusY, android.widget.ImageView.ScaleType scaleType) {
    }
    
    private final void setZoom(com.github.midros.istheapp.ui.widget.TouchImageView img) {
    }
    
    public final void fixTrans$app_debug() {
    }
    
    public final void fixScaleTrans$app_debug() {
    }
    
    private final float getFixTrans(float trans, float viewSize, float contentSize) {
        return 0.0F;
    }
    
    public final float getFixDragTrans$app_debug(float delta, float viewSize, float contentSize) {
        return 0.0F;
    }
    
    @java.lang.Override()
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }
    
    private final void fitImageToView() {
    }
    
    private final int setViewSize(int mode, int size, int drawableWidth) {
        return 0;
    }
    
    private final void translateMatrixAfterRotate(int axis, float trans, float prevImageSize, float imageSize, int prevViewSize, int viewSize, int drawableSize) {
    }
    
    private final void setState(com.github.midros.istheapp.ui.widget.TouchImageView.State state) {
    }
    
    @java.lang.Override()
    public boolean canScrollHorizontally(int direction) {
        return false;
    }
    
    public final void scaleImage$app_debug(double deltaScale, float focusX, float focusY, boolean stretchImageToSuper) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.PointF transformCordTouchToBitmap$app_debug(float x, float y, boolean clipToBitmap) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.PointF transformCordBitmapToTouch$app_debug(float bx, float by) {
        return null;
    }
    
    public TouchImageView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyle) {
        super(null);
    }
    
    public TouchImageView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public TouchImageView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lcom/github/midros/istheapp/ui/widget/TouchImageView$State;", "", "(Ljava/lang/String;I)V", "NONE", "DRAG", "ZOOM", "FLING", "ANIMATE_ZOOM", "app_debug"})
    static enum State {
        /*public static final*/ NONE /* = new NONE() */,
        /*public static final*/ DRAG /* = new DRAG() */,
        /*public static final*/ ZOOM /* = new ZOOM() */,
        /*public static final*/ FLING /* = new FLING() */,
        /*public static final*/ ANIMATE_ZOOM /* = new ANIMATE_ZOOM() */;
        
        State() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/github/midros/istheapp/ui/widget/TouchImageView$OnTouchImageViewListener;", "", "onMove", "", "app_debug"})
    public static abstract interface OnTouchImageViewListener {
        
        public abstract void onMove();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\r\u0010\u0013\u001a\u00020\fH\u0000\u00a2\u0006\u0002\b\u0014JM\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0006H\u0000\u00a2\u0006\u0002\b\u001fJ\u0015\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\fH\u0000\u00a2\u0006\u0002\b\"R\u0014\u0010\u0005\u001a\u00020\u00068@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\f8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006#"}, d2 = {"Lcom/github/midros/istheapp/ui/widget/TouchImageView$CompatScroller;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "currX", "", "getCurrX$app_debug", "()I", "currY", "getCurrY$app_debug", "isFinished", "", "isFinished$app_debug", "()Z", "overScroller", "Landroid/widget/OverScroller;", "getOverScroller$app_debug", "()Landroid/widget/OverScroller;", "computeScrollOffset", "computeScrollOffset$app_debug", "fling", "", "startX", "startY", "velocityX", "velocityY", "minX", "maxX", "minY", "maxY", "fling$app_debug", "forceFinished", "finished", "forceFinished$app_debug", "app_debug"})
    static final class CompatScroller {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.OverScroller overScroller = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.OverScroller getOverScroller$app_debug() {
            return null;
        }
        
        public final boolean isFinished$app_debug() {
            return false;
        }
        
        public final int getCurrX$app_debug() {
            return 0;
        }
        
        public final int getCurrY$app_debug() {
            return 0;
        }
        
        public final void fling$app_debug(int startX, int startY, int velocityX, int velocityY, int minX, int maxX, int minY, int maxY) {
        }
        
        public final void forceFinished$app_debug(boolean finished) {
        }
        
        public final boolean computeScrollOffset$app_debug() {
            return false;
        }
        
        public CompatScroller(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\'\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/github/midros/istheapp/ui/widget/TouchImageView$ZoomVariables;", "", "scale", "", "focusX", "focusY", "scaleType", "Landroid/widget/ImageView$ScaleType;", "(FFFLandroid/widget/ImageView$ScaleType;)V", "getFocusX$app_debug", "()F", "getFocusY$app_debug", "getScale$app_debug", "getScaleType$app_debug", "()Landroid/widget/ImageView$ScaleType;", "app_debug"})
    static final class ZoomVariables {
        private final float scale = 0.0F;
        private final float focusX = 0.0F;
        private final float focusY = 0.0F;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView.ScaleType scaleType = null;
        
        public final float getScale$app_debug() {
            return 0.0F;
        }
        
        public final float getFocusX$app_debug() {
            return 0.0F;
        }
        
        public final float getFocusY$app_debug() {
            return 0.0F;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView.ScaleType getScaleType$app_debug() {
            return null;
        }
        
        public ZoomVariables(float scale, float focusX, float focusY, @org.jetbrains.annotations.NotNull()
        android.widget.ImageView.ScaleType scaleType) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J(\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0011"}, d2 = {"Lcom/github/midros/istheapp/ui/widget/TouchImageView$GestureListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "(Lcom/github/midros/istheapp/ui/widget/TouchImageView;)V", "onDoubleTap", "", "e", "Landroid/view/MotionEvent;", "onDoubleTapEvent", "onFling", "e1", "e2", "velocityX", "", "velocityY", "onLongPress", "", "onSingleTapConfirmed", "app_debug"})
    final class GestureListener extends android.view.GestureDetector.SimpleOnGestureListener {
        
        @java.lang.Override()
        public boolean onSingleTapConfirmed(@org.jetbrains.annotations.NotNull()
        android.view.MotionEvent e) {
            return false;
        }
        
        @java.lang.Override()
        public void onLongPress(@org.jetbrains.annotations.NotNull()
        android.view.MotionEvent e) {
        }
        
        @java.lang.Override()
        public boolean onFling(@org.jetbrains.annotations.NotNull()
        android.view.MotionEvent e1, @org.jetbrains.annotations.NotNull()
        android.view.MotionEvent e2, float velocityX, float velocityY) {
            return false;
        }
        
        @java.lang.Override()
        public boolean onDoubleTap(@org.jetbrains.annotations.NotNull()
        android.view.MotionEvent e) {
            return false;
        }
        
        @java.lang.Override()
        public boolean onDoubleTapEvent(@org.jetbrains.annotations.NotNull()
        android.view.MotionEvent e) {
            return false;
        }
        
        public GestureListener() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/github/midros/istheapp/ui/widget/TouchImageView$PrivateOnTouchListener;", "Landroid/view/View$OnTouchListener;", "(Lcom/github/midros/istheapp/ui/widget/TouchImageView;)V", "last", "Landroid/graphics/PointF;", "onTouch", "", "v", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "app_debug"})
    final class PrivateOnTouchListener implements android.view.View.OnTouchListener {
        private final android.graphics.PointF last = null;
        
        @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
        @java.lang.Override()
        public boolean onTouch(@org.jetbrains.annotations.NotNull()
        android.view.View v, @org.jetbrains.annotations.NotNull()
        android.view.MotionEvent event) {
            return false;
        }
        
        public PrivateOnTouchListener() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\n"}, d2 = {"Lcom/github/midros/istheapp/ui/widget/TouchImageView$ScaleListener;", "Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;", "(Lcom/github/midros/istheapp/ui/widget/TouchImageView;)V", "onScale", "", "detector", "Landroid/view/ScaleGestureDetector;", "onScaleBegin", "onScaleEnd", "", "app_debug"})
    final class ScaleListener extends android.view.ScaleGestureDetector.SimpleOnScaleGestureListener {
        
        @java.lang.Override()
        public boolean onScaleBegin(@org.jetbrains.annotations.NotNull()
        android.view.ScaleGestureDetector detector) {
            return false;
        }
        
        @java.lang.Override()
        public boolean onScale(@org.jetbrains.annotations.NotNull()
        android.view.ScaleGestureDetector detector) {
            return false;
        }
        
        @java.lang.Override()
        public void onScaleEnd(@org.jetbrains.annotations.NotNull()
        android.view.ScaleGestureDetector detector) {
        }
        
        public ScaleListener() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\'\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0003H\u0002J\b\u0010\u0016\u001a\u00020\u0003H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0003H\u0002R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/github/midros/istheapp/ui/widget/TouchImageView$DoubleTapZoom;", "Ljava/lang/Runnable;", "targetZoom", "", "focusX", "focusY", "stretchImageToSuper", "", "(Lcom/github/midros/istheapp/ui/widget/TouchImageView;FFFZ)V", "bitmapX", "bitmapY", "endTouch", "Landroid/graphics/PointF;", "interpolator", "Landroid/view/animation/AccelerateDecelerateInterpolator;", "startTime", "", "startTouch", "startZoom", "calculateDeltaScale", "", "t", "interpolate", "run", "", "translateImageToCenterTouchPosition", "app_debug"})
    final class DoubleTapZoom implements java.lang.Runnable {
        private final long startTime = 0L;
        private final android.graphics.PointF startTouch = null;
        private final android.graphics.PointF endTouch = null;
        private final float bitmapX = 0.0F;
        private final float bitmapY = 0.0F;
        private final float startZoom = 0.0F;
        private final android.view.animation.AccelerateDecelerateInterpolator interpolator = null;
        private final float targetZoom = 0.0F;
        private final boolean stretchImageToSuper = false;
        
        @java.lang.Override()
        public void run() {
        }
        
        private final void translateImageToCenterTouchPosition(float t) {
        }
        
        private final float interpolate() {
            return 0.0F;
        }
        
        private final double calculateDeltaScale(float t) {
            return 0.0;
        }
        
        public DoubleTapZoom(float targetZoom, float focusX, float focusY, boolean stretchImageToSuper) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\r\u0010\u0014\u001a\u00020\u0015H\u0000\u00a2\u0006\u0002\b\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0016R\u001a\u0010\u0006\u001a\u00020\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0018"}, d2 = {"Lcom/github/midros/istheapp/ui/widget/TouchImageView$Fling;", "Ljava/lang/Runnable;", "velocityX", "", "velocityY", "(Lcom/github/midros/istheapp/ui/widget/TouchImageView;II)V", "currX", "getCurrX$app_debug", "()I", "setCurrX$app_debug", "(I)V", "currY", "getCurrY$app_debug", "setCurrY$app_debug", "scroller", "Lcom/github/midros/istheapp/ui/widget/TouchImageView$CompatScroller;", "getScroller$app_debug", "()Lcom/github/midros/istheapp/ui/widget/TouchImageView$CompatScroller;", "setScroller$app_debug", "(Lcom/github/midros/istheapp/ui/widget/TouchImageView$CompatScroller;)V", "cancelFling", "", "cancelFling$app_debug", "run", "app_debug"})
    final class Fling implements java.lang.Runnable {
        private int currX;
        private int currY;
        @org.jetbrains.annotations.Nullable()
        private com.github.midros.istheapp.ui.widget.TouchImageView.CompatScroller scroller;
        
        public final int getCurrX$app_debug() {
            return 0;
        }
        
        public final void setCurrX$app_debug(int p0) {
        }
        
        public final int getCurrY$app_debug() {
            return 0;
        }
        
        public final void setCurrY$app_debug(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.github.midros.istheapp.ui.widget.TouchImageView.CompatScroller getScroller$app_debug() {
            return null;
        }
        
        public final void setScroller$app_debug(@org.jetbrains.annotations.Nullable()
        com.github.midros.istheapp.ui.widget.TouchImageView.CompatScroller p0) {
        }
        
        public final void cancelFling$app_debug() {
        }
        
        @java.lang.Override()
        public void run() {
        }
        
        public Fling(int velocityX, int velocityY) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/github/midros/istheapp/ui/widget/TouchImageView$Companion;", "", "()V", "SUPER_MAX_MULTIPLIER", "", "SUPER_MIN_MULTIPLIER", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}