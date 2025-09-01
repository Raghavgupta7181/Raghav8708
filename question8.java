//Write a program to demonstrate implicit and explicit type casting
public class question8 {
    public static void main(String[] args) {
        int intVal = 100;
        double doubleVal = intVal;
        System.out.println("Implicit Type Casting:");
        System.out.println("Integer value: " + intVal);
        System.out.println("Converted to double: " + doubleVal);

        double originalDouble = 99.99;
        int narrowedInt = (int) originalDouble;
        System.out.println("\nExplicit Type Casting:");
        System.out.println("Double value: " + originalDouble);
        System.out.println("Converted to integer: " + narrowedInt);

        int largeInt = 130;
        byte byteVal = (byte) largeInt;
        System.out.println("\nExplicit Type Casting with Data Loss:");
        System.out.println("Integer value: " + largeInt);
        System.out.println("Converted to byte: " + byteVal);
    }
}
