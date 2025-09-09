import java.util.Scanner;

public class Level1ans9 {

    /**
     * The main method is the entry point of the program.
     * It prompts the user for the total fee and a discount percentage,
     * computes the final amount, and displays the result.
     */
    public static void main(String[] args) {
        
        // Create a Scanner object to read input from the console.
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the total fee.
        System.out.print("Enter the total fee in INR: ");
        double fee = scanner.nextDouble();

        // Prompt the user to enter the discount percentage.
        System.out.print("Enter the discount percentage: ");
        double discountPercent = scanner.nextDouble();

        // Calculate the discount amount.
        double discountAmount = fee * (discountPercent / 100.0);

        // Calculate the final discounted fee.
        double finalFee = fee - discountAmount;

        // Print the final result in the specified format.
        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f%n",
                          discountAmount, finalFee);
                          
        // Close the scanner object to prevent resource leaks.
        scanner.close();
    }
}
