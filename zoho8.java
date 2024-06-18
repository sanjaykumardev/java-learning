package Day3;

import java.util.*;

public class zoho8 {
    
    
    public static int factorsCount(int num) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                if (i == num / i) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }
        return count;
    }
    
    
    public static class FactorComparator implements Comparator<Integer> {
        public int compare(Integer a, Integer b) {
            int countA = factorsCount(a);
            int countB = factorsCount(b);
            if (countA != countB) {
                return Integer.compare(countB, countA); 
            } else {
                return Integer.compare(a, b); 
            }
        }
    }
    
  
    public static void customSort(Integer[] arr) {
        Arrays.sort(arr, new FactorComparator());
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        
        customSort(arr);
        
        
        System.out.println("Output:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
