import java.util.Scanner;

public class printoddnumber {
    public static void printOddNumbers(int n) {
        System.out.println("Odd numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (N) to print odd numbers from 1 to N: ");
        int num = scanner.nextInt();

        printOddNumbers(num);
        scanner.close();
    }
}


