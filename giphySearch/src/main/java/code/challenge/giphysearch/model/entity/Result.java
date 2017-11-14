package code.challenge.giphysearch.model.entity;

import com.squareup.moshi.Json;

import java.util.List;


public class Result {

  @Json(name = "data")
  private List<Data> dataList;
  private Meta meta;
  private Pagination pagination;


  public List<Data> getDataList() {
    return dataList;
  }


  public void setDataList(List<Data> dataList) {
    this.dataList = dataList;
  }


  public Meta getMeta() {
    return meta;
  }


  public void setMeta(Meta meta) {
    this.meta = meta;
  }


  public Pagination getPagination() {
    return pagination;
  }


  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }

}
