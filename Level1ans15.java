import java.util.Scanner;

public class Level1ans15 {

    public static void main(String[] args) {
        
        // Create a Scanner object to read input from the console.
        Scanner input = new Scanner(System.in);

        // Declare variables for unit price and quantity.
        double unitPrice;
        int quantity;
        
        // Prompt the user to enter the unit price and read the input.
        System.out.print("Enter the unit price of the item (in INR): ");
        unitPrice = input.nextDouble();
        
        // Prompt the user to enter the quantity and read the input.
        System.out.print("Enter the quantity to be bought: ");
        quantity = input.nextInt();
        
        // Calculate the total price.
        double totalPrice = unitPrice * quantity;
        
        // Display the total price in the specified format.
        System.out.printf("The total purchase price is INR %.2f if the quantity is %d and unit price is INR %.2f\n",
                          totalPrice, quantity, unitPrice);
        
        // Close the scanner to prevent resource leaks.
        input.close();
    }
}
