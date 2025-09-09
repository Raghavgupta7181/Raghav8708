import java.util.Scanner;

public class answer4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for two numbers
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        // Checking which number is greater
        if (number1 > number2) {
            System.out.println("The greater number is: " + number1);
        } else if (number2 > number1) {
            System.out.println("The greater number is: " + number2);
        } else {
            System.out.println("Both numbers are equal.");
        }

        scanner.close();
    }
}

