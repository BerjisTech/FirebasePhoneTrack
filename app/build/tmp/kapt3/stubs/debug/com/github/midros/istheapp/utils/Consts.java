package com.github.midros.istheapp.utils;

import java.lang.System;

/**
 * Created by luis rafael on 11/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b$\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u00107\u001a\u000208\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u000e\u0010;\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006J"}, d2 = {"Lcom/github/midros/istheapp/utils/Consts;", "", "()V", "ADDRESS_AUDIO_CALLS", "", "ADDRESS_AUDIO_RECORD", "ADDRESS_IMAGE", "ADDRESS_PHOTO", "APP_DISABLED", "", "APP_ENABLED", "CALLS", "CHILD_CAPTURE_PHOTO", "CHILD_GPS", "CHILD_NAME", "CHILD_PERMISSION", "CHILD_PHOTO", "CHILD_SERVICE_DATA", "CHILD_SHOW_APP", "CHILD_SOCIAL_MS", "COMMAND_ADD_WHITELIST", "COMMAND_ENABLE_ACCESSIBILITY", "COMMAND_ENABLE_ACCESSIBILITY_1", "COMMAND_ENABLE_GPS_PROVIDER", "COMMAND_ENABLE_NETWORK_PROVIDER", "COMMAND_ENABLE_NOTIFICATION_LISTENER", "COMMAND_GRANT_PERMISSION", "COMMAND_TYPE", "DATA", "DEVICE_NAME", "FACEBOOK_MESSENGER_PACK_NAME", "FRONT_FACING_CAMERA", "INSTAGRAM_PACK_NAME", "INTERVAL", "KEY_LOGGER", "KEY_TEXT", "LOCATION", "NOTIFICATION_MESSAGE", "PARAMS", "PERMISSION_USAGE_STATS", "PHONE_NUMBER", "PHOTO", "REAR_FACING_CAMERA", "RECORDING", "RESTART_MONITOR_RECEIVER", "SIZE_CACHE_FIREBASE", "", "SMS", "SMS_ADDRESS", "SMS_BODY", "SOCIAL", "STATE_CALL_END", "STATE_CALL_START", "STATE_INCOMING_NUMBER", "TAG", "TEXT", "Ljava/util/regex/Pattern;", "getTEXT", "()Ljava/util/regex/Pattern;", "TIMER", "TYPE_CALL", "TYPE_CALL_INCOMING", "TYPE_CALL_OUTGOING", "TYPE_CHILD", "TYPE_INSTAGRAM", "TYPE_MESSENGER", "TYPE_PARENT", "TYPE_SMS", "TYPE_SMS_INCOMING", "TYPE_SMS_OUTGOING", "TYPE_WHATSAPP", "URL_IMAGE", "USER", "WHATSAPP_PACK_NAME", "app_debug"})
public final class Consts {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "IsTheApp";
    public static final long SIZE_CACHE_FIREBASE = 50000000L;
    public static final int APP_ENABLED = 1;
    public static final int APP_DISABLED = 2;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TYPE_CHILD = "Child";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TYPE_PARENT = "Parent";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER = "user";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NOTIFICATION_MESSAGE = "notificationsMessages";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LOCATION = "location";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CALLS = "calls";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RECORDING = "recording";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DATA = "data";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SMS = "sms";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_LOGGER = "keyLogger";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PHOTO = "photo";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAMS = "params";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TIMER = "timer";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INTERVAL = "interval";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SOCIAL = "social";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHILD_SOCIAL_MS = "ms";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHILD_PHOTO = "photoUrl";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHILD_NAME = "nameChild";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEVICE_NAME = "nameDevice";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHILD_SHOW_APP = "showApp";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHILD_GPS = "gpsEnable";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHILD_SERVICE_DATA = "serviceData";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHILD_PERMISSION = "permissionEnable";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ADDRESS_AUDIO_CALLS = "audioCalls";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ADDRESS_AUDIO_RECORD = "audioRecord";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ADDRESS_IMAGE = "imageNotification";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ADDRESS_PHOTO = "photos";
    public static final int REAR_FACING_CAMERA = 0;
    public static final int FRONT_FACING_CAMERA = 1;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String URL_IMAGE = "urlImage";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_TEXT = "keyText";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHILD_CAPTURE_PHOTO = "capturePhoto";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COMMAND_TYPE = "commandType";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PHONE_NUMBER = "phoneNumber";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TYPE_CALL = "callType";
    public static final int TYPE_CALL_OUTGOING = 1;
    public static final int TYPE_CALL_INCOMING = 2;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TYPE_SMS = "smsType";
    public static final int TYPE_SMS_OUTGOING = 1;
    public static final int TYPE_SMS_INCOMING = 2;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SMS_ADDRESS = "smsAddress";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SMS_BODY = "smsBody";
    public static final int STATE_INCOMING_NUMBER = 1;
    public static final int STATE_CALL_START = 2;
    public static final int STATE_CALL_END = 3;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RESTART_MONITOR_RECEIVER = "com.github.midros.istheapp.receiver.RESTART_MONITOR_RECEIVER";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FACEBOOK_MESSENGER_PACK_NAME = "com.facebook.orca";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WHATSAPP_PACK_NAME = "com.whatsapp";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INSTAGRAM_PACK_NAME = "com.instagram.android";
    public static final int TYPE_MESSENGER = 1;
    public static final int TYPE_WHATSAPP = 2;
    public static final int TYPE_INSTAGRAM = 3;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.regex.Pattern TEXT = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PERMISSION_USAGE_STATS = "android.permission.PACKAGE_USAGE_STATS";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COMMAND_GRANT_PERMISSION = "pm grant ";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COMMAND_ADD_WHITELIST = "dumpsys deviceidle whitelist +";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COMMAND_ENABLE_GPS_PROVIDER = "settings put secure location_providers_allowed +gps";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COMMAND_ENABLE_NETWORK_PROVIDER = "settings put secure location_providers_allowed +network";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COMMAND_ENABLE_ACCESSIBILITY = "settings put secure enabled_accessibility_services ";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COMMAND_ENABLE_ACCESSIBILITY_1 = "settings put secure accessibility_enabled 1";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COMMAND_ENABLE_NOTIFICATION_LISTENER = "cmd notification allow_listener ";
    public static final com.github.midros.istheapp.utils.Consts INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.regex.Pattern getTEXT() {
        return null;
    }
    
    private Consts() {
        super();
    }
}