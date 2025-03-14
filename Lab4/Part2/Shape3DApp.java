import java.util.Scanner;

public class Shape3DApp {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int size, select;
    double a, b, c, totalArea = 0;

    System.out.println("Please input the number of shapes");
    size = scan.nextInt();
    for(int i = 0; i < size; i++) {
      System.out.println("Please select the shape");
      System.out.println("1. Pyramid");
      System.out.println("2. Sphere");
      System.out.println("3. Cuboid");
      System.out.println("4. Cone");
      System.out.println("5. Cylinder");
      select = scan.nextInt();
      switch(select) {
        case 1:
          System.out.println("Please input the height and base of the Pyramid");
          a = scan.nextDouble();
          b = scan.nextDouble();
          Pyramid pyramid = new Pyramid(a,b);
          totalArea = totalArea + pyramid.area();
          break;
        case 2:
          System.out.println("Please input the radius of the Sphere");
          a = scan.nextDouble();
          Sphere sphere = new Sphere(a);
          totalArea = totalArea + sphere.area();
          break;
        case 3:
          System.out.println("Please input the length, breath and height of the Cuboid");
          a = scan.nextDouble();
          b = scan.nextDouble();
          c = scan.nextDouble();
          Cuboid cuboid = new Cuboid(a,b,c);
          totalArea = totalArea + cuboid.area();
          break;
        case 4:
          System.out.println("Please input the radius and height of the Cone");
          a = scan.nextDouble();
          b = scan.nextDouble();
          Cone cone = new Cone(a,b);
          totalArea = totalArea + cone.area();
          break;
        case 5:
          System.out.println("Please input the radius and height of the Cylinder");
          a = scan.nextDouble();
          b = scan.nextDouble();
          Cylinder cylinder = new Cylinder(a,b);
          totalArea = totalArea + cylinder.area();
          break;
      }
    }
    System.out.println("\nThe combined area is: " + totalArea);
  }
}
