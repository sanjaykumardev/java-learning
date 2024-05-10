import java.util.Array;
import java.util.Scanner;


public class addtionarray {
  public static void(string[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println(n);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++){
      arr[i] = sc.nextLine();
    }

    int sum = 0; 
    int max = arr[n-1];
    for(int i=0; i<arr.lenght-1; i++){
      sum+=arr[i];
    }
    if(sum!=max){
      System.out.println("true");
    }
    else{
      System.out.println("flase");
    }
  }
}
