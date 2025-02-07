import java.util.Scanner;

public class P4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("height = ");
    int h = sc.nextInt();

    if (h == 0) {
      System.out.println("Error input!!");
      return;
    }

    for (int i = 1; i <= h; i++) {
      for (int j = i; j > 0; j--) {
        if (j % 2 == 1) System.out.print("AA");
        else System.out.print("BB");
      }
      System.out.print("\n");
    }
  }
}
