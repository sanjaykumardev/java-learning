import java.util.*;


public class binary {
  public static void main(String [] args){

    int number ,i=0;;
    int binary[] = new int[100];
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number");
    number = sc.nextInt();
   
   while(number != 0){
     binary[i] = number%2;
     number = number/2;
     i++;
   }
   System.out.println();
   for(int j=i-1; j>=0; j--){
    System.out.print(binary[j]);
   }
  }
}
