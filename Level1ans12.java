import java.util.Scanner;

public class Level1ans12 {

    public static void main(String[] args) {
        
        // Create a Scanner object to take user input.
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the base of the triangle in inches.
        System.out.print("Enter the base of the triangle (in inches): ");
        double baseInches = input.nextDouble();
        
        // Prompt the user to enter the height of the triangle in inches.
        System.out.print("Enter the height of the triangle (in inches): ");
        double heightInches = input.nextDouble();
        
        // Calculate the area of the triangle in square inches.
        // Hint: Area of a Triangle is ½ * base * height
        double areaInches = 0.5 * baseInches * heightInches;
        
        // Convert the area from square inches to square centimeters.
        // Hint: 1 inch = 2.54 cm, so 1 sq inch = (2.54 * 2.54) sq cm
        double areaCm = areaInches * 2.54 * 2.54;
        
        // Display the output in a clear and descriptive format.
        System.out.printf("The area of the triangle is %.2f sq. inches and %.2f sq. centimeters.\n", areaInches, areaCm);
        
        // Close the scanner object to prevent resource leaks.
        input.close();
    }
}
