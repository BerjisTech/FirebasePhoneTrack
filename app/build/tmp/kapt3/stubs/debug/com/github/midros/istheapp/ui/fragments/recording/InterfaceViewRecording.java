package com.github.midros.istheapp.ui.fragments.recording;

import java.lang.System;

/**
 * Created by luis rafael on 17/03/19.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\f"}, d2 = {"Lcom/github/midros/istheapp/ui/fragments/recording/InterfaceViewRecording;", "Lcom/github/midros/istheapp/ui/activities/base/InterfaceView;", "setRecyclerAdapter", "", "recyclerAdapter", "Lcom/github/midros/istheapp/ui/adapters/recordingadapter/RecordingRecyclerAdapter;", "setValueState", "dataSnapshot", "Lcom/google/firebase/database/DataSnapshot;", "setValueTimerRecording", "timer", "", "app_debug"})
public abstract interface InterfaceViewRecording extends com.github.midros.istheapp.ui.activities.base.InterfaceView {
    
    public abstract void setValueState(@org.jetbrains.annotations.NotNull()
    com.google.firebase.database.DataSnapshot dataSnapshot);
    
    public abstract void setValueTimerRecording(long timer);
    
    public abstract void setRecyclerAdapter(@org.jetbrains.annotations.NotNull()
    com.github.midros.istheapp.ui.adapters.recordingadapter.RecordingRecyclerAdapter recyclerAdapter);
}