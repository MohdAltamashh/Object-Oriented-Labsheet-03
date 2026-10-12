import java.util.Arrays;
import java.util.Scanner;

public class Question29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        if (rows <= 0) {
            System.out.println("Number of rows must be positive.");
        } else {
            int[][] jagged = new int[rows][];
            for (int i = 0; i < rows; i++) {
                System.out.print("Enter length of row " + (i + 1) + ": ");
                int length = sc.nextInt();
                if (length < 0) {
                    System.out.println("Row length cannot be negative.");
                    sc.close();
                    return;
                }
                jagged[i] = new int[length];
                System.out.println("Enter " + length + " elements:");
                for (int j = 0; j < length; j++) jagged[i][j] = sc.nextInt();
                Arrays.sort(jagged[i]);
            }

            System.out.println("Jagged array after sorting each row:");
            for (int[] row : jagged) {
                for (int value : row) System.out.print(value + " ");
                System.out.println();
            }
        }
        sc.close();
    }
}
