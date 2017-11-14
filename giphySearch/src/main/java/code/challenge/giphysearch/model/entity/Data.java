package code.challenge.giphysearch.model.entity;

import com.squareup.moshi.Json;


public class Data {

  private String type;
  private String id;
  private String slug;
  private String url;
  @Json(name = "bitly_gif_url")
  private String bitlyGifUrl;
  @Json(name = "bitly_url")
  private String bitlyUrl;
  @Json(name = "embed_url")
  private String embedUrl;
  private String username;
  private String source;
  private String rating;
  private String caption;
  @Json(name = "content_url")
  private String contentUrl;
  @Json(name = "source_tld")
  private String sourceTld;
  @Json(name = "source_post_url")
  private String sourcePostUrl;
  @Json(name = "import_datetime")
  private String importDatetime;
  @Json(name = "trending_datetime")
  private String trendingDatetime;
  private Container images;


  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public String getSlug() {
    return slug;
  }


  public void setSlug(String slug) {
    this.slug = slug;
  }


  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public String getBitlyGifUrl() {
    return bitlyGifUrl;
  }


  public void setBitlyGifUrl(String bitlyGifUrl) {
    this.bitlyGifUrl = bitlyGifUrl;
  }


  public String getBitlyUrl() {
    return bitlyUrl;
  }


  public void setBitlyUrl(String bitlyUrl) {
    this.bitlyUrl = bitlyUrl;
  }


  public String getEmbedUrl() {
    return embedUrl;
  }


  public void setEmbedUrl(String embedUrl) {
    this.embedUrl = embedUrl;
  }


  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public String getRating() {
    return rating;
  }


  public void setRating(String rating) {
    this.rating = rating;
  }


  public String getContentUrl() {
    return contentUrl;
  }


  public void setContentUrl(String contentUrl) {
    this.contentUrl = contentUrl;
  }


  public String getSourceTld() {
    return sourceTld;
  }


  public void setSourceTld(String sourceTld) {
    this.sourceTld = sourceTld;
  }


  public String getSourcePostUrl() {
    return sourcePostUrl;
  }


  public void setSourcePostUrl(String sourcePostUrl) {
    this.sourcePostUrl = sourcePostUrl;
  }


  public String getImportDatetime() {
    return importDatetime;
  }


  public void setImportDatetime(String importDatetime) {
    this.importDatetime = importDatetime;
  }


  public String getTrendingDatetime() {
    return trendingDatetime;
  }


  public void setTrendingDatetime(String trendingDatetime) {
    this.trendingDatetime = trendingDatetime;
  }


  public Container getImages() {
    return images;
  }


  public void setImages(Container images) {
    this.images = images;
  }
}
