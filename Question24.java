import java.util.Scanner;

public class Question24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Array size must be positive.");
        } else {
            int[] array = new int[size];
            for (int i = 0; i < size; i++) array[i] = sc.nextInt();

            int[] unique = new int[size];
            int count = 0;
            for (int value : array) {
                boolean exists = false;
                for (int i = 0; i < count; i++) {
                    if (unique[i] == value) {
                        exists = true;
                        break;
                    }
                }
                if (!exists) unique[count++] = value;
            }

            System.out.print("Array after removing duplicates: ");
            for (int i = 0; i < count; i++) System.out.print(unique[i] + " ");
            System.out.println();
        }
        sc.close();
    }
}
