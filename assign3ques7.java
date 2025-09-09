import java.util.Scanner;

public class assign3ques7 {

    public static void main(String[] args) {
        // 1. Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // 2. Prompt the user for their name
        System.out.print("Enter your name: ");
        
        // 3. Read the name and store it in a variable
        String userName = scanner.nextLine();

        // 4. Prompt the user for their age
        System.out.print("Enter your age: ");
        
        // 5. Read the age and store it in a variable
        int userAge = scanner.nextInt();

        // 6. Print a greeting using the user's input
        System.out.println("\nHello, " + userName + "! You are " + userAge + " years old.");

        // 7. Close the scanner
        scanner.close();
    }
}