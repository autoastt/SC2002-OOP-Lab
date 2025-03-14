public class Cuboid implements Shape {
  private double length, breadth, height;

  public Cuboid(double length, double breadth, double height) {
    this.length = length;
    this.breadth = breadth;
    this.height = height;
  }

  public double area() {
    return 2 * (length * breadth + breadth * height + height * length);
  }
}
