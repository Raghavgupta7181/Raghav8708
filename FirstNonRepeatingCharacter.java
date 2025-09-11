import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    public static final int ASCII_SIZE = 256;

    public static char findFirstNonRepeatingCharacter(String text) {
        int[] frequency = new int[ASCII_SIZE];

        // Loop 1: Find frequency of each character
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        // Loop 2: Find the first character with a frequency of 1
        for (int i = 0; i < text.length(); i++) {
            if (frequency[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }
        return '\0'; // Return null character if no non-repeating character is found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        char firstNonRepeating = findFirstNonRepeatingCharacter(inputString);
        if (firstNonRepeating != '\0') {
            System.out.println("The first non-repeating character is: " + firstNonRepeating);
        } else {
            System.out.println("There are no non-repeating characters in the string.");
        }
        scanner.close();
    }
}