import java.util.Scanner;

public class Lab2p1 {
  public static void main(String[] args) {
    int choice, m, n;
    Scanner sc = new Scanner(System.in);
    do {
      System.out.println("Perform the following methods:");
      System.out.println("1: miltiplication test");
      System.out.println("2: quotient using division by subtraction");
      System.out.println("3: remainder using division by subtraction");
      System.out.println("4: count the number of digits");
      System.out.println("5: position of a digit");
      System.out.println("6: extract all odd digits");
      System.out.println("7: quit");
      choice = sc.nextInt();
      switch (choice) {
        case 1: /* add mulTest() call */
          mulTest();
          break;
        case 2: /* add divide() call */
          System.out.print("m = ");
          m = sc.nextInt();
          System.out.print("n = ");
          n = sc.nextInt();
          System.out.println(m + "/" + n + " = " + divide(m, n));
          break;
        case 3: /* add modulus() call */
          System.out.print("m = ");
          m = sc.nextInt();
          System.out.print("n = ");
          n = sc.nextInt();
          System.out.println(m + " % " + n + " = " + modulus(m, n));
          break;
        case 4: /* add countDigits() call */
          System.out.print("n: ");
          n = sc.nextInt();
          if (n <= 0) {
            System.out.println("Error input!!");
            break;
          }
          System.out.println("count = " + countDigits(n));
          break;
        case 5: /* add position() call */
          System.out.print("n: ");
          n = sc.nextInt();
          System.out.print("digit: ");
          m = sc.nextInt();
          System.out.println("position = " + position(n, m));
          break;
        case 6: /* add extractOddDigits() call */
          System.out.print("n: ");
          long nn = sc.nextInt();
          if (nn <= 0) {
            System.out.println("Error input!!");
            break;
          }
          System.out.println("oddDigits = " + extractOddDigits(nn));
          break;
        case 7: System.out.println("Program terminating ….");
      }
    } while (choice < 7);
  }

  public static void mulTest() {
    int cnt = 0;
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 5; i++) {
      int x = (int)(Math.random() * 9) + 1;
      int y = (int)(Math.random() * 9) + 1;
      System.out.print("How much is " + x + " times " + y + "? ");
      int ans = sc.nextInt();
      if (ans == x * y) cnt++;
    }
    System.out.println(cnt + " answers out of 5 are correct.");
  }

  public static int divide(int m, int n) {
    int ret = 0;
    while (m >= n) {
      m -= n;
      ret++;
    }
    return ret;
  }

  public static int modulus(int m, int n) {
    return m - n * divide(m, n);
  }

  public static int countDigits(int n) {
    int ret = 0;
    while (n > 0) {
      ret++;
      n /= 10;
    }
    return ret;
  }

  public static int position(int n, int digit) {
    int ret = 1;
    while (n > 0) {
      if (n % 10 == digit) return ret;
      n /= 10;
      ret++;
    }
    return -1;
  }

  public static long extractOddDigits(long n) {
    long ret = 0, p = 1;
    while (n > 0) {
      long x = n % 10;
      if (x % 2 == 1) {
        ret += p * x;
        p *= 10;
      }
      n /= 10;
    }
    return ret == 0 ? -1 : ret;
  }
}
