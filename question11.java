//Write a program to show the difference between char and String data types
public class question11 {
    public static void main(String[] args) {
        // Example of char
        char singleCharacter = 'A';
        System.out.println("Char Example:");
        System.out.println("Value of singleCharacter: " + singleCharacter);
        System.out.println("Size of char: 2 bytes (16 bits)");
        
        String text = "Hello, World!";
        System.out.println("\nString Example:");
        System.out.println("Value of text: " + text);
        System.out.println("Length of text: " + text.length());
        
        System.out.println("\nKey Differences:");
        System.out.println("1. 'char' is a single character, while 'String' is a sequence of characters.");
        System.out.println("2. 'char' uses single quotes ('A'), while 'String' uses double quotes (\"Hello\").");
        System.out.println("3. 'String' has built-in methods like length(), charAt(), etc., while 'char' does not.");
    }
}
