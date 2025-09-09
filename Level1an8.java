import java.util.Scanner;

public class Level1an8 {

    public static void main(String[] args) {

        // Create a variable km with type double.
        double km;

        // Create a Scanner object to take user input from the keyboard.
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the distance in kilometers.
        System.out.print("Enter distance in kilometers: ");

        // Use the Scanner object to read the user input for km.
        km = input.nextDouble();

        // Use the formula 1 mile = 1.6 km to calculate miles.
        // Therefore, miles = km / 1.6
        double miles = km / 1.6;

        // Display the output in the specified format.
        System.out.printf("The total miles is %.2f mile for the given %.2f km\n", miles, km);

        // Close the scanner object to prevent resource leaks.
        input.close();
    }
}
