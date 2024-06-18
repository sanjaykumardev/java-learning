//? diamond pattern
public class pattern1 {
  public static void main(String[] args) {
    int n = 5;
    for(int i=0; i<=n; i++){
      for(int j=0; j<n-i; j++){
        System.out.print(" ");
      }
      for(int k =0; k<=i; k++){
        System.out.print("* ");
      }
      System.out.println();
    }

    for (int i = n - 1; i >= 0; i--) {
      for (int j = 0; j < n - i; j++) {
          System.out.print(" ");
      }
      for (int k = 0; k <= i; k++) {
          System.out.print("* ");
      }
      System.out.println();
  }
  }
}


// ? rohmbus pattern
//     public class pattern1{
//       public static void main(String[] args){
//         int n = 8;
//         for(int i=0; i<n; i++){
//          for(int j=0; j<n-i; j++){
//           System.out.print(" ");
//          }
//          for(int k=0; k<n; k++){
//             System.out.print("* ");
//          }
//          System.out.println();
//         }
//     }
// }



 //? hollow rohmbus pattern.
// public class pattern1 {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 1; i < n; i++) {
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 0; j < n; j++) {
//                 if (j == 0 || j == 0 || j == n - 1 || j == n - 1 || i == 1 || i == n)
//                     System.out.print("*");
//                 else
//                     System.out.print(" ");

//             }
//             System.out.println();
//         }
//     }
// }




//? left pyramid.
// public class  pattern1{
//   public static void main(String [] args){
//      int n = 5;

        
//         for (int i = 1; i <= n; i++) {
           
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println(); // Move to the next line after each row
//           }
//  }
// }



// ? right pyramid.
// public class pattern1 {
//   public static void main( String [] args){
//     int N= 5;

//     //! outer loop to print
//     for(int i= 1; i<= N; i++){

//       //! inside loop to print
//         for(int j= 1; j<= N-i+1; j++){
//           System.out.print( " *");
//         }
//           System.out.println( );
//     }  
//   }
// }


// ?  different pattern.
// public class pattern1 {
//   public static void main( String [] args){
//     int N= 5;

//     //! outer loop to print
//     for(int i= 1; i<=N; i++){

//       //! inside loop to print
//         for(int j= 1; j<= i; j++){
//           System.out.print(j + " ");
//         }
//           System.out.println( );
//     }  
//   }
// }


// ?floyd traingle.
public class pattern1 {
  public static void main( String [] args){
    int N= 7;  
     int sum = 1 ; 
    // ! outer loop to print
    for(int i= 1; i<=N; i++){

    //   ! inside loop to print
        for(int j= 1; j<= i; j++){
          System.out.print(sum  + " ");
          sum++;  
        }
          System.out.println( );
    }  
  }
}


//? incorrect keyboard. 
// import java.util.Scanner;
// public class pattern1 {
  
//    public static void main(String[] args){
//     //! input function 
//     Scanner sc  = new Scanner(System.in);
//     System.out.println("enter word ");
//     String s = sc.nextLine();
       
//     //! variable declare
//      int count = 0;
     
//     //! function part 
   
//    }
   
// }