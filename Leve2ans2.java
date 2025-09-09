import java.util.Scanner;

public class Leve2ans2 {

    /**
     * The main method is the entry point of the program.
     * It prompts the user for the base and height, calculates the
     * area in both units, and prints the result.
     */
    public static void main(String[] args) {

        // Create a Scanner object to read input from the console.
        Scanner scanner = new Scanner(System.in);
        
        // Declare variables for base and height.
        double base;
        double height;

        // Prompt the user to enter the base of the triangle.
        System.out.print("Enter the base of the triangle in cm: ");
        base = scanner.nextDouble();

        // Prompt the user to enter the height of the triangle.
        System.out.print("Enter the height of the triangle in cm: ");
        height = scanner.nextDouble();
        
        // Define the conversion factor from cm to inches.
        final double CM_PER_INCH = 2.54;

        // Calculate the area in square centimeters.
        // Area = 0.5 * base * height
        double areaInSqCm = 0.5 * base * height;
        
        // Convert the area to square inches.
        // 1 square inch = (2.54 cm)^2
        double areaInSqInches = areaInSqCm / (CM_PER_INCH * CM_PER_INCH);

        // Print the results in the specified format.
        System.out.printf("The Area of the triangle in sq in is %.2f and sq cm is %.2f%n",
                          areaInSqInches, areaInSqCm);
        
        // Close the scanner object.
        scanner.close();
    }
}
