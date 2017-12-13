package code.challenge.giphysearch;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.GridView;
import android.widget.SearchView;

import javax.inject.Inject;

import code.challenge.giphysearch.viewModel.GiphySearchViewModel;
import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {

  private static final String QUERY = "query";
  private static final String TAG = MainActivity.class.getSimpleName();
  @Inject
  GiphySearchViewModel viewModel;
  @Inject
  SharedPreferences pref;
  private SearchView searchView;
  private GridView gv;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    AndroidInjection.inject(this);
    setContentView(R.layout.activity_main);
    Toolbar myToolbar = findViewById(R.id.my_toolbar);
    setSupportActionBar(myToolbar);
    setup(savedInstanceState);
  }

  @Override
  protected void onSaveInstanceState(Bundle outState) {
    Log.i(TAG, "onSaveInstanceState: ");
    super.onSaveInstanceState(outState);
    outState.putString(QUERY, viewModel.getQueryString());
  }

  private void setup(Bundle savedInstanceState) {
    gv = findViewById(R.id.gridView);
    String queryString = savedInstanceState != null ? restoreQuery(savedInstanceState) : "";
    submitSearch(queryString);
  }

  private String restoreQuery(Bundle savedInstanceState) {
    return savedInstanceState.getString(QUERY);
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    MenuInflater inflater = getMenuInflater();
    inflater.inflate(R.menu.menu_main, menu);
    searchView = (SearchView) menu.findItem(R.id.search).getActionView();
    searchView.setOnQueryTextListener(this);
    MenuItem clear = menu.findItem(R.id.clear);
    clear.setVisible(viewModel.getQueryString().length() != 0);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    switch (item.getItemId()) {
      case R.id.clear:
        submitSearch("");
        return true;
    }
    return false;
  }

  @Override
  public boolean onQueryTextSubmit(String query) {
    //Log.i(TAG, "onQueryTextSubmit: " + query);
    searchView.setQuery("", false);
    searchView.setIconified(true);
    submitSearch(query);
    return true;
  }

  private void submitSearch(String query) {
    String title = query.length() == 0 ? getResources().getString(R.string.app_name) : query;
    viewModel.search(query).observe(this, result -> {
      GridViewAdapter adapter = new GridViewAdapter(MainActivity.this, result.getDataList());
      gv.setAdapter(adapter);
    });
    getSupportActionBar().setTitle(title.trim());
    invalidateOptionsMenu();
  }

  @Override
  public boolean onQueryTextChange(String newText) {
    //Log.i(TAG, "onQueryTextChange: " + newText);
    return true;
  }

}
