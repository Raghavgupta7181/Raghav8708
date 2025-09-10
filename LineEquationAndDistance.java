import java.util.Scanner;

public class LineEquationAndDistance {

    // Method to calculate Euclidean distance between two points
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to calculate slope and intercept of the line
    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        double[] result = new double[2];
        if (x1 == x2) {
            System.out.println("The line is vertical, slope is undefined.");
            return null;
        }
        double m = (y2 - y1) / (x2 - x1); // slope
        double b = y1 - (m * x1);         // intercept
        result[0] = m;
        result[1] = b;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for two points
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        // Calculate distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance between the points: " + distance);

        // Calculate line equation
        double[] lineEquation = calculateLineEquation(x1, y1, x2, y2);
        if (lineEquation != null) {
            System.out.println("Equation of the line: y = " + lineEquation[0] + "x + " + lineEquation[1]);
        }
    }
}
