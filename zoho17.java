import java.util.*;



public class zoho17 {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int[] arr = new int[n];

   for(int i=0; i<n; i++){
    arr[i] = sc.nextInt();
   }
   Arraysreapted(arr);

  }
  


  public static void Arraysreapted(int[] nums){

    int count = 0;

    for(int i=0; i<nums.length; i++){
      for(int j=1; j<nums.length; j++){
        if(nums[i] == nums[j]){
          count += nums[i];
          count++;
        }
      }
    }
    if(count == 4 || count > 1 || count == 2)
      Arrays.sort(count);
    
    System.out.print(count);
  }
}
