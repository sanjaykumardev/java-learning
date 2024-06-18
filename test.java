import java.util.Scanner;
import java.util.Arrays;
public class test{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++){
    arr[i] = sc.nextInt();
    }
     reapeted(arr);
  }

  public static void reapeted(int[] nums){
    int sum =0; 
    int n = nums.length -1; 
    int maxint = 0;
    for(int i=0; i<nums.length; i++){
      for(int j=0; j<nums.length-1; j++){

        if(nums[i] == nums[j]){
          sum += nums[i];
          sum++;
        }
      }
    }
    if(sum > n){
      maxint+= sum;
    }
   
    System.out.println(maxint);
  }
}
