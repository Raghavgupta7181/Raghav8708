public class question12 {
    public static void main(String[] args) {
        // Declare variables of different types
        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 30;
        float floatValue = 40.5f;
        double doubleValue = 50.5;

        int result1 = byteValue + shortValue;
        System.out.println("Result of byte + short (promoted to int): " + result1);

        float result2 = intValue + floatValue;
        System.out.println("Result of int + float (promoted to float): " + result2);

        double result3 = floatValue + doubleValue;
        System.out.println("Result of float + double (promoted to double): " + result3);

        double result4 = byteValue + intValue + doubleValue;
        System.out.println("Result of byte + int + double (promoted to double): " + result4);
    }
}
