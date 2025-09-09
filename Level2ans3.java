import java.util.Scanner;

public class Level2ans3 {

    public static void main(String[] args) {
        
        // Create a Scanner object to read input from the console.
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the perimeter of the square.
        System.out.print("Enter the perimeter of the square: ");
        
        // Read the user's input for the perimeter.
        double perimeter = scanner.nextDouble();
        
        // Calculate the side of the square.
        double side = perimeter / 4.0;
        
        // Display the result in the specified format.
        System.out.printf("The length of the side is %.2f whose perimeter is %.2f%n", side, perimeter);
        
        // Close the scanner to prevent resource leaks.
        scanner.close();
    }
}
