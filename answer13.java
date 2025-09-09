import java.util.Scanner;

public class answer13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();

        int factorial = 1;
        int i = 1;

        do {
            factorial *= i;
            i++;
        } while (i <= number);

        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}

