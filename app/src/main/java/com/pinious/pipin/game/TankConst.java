package com.pinious.pipin.game;

import android.net.Uri;
import android.webkit.ValueCallback;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;

public class TankConst {
    static int profileCode = 444;
    static int Code = 11111;
    static ValueCallback<Uri[]> CallBack;
    static Uri URL;
    static FirebaseRemoteConfig Firebase;

    public static void SetBase()
    {
        Firebase = FirebaseRemoteConfig.getInstance();
        FirebaseRemoteConfigSettings configSettings = new FirebaseRemoteConfigSettings.Builder().build();
        Firebase.setDefaultsAsync(R.xml.tank_url);
        Firebase.setConfigSettingsAsync(configSettings);
    }

    public static int getCode() {
        return Code;
    }

    public static void setCode(int code) {
        Code = code;
    }

    public static ValueCallback<Uri[]> getCallBack() {
        return CallBack;
    }

    public static void setCallBack(ValueCallback<Uri[]> callBack) {
        CallBack = callBack;
    }

    public static Uri getURL() {
        return URL;
    }

    public static void setURL(Uri URL) {
        TankConst.URL = URL;
    }

    public static FirebaseRemoteConfig getFirebase() {
        return Firebase;
    }

    public static void setFirebase(FirebaseRemoteConfig firebase) {
        Firebase = firebase;
    }

    public static int getProfileCode() {
        return profileCode;
    }

    public static void setProfileCode(int profileCode) {
        TankConst.profileCode = profileCode;
    }
}
