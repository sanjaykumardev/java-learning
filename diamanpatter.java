// public class diamanpatter {
//   public static void main(String[] args) {
//     int n =5;
//     diamonpattern(n);
//   }

//   public static void diamonpattern(int n){
//     // outter loop
//     for(int i=0; i<=n; i++){
//       // space for patten
//       for(int j=0; j<n-i; j++){
//         System.out.print(" ");
//       }
//       for(int k=0; k<=i; k++){
//         System.out.print("* ");
//       }
//       System.out.println();
//     }
//     for(int i=n-1; i>=0; i--){
//       // space for patten
//       for(int j=0; j<n-i; j++){
//         System.out.print(" ");
//       }
//       for(int k=0; k<=i; k++){
//         System.out.print("* ");
//       }
//       System.out.println();
//     }
    
//   }
// }


public class diamanpatter {
   
  public static void main(String[] args) {
    
    int n = 5 ;
  
    for(int i=0;  i<=n; i++){
      for(int j=0; j<n-i; j++){
        System.out.print(" ");
      }
      for(int k=0; k<=i; k++ ){
        System.out.print("* ");
      }
      System.out.println();
    }
    for(int i=n-1; i>=0; i--){
      for(int j=0; j<n-i; j++){
        System.out.print(" ");
      }
      for(int k=0; k<=i; k++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}