import java.util.Scanner;

public class P1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char c = sc.next().charAt(0);
    if (c == 'A' || c == 'a') System.out.println("Action movie fan");
    else if (c == 'C' || c == 'c') System.out.println("Comedy movie fan");
    else if (c == 'D' || c == 'd') System.out.println("Drama movie fan");
    else System.out.println("Invalid choice");
  }
}
