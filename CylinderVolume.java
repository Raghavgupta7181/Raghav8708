import java.util.Scanner;

public class CylinderVolume {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for radius and height
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();

        // Calculate the volume of the cylinder
        double volume = Math.PI * Math.pow(radius, 2) * height;

        // Display the result
        System.out.printf("The volume of the cylinder is: %.2f%n", volume);

        // Close the scanner
        scanner.close();
    }
}
