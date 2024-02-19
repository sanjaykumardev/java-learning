import java.util.Arrays;
import java.util.Scanner;

public class codeingninjas {
  public static int[] reversearray( int n , int[] nums){
    int left= 0 , right = n-1;
  
    while(left < right){
      
      int temp = nums[left];
      nums[left ]= nums[right];
      nums[right] = temp ; 
       
      left++;
      right--;
    }
     return nums;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the size of array");
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<arr.length; i++){
     arr[i] = sc.nextInt();
    }
     int[]  reversedArray = reversearray(n, arr);
    System.out.println(Arrays.toString(reversedArray));
     sc.close();
  }
}
