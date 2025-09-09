import java.util.Scanner;

public class answer11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number for which the multiplication table is to be printed
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Using a for loop to generate the multiplication table
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();
    }
}