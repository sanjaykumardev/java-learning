import java.util.*;




public class positonofarray {

  private static char[] position;

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println();
    int s = sc.nextInt();
    int[] sum  = new int[s];
    
    for(int i=0; i<s; i++){
      sum[i]= sc.nextInt(); 
    }
    position(sum ,s);
    System.out.println(position);
  }
  
  public static void position(int[] num , int val){
      int I = 0;
      int[] n  = new int[I];
      int[] sum = new int[-1 -1];
      for(int i=0; i<num.length; i++){
        if(num[i] == val){
          val = num[I];
          n[I]= val;
          System.out.println(n);
        }
        else{
          System.out.println(sum);
        }
      }

  }
}
