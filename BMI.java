import java.util.Scanner;

public class BMI {

    public static final int TEAM_SIZE = 10;
    public static final int WEIGHT_INDEX = 0;
    public static final int HEIGHT_INDEX = 1;
    public static final int BMI_INDEX = 2;
    public static final int STATUS_INDEX = 3;

    public static String[][] calculateBMIAndStatus(double[][] personData) {
        String[][] results = new String[TEAM_SIZE][4];
        for (int i = 0; i < TEAM_SIZE; i++) {
            double weight = personData[i][WEIGHT_INDEX];
            double heightInCm = personData[i][HEIGHT_INDEX];
            double heightInM = heightInCm / 100.0;
            double bmi = weight / (heightInM * heightInM);
            String status = getBMIStatus(bmi);

            results[i][0] = String.format("%.2f", weight);
            results[i][1] = String.format("%.2f", heightInCm);
            results[i][2] = String.format("%.2f", bmi);
            results[i][3] = status;
        }
        return results;
    }

    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal";
        } else if (bmi >= 25.0 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void displayResults(String[][] results) {
        System.out.println("-------------------------------------------------");
        System.out.printf("| %-10s | %-10s | %-8s | %-12s |\n", "Weight (kg)", "Height (cm)", "BMI", "Status");
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < TEAM_SIZE; i++) {
            System.out.printf("| %-10s | %-10s | %-8s | %-12s |\n", results[i][0], results[i][1], results[i][2], results[i][3]);
        }
        System.out.println("-------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] personData = new double[TEAM_SIZE][2];

        System.out.println("Enter the weight (kg) and height (cm) for 10 people:");
        for (int i = 0; i < TEAM_SIZE; i++) {
            System.out.print("Person " + (i + 1) + " - Weight (kg): ");
            personData[i][WEIGHT_INDEX] = scanner.nextDouble();
            System.out.print("Person " + (i + 1) + " - Height (cm): ");
            personData[i][HEIGHT_INDEX] = scanner.nextDouble();
        }

        String[][] bmiResults = calculateBMIAndStatus(personData);
        displayResults(bmiResults);
        scanner.close();
    }
}