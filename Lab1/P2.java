import java.util.Scanner;

public class P2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("salary: $");
    int s = sc.nextInt();
    System.out.print("merit: ");
    int m = sc.nextInt();
    char ans;
    if (s >= 700) {
      ans = 'A';
      if (s < 800 && m < 20) ans = 'B';
    }
    else if (s >= 600) {
      ans = 'B';
      if (s < 650 && m < 10) ans = 'C';
    }
    else ans = 'C';
    System.out.println("Grade " + ans);
  }
}
