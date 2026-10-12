import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int rows = sc.nextInt(), cols = sc.nextInt();

        if (rows <= 0 || cols <= 0) {
            System.out.println("Rows and columns must be positive.");
        } else {
            int[][] a = new int[rows][cols];
            int[][] b = new int[rows][cols];
            int[][] sum = new int[rows][cols];

            System.out.println("Enter first matrix:");
            for (int i = 0; i < rows; i++)
                for (int j = 0; j < cols; j++) a[i][j] = sc.nextInt();

            System.out.println("Enter second matrix:");
            for (int i = 0; i < rows; i++)
                for (int j = 0; j < cols; j++) b[i][j] = sc.nextInt();

            System.out.println("Sum matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    sum[i][j] = a[i][j] + b[i][j];
                    System.out.print(sum[i][j] + "\t");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
