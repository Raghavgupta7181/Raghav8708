import java.util.Scanner;

public class answer9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a single character: ");
        char ch = scanner.next().toLowerCase().charAt(0); // Convert to lowercase for simplicity

        // Check if the input is an alphabet
        if (!Character.isLetter(ch)) {
            System.out.println("Invalid input! Please enter an alphabet.");
        } else {
            // Use switch to determine if it's a vowel or consonant
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(ch + " is a vowel.");
                    break;
                default:
                    System.out.println(ch + " is a consonant.");
            }
        }

        scanner.close();
    }
}

