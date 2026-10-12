import java.util.Scanner;

public class Question04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Array size must be positive.");
        } else {
            int[] numbers = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                numbers[i] = sc.nextInt();
            }

            int maximum = numbers[0];
            for (int number : numbers) {
                if (number > maximum) maximum = number;
            }
            System.out.println("Maximum element = " + maximum);
        }
        sc.close();
    }
}
