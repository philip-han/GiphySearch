package code.challenge.giphysearch.di;

import code.challenge.giphysearch.MainActivity;
import code.challenge.giphysearch.MainActivityModule;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Philip K. Han on 11/11/17.
 */

@Module
public abstract class ActivityBuilder {

  @ContributesAndroidInjector(modules = MainActivityModule.class)
  abstract MainActivity bindMainActivity();

}
