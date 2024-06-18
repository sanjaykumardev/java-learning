import java.util.*;
import java.util.Collections;

public class Arraylist {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];

    for(int i=0; i<n; i++){
      arr[i] = sc.nextInt();
    }
   sorting(arr);
  }

  public static void sorting(int[] nums){
   
    ArrayList<Integer> result = new ArrayList<>();
   
    for(int  i=0; i<nums.length; i++){
     if(!result.contains(nums[i])){
      result.add(nums[i]);
     }
    }
      Collections.sort(result);
    System.out.println(result);
  }
}