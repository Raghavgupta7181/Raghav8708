import java.util.Scanner;

public class Level1ans14 {

    /**
     * The main method is the entry point of the program.
     * It prompts the user for a distance in feet, performs the
     * necessary conversions, and prints the results.
     */
    public static void main(String[] args) {

        // Create a Scanner object to read input from the console.
        Scanner scanner = new Scanner(System.in);
        
        // Declare a variable to store the distance in feet.
        double distanceInFeet;

        // Prompt the user to enter the distance in feet.
        System.out.print("Enter the distance in feet: ");
        distanceInFeet = scanner.nextDouble();

        // Convert feet to yards.
        // 1 yard = 3 feet
        double distanceInYards = distanceInFeet / 3.0;

        // Convert yards to miles.
        // 1 mile = 1760 yards
        double distanceInMiles = distanceInYards / 1760.0;
        
        // Print the results in a clear and readable format.
        System.out.printf("The distance of %.2f feet is equal to %.2f yards and %.4f miles.%n",
                          distanceInFeet, distanceInYards, distanceInMiles);
        
        // Close the scanner object to prevent resource leaks.
        scanner.close();
    }
}
