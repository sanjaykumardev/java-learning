import java.util.Scanner;

public class lcm {
  public static int gcd(int a, int b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int n = (n1 * n2) / gcd(n1, n2);
    System.out.println("The lcm is " + n);
    sc.close();
  }
}
// need to learn ????