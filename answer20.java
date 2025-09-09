public class answer20 {
    public static void main(String[] args) {
        int number = 121;

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(int num) {
        int original = num, reversed = 0;

        while (num != 0) {
            int digit = num % 10;     
            reversed = reversed * 10 + digit;
            num /= 10;                 
            
        }

        return original == reversed; 
    }
}
