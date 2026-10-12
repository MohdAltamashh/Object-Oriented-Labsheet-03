import java.util.Scanner;

public class Question28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int rows = sc.nextInt(), cols = sc.nextInt();

        if (rows <= 0 || cols <= 0) {
            System.out.println("Rows and columns must be positive.");
        } else {
            int[][] matrix = new int[rows][cols];
            for (int i = 0; i < rows; i++)
                for (int j = 0; j < cols; j++) matrix[i][j] = sc.nextInt();

            System.out.print("Enter element to search: ");
            int target = sc.nextInt();
            boolean found = false;
            for (int i = 0; i < rows; i++)
                for (int j = 0; j < cols; j++)
                    if (matrix[i][j] == target) {
                        System.out.println("Found at row " + (i + 1) + ", column " + (j + 1));
                        found = true;
                    }

            if (!found) System.out.println("Element not found.");
        }
        sc.close();
    }
}
