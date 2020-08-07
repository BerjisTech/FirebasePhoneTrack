package com.github.midros.istheapp.ui.widget.toolbar;

import java.lang.System;

/**
 * Created by luis rafael on 20/05/19.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00d6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 \u00b5\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0004\u00b5\u0001\u00b6\u0001B\u0017\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fB\u001f\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\u0014\u0010\u0083\u0001\u001a\u00030\u0084\u00012\b\u0010\u0085\u0001\u001a\u00030\u0086\u0001H\u0016J\n\u0010\u0087\u0001\u001a\u00030\u0084\u0001H\u0002J\u0011\u0010\u0088\u0001\u001a\u00030\u0084\u00012\u0007\u0010\u0089\u0001\u001a\u00020#J\u001c\u0010\u008a\u0001\u001a\u00030\u0084\u00012\u0007\u0010\u008b\u0001\u001a\u00020\u000e2\u0007\u0010\u008c\u0001\u001a\u00020\u000eH\u0002J/\u0010\u008d\u0001\u001a\u00030\u0084\u00012\b\u0010\u0085\u0001\u001a\u00030\u008e\u00012\u0007\u0010\u008f\u0001\u001a\u00020\u000e2\u0007\u0010\u0090\u0001\u001a\u00020\u000e2\u0007\u0010\u0091\u0001\u001a\u00020\u000eH\u0016J\b\u0010\u0092\u0001\u001a\u00030\u0084\u0001J\b\u0010\u0093\u0001\u001a\u00030\u0084\u0001J\b\u0010\u0094\u0001\u001a\u00030\u0084\u0001J\t\u0010&\u001a\u00030\u0084\u0001H\u0002J\u0012\u0010\u0095\u0001\u001a\u00020\u000e2\u0007\u0010\u0096\u0001\u001a\u00020#H\u0002J\n\u0010\u0097\u0001\u001a\u00030\u0084\u0001H\u0002J\n\u0010\u0098\u0001\u001a\u00030\u0084\u0001H\u0002J\n\u0010\u0099\u0001\u001a\u00030\u0084\u0001H\u0002J\t\u0010\u009a\u0001\u001a\u00020#H\u0002J\u0014\u0010\u009b\u0001\u001a\u00030\u0084\u00012\b\u0010\u009c\u0001\u001a\u00030\u009d\u0001H\u0016J\u0014\u0010\u009e\u0001\u001a\u00030\u0084\u00012\b\u0010\u009c\u0001\u001a\u00030\u009d\u0001H\u0016J\u0014\u0010\u009f\u0001\u001a\u00030\u0084\u00012\b\u0010\u009c\u0001\u001a\u00030\u009d\u0001H\u0016J\u0014\u0010\u00a0\u0001\u001a\u00030\u0084\u00012\b\u0010\u00a1\u0001\u001a\u00030\u00a2\u0001H\u0016J)\u0010\u00a3\u0001\u001a\u00020#2\t\u0010\u00a1\u0001\u001a\u0004\u0018\u00010V2\u0007\u0010\u00a4\u0001\u001a\u00020\u000e2\n\u0010\u00a5\u0001\u001a\u0005\u0018\u00010\u00a6\u0001H\u0016J\u001d\u0010\u00a7\u0001\u001a\u00030\u0084\u00012\b\u0010\u00a1\u0001\u001a\u00030\u00a2\u00012\u0007\u0010\u00a8\u0001\u001a\u00020#H\u0016J\u001b\u0010\u00a9\u0001\u001a\u00030\u0084\u00012\u0007\u0010\u00aa\u0001\u001a\u00020\u000e2\u0006\u0010w\u001a\u00020/H\u0016J\u001b\u0010\u00ab\u0001\u001a\u00030\u0084\u00012\u0007\u0010\u00aa\u0001\u001a\u00020\u000e2\u0006\u0010w\u001a\u00020/H\u0016J/\u0010\u00ac\u0001\u001a\u00030\u0084\u00012\b\u0010\u0085\u0001\u001a\u00030\u008e\u00012\u0007\u0010\u008f\u0001\u001a\u00020\u000e2\u0007\u0010\u00ad\u0001\u001a\u00020\u000e2\u0007\u0010\u0090\u0001\u001a\u00020\u000eH\u0016J\u0011\u0010\u00ae\u0001\u001a\u00030\u0084\u00012\u0007\u0010\u00af\u0001\u001a\u00020/J\u0010\u0010\u00b0\u0001\u001a\u00030\u0084\u00012\u0006\u0010S\u001a\u00020TJ\n\u0010\u00b1\u0001\u001a\u00030\u0084\u0001H\u0002J\n\u0010\u00b2\u0001\u001a\u00030\u0084\u0001H\u0002J\u0012\u0010\u00b3\u0001\u001a\u00030\u0084\u00012\u0006\u0010w\u001a\u00020/H\u0002J\n\u0010\u00b4\u0001\u001a\u00030\u0084\u0001H\u0002R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001f\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\u0015\u001a\u0004\b \u0010\u0013R\u000e\u0010\"\u001a\u00020#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u00020#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*R$\u0010.\u001a\u00020/2\u0006\u0010.\u001a\u00020/8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001b\u00104\u001a\u0002058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b8\u0010\u0015\u001a\u0004\b6\u00107R\u001a\u00109\u001a\u00020#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010(\"\u0004\b:\u0010*R\u000e\u0010;\u001a\u00020#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010<\u001a\u00020#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010(\"\u0004\b=\u0010*R\u000e\u0010>\u001a\u00020#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010?\u001a\u00020@8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bC\u0010\u0015\u001a\u0004\bA\u0010BR\u001b\u0010D\u001a\u0002058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bF\u0010\u0015\u001a\u0004\bE\u00107R\"\u0010I\u001a\u0004\u0018\u00010H2\b\u0010G\u001a\u0004\u0018\u00010H@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u001b\u0010L\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bN\u0010\u0015\u001a\u0004\bM\u0010\u0013R\u001b\u0010O\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bQ\u0010\u0015\u001a\u0004\bP\u0010\u0013R\u000e\u0010R\u001a\u00020#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010S\u001a\u0004\u0018\u00010TX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010U\u001a\u00020V8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bY\u0010\u0015\u001a\u0004\bW\u0010XR\u001b\u0010Z\u001a\u00020[8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b^\u0010\u0015\u001a\u0004\b\\\u0010]R\u001b\u0010_\u001a\u00020`8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bc\u0010\u0015\u001a\u0004\ba\u0010bR\u001b\u0010d\u001a\u00020e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bh\u0010\u0015\u001a\u0004\bf\u0010gR$\u0010j\u001a\u00020/2\u0006\u0010i\u001a\u00020/8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bk\u00101\"\u0004\bl\u00103R$\u0010n\u001a\u00020#2\u0006\u0010m\u001a\u00020#@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bo\u0010(\"\u0004\bp\u0010*R$\u0010q\u001a\u00020#2\u0006\u0010m\u001a\u00020#@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\br\u0010(\"\u0004\bs\u0010*R\u001b\u0010t\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bv\u0010\u0015\u001a\u0004\bu\u0010\u0013R$\u0010w\u001a\u00020/2\u0006\u0010w\u001a\u00020/8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bx\u00101\"\u0004\by\u00103R$\u0010z\u001a\u00020/2\u0006\u0010z\u001a\u00020/8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b{\u00101\"\u0004\b|\u00103R\u001b\u0010}\u001a\u00020V8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u007f\u0010\u0015\u001a\u0004\b~\u0010XR\u001e\u0010\u0080\u0001\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\u000e\n\u0005\b\u0082\u0001\u0010\u0015\u001a\u0005\b\u0081\u0001\u0010\u0013\u00a8\u0006\u00b7\u0001"}, d2 = {"Lcom/github/midros/istheapp/ui/widget/toolbar/CustomToolbar;", "Landroid/widget/FrameLayout;", "Landroid/view/View$OnClickListener;", "Landroid/view/animation/Animation$AnimationListener;", "Lcom/github/midros/istheapp/ui/widget/toolbar/adapter/SuggestionsAdapter$OnItemViewClickListener;", "Landroid/view/View$OnFocusChangeListener;", "Landroid/widget/TextView$OnEditorActionListener;", "Landroid/text/TextWatcher;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "actionDelete", "Landroid/widget/ImageView;", "getActionDelete", "()Landroid/widget/ImageView;", "actionDelete$delegate", "Lkotlin/properties/ReadOnlyProperty;", "adapter", "Lcom/github/midros/istheapp/ui/widget/toolbar/adapter/DefaultSuggestionsAdapter;", "alphaRecord", "Landroid/view/animation/AlphaAnimation;", "childPhoto", "Lde/hdodenhof/circleimageview/CircleImageView;", "getChildPhoto", "()Lde/hdodenhof/circleimageview/CircleImageView;", "childPhoto$delegate", "clearIcon", "getClearIcon", "clearIcon$delegate", "clickClearText", "", "density", "", "enableSearch", "getEnableSearch", "()Z", "setEnableSearch", "(Z)V", "enableStatePermission", "getEnableStatePermission", "setEnableStatePermission", "hint", "", "getHint", "()Ljava/lang/String;", "setHint", "(Ljava/lang/String;)V", "inputContainer", "Landroid/widget/LinearLayout;", "getInputContainer", "()Landroid/widget/LinearLayout;", "inputContainer$delegate", "isActionEnabled", "setActionEnabled", "isSearchDisabledForAction", "isSearchEnabled", "setSearchEnabled", "isSuggestionsVisible", "last", "Landroid/widget/RelativeLayout;", "getLast", "()Landroid/widget/RelativeLayout;", "last$delegate", "linearRecord", "getLinearRecord", "linearRecord$delegate", "<set-?>", "Landroidx/appcompat/widget/PopupMenu;", "menu", "getMenu", "()Landroidx/appcompat/widget/PopupMenu;", "menuIcon", "getMenuIcon", "menuIcon$delegate", "navIcon", "getNavIcon", "navIcon$delegate", "navIconShown", "onToolbarActionListener", "Lcom/github/midros/istheapp/ui/widget/toolbar/CustomToolbar$OnToolbarActionListener;", "placeHolderView", "Landroid/widget/TextView;", "getPlaceHolderView", "()Landroid/widget/TextView;", "placeHolderView$delegate", "progress", "Landroid/widget/ProgressBar;", "getProgress", "()Landroid/widget/ProgressBar;", "progress$delegate", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView$delegate", "searchEditText", "Landroid/widget/EditText;", "getSearchEditText", "()Landroid/widget/EditText;", "searchEditText$delegate", "title", "setTitle", "getSetTitle", "setSetTitle", "state", "showProgress", "getShowProgress", "setShowProgress", "statePermission", "getStatePermission", "setStatePermission", "stateView", "getStateView", "stateView$delegate", "text", "getText", "setText", "timer", "getTimer", "setTimer", "timerRecord", "getTimerRecord", "timerRecord$delegate", "viewRecord", "getViewRecord", "viewRecord$delegate", "afterTextChanged", "", "s", "Landroid/text/Editable;", "animateNavIcon", "animateRecord", "record", "animateSuggestions", "from", "to", "beforeTextChanged", "", "start", "count", "after", "disableAction", "disableSearch", "enableAction", "getListHeight", "isSubtraction", "hideSuggestionsList", "inflateMenu", "init", "listenerExists", "onAnimationEnd", "animation", "Landroid/view/animation/Animation;", "onAnimationRepeat", "onAnimationStart", "onClick", "v", "Landroid/view/View;", "onEditorAction", "actionId", "event", "Landroid/view/KeyEvent;", "onFocusChange", "hasFocus", "onItemClickListener", "position", "onItemDeleteListener", "onTextChanged", "before", "setChildPhoto", "url", "setOnToolbarActionListener", "setupIconRippleStyle", "showSuggestionsList", "textSearchConfirmed", "topView", "Companion", "OnToolbarActionListener", "app_debug"})
public final class CustomToolbar extends android.widget.FrameLayout implements android.view.View.OnClickListener, android.view.animation.Animation.AnimationListener, com.github.midros.istheapp.ui.widget.toolbar.adapter.SuggestionsAdapter.OnItemViewClickListener, android.view.View.OnFocusChangeListener, android.widget.TextView.OnEditorActionListener, android.text.TextWatcher {
    private final kotlin.properties.ReadOnlyProperty inputContainer$delegate = null;
    private final kotlin.properties.ReadOnlyProperty navIcon$delegate = null;
    private final kotlin.properties.ReadOnlyProperty menuIcon$delegate = null;
    private final kotlin.properties.ReadOnlyProperty clearIcon$delegate = null;
    private final kotlin.properties.ReadOnlyProperty childPhoto$delegate = null;
    private final kotlin.properties.ReadOnlyProperty searchEditText$delegate = null;
    private final kotlin.properties.ReadOnlyProperty placeHolderView$delegate = null;
    private final kotlin.properties.ReadOnlyProperty stateView$delegate = null;
    private final kotlin.properties.ReadOnlyProperty progress$delegate = null;
    private final kotlin.properties.ReadOnlyProperty actionDelete$delegate = null;
    private final kotlin.properties.ReadOnlyProperty last$delegate = null;
    private final kotlin.properties.ReadOnlyProperty recyclerView$delegate = null;
    private final kotlin.properties.ReadOnlyProperty linearRecord$delegate = null;
    private final kotlin.properties.ReadOnlyProperty viewRecord$delegate = null;
    private final kotlin.properties.ReadOnlyProperty timerRecord$delegate = null;
    private com.github.midros.istheapp.ui.widget.toolbar.CustomToolbar.OnToolbarActionListener onToolbarActionListener;
    private android.view.animation.AlphaAnimation alphaRecord;
    private boolean enableSearch;
    private boolean enableStatePermission;
    private boolean statePermission;
    private boolean showProgress;
    private boolean isActionEnabled;
    private boolean isSearchEnabled;
    private boolean isSearchDisabledForAction;
    private boolean clickClearText;
    private boolean isSuggestionsVisible;
    private com.github.midros.istheapp.ui.widget.toolbar.adapter.DefaultSuggestionsAdapter adapter;
    private float density;
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.widget.PopupMenu menu;
    private boolean navIconShown;
    public static final int BUTTON_CHILD_USER = 1;
    public static final int BUTTON_NAVIGATION = 2;
    public static final int BUTTON_BACK = 3;
    public static final int BUTTON_STATE = 4;
    public static final int BUTTON_ACTION_DELETE = 5;
    public static final com.github.midros.istheapp.ui.widget.toolbar.CustomToolbar.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final android.widget.LinearLayout getInputContainer() {
        return null;
    }
    
    private final android.widget.ImageView getNavIcon() {
        return null;
    }
    
    private final android.widget.ImageView getMenuIcon() {
        return null;
    }
    
    private final android.widget.ImageView getClearIcon() {
        return null;
    }
    
    private final de.hdodenhof.circleimageview.CircleImageView getChildPhoto() {
        return null;
    }
    
    private final android.widget.EditText getSearchEditText() {
        return null;
    }
    
    private final android.widget.TextView getPlaceHolderView() {
        return null;
    }
    
    private final android.widget.ImageView getStateView() {
        return null;
    }
    
    private final android.widget.ProgressBar getProgress() {
        return null;
    }
    
    private final android.widget.ImageView getActionDelete() {
        return null;
    }
    
    private final android.widget.RelativeLayout getLast() {
        return null;
    }
    
    private final androidx.recyclerview.widget.RecyclerView getRecyclerView() {
        return null;
    }
    
    private final android.widget.LinearLayout getLinearRecord() {
        return null;
    }
    
    private final android.widget.ImageView getViewRecord() {
        return null;
    }
    
    private final android.widget.TextView getTimerRecord() {
        return null;
    }
    
    public final boolean getEnableSearch() {
        return false;
    }
    
    public final void setEnableSearch(boolean p0) {
    }
    
    public final boolean getEnableStatePermission() {
        return false;
    }
    
    public final void setEnableStatePermission(boolean p0) {
    }
    
    public final boolean getStatePermission() {
        return false;
    }
    
    public final void setStatePermission(boolean state) {
    }
    
    public final boolean getShowProgress() {
        return false;
    }
    
    public final void setShowProgress(boolean state) {
    }
    
    public final boolean isActionEnabled() {
        return false;
    }
    
    public final void setActionEnabled(boolean p0) {
    }
    
    public final boolean isSearchEnabled() {
        return false;
    }
    
    public final void setSearchEnabled(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.appcompat.widget.PopupMenu getMenu() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSetTitle() {
        return null;
    }
    
    public final void setSetTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String title) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHint() {
        return null;
    }
    
    public final void setHint(@org.jetbrains.annotations.NotNull()
    java.lang.String hint) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getText() {
        return null;
    }
    
    public final void setText(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimer() {
        return null;
    }
    
    public final void setTimer(@org.jetbrains.annotations.NotNull()
    java.lang.String timer) {
    }
    
    private final void init() {
    }
    
    private final void topView() {
    }
    
    public final void setChildPhoto(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    private final void setupIconRippleStyle() {
    }
    
    private final void inflateMenu() {
    }
    
    public final void setOnToolbarActionListener(@org.jetbrains.annotations.NotNull()
    com.github.midros.istheapp.ui.widget.toolbar.CustomToolbar.OnToolbarActionListener onToolbarActionListener) {
    }
    
    public final void enableAction() {
    }
    
    public final void disableAction() {
    }
    
    public final void disableSearch() {
    }
    
    private final void enableSearch() {
    }
    
    private final void animateNavIcon() {
    }
    
    @java.lang.Override()
    public void onAnimationEnd(@org.jetbrains.annotations.NotNull()
    android.view.animation.Animation animation) {
    }
    
    private final void animateSuggestions(int from, int to) {
    }
    
    public final void animateRecord(boolean record) {
    }
    
    private final void showSuggestionsList() {
    }
    
    private final void hideSuggestionsList() {
    }
    
    private final boolean listenerExists() {
        return false;
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    @java.lang.Override()
    public void onAnimationStart(@org.jetbrains.annotations.NotNull()
    android.view.animation.Animation animation) {
    }
    
    @java.lang.Override()
    public void onAnimationRepeat(@org.jetbrains.annotations.NotNull()
    android.view.animation.Animation animation) {
    }
    
    @java.lang.Override()
    public void onFocusChange(@org.jetbrains.annotations.NotNull()
    android.view.View v, boolean hasFocus) {
    }
    
    @java.lang.Override()
    public boolean onEditorAction(@org.jetbrains.annotations.Nullable()
    android.widget.TextView v, int actionId, @org.jetbrains.annotations.Nullable()
    android.view.KeyEvent event) {
        return false;
    }
    
    private final void textSearchConfirmed(java.lang.String text) {
    }
    
    private final int getListHeight(boolean isSubtraction) {
        return 0;
    }
    
    @java.lang.Override()
    public void afterTextChanged(@org.jetbrains.annotations.NotNull()
    android.text.Editable s) {
    }
    
    @java.lang.Override()
    public void beforeTextChanged(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence s, int start, int count, int after) {
    }
    
    @java.lang.Override()
    public void onTextChanged(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence s, int start, int before, int count) {
    }
    
    @java.lang.Override()
    public void onItemClickListener(int position, @org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    @java.lang.Override()
    public void onItemDeleteListener(int position, @org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public CustomToolbar(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public CustomToolbar(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u000e"}, d2 = {"Lcom/github/midros/istheapp/ui/widget/toolbar/CustomToolbar$OnToolbarActionListener;", "", "onActionStateChanged", "", "enabled", "", "onButtonClicked", "buttonCode", "", "onChangeHeight", "onSearchConfirmed", "text", "", "onSearchStateChanged", "app_debug"})
    public static abstract interface OnToolbarActionListener {
        
        public abstract void onSearchStateChanged(boolean enabled);
        
        public abstract void onSearchConfirmed(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence text);
        
        public abstract void onButtonClicked(int buttonCode);
        
        public abstract void onActionStateChanged(boolean enabled);
        
        public abstract void onChangeHeight();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/github/midros/istheapp/ui/widget/toolbar/CustomToolbar$Companion;", "", "()V", "BUTTON_ACTION_DELETE", "", "BUTTON_BACK", "BUTTON_CHILD_USER", "BUTTON_NAVIGATION", "BUTTON_STATE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}