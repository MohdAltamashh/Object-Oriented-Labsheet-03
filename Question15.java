import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][][] array = new int[2][2][2];
        int sum = 0;

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++) {
                    System.out.print("Enter element [" + i + "][" + j + "][" + k + "]: ");
                    array[i][j][k] = sc.nextInt();
                    sum += array[i][j][k];
                }

        System.out.println("Sum of all 3-D array elements = " + sum);
        sc.close();
    }
}
