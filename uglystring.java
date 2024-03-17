import java.util.*;

public class uglystring {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int sum = sc.nextInt();
    String[] name = new String[sum];
    for (int i = 0; i < t; i++) {
      name[i] = sc.nextLine();

    }
  }

  public static  String ugly(String name) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < name.length(); i++) {
        char currentChar = name.charAt(i);
        if (result.indexOf(String.valueOf(currentChar)) == -1) {
            result.append(currentChar);
        }
    }
    return result.toString();
}
}
