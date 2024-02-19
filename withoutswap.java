 import java.util.Arrays;

public class withoutswap {
  public static void isreverse(int[]arr1 ,int[] arr2 ){
   if(arr1.length != arr2.length){
    System.out.print("enter the equal array number");
   }
   for (int i = 0; i < arr1.length; i++) {
    // XOR swapping technique to swap elements without a temporary variable
    arr1[i] = arr1[i] ^ arr2[i];
    arr2[i] = arr1[i] ^ arr2[i];
    arr1[i] = arr1[i] ^ arr2[i];
   }
}
   
  
  public static void main(String[] args){
      int arr1[] = new int[] {20 ,30, 40 ,50};
      int arr2[] = new int[] {30 ,100 ,99 ,57 };

      System.out.println("orginal num: " + Arrays.toString(arr1));
      System.out.println("orginal num: " + Arrays.toString(arr2));
      isreverse(arr1 ,arr2);
      System.out.println("swap num: " + Arrays.toString(arr1));
      System.out.println("swap num: " + Arrays.toString(arr2));
  }
}


