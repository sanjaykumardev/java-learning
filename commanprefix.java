

public class commanprefix {
  public static String Prefix(String[] str) {
    if (str == null || str.length == 0) {
      return "";
    }

    String prefix = str[0];

    for (int i = 1; i < str.length; i++) {
      while (str[i].indexOf(prefix) != 0) {
          prefix = prefix.substring(0, prefix.length() - 1); // Shorten the prefix
          if (prefix.isEmpty()) {
              return "";
          }
      }
  }
  return prefix;
  }

  // driver code
  public static void main(String[] args) {
       String[] strs1 = {"samwer", "samow", "samight"};
       String[] strs2 = {"dog", "racecar", "car"};
       System.out.println("Output for strs1: " + Prefix(strs1)); // Output: "fl"
       System.out.println("Output for strs2: " + Prefix(strs2)); // Output: ""
    
  }
}
