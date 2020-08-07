package com.github.midros.istheapp.ui.widget.toolbar.adapter;

import java.lang.System;

/**
 * Created by luis rafael on 20/05/19.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0004J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\bH\u0017J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bH\u0016J\u000e\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lcom/github/midros/istheapp/ui/widget/toolbar/adapter/DefaultSuggestionsAdapter;", "Lcom/github/midros/istheapp/ui/widget/toolbar/adapter/SuggestionsAdapter;", "", "Lcom/github/midros/istheapp/ui/widget/toolbar/adapter/DefaultSuggestionsAdapter$SuggestionHolder;", "()V", "listener", "Lcom/github/midros/istheapp/ui/widget/toolbar/adapter/SuggestionsAdapter$OnItemViewClickListener;", "singleViewHeight", "", "getSingleViewHeight", "()I", "onBindSuggestionHolder", "", "suggestion", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setListener", "SuggestionHolder", "app_debug"})
public final class DefaultSuggestionsAdapter extends com.github.midros.istheapp.ui.widget.toolbar.adapter.SuggestionsAdapter<java.lang.String, com.github.midros.istheapp.ui.widget.toolbar.adapter.DefaultSuggestionsAdapter.SuggestionHolder> {
    private com.github.midros.istheapp.ui.widget.toolbar.adapter.SuggestionsAdapter.OnItemViewClickListener listener;
    
    @java.lang.Override()
    public int getSingleViewHeight() {
        return 0;
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    com.github.midros.istheapp.ui.widget.toolbar.adapter.SuggestionsAdapter.OnItemViewClickListener listener) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.github.midros.istheapp.ui.widget.toolbar.adapter.DefaultSuggestionsAdapter.SuggestionHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    public void onBindSuggestionHolder(@org.jetbrains.annotations.NotNull()
    java.lang.String suggestion, @org.jetbrains.annotations.NotNull()
    com.github.midros.istheapp.ui.widget.toolbar.adapter.DefaultSuggestionsAdapter.SuggestionHolder holder, int position) {
    }
    
    public DefaultSuggestionsAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u0012R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0013"}, d2 = {"Lcom/github/midros/istheapp/ui/widget/toolbar/adapter/DefaultSuggestionsAdapter$SuggestionHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "ivDelete", "Landroid/widget/ImageView;", "getIvDelete", "()Landroid/widget/ImageView;", "ivDelete$delegate", "Lkotlin/properties/ReadOnlyProperty;", "text", "Landroid/widget/TextView;", "getText", "()Landroid/widget/TextView;", "text$delegate", "bind", "", "", "app_debug"})
    public static final class SuggestionHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final kotlin.properties.ReadOnlyProperty text$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.properties.ReadOnlyProperty ivDelete$delegate = null;
        
        private final android.widget.TextView getText() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getIvDelete() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        java.lang.String text) {
        }
        
        public SuggestionHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}