import java.util.Scanner;

public class Question26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter order of square matrix: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Order must be positive.");
        } else {
            int[][] matrix = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) matrix[i][j] = sc.nextInt();

            System.out.println("Upper triangular part (zeros below main diagonal):");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++)
                    System.out.print((i <= j ? matrix[i][j] : 0) + "\t");
                System.out.println();
            }

            System.out.println("Lower triangular part (zeros above main diagonal):");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++)
                    System.out.print((i >= j ? matrix[i][j] : 0) + "\t");
                System.out.println();
            }
        }
        sc.close();
    }
}
