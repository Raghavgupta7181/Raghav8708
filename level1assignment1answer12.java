import java.util.Scanner;

public class level1assignment1answer12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n >= 0) {
            int sum = 0;
            int i = 1;
            while (i <= n) {
                sum += i;
                i++;
            }
            int formula = n * (n + 1) / 2;
            System.out.println("Sum using while loop: " + sum);
            System.out.println("Sum using formula: " + formula);
            System.out.println("Match? " + (sum == formula));
        } else {
            System.out.println("Not a natural number");
        }
    }
}
