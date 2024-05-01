import java.util.*;

public class dualtigger {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // Loop to handle multiple sets of inputs
    for (int j = 0; j < 4; j++) {
      int n = sc.nextInt();
      int[] s = new int[n];
      for (int i = 0; i < n; i++) {
        s[i] = sc.nextInt();
      }

      boolean found = false;
      for (int i = 0; i < s.length - 2; i++) {
        if (s[i] == s[i + 2]) {
          found = true;
          break;
        }
      }

      if (found) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }
}
