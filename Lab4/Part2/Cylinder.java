public class Cylinder implements Shape {
  private double radius, height;

  public Cylinder(double radius, double height) {
    this.radius = radius;
    this.height = height;
  }

  public double area() {
    Circle circle = new Circle(radius);
    return 2 * circle.area() + (circle.area() * height);
  }
}
