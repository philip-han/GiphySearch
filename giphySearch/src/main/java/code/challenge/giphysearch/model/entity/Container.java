package code.challenge.giphysearch.model.entity;

import com.squareup.moshi.Json;



public class Container {

  @Json(name = "fixed_height")
  private Image fixedHeight;
  @Json(name = "fixed_height_still")
  private Image fixedHeightStill;
  @Json(name = "fixed_height_downsampled")
  private Image fixedHeightDownsampled;
  @Json(name = "fixed_width")
  private Image fixedWidth;
  @Json(name = "fixed_width_still")
  private Image fixedWidthStill;
  @Json(name = "fixed_width_downsampled")
  private Image fixedWidthDownsampled;
  @Json(name = "fixed_height_small")
  private Image fixedHeightSmall;
  @Json(name = "fixed_height_small_still")
  private Image fixedHeightSmallStill;
  @Json(name = "fixed_width_small")
  private Image fixedWidthSmall;
  @Json(name = "fixed_width_small_still")
  private Image fixedWidthSmallStill;
  private Image downsized;
  @Json(name = "downsized_still")
  private Image downsizedStill;
  @Json(name = "downsized_medium")
  private Image downsizedMedium;
  @Json(name = "downsized_large")
  private Image downsizedLarge;
  private Original original;
  @Json(name = "original_still")
  private Image originalStill;
  private Image looping;


  public Image getFixedHeight() {
    return fixedHeight;
  }


  public void setFixedHeight(Image fixedHeight) {
    this.fixedHeight = fixedHeight;
  }


  public Image getFixedHeightStill() {
    return fixedHeightStill;
  }


  public void setFixedHeightStill(Image fixedHeightStill) {
    this.fixedHeightStill = fixedHeightStill;
  }


  public Image getFixedHeightDownsampled() {
    return fixedHeightDownsampled;
  }


  public void setFixedHeightDownsampled(Image fixedHeightDownsampled) {
    this.fixedHeightDownsampled = fixedHeightDownsampled;
  }


  public Image getFixedWidth() {
    return fixedWidth;
  }


  public void setFixedWidth(Image fixedWidth) {
    this.fixedWidth = fixedWidth;
  }


  public Image getFixedWidthStill() {
    return fixedWidthStill;
  }


  public void setFixedWidthStill(Image fixedWidthStill) {
    this.fixedWidthStill = fixedWidthStill;
  }


  public Image getFixedWidthDownsampled() {
    return fixedWidthDownsampled;
  }


  public void setFixedWidthDownsampled(Image fixedWidthDownsampled) {
    this.fixedWidthDownsampled = fixedWidthDownsampled;
  }


  public Image getFixedHeightSmall() {
    return fixedHeightSmall;
  }


  public void setFixedHeightSmall(Image fixedHeightSmall) {
    this.fixedHeightSmall = fixedHeightSmall;
  }


  public Image getFixedHeightSmallStill() {
    return fixedHeightSmallStill;
  }


  public void setFixedHeightSmallStill(Image fixedHeightSmallStill) {
    this.fixedHeightSmallStill = fixedHeightSmallStill;
  }


  public Image getFixedWidthSmall() {
    return fixedWidthSmall;
  }


  public void setFixedWidthSmall(Image fixedWidthSmall) {
    this.fixedWidthSmall = fixedWidthSmall;
  }


  public Image getFixedWidthSmallStill() {
    return fixedWidthSmallStill;
  }


  public void setFixedWidthSmallStill(Image fixedWidthSmallStill) {
    this.fixedWidthSmallStill = fixedWidthSmallStill;
  }


  public Image getDownsized() {
    return downsized;
  }


  public void setDownsized(Image downsized) {
    this.downsized = downsized;
  }


  public Image getDownsizedStill() {
    return downsizedStill;
  }


  public void setDownsizedStill(Image downsizedStill) {
    this.downsizedStill = downsizedStill;
  }


  public Image getDownsizedMedium() {
    return downsizedLarge;
  }


  public void setDownsizedMedium(Image downsizedMedium) {
    this.downsizedMedium = downsizedMedium;
  }


  public Image getDownsizedLarge() {
    return downsizedLarge;
  }


  public void setDownsizedLarge(Image downsizedLarge) {
    this.downsizedLarge = downsizedLarge;
  }


  public Original getOriginal() {
    return original;
  }


  public void setOriginal(Original original) {
    this.original = original;
  }


  public Image getOriginalStill() {
    return originalStill;
  }


  public void setOriginalStill(Image originalStill) {
    this.originalStill = originalStill;
  }


  public Image getLooping() {
    return looping;
  }


  public void setLooping(Image looping) {
    this.looping = looping;
  }

}
