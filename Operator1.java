public class Operator1 {
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        System.out.println("\nRelational Operators:");
        System.out.println("a > b: " + (a > b)); 
        System.out.println("a < b: " + (a < b)); 
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b)); 

        
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x AND y: " + (x && y));
        System.out.println("x OR y: " + (x || y));
        System.out.println("NOT x: " + (!x));

        System.out.println("\nAssignment Operators:");
        int c = 15;
        System.out.println("Initial value of c: " + c);
        c += 5;
        System.out.println("After c += 5: " + c);
        c *= 2;
        System.out.println("After c *= 2: " + c);
    }
}

