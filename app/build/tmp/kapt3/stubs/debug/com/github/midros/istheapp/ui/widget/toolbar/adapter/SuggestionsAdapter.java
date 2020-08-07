package com.github.midros.istheapp.ui.widget.toolbar.adapter;

import java.lang.System;

/**
 * Created by luis rafael on 20/05/19.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00020\u00042\u00020\u0005:\u0001\"B\u0005\u00a2\u0006\u0002\u0010\u0006J\u0015\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\u0014J\u001d\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\u0017J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\bH\u0016J\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fJ%\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00028\u00012\u0006\u0010\u0016\u001a\u00020\bH&\u00a2\u0006\u0002\u0010\u001fJ\u001d\u0010 \u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00028\u00012\u0006\u0010\u0016\u001a\u00020\bH\u0016\u00a2\u0006\u0002\u0010!R\u0011\u0010\u0007\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/github/midros/istheapp/ui/widget/toolbar/adapter/SuggestionsAdapter;", "S", "V", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroid/widget/Filterable;", "()V", "listHeight", "", "getListHeight", "()I", "maxSuggestionsCount", "singleViewHeight", "getSingleViewHeight", "suggestions", "", "suggestionsClone", "addSuggestion", "", "r", "(Ljava/lang/Object;)V", "deleteSuggestion", "position", "(ILjava/lang/Object;)V", "getFilter", "Landroid/widget/Filter;", "getItemCount", "getSuggestions", "onBindSuggestionHolder", "suggestion", "holder", "(Ljava/lang/Object;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "OnItemViewClickListener", "app_debug"})
public abstract class SuggestionsAdapter<S extends java.lang.Object, V extends androidx.recyclerview.widget.RecyclerView.ViewHolder> extends androidx.recyclerview.widget.RecyclerView.Adapter<V> implements android.widget.Filterable {
    private java.util.List<S> suggestions;
    private java.util.List<S> suggestionsClone;
    private int maxSuggestionsCount;
    
    public abstract int getSingleViewHeight();
    
    public final int getListHeight() {
        return 0;
    }
    
    public final void addSuggestion(@org.jetbrains.annotations.Nullable()
    S r) {
    }
    
    public final void deleteSuggestion(int position, @org.jetbrains.annotations.Nullable()
    S r) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<S> getSuggestions() {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    V holder, int position) {
    }
    
    public abstract void onBindSuggestionHolder(S suggestion, @org.jetbrains.annotations.NotNull()
    V holder, int position);
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.widget.Filter getFilter() {
        return null;
    }
    
    public SuggestionsAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\t"}, d2 = {"Lcom/github/midros/istheapp/ui/widget/toolbar/adapter/SuggestionsAdapter$OnItemViewClickListener;", "", "onItemClickListener", "", "position", "", "text", "", "onItemDeleteListener", "app_debug"})
    public static abstract interface OnItemViewClickListener {
        
        public abstract void onItemClickListener(int position, @org.jetbrains.annotations.NotNull()
        java.lang.String text);
        
        public abstract void onItemDeleteListener(int position, @org.jetbrains.annotations.NotNull()
        java.lang.String text);
    }
}