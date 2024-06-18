public class zoho7 {

    public static void main(String[] args) {
        printPattern();
    }

    public static void printPattern() {
        int size = 5; 

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    System.out.print(i + 1);
                } else if (i + j == size - 1) {
                    System.out.print(size - i);
                } else {
                    System.out.print(" ");
                }
            }.
            System.out.println();
        }
    }
}
