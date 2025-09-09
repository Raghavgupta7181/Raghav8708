import java.util.Scanner;

public class leve21assignment1answer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter your years of service: ");
        int years = sc.nextInt();

        double bonus = 0;
        if (years > 5) {
            bonus = salary * 0.05;
        }

        System.out.println("Bonus amount: " + bonus);
        sc.close();
    }
}
