public class Sphere extends Circle {
  public Sphere(double r) {
    super(r);
  }

  public double area() {
    return 4 * super.area();
  }
}
