import java.util.Scanner;

public class Leve2ans1 {

    public static void main(String[] args) {
        
        // Create a Scanner object to read input from the console.
        Scanner input = new Scanner(System.in);
        
        // Declare two variables to store the user-inputted numbers.
        double number1;
        double number2;
        
        // Prompt the user to enter the first number.
        System.out.print("Enter the first floating-point number: ");
        number1 = input.nextDouble();
        
        // Prompt the user to enter the second number.
        System.out.print("Enter the second floating-point number: ");
        number2 = input.nextDouble();
        
        // Perform the arithmetic operations and store the results.
        double sum = number1 + number2;
        double difference = number1 - number2;
        double product = number1 * number2;
        
        // Check for division by zero before performing the operation.
        if (number2 != 0) {
            double quotient = number1 / number2;
            
            // Print the results in a single, formatted line as requested.
            System.out.printf("The addition, subtraction, multiplication, and division value of 2 numbers %.2f and %.2f is %.2f, %.2f, %.2f, and %.2f\n",
                              number1, number2, sum, difference, product, quotient);
        } else {
            System.out.printf("The addition, subtraction, and multiplication value of 2 numbers %.2f and %.2f is %.2f, %.2f, and %.2f\n",
                              number1, number2, sum, difference, product);
            System.out.println("Division by zero is not possible.");
        }
        
        // Close the scanner to prevent resource leaks.
        input.close();
    }
}
