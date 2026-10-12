import java.util.Scanner;

public class Question25 {
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

            int mainSum = 0, secondarySum = 0;
            for (int i = 0; i < n; i++) {
                mainSum += matrix[i][i];
                secondarySum += matrix[i][n - 1 - i];
            }
            System.out.println("Main diagonal sum = " + mainSum);
            System.out.println("Secondary diagonal sum = " + secondarySum);
        }
        sc.close();
    }
}
