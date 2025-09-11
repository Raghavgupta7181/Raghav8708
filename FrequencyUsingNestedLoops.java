import java.util.Arrays;
import java.util.Scanner;

public class FrequencyUsingNestedLoops {

    public static Object[][] findCharacterFrequency(String text) {
        char[] charArray = text.toCharArray();
        Object[][] frequencyResult = new Object[charArray.length][2];
        int resultCount = 0;

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '\0') {
                continue; // Skip characters that have been counted
            }

            int frequency = 1;
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] == charArray[j]) {
                    frequency++;
                    charArray[j] = '\0'; // Mark duplicates as counted
                }
            }
            frequencyResult[resultCount][0] = charArray[i];
            frequencyResult[resultCount][1] = frequency;
            resultCount++;
        }
        return Arrays.copyOf(frequencyResult, resultCount);
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