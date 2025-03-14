import java.util.Scanner;

public class Shape2DApp {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int size, select;
    double a, b, totalArea = 0;

    System.out.println("Please input the number of shapes");
    size = scan.nextInt();
    for(int i = 0; i < size; i++) {
      System.out.println("Please select the shape");
      System.out.println("1. Triangle");
      System.out.println("2. Circle");
      System.out.println("3. Rectangle");
      select = scan.nextInt();
      switch(select){
        case 1:
          System.out.println("Please input the height and base of the triangle");
          a = scan.nextDouble();
          b = scan.nextDouble();
          Triangle triangle = new Triangle(a,b);
          totalArea = totalArea + triangle.area();
          break;
        case 2:
          System.out.println("Please input the radius of the circle");
          a = scan.nextDouble();
          Circle circle = new Circle(a);
          totalArea = totalArea + circle.area();
          break;
        case 3:
          System.out.println("Please input the length and breath of the rectangle");
          a = scan.nextDouble();
          b = scan.nextDouble();
          Rectangle rectangle = new Rectangle(a,b);
          totalArea = totalArea + rectangle.area();
          break;
      }
    }
    System.out.println("\nThe combined area is: " + totalArea);
  }
}
