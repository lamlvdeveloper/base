package com.example.baseapp.database.sharedpre;

import android.content.Context;
import android.content.SharedPreferences;

public class Shared {

    private SharedPreferences IShare = null;
    private static Shared mSharedPre;

    public Shared(Context context) {
        if (context != null)
            IShare = context.getSharedPreferences("KEY_SHARED", Context.MODE_PRIVATE);
    }

    public static Shared getInstance(Context context) {
        if (mSharedPre == null) {
            mSharedPre = new Shared(context.getApplicationContext());
        }
        return mSharedPre;
    }

    public void setValue(String key, long val) {
        IShare.edit().putLong(key, val).apply();
    }

    public void setValue(String key, String val) {
        IShare.edit().putString(key, val).apply();
    }

    public void setValue(String key, int val) {
        IShare.edit().putInt(key, val).apply();
    }

    public int getValue(String key, int delVal) {
        return IShare.getInt(key, delVal);
    }

    public void setValue(String key, boolean val) {
        IShare.edit().putBoolean(key, val).apply();
    }

    public boolean getValue(String key, boolean delValBoolean) {
        return IShare.getBoolean(key, delValBoolean);
    }

    public long getValueLong(String key, long delVal) {
        return IShare.getLong(key, delVal);
    }

    public String getValue(String key, String delVal) {
        return IShare.getString(key, delVal).trim().toString();
    }

    public void setNotificationCount(String key, int countNoti) {
        if (countNoti > 0)
            countNoti = (int) getNotificationCount(key, 0) + countNoti;

        IShare.edit().putInt(key, countNoti).apply();
    }

    public int getNotificationCount(String key, int countNoti) {
        return IShare.getInt(key, countNoti);
    }

    public void setNotificationCountTimeline(String key, int countNoti) {
        if (countNoti > 0)
            countNoti = (int) getNotificationCountTimeline(key, 0) + countNoti;

        IShare.edit().putInt(key, countNoti).apply();
    }

    public int getNotificationCountTimeline(String key, int countNoti) {
        return IShare.getInt(key, countNoti);
    }

    public void removeValue(String key) {
        IShare.edit().remove(key).apply();
    }

    public void setNotificationCountFriend(String key, int countNoti) {
        if (countNoti > 0)
            countNoti = (int) getNotificationCountFriend(key, 0) + countNoti;

        IShare.edit().putInt(key, countNoti).apply();
    }

    public int getNotificationCountFriend(String key, int countNoti) {
        return IShare.getInt(key, countNoti);
    }

    public void setNotificationCountFriendRequest(String key, int countNoti) {
        countNoti = (int) getNotificationCountFriendRequest(key, 0) + countNoti;
        IShare.edit().putInt(key, countNoti).apply();
    }

    public void setNotificationCountFriendRequestDefault(String key, int countNoti) {
        IShare.edit().putInt(key, countNoti).apply();
    }

    public int getNotificationCountFriendRequest(String key, int countNoti) {
        return IShare.getInt(key, countNoti);
    }

    public void setNotificationCountAcceptFriend(String key, int countNoti) {
        if (countNoti > 0)
            countNoti = (int) getNotificationCountAcceptFriend(key, 0) + countNoti;

        IShare.edit().putInt(key, countNoti).apply();
    }

    public int getNotificationCountAcceptFriend(String key, int countNoti) {
        return IShare.getInt(key, countNoti);
    }

    public void setNotificationCountSetting(String key, int countNoti) {
        if (countNoti > 0)
            countNoti = (int) getNotificationCountSetting(key, 0) + countNoti;

        IShare.edit().putInt(key, countNoti).apply();
    }

    public int getNotificationCountSetting(String key, int countNoti) {
        return IShare.getInt(key, countNoti);
    }

    public void setNotificationCountSticker(String key, int countNoti) {
        if (countNoti > 0)
            countNoti = (int) getNotificationCountSticker(key, 0) + countNoti;

        IShare.edit().putInt(key, countNoti).apply();
    }

    public int getNotificationCountSticker(String key, int countNoti) {
        return IShare.getInt(key, countNoti);
    }

    public void setNotificationCountBadge(String key, int countNoti) {
        if (countNoti > 0)
            countNoti = (int) getNotificationCountBadge(key, 0) + countNoti;

        IShare.edit().putInt(key, countNoti).apply();
    }

    public int getNotificationCountBadge(String key, int countNoti) {
        return IShare.getInt(key, countNoti);
    }
}
