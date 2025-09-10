import java.util.Scanner;

public class level2assignment2answer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3]; // [][0]=weight, [1]=height, [2]=BMI
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter weight and height for person " + (i + 1));
            double weight, height;
            do {
                System.out.print("Weight (kg): ");
                weight = sc.nextDouble();
            } while (weight <= 0);

            do {
                System.out.print("Height (m): ");
                height = sc.nextDouble();
            } while (height <= 0);

            personData[i][0] = weight;
            personData[i][1] = height;
            personData[i][2] = weight / (height * height);

            double bmi = personData[i][2];
            if (bmi < 18.5) status[i] = "Underweight";
            else if (bmi < 25) status[i] = "Normal";
            else if (bmi < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("Person %d - Height: %.2f, Weight: %.2f, BMI: %.2f, Status: %s\n",
                    i + 1, personData[i][1], personData[i][0], personData[i][2], status[i]);
        }
    }
}
