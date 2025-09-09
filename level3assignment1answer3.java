import java.util.Scanner;

public class level3assignment1answer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks in Physics: ");
        int physics = sc.nextInt();
        System.out.print("Enter marks in Chemistry: ");
        int chemistry = sc.nextInt();
        System.out.print("Enter marks in Maths: ");
        int maths = sc.nextInt();

        double average = (physics + chemistry + maths) / 3.0;

        String grade;
        String remarks;

        if (average >= 90) {
            grade = "A";
            remarks = "Excellent";
        } else if (average >= 75) {
            grade = "B";
            remarks = "Good";
        } else if (average >= 50) {
            grade = "C";
            remarks = "Average";
        } else {
            grade = "F";
            remarks = "Fail";
        }

        System.out.printf("Average Marks: %.2f\n", average);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        sc.close();
    }
}
