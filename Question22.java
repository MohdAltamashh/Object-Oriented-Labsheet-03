import java.util.Scanner;

public class Question22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Array size must be positive.");
        } else {
            int[] array = new int[size];
            boolean[] counted = new boolean[size];
            for (int i = 0; i < size; i++) array[i] = sc.nextInt();

            for (int i = 0; i < size; i++) {
                if (counted[i]) continue;
                int count = 1;
                for (int j = i + 1; j < size; j++) {
                    if (array[i] == array[j]) {
                        count++;
                        counted[j] = true;
                    }
                }
                System.out.println(array[i] + " occurs " + count + " time(s).");
            }
        }
        sc.close();
    }
}
