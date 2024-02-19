import java.util.Scanner;

public class Strongpassword {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Password: ");
        String s = sc.nextLine();
        sc.close();

        // Function for this problem
        int l = s.length();
        char s1 = '#';
        char s2 = '!';
        char s3 = '_';
        char s4 = '@';
        int c = 0;
        
        for (char i = 0; i < l; i++) {
            char str = s.charAt(i);
            if ((str >=  8 && str <= 25 ) && ((str == s1 || str == s2 || str == s3 || str == s4) || Character.isUpperCase(str) || Character.isLowerCase
            (str) || Character.isDigit(str))) {
                c++; // condition 
            } 
        }
        if(c == l ){
          System.out.println(" VALID");
        }
        else{
          System.out.println(" INVALID");
        }
    }
}
