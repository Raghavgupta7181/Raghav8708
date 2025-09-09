import java.util.Scanner;

public class Level2ans5 {

    /**
     * This program takes two integers as input and calculates their quotient and remainder.
     */
    public static void main(String[] args) {
        
        // Create a Scanner object to read input from the console.
        Scanner scanner = new Scanner(System.in);
        
        // Declare variables for the two numbers.
        int number1, number2;

        // Prompt the user to enter the first number.
        System.out.print("Enter the first number: ");
        number1 = scanner.nextInt();

        // Prompt the user to enter the second number.
        System.out.print("Enter the second number: ");
        number2 = scanner.nextInt();

        // Check if the second number is not zero to avoid a division-by-zero error.
        if (number2 != 0) {
            // Calculate the quotient using the division operator.
            int quotient = number1 / number2;
            
            // Calculate the remainder using the modulus operator.
            int remainder = number1 % number2;

            // Print the result in the specified format.
            System.out.printf("The Quotient is %d and Reminder is %d of two number %d and %d%n",
                              quotient, remainder, number1, number2);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
        
        // Close the scanner to prevent resource leaks.
        scanner.close();
    }
}
