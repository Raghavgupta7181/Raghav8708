import java.util.Scanner;

public class Level2ans6 {

    /**
     * The main method is the entry point of the program.
     * It prompts the user for unit price and quantity,
     * calculates the total price, and prints the result.
     */
    public static void main(String[] args) {

        // Create a Scanner object to read input from the console.
        Scanner scanner = new Scanner(System.in);

        // Declare variables for unit price and quantity.
        double unitPrice;
        int quantity;

        // Prompt the user to enter the unit price.
        System.out.print("Enter the unit price of the item: INR ");
        unitPrice = scanner.nextDouble();

        // Prompt the user to enter the quantity.
        System.out.print("Enter the quantity to be bought: ");
        quantity = scanner.nextInt();

        // Calculate the total price.
        double totalPrice = unitPrice * quantity;

        // Print the final result in the specified format.
        System.out.printf("The total purchase price is INR %.2f if the quantity is %d and unit price is INR %.2f%n",
                          totalPrice, quantity, unitPrice);
        
        // Close the scanner object to prevent resource leaks.
        scanner.close();
    }
}
