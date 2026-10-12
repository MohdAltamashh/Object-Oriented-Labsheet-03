import java.util.Scanner;

public class Question03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Array size must be positive.");
        } else {
            int[] numbers = new int[size];
            int sum = 0;
            for (int i = 0; i < size; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                numbers[i] = sc.nextInt();
                sum += numbers[i];
            }
            System.out.println("Sum of array elements = " + sum);
        }
        sc.close();
    }
}
