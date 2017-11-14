package code.challenge.giphysearch.model;

import code.challenge.giphysearch.model.entity.Result;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Philip K. Han on 11/8/17.
 */

public interface GiphyAPI {

  @GET("gifs/trending")
  Call<Result> getTrending();

  @GET("gifs/search")
  Call<Result> searchFor(@Query("q") String query);

}
