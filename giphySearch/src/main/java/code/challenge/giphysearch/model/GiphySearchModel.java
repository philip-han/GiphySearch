package code.challenge.giphysearch.model;

import code.challenge.giphysearch.model.entity.Result;
import retrofit2.Call;

/**
 * Created by Philip K. Han on 11/8/17.
 */

public class GiphySearchModel {

  private GiphyAPI giphyAPI;

  public GiphySearchModel(GiphyAPI giphyAPI) {
    this.giphyAPI = giphyAPI;
  }

  Call<Result> getSearchResult(String query) {
    if (query != null && query.length() != 0) return giphyAPI.searchFor(query);
    return giphyAPI.getTrending();
  }

  public GiphySearchLiveData query(String queryString) {
    GiphySearchLiveData result = new GiphySearchLiveData(this);
    result.setQuery(queryString);
    return result;
  }

}
