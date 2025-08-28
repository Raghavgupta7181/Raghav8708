import java.util.Scanner;
class problem5{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=scan.nextInt();
        System.out.println("Enter second number");
        int num2=scan.nextInt();
        int product=num1;
        for(int i=0;i<num2-1;i++){
            product+=num1;
        }
        System.out.println("multiple is =" +product);
    }
}