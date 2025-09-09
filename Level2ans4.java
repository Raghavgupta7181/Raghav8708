import java.util.Scanner;

public class Level2ans4 {

    /**
     * This program takes a distance in feet as input and converts it to yards and miles.
     */
    public static void main(String[] args) {
        
        // Create a Scanner object to read input from the console.
        Scanner input = new Scanner(System.in);

        // Prompt the user for the distance in feet.
        System.out.print("Enter the distance in feet: ");
        
        // Read the user's input. Using double for floating-point values.
        double distanceInFeet = input.nextDouble();
        
        // Calculate the distance in yards.
        // 1 yard = 3 feet
        double distanceInYards = distanceInFeet / 3.0;
        
        // Calculate the distance in miles.
        // 1 mile = 1760 yards
        double distanceInMiles = distanceInYards / 1760.0;
        
        // Print the final result in the specified format, rounded to two decimal places.
        System.out.printf("The distance in yards is %.2f while the distance in miles is %.2f%n", distanceInYards, distanceInMiles);
        
        // Close the scanner to prevent resource leaks.
        input.close();
    }
}
