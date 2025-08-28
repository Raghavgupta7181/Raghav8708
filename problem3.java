import java.util.Scanner;
public class problem3 {
    public static void main(String[] args) {
        Scanner Scan= new Scanner (System.in);
        System.err.println("Enter first value");
        int num1=Scan.nextInt();
        System.out.println("Enter second value");
        int num2= Scan.nextInt();
        num1=num1+num2;
        num2=num1-num2;
        num1-=num2;
        System.out.println("Values after swapping");
        System.out.println("num1="+num1);
        System.out.println("num2="+num2);

        
    }
}
