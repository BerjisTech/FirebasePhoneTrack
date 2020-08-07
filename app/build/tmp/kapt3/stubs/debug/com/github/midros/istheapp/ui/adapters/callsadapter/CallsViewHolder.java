package com.github.midros.istheapp.ui.adapters.callsadapter;

import java.lang.System;

/**
 * Created by luis rafael on 28/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020SJ\u0006\u0010T\u001a\u00020\u001fJ\u0006\u0010U\u001a\u00020\u001fJ\u000e\u0010V\u001a\u00020Q2\u0006\u0010W\u001a\u00020XJ\u0016\u0010Y\u001a\u00020Q2\u0006\u0010Z\u001a\u00020X2\u0006\u0010[\u001a\u00020\\J\u0006\u0010]\u001a\u00020QJ\u0006\u0010^\u001a\u00020QJ\u0006\u0010_\u001a\u00020QJ\u0010\u0010`\u001a\u00020Q2\u0006\u0010a\u001a\u00020bH\u0002J\b\u0010c\u001a\u00020QH\u0002J\u0010\u0010d\u001a\u00020Q2\u0006\u0010e\u001a\u00020bH\u0002J\u000e\u0010f\u001a\u00020Q2\u0006\u0010g\u001a\u00020\u001fJ\u0010\u0010h\u001a\u00020Q2\u0006\u0010e\u001a\u00020bH\u0002J\b\u0010i\u001a\u00020QH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001b\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u000e\u001a\u0004\b\u001c\u0010\u0017R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010 \u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\"\u0010\u000e\u001a\u0004\b!\u0010\u0017R\u001a\u0010#\u001a\u00020\u001fX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001b\u0010(\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b*\u0010\u000e\u001a\u0004\b)\u0010\u0017R\u001b\u0010+\u001a\u00020,8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b/\u0010\u000e\u001a\u0004\b-\u0010.R\u001b\u00100\u001a\u00020,8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b2\u0010\u000e\u001a\u0004\b1\u0010.R\u001b\u00103\u001a\u0002048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b7\u0010\u000e\u001a\u0004\b5\u00106R\u001b\u00108\u001a\u0002098FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b<\u0010\u000e\u001a\u0004\b:\u0010;R\u0010\u0010=\u001a\u0004\u0018\u00010>X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010?\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bA\u0010\u000e\u001a\u0004\b@\u0010\u0017R\u000e\u0010B\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010C\u001a\u00020D8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bG\u0010\u000e\u001a\u0004\bE\u0010FR\u0010\u0010H\u001a\u0004\u0018\u00010IX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010J\u001a\u00020K8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bN\u0010\u000e\u001a\u0004\bL\u0010MR\u000e\u0010O\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006j"}, d2 = {"Lcom/github/midros/istheapp/ui/adapters/callsadapter/CallsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/view/View;Landroid/content/Context;)V", "audio", "Landroid/media/AudioManager;", "btnPlay", "Lcom/romancha/playpause/PlayPauseView;", "getBtnPlay", "()Lcom/romancha/playpause/PlayPauseView;", "btnPlay$delegate", "Lkotlin/properties/ReadOnlyProperty;", "card", "Landroidx/cardview/widget/CardView;", "getCard", "()Landroidx/cardview/widget/CardView;", "card$delegate", "contact", "Landroid/widget/TextView;", "getContact", "()Landroid/widget/TextView;", "contact$delegate", "getContext", "()Landroid/content/Context;", "currentDuration", "getCurrentDuration", "currentDuration$delegate", "currentProgress", "", "dateTime", "getDateTime", "dateTime$delegate", "downloader", "getDownloader$app_debug", "()Z", "setDownloader$app_debug", "(Z)V", "duration", "getDuration", "duration$delegate", "imageItem", "Landroid/widget/ImageView;", "getImageItem", "()Landroid/widget/ImageView;", "imageItem$delegate", "imgCallType", "getImgCallType", "imgCallType$delegate", "imgCheck", "Lde/hdodenhof/circleimageview/CircleImageView;", "getImgCheck", "()Lde/hdodenhof/circleimageview/CircleImageView;", "imgCheck$delegate", "itemClick", "Landroid/widget/LinearLayout;", "getItemClick", "()Landroid/widget/LinearLayout;", "itemClick$delegate", "mediaPlayer", "Landroid/media/MediaPlayer;", "phoneNumber", "getPhoneNumber", "phoneNumber$delegate", "playing", "progressCall", "Lat/grabner/circleprogress/CircleProgressView;", "getProgressCall", "()Lat/grabner/circleprogress/CircleProgressView;", "progressCall$delegate", "runThreads", "Ljava/lang/Thread;", "seekBarProgress", "Landroid/widget/SeekBar;", "getSeekBarProgress", "()Landroid/widget/SeekBar;", "seekBarProgress$delegate", "stopPlayer", "bind", "", "item", "Lcom/github/midros/istheapp/data/model/Calls;", "getPlaying", "getStopPlayer", "initializeMediaPlayer", "fileName", "", "isSelectedItem", "key", "file", "Ljava/io/File;", "onPauseAudioCall", "onPlayAudioCall", "onStopAudioCall", "seek", "position", "", "setCurrentProgress", "setMaxProgress", "value", "setOnPlay", "onPlay", "setProgressValue", "stopCurrentProgress", "app_debug"})
public final class CallsViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    private final kotlin.properties.ReadOnlyProperty contact$delegate = null;
    private final kotlin.properties.ReadOnlyProperty phoneNumber$delegate = null;
    private final kotlin.properties.ReadOnlyProperty dateTime$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty imageItem$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty progressCall$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty itemClick$delegate = null;
    private final kotlin.properties.ReadOnlyProperty duration$delegate = null;
    private final kotlin.properties.ReadOnlyProperty currentDuration$delegate = null;
    private final kotlin.properties.ReadOnlyProperty imgCallType$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty btnPlay$delegate = null;
    private final kotlin.properties.ReadOnlyProperty seekBarProgress$delegate = null;
    private final kotlin.properties.ReadOnlyProperty imgCheck$delegate = null;
    private final kotlin.properties.ReadOnlyProperty card$delegate = null;
    private final android.media.AudioManager audio = null;
    private boolean downloader;
    private android.media.MediaPlayer mediaPlayer;
    private boolean currentProgress;
    private java.lang.Thread runThreads;
    private boolean playing;
    private boolean stopPlayer;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    private final android.widget.TextView getContact() {
        return null;
    }
    
    private final android.widget.TextView getPhoneNumber() {
        return null;
    }
    
    private final android.widget.TextView getDateTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getImageItem() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final at.grabner.circleprogress.CircleProgressView getProgressCall() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getItemClick() {
        return null;
    }
    
    private final android.widget.TextView getDuration() {
        return null;
    }
    
    private final android.widget.TextView getCurrentDuration() {
        return null;
    }
    
    private final android.widget.ImageView getImgCallType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.romancha.playpause.PlayPauseView getBtnPlay() {
        return null;
    }
    
    private final android.widget.SeekBar getSeekBarProgress() {
        return null;
    }
    
    private final de.hdodenhof.circleimageview.CircleImageView getImgCheck() {
        return null;
    }
    
    private final androidx.cardview.widget.CardView getCard() {
        return null;
    }
    
    public final boolean getDownloader$app_debug() {
        return false;
    }
    
    public final void setDownloader$app_debug(boolean p0) {
    }
    
    public final void isSelectedItem(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.io.File file) {
    }
    
    public final void bind(@org.jetbrains.annotations.NotNull()
    com.github.midros.istheapp.data.model.Calls item) {
    }
    
    public final boolean getPlaying() {
        return false;
    }
    
    public final boolean getStopPlayer() {
        return false;
    }
    
    public final void initializeMediaPlayer(@org.jetbrains.annotations.NotNull()
    java.lang.String fileName) {
    }
    
    public final void onPlayAudioCall() {
    }
    
    public final void onPauseAudioCall() {
    }
    
    public final void onStopAudioCall() {
    }
    
    public final void setOnPlay(boolean onPlay) {
    }
    
    private final void setMaxProgress(int value) {
    }
    
    private final void seek(int position) {
    }
    
    private final void setProgressValue(int value) {
    }
    
    private final void setCurrentProgress() {
    }
    
    private final void stopCurrentProgress() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public CallsViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
}