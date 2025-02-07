import java.util.Scanner;

public class P3 {
  private static double UStoSGD = 1.82;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("starting: ");
    int s = sc.nextInt();
    System.out.print("ending: ");
    int e = sc.nextInt();
    System.out.print("increment: ");
    int cnt = sc.nextInt();

    if (e < s) {
      System.out.println("Error input!!");
      return;
    }

    System.out.println("US$\tS$");
    System.out.println("------------");

    // (1) for loop
    for (int i = s; i <= e; i += cnt) {
      System.out.println(i + "\t" + 1.0 * i * UStoSGD);
    }

    // (2) while loop
    //while (s <= e) {
    //  System.out.println(s + "\t" + 1.0 * s * UStoSGD);
    //  s += cnt;
    //}

    // (3) do-while loop
    //do {
    //  System.out.println(s + "\t" + 1.0 * s * UStoSGD);
    //  s += cnt;
    //} while (s <= e);
  }
}
