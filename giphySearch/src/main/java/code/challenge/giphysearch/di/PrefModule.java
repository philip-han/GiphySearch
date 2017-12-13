package code.challenge.giphysearch.di;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Philip K. Han on 12/12/17.
 */

@Module
public class PrefModule {

  @Provides
  @Singleton
  SharedPreferences provideSharedPreferences(Application application) {
    return PreferenceManager.getDefaultSharedPreferences(application);
  }

}
