import java.util.Scanner;

public class level3assignment1answer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int originalNumber = number;
        int sum = 0;

        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum += digit * digit * digit;
            originalNumber /= 10;
        }

        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is NOT an Armstrong Number.");
        }

        sc.close();
    }
}
