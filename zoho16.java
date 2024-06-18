import java.util.*;

public class zoho16 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String m = sc.next();
    String s1="";
    for(int i=0; i<s.length(); i++)
   {
    if(s.charAt(i)!=m.charAt(i))
    {
      s1+=s.charAt(i);
      s1+=m.charAt(i);
    }
   }
  System.out.print(s1);
    
  }
} 

