package com.silicontechnologies.recentdaggerexample.di;

import android.app.Application;
import android.content.Context;
import com.silicontechnologies.recentdaggerexample.ApplicationContext;
import com.silicontechnologies.recentdaggerexample.SharedPreferenceHelper;
import dagger.Component;
import javax.inject.Singleton;

/**
 * Created by rajajawahar on 23/12/17.
 */

@Singleton @Component(modules = ApplicationModule.class) public interface ApplicationComponent {

  @ApplicationContext Context getContext();

  Application getApplication();

  SharedPreferenceHelper getPreferenceHelper();
}
