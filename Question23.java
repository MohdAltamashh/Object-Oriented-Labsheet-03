import java.util.Scanner;

public class Question23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        if (size < 2) {
            System.out.println("At least two elements are required.");
        } else {
            int[] array = new int[size];
            for (int i = 0; i < size; i++) array[i] = sc.nextInt();

            Integer largest = null, secondLargest = null;
            for (int value : array) {
                if (largest == null || value > largest) {
                    if (largest == null || value != largest) secondLargest = largest;
                    largest = value;
                } else if (value < largest && (secondLargest == null || value > secondLargest)) {
                    secondLargest = value;
                }
            }

            if (secondLargest == null) {
                System.out.println("No second-largest distinct element exists.");
            } else {
                System.out.println("Second largest distinct element = " + secondLargest);
            }
        }
        sc.close();
    }
}
