package com.github.midros.istheapp.ui.adapters.basedapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH&\u00a8\u0006\n"}, d2 = {"Lcom/github/midros/istheapp/ui/adapters/basedapter/InterfaceAdapter;", "", "failedResult", "", "error", "Lcom/google/firebase/database/DatabaseError;", "successResult", "result", "", "filter", "app_debug"})
public abstract interface InterfaceAdapter {
    
    public abstract void successResult(boolean result, boolean filter);
    
    public abstract void failedResult(@org.jetbrains.annotations.NotNull()
    com.google.firebase.database.DatabaseError error);
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}