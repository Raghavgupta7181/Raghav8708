Here’s a simple Java program to take a string input and print its characters one by one, stopping when a space is encountered:
Javaimport java.util.Scanner;

public class answer18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");

        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == ' ') {
                break;
            }
            System.out.println(ch);
        }

        scanner.close();
    }
}

