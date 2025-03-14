import java.lang.Math;

public class Pyramid implements Shape {
  private double height, base;

  public Pyramid(double height, double base) {
    this.height = height;
    this.base = base;
  }

  public double area() {
    double s = Math.sqrt(0.5 * 0.5 * base * base + height * height);
    return base * base + 4 * 0.5 * base * s;
  }
}
