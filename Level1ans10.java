import java.util.Scanner;

public class Level1ans10 {

    public static void main(String[] args) {
        
        // Create a Scanner object to take user input.
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter their height in centimeters.
        System.out.print("Enter your height in centimeters: ");
        
        // Take user input for height in centimeters.
        double heightInCm = input.nextDouble();
        
        // Convert centimeters to total inches.
        // Hint: 1 inch = 2.54 cm
        double totalInches = heightInCm / 2.54;
        
        // Calculate the number of full feet.
        // Hint: 1 foot = 12 inches
        int feet = (int) (totalInches / 12);
        
        // Calculate the remaining inches.
        double inches = totalInches % 12;
        
        // Display the output in the specified format.
        System.out.printf("Your Height in cm is %.2f while in feet is %d and inches is %.2f\n", 
                          heightInCm, feet, inches);
        
        // Close the scanner object to prevent resource leaks.
        input.close();
    }
}
