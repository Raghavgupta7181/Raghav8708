public class Level1ans3 {

    /**
     * The main method is the entry point of the program.
     * It defines the distance in kilometers, calculates the equivalent
     * distance in miles, and prints the result.
     */
    public static void main(String[] args) {

        // Define the distance in kilometers as specified.
        double kilometers = 10.8;

        // The conversion factor provided is 1 km = 1.6 miles.
        // Therefore, we multiply the kilometers by this factor to get miles.
        double miles = kilometers * 1.6;

        // Print the result in the specified format, rounding to two decimal places for clarity.
        System.out.printf("The distance %.1f km in miles is %.2f", kilometers, miles);
    }
}