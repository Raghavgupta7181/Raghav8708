//Write a program to use var (Java 10+) for type inference
public class question17 {
    public static void main(String[] args) {
        var message = "Hello, Java 10!";
        var number = 42;                
        var decimal = 3.14;             
        var isJavaFun = true;           

        System.out.println("Message: " + message);
        System.out.println("Number: " + number);
        System.out.println("Decimal: " + decimal);
        System.out.println("Is Java fun? " + isJavaFun);

        var numbers = new int[]{1, 2, 3, 4, 5};
        for (var num : numbers) {
            System.out.println("Number in array: " + num);
        }
    }
}
