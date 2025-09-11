import java.util.Scanner;

public class CharacterFrequency {

    public static final int ASCII_SIZE = 256;

    public static Object[][] findCharacterFrequency(String text) {
        int[] frequency = new int[ASCII_SIZE];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        Object[][] result = new Object[text.length()][2];
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (frequency[currentChar] > 0) {
                result[count][0] = currentChar;
                result[count][1] = frequency[currentChar];
                frequency[currentChar] = 0; // Mark as processed to avoid duplicates
                count++;
            }
        }
        return java.util.Arrays.copyOf(result, count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        Object[][] frequencies = findCharacterFrequency(inputString);

        System.out.println("Character Frequencies:");
        for (Object[] pair : frequencies) {
            System.out.println("'" + pair[0] + "': " + pair[1]);
        }
        scanner.close();
    }
}