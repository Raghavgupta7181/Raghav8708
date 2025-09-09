import java.util.Scanner;

public class Level2ans8 {

    /**
     * The main method is the entry point of the program.
     * It takes three double inputs from the user and performs
     * several calculations, demonstrating operator precedence.
     */
    public static void main(String[] args) {

        // Create a Scanner object to read input from the console.
        Scanner scanner = new Scanner(System.in);
        
        // Declare variables for the three numbers of type double.
        double a, b, c;
        double result1, result2, result3, result4;

        // Prompt the user to enter the first number.
        System.out.print("Enter the first number (a): ");
        a = scanner.nextDouble();

        // Prompt the user to enter the second number.
        System.out.print("Enter the second number (b): ");
        b = scanner.nextDouble();

        // Prompt the user to enter the third number.
        System.out.print("Enter the third number (c): ");
        c = scanner.nextDouble();

        // Perform the arithmetic operations.
        // Operation 1: a + b * c
        // Note: Multiplication has higher precedence than addition.
        result1 = a + b * c;

        // Operation 2: a * b + c
        // Note: Multiplication has higher precedence than addition.
        result2 = a * b + c;

        // Operation 3: c + a / b
        // Note: Division has higher precedence than addition.
        result3 = c + a / b;

        // Operation 4: a % b + c
        // Note: The modulus operator (%) has the same precedence as multiplication and division.
        result4 = a % b + c;

        // Print the results using a format specifier for doubles.
        System.out.printf("The results of Double Operations are %.2f, %.2f, %.2f, and %.2f%n",
                          result1, result2, result3, result4);

        // Close the scanner object to prevent resource leaks.
        scanner.close();
    }
}
