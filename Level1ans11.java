import java.util.Scanner;

public class Level1ans11 {

    /**
     * The main method is the entry point of the program.
     * It handles user input and performs the calculations.
     */
    public static void main(String[] args) {
        
        // Create a Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);
        
        // Declare variables to store the two numbers.
        double number1, number2;

        // Prompt the user for the first number.
        System.out.print("Enter the first number: ");
        number1 = scanner.nextDouble();

        // Prompt the user for the second number.
        System.out.print("Enter the second number: ");
        number2 = scanner.nextDouble();

        // Perform the arithmetic operations.
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        // Print the results in a single, formatted output statement.
        System.out.printf("The addition, subtraction, multiplication and division value of %.2f and %.2f is %.2f, %.2f, %.2f, and %.2f%n",
                          number1, number2, addition, subtraction, multiplication, division);

        // Close the scanner object to prevent resource leaks.
        scanner.close();
    }
}
