import java.util.Scanner;

public class level2assignment2answer10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take the input for a number
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        // Step 2: Handle negative numbers
        if (number < 0) {
            number = -number; // Convert to positive
        }

        // Step 3: Create frequency array of size 10
        int[] frequency = new int[10];

        // Step 4: Count digits and store frequency
        if (number == 0) {
            frequency[0] = 1; // Special case for 0
        } else {
            while (number > 0) {
                int digit = (int) (number % 10);
                frequency[digit]++;
                number /= 10;
            }
        }

        // Step 5: Display the frequency of each digit
        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }

        sc.close();
    }
}
