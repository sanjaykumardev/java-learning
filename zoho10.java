import java.util.Scanner;

public class zoho10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        String s = sc.nextLine();
        String M = sc.nextLine();
        
        
        int index = findSubstringIndex(s, M);
        
        
        System.out.println(index);
        
        
        sc.close();
    }

   
    public static int findSubstringIndex(String s1, String s2) {
        
        if (s2.length() > s1.length()) {
            return -1;
        }
        
        
        for (int i = 0; i <= s1.length() - s2.length(); i++) {
            
            String substring = s1.substring(i, i + s2.length());
            
            
            if (substring.equals(s2)) {
                return i;  
            }
        }
        
        return -1;
    }
}
