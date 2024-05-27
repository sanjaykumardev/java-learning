import java.util.Stack;
import java.util.Scanner;
public class zoho2 {

    public static String Parentheses(String n) {
        Stack<Integer> stack = new Stack<>();
        boolean[] valid = new boolean[n.length()];

        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else if (c == ')') {
                if (!stack.isEmpty()) 
                    valid[i] = true;  
                    valid[stack.pop()] = true;  
                }
            } else {
                valid[i] = true;  
            }
        }


        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n.length(); i++) {
            if (valid[i]) {
                result.append(n.charAt(i));
            }
        }

        return result.toString();
    }
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        String input = Parentheses(s);
        System.out.print(input);
    }
}