import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class premutation{
  public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++){
      arr[i] = sc.nextInt();
    }
   array(nums);
  }
  public List<List<Integer>> array(int[] nums){
    List<List<Integer>> result = new Arraylist<>();
    if(nums.length == 1){
      List<Integer> res = new Arraylist<>();
      res.add(nums[0]);
      result.add(res);
      return res;
    }
    for(int i=nums.length-1; i>=0; i--){
      int n = nums[i];
      int[] renums = new int[nums.length-1];
      int index = 0;
      for(int j=0; j<nums.length; j++){
        if(j != i){
          renums[index] = nums[j];
          index++;
        }
      }
      List<List<Integer>> prems = array(renums);
      for(List<Integer> p : prems){
        p.add(n);
      }
      result.addAll(prems);
    }
    return result;
  }
}


