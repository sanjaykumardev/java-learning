package Day3;
import java.util.*;

public class  zoho9{
    public static void main(String args[]) {
        String[] one = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        String[] two = {"", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] three = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the number: ");
        int number = in.nextInt();
        
        if (number == 0) {
            System.out.println("ZERO");
        } else if (number < 11) {
            System.out.println(one[number]);
        } else if (number > 10 && number < 20) {
            System.out.println(two[number % 10]);
        } else if (number > 20 && number < 1000) {
            int temp = number;
            int count = 0;
        
            while (temp != 0) {
                count++;
                temp = temp / 10;
            }
             
            if (count == 2) {
                System.out.print(three[number / 10] + " ");
                System.out.println(one[number % 10]);
            } else if (count == 3) {
                System.out.print(one[number / 100] + " hundred ");
                number = number - ((number / 100) * 100);
                System.out.print(three[number / 10] + " ");
                System.out.println(one[number % 10]);
            }
        }   
    }
}