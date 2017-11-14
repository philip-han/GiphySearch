package code.challenge.giphysearch.model.entity;

import com.squareup.moshi.Json;



public class Original {

  private String url;
  private String width;
  private String height;
  private String size;
  private String frames;
  private String mp4;
  @Json(name = "mp4_size")
  private String mp4Size;
  private String webp;
  @Json(name = "webp_size")
  private String webpSize;


  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public String getWidth() {
    return width;
  }


  public void setWidth(String width) {
    this.width = width;
  }


  public String getHeight() {
    return height;
  }


  public void setHeight(String height) {
    this.height = height;
  }


  public String getSize() {
    return size;
  }


  public void setSize(String size) {
    this.size = size;
  }


  public String getFrames() {
    return frames;
  }


  public void setFrames(String frames) {
    this.frames = frames;
  }


  public String getMp4() {
    return mp4;
  }


  public void setMp4(String mp4) {
    this.mp4 = mp4;
  }


  public String getMp4Size() {
    return mp4Size;
  }


  public void setMp4Size(String mp4Size) {
    this.mp4Size = mp4Size;
  }

  public String getWebp() {
    return webp;
  }


  public void setWebp(String webp) {
    this.webp = webp;
  }

  public String getWebpSize() {
    return webpSize;
  }


  public void setWebpSize(String webpSize) {
    this.webpSize = webpSize;
  }

}
