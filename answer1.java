import java.util.Scanner;

public class answer1 {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Prompt the user for their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Print the message
        System.out.println("Hello " + name + ", you are " + age + " years old.");

        // Close the scanner
        scanner.close();
    }
}
