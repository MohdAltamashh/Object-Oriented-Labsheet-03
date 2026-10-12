import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maximum = Integer.MIN_VALUE;

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++) {
                    System.out.print("Enter element [" + i + "][" + j + "][" + k + "]: ");
                    int value = sc.nextInt();
                    if (value > maximum) maximum = value;
                }

        System.out.println("Maximum element = " + maximum);
        sc.close();
    }
}
