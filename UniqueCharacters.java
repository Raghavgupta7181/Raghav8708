import java.util.Arrays;
import java.util.Scanner;

public class UniqueCharacters {

    public static int getLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return length;
        }
    }

    public static char[] findUniqueCharacters(String text) {
        int length = getLength(text);
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        char[] uniqueChars = findUniqueCharacters(inputString);
        System.out.println("Unique characters: " + Arrays.toString(uniqueChars));
        scanner.close();
    }
}