import java.util.Scanner;

public answer12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;

        // Calculate the sum of digits
        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            sum += digit;           // Add it to the sum
            number /= 10;           // Remove the last digit
        }

        // Output the result
        System.out.println("The sum of the digits is: " + sum);
    }
}
