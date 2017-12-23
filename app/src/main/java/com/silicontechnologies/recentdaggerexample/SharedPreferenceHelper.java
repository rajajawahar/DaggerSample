package com.silicontechnologies.recentdaggerexample;

import android.content.SharedPreferences;
import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by rajajawahar on 23/12/17.
 */

@Singleton public class SharedPreferenceHelper {

  public static String PREF_KEY_ACCESS_TOKEN = "access-token";

  private SharedPreferences mSharedPreferences;

  @Inject public SharedPreferenceHelper(SharedPreferences sharedPreferences) {
    mSharedPreferences = sharedPreferences;
  }

  public void put(String key, String value) {
    mSharedPreferences.edit().putString(key, value).apply();
  }

  public String get(String key, String defaultValue) {
    return mSharedPreferences.getString(key, defaultValue);
  }
}
