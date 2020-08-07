package com.github.midros.istheapp.ui.adapters.recordingadapter;

import java.lang.System;

/**
 * Created by luis rafael on 28/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020KH\u0007J\u0006\u0010L\u001a\u00020\u001aJ\u0006\u0010M\u001a\u00020\u001aJ\u000e\u0010N\u001a\u00020I2\u0006\u0010O\u001a\u00020PJ\u0016\u0010Q\u001a\u00020I2\u0006\u0010R\u001a\u00020P2\u0006\u0010S\u001a\u00020TJ\u0006\u0010U\u001a\u00020IJ\u0006\u0010V\u001a\u00020IJ\u0006\u0010W\u001a\u00020IJ\u0010\u0010X\u001a\u00020I2\u0006\u0010Y\u001a\u00020ZH\u0002J\b\u0010[\u001a\u00020IH\u0002J\u0010\u0010\\\u001a\u00020I2\u0006\u0010]\u001a\u00020ZH\u0002J\u000e\u0010^\u001a\u00020I2\u0006\u0010_\u001a\u00020\u001aJ\u0010\u0010`\u001a\u00020I2\u0006\u0010]\u001a\u00020ZH\u0002J\b\u0010a\u001a\u00020IH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u000e\u001a\u0004\b\u001c\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u001aX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001b\u0010#\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b%\u0010\u000e\u001a\u0004\b$\u0010\u0017R\u001b\u0010&\u001a\u00020\'8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b*\u0010\u000e\u001a\u0004\b(\u0010)R\u001b\u0010+\u001a\u00020,8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b/\u0010\u000e\u001a\u0004\b-\u0010.R\u001b\u00100\u001a\u0002018FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b4\u0010\u000e\u001a\u0004\b2\u00103R\u0010\u00105\u001a\u0004\u0018\u000106X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u00107\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b9\u0010\u000e\u001a\u0004\b8\u0010\u0017R\u000e\u0010:\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010;\u001a\u00020<8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b?\u0010\u000e\u001a\u0004\b=\u0010>R\u0010\u0010@\u001a\u0004\u0018\u00010AX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010B\u001a\u00020C8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bF\u0010\u000e\u001a\u0004\bD\u0010ER\u000e\u0010G\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006b"}, d2 = {"Lcom/github/midros/istheapp/ui/adapters/recordingadapter/RecordingViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/view/View;Landroid/content/Context;)V", "audio", "Landroid/media/AudioManager;", "btnPlay", "Lcom/romancha/playpause/PlayPauseView;", "getBtnPlay", "()Lcom/romancha/playpause/PlayPauseView;", "btnPlay$delegate", "Lkotlin/properties/ReadOnlyProperty;", "card", "Landroidx/cardview/widget/CardView;", "getCard", "()Landroidx/cardview/widget/CardView;", "card$delegate", "currentDuration", "Landroid/widget/TextView;", "getCurrentDuration", "()Landroid/widget/TextView;", "currentDuration$delegate", "currentProgress", "", "dateTime", "getDateTime", "dateTime$delegate", "downloader", "getDownloader$app_debug", "()Z", "setDownloader$app_debug", "(Z)V", "duration", "getDuration", "duration$delegate", "imageItem", "Landroid/widget/ImageView;", "getImageItem", "()Landroid/widget/ImageView;", "imageItem$delegate", "imgCheck", "Lde/hdodenhof/circleimageview/CircleImageView;", "getImgCheck", "()Lde/hdodenhof/circleimageview/CircleImageView;", "imgCheck$delegate", "itemClick", "Landroid/widget/LinearLayout;", "getItemClick", "()Landroid/widget/LinearLayout;", "itemClick$delegate", "mediaPlayer", "Landroid/media/MediaPlayer;", "name", "getName", "name$delegate", "playing", "progressRecord", "Lat/grabner/circleprogress/CircleProgressView;", "getProgressRecord", "()Lat/grabner/circleprogress/CircleProgressView;", "progressRecord$delegate", "runThreads", "Ljava/lang/Thread;", "seekBarProgress", "Landroid/widget/SeekBar;", "getSeekBarProgress", "()Landroid/widget/SeekBar;", "seekBarProgress$delegate", "stopPlayer", "bind", "", "item", "Lcom/github/midros/istheapp/data/model/Recording;", "getPlaying", "getStopPlayer", "initializeMediaPlayer", "fileName", "", "isSelectedItem", "key", "file", "Ljava/io/File;", "onPauseAudioRecord", "onPlayAudioRecord", "onStopAudioRecord", "seek", "position", "", "setCurrentProgress", "setMaxProgress", "value", "setOnPlay", "onPlay", "setProgressValue", "stopCurrentProgress", "app_debug"})
public final class RecordingViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    private final kotlin.properties.ReadOnlyProperty name$delegate = null;
    private final kotlin.properties.ReadOnlyProperty dateTime$delegate = null;
    private final kotlin.properties.ReadOnlyProperty imageItem$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty progressRecord$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty itemClick$delegate = null;
    private final kotlin.properties.ReadOnlyProperty duration$delegate = null;
    private final kotlin.properties.ReadOnlyProperty currentDuration$delegate = null;
    private final kotlin.properties.ReadOnlyProperty seekBarProgress$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty btnPlay$delegate = null;
    private final kotlin.properties.ReadOnlyProperty imgCheck$delegate = null;
    private final kotlin.properties.ReadOnlyProperty card$delegate = null;
    private final android.media.AudioManager audio = null;
    private boolean downloader;
    private android.media.MediaPlayer mediaPlayer;
    private boolean currentProgress;
    private java.lang.Thread runThreads;
    private boolean playing;
    private boolean stopPlayer;
    private final android.content.Context context = null;
    
    private final android.widget.TextView getName() {
        return null;
    }
    
    private final android.widget.TextView getDateTime() {
        return null;
    }
    
    private final android.widget.ImageView getImageItem() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final at.grabner.circleprogress.CircleProgressView getProgressRecord() {
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
    
    private final android.widget.SeekBar getSeekBarProgress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.romancha.playpause.PlayPauseView getBtnPlay() {
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
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    public final void bind(@org.jetbrains.annotations.NotNull()
    com.github.midros.istheapp.data.model.Recording item) {
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
    
    public final void onPlayAudioRecord() {
    }
    
    public final void onPauseAudioRecord() {
    }
    
    public final void onStopAudioRecord() {
    }
    
    public final void setOnPlay(boolean onPlay) {
    }
    
    private final void setMaxProgress(int value) {
    }
    
    private final void setProgressValue(int value) {
    }
    
    private final void seek(int position) {
    }
    
    private final void setCurrentProgress() {
    }
    
    private final void stopCurrentProgress() {
    }
    
    public RecordingViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
}