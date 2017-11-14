package code.challenge.giphysearch.model.entity;

import com.squareup.moshi.Json;

/**
 * Created by Philip K. Han on 11/12/17.
 */

public class Pagination {

  @Json(name = "total_count")
  private int totalCount;
  private int count;
  private int offset;

  public int getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(int totalCount) {
    this.totalCount = totalCount;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public int getOffset() {
    return offset;
  }

  public void setOffset(int offset) {
    this.offset = offset;
  }

}
