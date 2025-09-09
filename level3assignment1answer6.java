import java.util.Scanner;

public class level3assignment1answer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = Math.abs(sc.nextInt()); // Consider absolute for negative numbers

        int count = 0;
        if (number == 0) count = 1; // Edge case for 0

        while (number != 0) {
            number /= 10;
            count++;
        }

        System.out.println("Number of digits: " + count);

        sc.close();
    }
}
