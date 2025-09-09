public class Level1ans7 {

    /**
     * The main method is the entry point of the program.
     * It defines constants for the Earth's radius and pi,
     * calculates the volume in km^3 and then converts it to miles^3,
     * finally printing the results.
     */
    public static void main(String[] args) {

        // Define the radius of the Earth in kilometers.
        double radiusKm = 6378.0;

        // Use Java's built-in constant for pi.
        double pi = Math.PI;

        // The formula for the volume of a sphere is (4/3) * pi * r^3.
        double volumeKm3 = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);

        // Convert the volume to cubic miles.
        // We know that 1 km = 0.621371 miles.
        // To convert cubic kilometers to cubic miles, we must cube this conversion factor.
        double kmToMilesFactor = 0.621371;
        double volumeMiles3 = volumeKm3 * Math.pow(kmToMilesFactor, 3);

        // Print the final result in the specified format.
        System.out.printf("The volume of earth in cubic kilometers is %.2f and cubic miles is %.2f",
                volumeKm3, volumeMiles3);
    }
}
