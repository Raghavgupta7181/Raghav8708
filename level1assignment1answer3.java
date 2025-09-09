import java.util.Scanner;

public class level1assignment1answer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        
        boolean firstLargest = n1 >= n2 && n1 >= n3;
        boolean secondLargest = n2 >= n1 && n2 >= n3;
        boolean thirdLargest = n3 >= n1 && n3 >= n2;
        
        System.out.println("Is the first number the largest? " + firstLargest);
        System.out.println("Is the second number the largest? " + secondLargest);
        System.out.println("Is the third number the largest? " + thirdLargest);
    }
}
