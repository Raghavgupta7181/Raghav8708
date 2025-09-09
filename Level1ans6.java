ublic class Level1ans6 {
    public static void main(String[] args) {

        // Create a variable named fee and assign 125000 to it.
        double fee = 125000;

        // Create another variable discountPercent and assign 10 to it.
        double discountPercent = 10;

        // Compute the discount amount and assign it to the discount variable.
        double discount = fee * (discountPercent / 100);

        // Compute the fee you have to pay by subtracting the discount from the fee.
        double finalDiscountedFee = fee - discount;

        // Use a single print statement to display the output with the variables.
        // The %.2f format specifier is used to display the numbers with two decimal places.
        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f\n", discount, finalDiscountedFee);
    }
}
