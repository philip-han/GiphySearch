package code.challenge.giphysearch.viewModel;

import android.arch.lifecycle.ViewModel;

import code.challenge.giphysearch.model.GiphySearchModel;

/**
 * Created by Philip K. Han on 11/12/17.
 */

public class GiphySearchViewModel extends ViewModel {

  private GiphySearchLiveData query;

  public void setModel(GiphySearchModel model) {
    if (query == null) query = new GiphySearchLiveData(model);
  }

  public GiphySearchLiveData search(String queryString) {
    query.setQuery(queryString);
    return query;
  }

  public String getQueryString() {
    return query.getQuery();
  }

  @Override
  protected void onCleared() {
    super.onCleared();
  }

}
