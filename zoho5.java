
import java.util.*;

public class zoho5{
    public static List<Integer> arr(int[] nums, int n){
        List<Integer> ans = new ArrayList<>();
        for(int i:nums){
            if(ans.isEmpty() || i>ans.get(ans.size()-1)){
                ans.add(i);
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(arr(arr,n));
    }
}