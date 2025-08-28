// write a program to find odd and even number using java
// to find largest number 
// swap 2 number without using 3rd variable 
// addtion of number without using operator (+)
import java.util.Scanner;
class problem{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        int num= scan.nextInt();
        if (num%2==0){
          System.out.println(num +"number is even");
        }
        else{
            System.out.println(num+"number is odd");
        }
    }
}