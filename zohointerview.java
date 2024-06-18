import java.util.*;

public class zohointerview {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    

    String result = duplicate(s);
    System.out.print(result);
  }

  
  public static String duplicate(String s){
    StringBuilder n = new StringBuilder();
     int nums = 0 ;
     for(int i=0; i<s.length(); i++){
        if( s.charAt(i) != s.charAt(i+1)){
          n.append(s.charAt(i));
        }
      else{
        n.append(nums);
       
      }
    }
    return  n.toString();
  }

}

