import java.util.Scanner;

public class Question30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int rows = sc.nextInt(), cols = sc.nextInt();

        if (rows <= 0 || cols <= 0) {
            System.out.println("Rows and columns must be positive.");
        } else {
            int[][] matrix = new int[rows][cols];
            int zeros = 0, nonZeros = 0;

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = sc.nextInt();
                    if (matrix[i][j] == 0) zeros++;
                    else nonZeros++;
                }
            }

            System.out.println("Zero elements = " + zeros);
            System.out.println("Non-zero elements = " + nonZeros);
            if (zeros > nonZeros) {
                System.out.println("The matrix is a sparse matrix.");
            } else {
                System.out.println("The matrix is not a sparse matrix.");
            }
        }
        sc.close();
    }
}
