import java.util.Scanner;
import java.util.Arrays;

public class mergesort {
  public static int[] merge(int[] arr1, int[] arr2){
    int[] merge = new int[arr1.length + arr2.length];
   int  i = 0 ,j =0, k =0;
   while (i < arr1.length && j < arr2.length) {
    if (arr1[i] <= arr2[j]) {
        merge[k++]= arr1[i++];
    } else {
        merge[k++] = arr2[j++];

    }
}

    while (i < arr1.length) {
      merge[k++] = arr1[i++];
  }

  while (j < arr2.length) {
      merge[k++] = arr2[j++];
  }

  return merge;

      }
     
  
  public static void main(String[] args){
    Scanner sc =  new Scanner(System.in);
    System.out .print("enter the size");
    int size = sc.nextInt();
    System.out.println("the array of first array");
    int[] arr1 =  new int[size];
    for(int i=0; i<arr1.length; i++){
      arr1[i] = sc.nextInt();
    }
    System.out.println("the array of second ");
    int[] arr2 = new int[size];
    for(int j=0;  j <  arr2.length; j++){
      arr2[j] = sc.nextInt();
    }
    int[]  mergearraysort  = merge(arr1, arr2); 
    System.out.println("the sorted the array: " + Arrays.toString(mergearraysort));
     sc.close();
  }
}










      
