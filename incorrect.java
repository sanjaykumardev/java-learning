import java.util.Scanner;

public class incorrect {
  public static void main(String[] args){
    Scanner sc  = new Scanner(System.in);
    System.out.println("enter string");
    String s = sc.nextLine();
   sc.close();
    // input to get 
    int l = s.length();
    int count = 0;
    char K = 'T';
    char G = 'D';
    char R1 = 'L';
    char R2 = 'F';

    for(char i=0; i<l; i++){
      if( s.charAt(i)== K  || s.charAt(i) == G ||  s.charAt(i) == R1 || s.charAt(i) == R2) {
        // count = count *2;
        count++;
      }
    }
    int b = (int) Math.pow(2, count);
    System.out.println(b);
  }
 }

