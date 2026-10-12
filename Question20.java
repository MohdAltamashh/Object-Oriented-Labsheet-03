import java.util.Scanner;

public class Question20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        if (students <= 0) {
            System.out.println("Number of students must be positive.");
        } else {
            double[][] marks = new double[students][];
            for (int i = 0; i < students; i++) {
                System.out.print("How many subjects for student " + (i + 1) + "? ");
                int subjects = sc.nextInt();
                if (subjects < 0) {
                    System.out.println("Subject count cannot be negative.");
                    sc.close();
                    return;
                }
                marks[i] = new double[subjects];
                for (int j = 0; j < subjects; j++) {
                    System.out.print("Enter mark for subject " + (j + 1) + ": ");
                    marks[i][j] = sc.nextDouble();
                }
            }

            for (int i = 0; i < students; i++) {
                System.out.print("Student " + (i + 1) + " marks: ");
                for (double mark : marks[i]) System.out.print(mark + " ");
                System.out.println();
            }
        }
        sc.close();
    }
}
