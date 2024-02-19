import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.Arrays;

public class sortandkelement {
  public static  void Sortin(int k , int[] arr){
    if(k < arr.length){
      System.out.println("kthelemnet: " + arr[k]);
    }
    else{
      System.out.println("kth position is not found");
    }

    

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the size of the array");
    int size = sc.nextInt();

    System.out.println("enter the arr1");
    int[] arr1 = new int[size];
    for(int i=0; i < size; i++){
      arr1[i] = sc.nextInt();
    }
    System.out.println("enter the arr2");
    int[] arr2 = new int[size];
    for(int i=0; i < size; i++){
      arr2[i] = sc.nextInt();
    }
   int[] mergedArray = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray();
   Arrays.sort(mergedArray);;
    System.out.println("enter the kth element");
    int k = sc.nextInt();
    
    Sortin(k ,mergedArray);
    sc.close();
  }
}
