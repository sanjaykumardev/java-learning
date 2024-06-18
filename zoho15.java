import java.util.*;


public class zoho15 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String s = sc.nextLine();
    String m = sc.nextLine();

    String str = string(s,m);
    System.out.println(str);
  }

  public static String string(String f , String s){
    StringBuilder s1 = new StringBuilder(f);
    StringBuilder s2 = new StringBuilder(s);

   if(s1.length() > s2.length()  ){
      
     for(int i=0; i<s1.length(); i++){
      for(int j=0; j<s2.length(); j++){
        if(s1.charAt(i) == s2.charAt(j)){
        s1.deleteCharAt(i);
        }
      }
    }
  }
  return s1.toString();
 }
}
