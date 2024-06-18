import java.util.Scanner;

public class zoho14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arrs = {1, 2, 3, 1, 4, 5, 6, 2, 3, 3};

        findAndPrintRepeat(arrs);
    }

    public static void findAndPrintRepeat(int[] arr) {
        boolean[] printed = new boolean[arr.length]; 
        for (int i = 0; i < arr.length; i++) {
            if (!printed[i]) { 
                int count = 0;

                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }

                if (count > 1) {
                    System.out.print(arr[i] + " ");
                  
                    for (int k = 0; k < arr.length; k++) {
                        if (arr[k] == arr[i]) {
                            printed[k] = true;
                        }
                    }
                }
            }
        }
    }
}
