import java.util.Arrays;
import java.util.Scanner;

public class FrequencyUsingUnique {

    public static final int ASCII_SIZE = 256;

    public static char[] findUniqueCharacters(String text) {
        int length = text.length();
        char[] uniqueChars = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < uniqueCount; j++) {
                if (text.charAt(i) == uniqueChars[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueChars[uniqueCount++] = text.charAt(i);
            }
        }
        return Arrays.copyOf(uniqueChars, uniqueCount);
    }

    public static Object[][] findCharacterFrequency(String text) {
        int[] frequency = new int[ASCII_SIZE];
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        char[] uniqueChars = findUniqueCharacters(text);
        Object[][] result = new Object[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            char currentChar = uniqueChars[i];
            result[i][0] = currentChar;
            result[i][1] = frequency[currentChar];
        }
        return result;
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