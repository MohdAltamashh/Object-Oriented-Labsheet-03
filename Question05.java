import java.util.Scanner;

public class Question05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Array size must be positive.");
        } else {
            int even = 0, odd = 0;
            for (int i = 0; i < size; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                int value = sc.nextInt();
                if (value % 2 == 0) even++;
                else odd++;
            }
            System.out.println("Even numbers = " + even);
            System.out.println("Odd numbers = " + odd);
        }
        sc.close();
    }
}
