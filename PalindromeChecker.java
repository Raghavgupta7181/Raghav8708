import java.util.Scanner;

public class PalindromeChecker {

    // Logic 1: Compare from start and end
    public static boolean isPalindromeLogic1(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive method
    public static boolean isPalindromeLogic2(String text) {
        return isPalindromeRecursive(text, 0, text.length() - 1);
    }

    private static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Using character arrays
    public static boolean isPalindromeLogic3(String text) {
        char[] originalArray = text.toCharArray();
        char[] reversedArray = reverseString(text);
        
        return java.util.Arrays.equals(originalArray, reversedArray);
    }

    private static char[] reverseString(String text) {
        char[] reversed = new char[text.length()];
        int j = 0;
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed[j++] = text.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check for palindrome: ");
        String inputString = scanner.nextLine();

        System.out.println("\nPalindrome Check Results:");
        System.out.println("Logic 1 (Compare from ends): " + (isPalindromeLogic1(inputString) ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Logic 2 (Recursive): " + (isPalindromeLogic2(inputString) ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Logic 3 (Character arrays): " + (isPalindromeLogic3(inputString) ? "Palindrome" : "Not a Palindrome"));
        scanner.close();
    }
}