  import java.util.Scanner;

public class matrix {
    public static void multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix, int[][] resultMatrix) {
        int rowsA = firstMatrix.length;
        // int rowsB = secondMatrix.length;
        int columnsA = firstMatrix[0].length;
        int columnsB = secondMatrix[0].length;

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsB; j++) {
                for (int k = 0; k < columnsA; k++) {
                    resultMatrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the first matrix: ");
        int rowsA = scanner.nextInt();
        System.out.print("Enter the number of columns for the first matrix: ");
        int columnsA = scanner.nextInt();

        int[][] firstMatrix = new int[rowsA][columnsA];
        System.out.println("Enter elements for the first matrix:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsA; j++) {
                firstMatrix[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Enter the number of rows for the second matrix: ");
        int rowsB = scanner.nextInt();
        System.out.print("Enter the number of columns for the second matrix: ");
        int columnsB = scanner.nextInt();

        if (columnsA != rowsB) {
            System.out.println("Matrix multiplication is not possible. The number of columns in the first matrix should be equal to the number of rows in the second matrix.");
            scanner.close();
            return;
        }

        int[][] secondMatrix = new int[rowsB][columnsB];
        System.out.println("Enter elements for the second matrix:");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < columnsB; j++) {
                secondMatrix[i][j] = scanner.nextInt();
            }
        }

        int[][] resultMatrix = new int[rowsA][columnsB];

        multiplyMatrices(firstMatrix, secondMatrix, resultMatrix);

        System.out.println("Resultant matrix after multiplication:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsB; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }


}
