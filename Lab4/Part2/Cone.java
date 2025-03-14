import java.lang.Math;

public class Cone implements Shape {
  private double radius, height;

  public Cone(double radius, double height) {
      this.radius = radius;
      this.height = height;
  }

  public double area() {
      return Math.PI * radius * radius + Math.PI * radius * Math.sqrt(radius * radius + height * height);
  }
}
