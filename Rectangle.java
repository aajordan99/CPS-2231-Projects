

public class Rectangle extends GeometricObject {
  private double width;
  private double height;

  public Rectangle() {
      super();
  }

  public Rectangle(double width, double height) {
    super();
    this.width = width;
    this.height = height;
  }

  /** Return width */
  public double getWidth() {
    return width;
  }

  /** Set a new width */
  public void setWidth(double width) {
    this.width = width;
  }

  /** Return height */
  public double getHeight() {
    return height;
  }

  /** Set a new height */
  public void setHeight(double height) {
    this.height = height;
  }


}