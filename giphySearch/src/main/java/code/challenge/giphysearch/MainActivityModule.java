package code.challenge.giphysearch;

import android.arch.lifecycle.ViewModelProviders;

import code.challenge.giphysearch.model.GiphyAPI;
import code.challenge.giphysearch.model.GiphySearchModel;
import code.challenge.giphysearch.viewModel.GiphySearchViewModel;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Philip K. Han on 11/11/17.
 */

@Module
public class MainActivityModule {

  @Provides
  GiphySearchModel provideGiphySearchModel(GiphyAPI giphyAPI) {
    return new GiphySearchModel(giphyAPI);
  }

  @Provides
  GiphySearchViewModel provideGiphySearchViewModel(MainActivity activity, GiphySearchModel model){
    GiphySearchViewModel viewModel = ViewModelProviders.of(activity).get(GiphySearchViewModel.class);
    viewModel.setModel(model);
    return viewModel;
  }

}
