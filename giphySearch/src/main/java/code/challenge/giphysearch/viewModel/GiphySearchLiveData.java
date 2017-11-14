package code.challenge.giphysearch.viewModel;

import android.arch.lifecycle.LiveData;
import android.util.Log;

import code.challenge.giphysearch.model.GiphySearchModel;
import code.challenge.giphysearch.model.entity.Result;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Philip K. Han on 11/12/17.
 */

public class GiphySearchLiveData extends LiveData<Result> {

  private static final String TAG = GiphySearchLiveData.class.getSimpleName();
  private GiphySearchModel model;
  private String query;

  public GiphySearchLiveData(GiphySearchModel model) {
    this.model = model;
    query = "";
  }

  void setQuery(String query) {
    if (query != null && query.equals(this.query) && getValue() != null) return;
    this.query = query;
    load();
  }

  String getQuery() {
    return query;
  }

  private void load() {
    Log.i(TAG, "load: ");
    Call<Result> result = model.getSearchResult(query);
    result.enqueue(new Callback<Result>() {
      @Override
      public void onResponse(Call<Result> call, Response<Result> response) {
        setValue(response.body());
      }

      @Override
      public void onFailure(Call<Result> call, Throwable t) {
        // TODO: 11/13/17 implement
      }
    });
  }

}
