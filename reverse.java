import java.util.Arrays;

public class reverse {
  public static void isreverse(int[]  arr){
    int left = 0 , right = arr.length-1;
    while(left<right){
      int temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;

      left++;
      right--;
    }
    // to convert the arry number to string 
    String numberStrings = Arrays.toString(arr);
    
     // to reverse the converted string
     StringBuilder  reverse = new StringBuilder(numberStrings).reverse();
   //   // Again to convert the string to number
    int reverseArray =  Integer.parseInt(reverse.toString());
       System.out.println(reverseArray);
  }
  public static void main(String[] args){
      int arr[] = new int[] {20 ,30, 40 ,50};

      System.out.println("orginal num: " + Arrays.toString(arr));
      isreverse(arr);
      System.out.println("reverse num: " + Arrays.toString(arr));
  }

 
    // public static void main(String[] args) {
    //     // Example string representing an array of integers
    //     String arrayAsString = "[1, 2, 3, 4, 5]";

    //     // Remove square brackets and split the string
    //     String[] numberStrings = arrayAsString
    //         .substring(1, arrayAsString.length() - 1) // Remove square brackets
    //         .split(", ");

    //     // Convert each number string to an integer
    //     int[] numbers = new int[numberStrings.length];
    //     for (int i = 0; i < numberStrings.length; i++) {
    //         numbers[i] = Integer.parseInt(numberStrings[i]);
    //     }

    //     // Print the result
    //     System.out.println("Array of integers: " + Arrays.toString(numbers));
    // }
}


