import java.util.Scanner;

public class Scorce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); 
        
         for(int i=0; i<T; i++){
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
         
            

            if (X < 50) {
                System.out.println("Z"); 
            } else if (X >= 50 && Y < 50) {
                System.out.println("F"); 
            } else {
                System.out.println("A");
            }
        
         }
        scanner.close();
    }
}
