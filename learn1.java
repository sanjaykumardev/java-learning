import java.util.Scanner;


// public class learn1 {
//  static int number(int n){
//  String n2 = Integer.toString(n);
//  return n2.length();
//  }
  
//   public static void main(String[] args)
//    {
//      int n = 12345;
//      System.out.println("Number of digits in " + n + " is " + number(n));
//    }
 
  
// }   
   
     
//    public class learn1 {
//       public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter number :");
//         int N  = sc.nextInt();
//         int  reverse  = 0; 
//         while (N!= 0) {
//            int digit = N%10;
//            reverse = reverse*10+digit;
//            N= N/10;
//        }
//        System.out.println(reverse);
//       }
//  }
  
     
   public class learn1{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String N  =sc.nextLine();
      String P  = sc.nextLine();
      float  Y =  sc.nextInt();
      System.out.println("country:" +N);
      sc.close();
    System.out.println("captial:" +P);
     System.out.println("years:" +Y);
     System.out.println("the capital of  "+N+" is "+P+ "and it gcp is "+Y );
    }
    

   }
   
