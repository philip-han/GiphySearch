package code.challenge.giphysearch.di;

import android.content.Context;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import code.challenge.giphysearch.R;
import code.challenge.giphysearch.model.GiphyAPI;
import code.challenge.giphysearch.model.GiphyAPIInterceptor;
import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

/**
 * Created by Philip K. Han on 11/12/17.
 */

@Module
public class NetworkModule {

  @Provides
  HttpLoggingInterceptor provideLoggingInterceptor() {
    HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
    loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
    return loggingInterceptor;
  }

  @Provides
  @Singleton
  OkHttpClient provideHttpClient(HttpLoggingInterceptor httpLoggingInterceptor, GiphyAPIInterceptor giphyAPIInterceptor) {
    OkHttpClient.Builder builder = new OkHttpClient.Builder()
        .addInterceptor(httpLoggingInterceptor)
        .addInterceptor(giphyAPIInterceptor)
        .connectTimeout(10, TimeUnit.SECONDS)
        .writeTimeout(10, TimeUnit.SECONDS)
        .readTimeout(10, TimeUnit.SECONDS);
    return builder.build();
  }


  @Provides
  @Singleton
  MoshiConverterFactory provideMoshiConverterFactory() {
    return MoshiConverterFactory.create();
  }


  @Provides
  @Singleton
  GiphyAPI provideGiphyAPI(Context context, OkHttpClient httpClient, MoshiConverterFactory moshiConverterFactory) {
    Retrofit retrofit = new Retrofit.Builder()
        .baseUrl(context.getString(R.string.giphy_base_url))
        .addConverterFactory(moshiConverterFactory)
        .client(httpClient)
        .build();
    return retrofit.create(GiphyAPI.class);
  }

}
