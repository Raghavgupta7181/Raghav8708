import java.util.Scanner;

public class NumberArrayCheck {
    public static boolean isPositive(int n) {
        return n > 0;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int compare(int a, int b) {
        if (a > b) return 1;
        else if (a == b) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        for (int n : numbers) {
            if (isPositive(n)) {
                System.out.println(n + " is Positive and " + (isEven(n) ? "Even" : "Odd"));
            } else {
                System.out.println(n + " is Negative");
            }
        }

        int result = compare(numbers[0], numbers[numbers.length - 1]);
        if (result == 1) System.out.println("First number is greater than last number");
        else if (result == 0) System.out.println("First and last number are equal");
        else System.out.println("First number is less than last number");
    }
}