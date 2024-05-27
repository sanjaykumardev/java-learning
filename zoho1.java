import java.util.Arrays;
import java.util.Scanner;

public class zoho1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        
       
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

 
        Arrays.sort(arr);

        int[] result = new int[n];

        int left = 0, right = n - 1;
        for (int i = 0; i < n; i++) {
         
            if (i % 2 == 0) {
                result[i] = arr[right];
                right--;
            } 
    
            else {
                result[i] = arr[left];
                left++;
            }
        }


        System.out.println( Arrays.toString(result));
   
        sc.close();
    }
}


