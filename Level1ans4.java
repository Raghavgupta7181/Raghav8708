public class Level1ans4 {

    /**
     * The main method is the entry point of the program.
     * It defines the cost and selling prices, calculates the profit,
     * and determines the profit percentage, then prints the results.
     */
    public static void main(String[] args) {

        // Define the cost price and selling price as specified in the problem.
        double costPrice = 129.0;
        double sellingPrice = 191.0;

        // Calculate the profit.
        double profit = sellingPrice - costPrice;

        // Calculate the profit percentage.
        double profitPercentage = (profit / costPrice) * 100;

        // Use a single print statement to display the required multiline output.
        // We use String.format for cleaner output formatting.
        String output = String.format(
            "The Cost Price is INR %.2f and Selling Price is INR %.2f%n" +
            "The Profit is INR %.2f and the Profit Percentage is %.2f",
            costPrice, sellingPrice, profit, profitPercentage
        );
        System.out.println(output);
    }
}
