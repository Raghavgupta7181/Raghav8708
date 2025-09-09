import java.util.Scanner;

public class Level1ans13 {

    /**
     * The main method is the entry point of the program.
     * It prompts the user for the perimeter, calculates the side,
     * and prints the result.
     */
    public static void main(String[] args) {
        
        // Create a Scanner object to read input from the console.
        Scanner scanner = new Scanner(System.in);
        
        // Declare a variable to store the perimeter.
        double perimeter;

        // Prompt the user to enter the perimeter.
        System.out.print("Enter the perimeter of the square: ");
        perimeter = scanner.nextDouble();

        // Calculate the side of the square.
        // Side = Perimeter / 4
        double side = perimeter / 4.0;

        // Print the final result in the specified format.
        System.out.printf("The length of the side is %.2f whose perimeter is %.2f%n",
                          side, perimeter);

        // Close the scanner to prevent resource leaks.
        scanner.close();
    }
}
