package com.silicontechnologies.recentdaggerexample.di;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.silicontechnologies.recentdaggerexample.ApplicationContext;
import dagger.Module;
import dagger.Provides;

/**
 * Created by rajajawahar on 23/12/17.
 */

@Module public class ApplicationModule {

  private final Application mApplication;

  public ApplicationModule(Application app) {
    mApplication = app;
  }

  @Provides @ApplicationContext Context provideContext() {
    return mApplication;
  }

  @Provides Application provideApplication() {
    return mApplication;
  }

  @Provides SharedPreferences provideSharedPrefs() {
    return mApplication.getSharedPreferences("demo-prefs", Context.MODE_PRIVATE);
  }
}
