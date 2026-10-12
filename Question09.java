import java.util.Scanner;

public class Question09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int rows = sc.nextInt(), cols = sc.nextInt();

        if (rows <= 0 || cols <= 0) {
            System.out.println("Rows and columns must be positive.");
        } else {
            int[][] matrix = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("Enter element [" + i + "][" + j + "]: ");
                    matrix[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < rows; i++) {
                int sum = 0;
                for (int j = 0; j < cols; j++) sum += matrix[i][j];
                System.out.println("Sum of row " + (i + 1) + " = " + sum);
            }
        }
        sc.close();
    }
}
