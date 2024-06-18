import java.util.*;

public class zoho11 {

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int[] arr = new int[num];
    for(int i=0; i< num; i++){
      arr[i] = sc.nextInt();
    }
    int[] last = array(arr);
    System.out.println(Arrays.toString(last));
    
  }
  public static int[] array(int[] nums){
  
  int[] l = new int[nums.length];
  
  int firstele = nums[0];
  for(int i=0; i< nums.length; i++){
    if(nums[i] == 0)
      nums[i-1] = nums[i];
      nums[nums.length-1] = firstele;
    }
    else if(nums[i] != 0 || nums[i] == nums[i+1]){
     nums[i] = nums[i] + nums[i+1];
      nums[i+1 ] = 0; 

    }
    return l;
  }
}

