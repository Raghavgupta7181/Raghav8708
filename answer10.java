import java.util.Scanner;

public class answer10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Using ternary operator to check divisibility
        String result = (number % 3 == 0 && number % 5 == 0) 
                        ? "The number is divisible by both 3 and 5." 
                        : "The number is not divisible by both 3 and 5.";

        System.out.println(result);
        scanner.close();
    }
}
