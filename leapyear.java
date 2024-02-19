import java.util.Scanner;

public class leapyear {
  public static boolean isLeapYear(int year){
     if((year % 4 ==0 && year %100 != 0) ||(year % 400 == 0)){
        return true;
     }
     else{
      return false ;
     }
  }


  public static void main (String[]  args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the year");
    int nums = sc.nextInt();

    if(isLeapYear(nums)){
     System.out.println("it is leapyear");
    }
    System.out.println("it not leapyear");
    sc.close();
  }
}
