import java.util.Scanner;

public class Question06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Array size must be positive.");
        } else {
            int[] source = new int[size];
            int[] destination = new int[size];

            for (int i = 0; i < size; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                source[i] = sc.nextInt();
            }

            for (int i = 0; i < size; i++) {
                destination[i] = source[i];
            }

            System.out.print("Copied array: ");
            for (int value : destination) System.out.print(value + " ");
            System.out.println();
        }
        sc.close();
    }
}
