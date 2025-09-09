import java.util.Scanner;

public class answer5 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        // Calculate the square and cube using the * operator
        double square = number * number;
        double cube = number * number * number;

        // Display the results
        System.out.println("Square of " + number + " is: " + square);
        System.out.println("Cube of " + number + " is: " + cube);

        // Close the scanner
        scanner.close();
    }
}
