package code.challenge.giphysearch.di;

import android.app.Application;

import javax.inject.Singleton;

import code.challenge.giphysearch.GiphySearchApplication;
import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Created by Philip K. Han on 11/11/17.
 */

@Singleton
@Component(modules = {
    AndroidInjectionModule.class,
    AppModule.class,
    NetworkModule.class,
    ActivityBuilder.class })

public interface AppComponent {

  @Component.Builder
  interface Builder {

    @BindsInstance
    Builder application(Application application);

    AppComponent build();
  }

  void inject(GiphySearchApplication app);

}
