import java.util.Scanner;


public class kthelement {

    public static void KthElement(int[] arr, int k) {
        if (k < arr.length) {
            System.out.println("Kth element: " + arr[k]);
        } else {
            System.out.println("Kth element does not exist in the array");
        }
    }

    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      System.out.print("enter the size of array ");
      int size = sc.nextInt();

        int[] arr = new int[size];
       System.out.print("enter the element of array ");
       for(int i=0; i<size; i++){
       arr[i] = sc.nextInt();
       }
       System.out.print("Enter the value of K: ");
       int k = sc.nextInt();

       KthElement(arr, k);
       sc.close();
    }
}


