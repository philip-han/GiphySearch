package code.challenge.giphysearch.viewModel;

import android.arch.lifecycle.ViewModel;

import code.challenge.giphysearch.model.GiphySearchLiveData;
import code.challenge.giphysearch.model.GiphySearchModel;

/**
 * Created by Philip K. Han on 11/12/17.
 */

public class GiphySearchViewModel extends ViewModel {

  private GiphySearchLiveData query;
  private GiphySearchModel model;

  public void setModel(GiphySearchModel model) {
    this.model = model;
  }

  public GiphySearchLiveData search(String queryString) {
    if (query == null || !getQueryString().equals(queryString)) query = model.query(queryString);
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
