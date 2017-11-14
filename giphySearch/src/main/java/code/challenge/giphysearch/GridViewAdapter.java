package code.challenge.giphysearch;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;

import java.util.List;

import code.challenge.giphysearch.model.entity.Data;

/**
 * Created by Philip K. Han on 11/13/17.
 */

public class GridViewAdapter extends BaseAdapter {

  private final LayoutInflater inflater;
  private Context context;
  private List<Data> dataList;

  public GridViewAdapter(Context context, List<Data> dataList) {
    this.dataList = dataList;
    this.context = context;
    inflater = LayoutInflater.from(context);
  }

  private RequestListener<String, GlideDrawable> createRequestListener(ProgressBar progressBar) {
    RequestListener<String, GlideDrawable> requestListener = new RequestListener<String, GlideDrawable>() {

      @Override
      public boolean onException(Exception e, String model, Target<GlideDrawable> target, boolean isFirstResource) {
        progressBar.setVisibility(View.GONE);
        return false;
      }

      @Override
      public boolean onResourceReady(GlideDrawable resource, String model, Target<GlideDrawable> target, boolean isFromMemoryCache, boolean isFirstResource) {
        progressBar.setVisibility(View.GONE);
        return false;
      }

    };
    return requestListener;
  }

  @Override
  public int getCount() {
    return dataList.size();
  }

  @Override
  public Data getItem(int i) {
    return dataList.get(i);
  }

  @Override
  public long getItemId(int i) {
    return 0;
  }

  @Override
  public View getView(int i, View view, ViewGroup viewGroup) {
    if (view == null) view = inflater.inflate(R.layout.giphy_image_layout, viewGroup, false);
    ImageView iv = view.findViewById(R.id.gifImage);
    ProgressBar pb = view.findViewById(R.id.gifImageProgressBar);
    Glide.with(context)
        .load(getItem(i).getImages().getFixedWidth().getUrl())
        .listener(createRequestListener(pb))
        .into(iv);
    return view;
  }

}
