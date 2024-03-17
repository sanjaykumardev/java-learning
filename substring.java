class Solution {
  public boolean isSubstringPresent(String s) {
      String rev = rev(s);
      for(int i = 0; i < s.length() - 1; i++) {
          String temp = s.substring(i, i+2);
          if(rev.contains(temp)) {
              return true;
          }
      }
      return false;
  }
  
  /**
   * @param s
   * @return
   */
  String rev(String s) {
      StringBuilder sb = new StringBuilder(s);
      sb.reverse();
      return sb.toString();
   }
}






