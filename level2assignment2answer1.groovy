import java.util.Scanner;

public class level2assignment2answer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] employeeData = new double[10][2]; // [][0] = salary, [][1] = years
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter salary and years of service for employee " + (i + 1));
            double salary = sc.nextDouble();
            double years = sc.nextDouble();

            if (salary < 0 || years < 0) {
                System.out.println("Invalid input. Try again.");
                i--;
                continue;
            }

            employeeData[i][0] = salary;
            employeeData[i][1] = years;
        }

        for (int i = 0; i < 10; i++) {
            double salary = employeeData[i][0];
            double years = employeeData[i][1];

            bonus[i] = (years > 5) ? salary * 0.05 : salary * 0.02;
            newSalary[i] = salary + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary;
            totalNewSalary += newSalary[i];
        }

        System.out.printf("Total Bonus: %.2f\nTotal Old Salary: %.2f\nTotal New Salary: %.2f\n",
                totalBonus, totalOldSalary, totalNewSalary);
    }
}
