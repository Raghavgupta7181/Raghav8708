import java.util.Scanner;

public class level2ans7 {

    /**
     * The main method is the entry point of the program.
     * It takes three integer inputs from the user and performs
     * several calculations, demonstrating operator precedence.
     */
    public static void main(String[] args) {

        // Create a Scanner object to read input from the console.
        Scanner scanner = new Scanner(System.in);
        
        // Declare variables for the three integers.
        int a, b, c;
        int result1, result2, result3, result4;

        // Prompt the user to enter the first integer.
        System.out.print("Enter the first integer (a): ");
        a = scanner.nextInt();

        // Prompt the user to enter the second integer.
        System.out.print("Enter the second integer (b): ");
        b = scanner.nextInt();

        // Prompt the user to enter the third integer.
        System.out.print("Enter the third integer (c): ");
        c = scanner.nextInt();

        // Perform the integer operations.
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

        // Print the results in the specified format.
        System.out.printf("The results of Int Operations are %d, %d, %d, and %d%n",
                          result1, result2, result3, result4);

        // Close the scanner object to prevent resource leaks.
        scanner.close();
    }
}
