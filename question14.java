//Write a program to use wrapper class methods to convert numbers to binary and hexadecimal
public class question14 {
    public static void main(String[] args) {
        
        int number = 42;

        String binary = Integer.toBinaryString(number);
        System.out.println("Binary representation of " + number + " is: " + binary);

        String hexadecimal = Integer.toHexString(number);
        System.out.println("Hexadecimal representation of " + number + " is: " + hexadecimal);
    }
}
