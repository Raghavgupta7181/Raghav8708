import java.util.Scanner;

public class answer7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for marks
        System.out.print("Enter marks (0-100): ");
        int marks = scanner.nextInt();

        // Checking and assigning grades
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 50) {
            System.out.println("Grade: C");
        } else if (marks >= 0) {
            System.out.println("Grade: Fail");
        } else {
            System.out.println("Invalid marks entered. Please enter a value between 0 and 100.");
        }

        scanner.close();
    }
}
