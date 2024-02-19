// import java.util.Scanner;

// public class kth {
//   public static void kthelement(int[] arr , int k) {
//     if(k < arr.length){
//      System.out.println("kthelemnet :" + arr[k]);
//     }
//     else{
//      System.out.print("this no  in array");
//     }
      
//   }



//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//      System.out.print("enter the array size ");
//      int size = sc.nextInt();

//      int[] arr = new int[size];
//      System.out.print("enter the array");
//      for(int i=0; i<size; i++){
//       arr[i] = sc.nextInt();
//      }

//       System.out.println("enter the kth element");
//       int k = sc.nextInt();

//       kthelement(arr ,k);
//       sc.close();
//   }

// }


// public class kth{
//    public static void main(String[] args){
//    int  n = 5 ;
//     for(int i=1; i<n; i++){

//       for(int j=i; j<=n-i; j--){
//         System.out.print("* ");
//       }
//     } 
//     for(int i=1; i<=n-i; i++){
//        for(int j=n; j<=i; j++){
//         System.out.print("* ");
//        }
//     }
//   }
// }
// import java.util.Arrays;
// // import java.util.Collections;

// public class kth {

//     public static void main(String[] args) {

//         Integer[] arr = new Integer[]{2, 5, 77, 4, 66, 88, 99, 0}; // Use Integer instead of int
//         Arrays.sort(arr);
        
//         System.out.println("The elements are in descending order: " + Arrays.toString(arr));
//     }
// }



// import java.util.Arrays;
// import java.util.Collections;


// public class kth {

//     public static void main(String[] args) {

//         Integer[] arr = new Integer[]{2, 5, 77, 4, 66, 88, 99, 0}; // Use Integer instead of int
//         Arrays.sort(arr , Collections.reverseOrder());
        
//         System.out.println("The elements are in descending order: " + Arrays.toString(arr));
//     }
// }
// import java.util;

// public class kth{
//   public static int gcd(int a ,int b){
//     if(b == 0){
//       return b;
//     }
//     return gcd(a,a%b);
//   }
//   public static void main(String[] args){
//    int n1 =3;
//    int n2 = 5;
//     int n = (n1*n2)/gcd(n1,n2);
//     System.out.print("the lcm of this number" + n);
//   }
// }

// import java.util.Scanner;

// public class kth {
//     public static int gcd(int a,int b){
//         if(b==0){
//             return b;
//         }
//         return gcd(a,a%b);
//     }
//     public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n1=sc.nextInt();
//        int n2=sc.nextInt();
//        int n=(n1*n2)/gcd(n1,n2);
//        System.out.println("The lcm is "+n);
//        sc.close();
//     }
// } 