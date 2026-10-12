import java.util.Scanner;

public class Question21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Array size must be positive.");
        } else {
            int[] array = new int[size];
            for (int i = 0; i < size; i++) array[i] = sc.nextInt();

            int first = array[0];
            for (int i = 0; i < size - 1; i++) array[i] = array[i + 1];
            array[size - 1] = first;

            System.out.print("Array after left rotation: ");
            for (int value : array) System.out.print(value + " ");
            System.out.println();
        }
        sc.close();
    }
}
