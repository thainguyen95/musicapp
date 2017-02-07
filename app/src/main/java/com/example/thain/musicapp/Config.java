package com.example.thain.musicapp;

import android.content.Context;
import android.content.SharedPreferences;

public class Config {
    private SharedPreferences mPrefs;
    public static final int SORT_BY_TITLE = 0;

    public static Config newInstance(Context context) {
        return new Config(context);
    }

    private Config(Context context) {
        mPrefs = context.getSharedPreferences(Constants.PREFS_KEY, Context.MODE_PRIVATE);
    }

    public boolean getIsFirstRun() {
        return mPrefs.getBoolean(Constants.IS_FIRST_RUN, true);
    }

    public void setIsFirstRun(boolean firstRun) {
        mPrefs.edit().putBoolean(Constants.IS_FIRST_RUN, firstRun).apply();
    }

    public boolean getIsDarkTheme() {
        return mPrefs.getBoolean(Constants.IS_DARK_THEME, false);
    }

    public void setIsDarkTheme(boolean isDarkTheme) {
        mPrefs.edit().putBoolean(Constants.IS_DARK_THEME, isDarkTheme).apply();
    }

    public boolean getIsShuffleEnabled() {
        return mPrefs.getBoolean(Constants.SHUFFLE, true);
    }

    public void setShuffle(boolean shuffle) {
        mPrefs.edit().putBoolean(Constants.SHUFFLE, shuffle).apply();
    }

    public boolean getIsNumericProgressEnabled() {
        return mPrefs.getBoolean(Constants.NUMERIC_PROGRESS, false);
    }

    public void setIsNumericProgressEnabled(boolean enabled) {
        mPrefs.edit().putBoolean(Constants.NUMERIC_PROGRESS, enabled).apply();
    }

    public int getSorting() {
        return mPrefs.getInt(Constants.SORTING, SORT_BY_TITLE);
    }

    public void setSorting(int sorting) {
        mPrefs.edit().putInt(Constants.SORTING, sorting).apply();
    }

    public boolean getRepeatSong() {
        return mPrefs.getBoolean(Constants.REPEAT_SONG, false);
    }

    public void setRepeatSong(boolean repeat) {
        mPrefs.edit().putBoolean(Constants.REPEAT_SONG, repeat).apply();
    }
}
