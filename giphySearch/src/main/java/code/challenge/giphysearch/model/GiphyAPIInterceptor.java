package code.challenge.giphysearch.model;

import android.content.Context;
import android.support.annotation.NonNull;

import java.io.IOException;

import javax.inject.Inject;

import code.challenge.giphysearch.R;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Philip K. Han on 11/12/17.
 */

public class GiphyAPIInterceptor implements Interceptor {

  @Inject
  Context context;

  @Inject
  GiphyAPIInterceptor() {
    super();
  }

  @Override
  public Response intercept(@NonNull Chain chain) throws IOException {
    String apiKey = context.getString(R.string.giphy_api_key);

    Request original = chain.request();
    Request request = original
        .newBuilder()
        .header("api-key", apiKey)
        .build();

    return chain.proceed(request);
  }

}
