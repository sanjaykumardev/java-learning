public class oddnumber{
  public static void main(String[] agrs){
     
    int num = 2; 
    for(int i=1; i<=num; i++){
      if(i%2 != 0){
        System.out.print(i + " ");
      }
      if(num % 2 == 0 ){
        System.out.println("not a odd number");
      }
    //   else{
    //     System.out.println("not a odd number");
    //   }
    }
  }
}


// public class oddnumber {

//     public static void printOddNumbers(int N) {
//         System.out.println("Odd numbers from 1 to " + N + ":");
//         for (int i = 1; i <= N; i++) {
//             if (i % 2 != 0) {
//                 System.out.print(i + " ");
//             }
//         }
//         System.out.println(); // Print a new line after all odd numbers are printed
//     }

//     public static void main(String[] args) {
//         int N = 100; // Change this value to print odd numbers up to a different N

//         printOddNumbers(N);
//     }
// }
