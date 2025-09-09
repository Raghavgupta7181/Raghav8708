public class PowerCalculation {
    public static void main(String[] args) {
        double base = 2;
        int exponent = 3; 

        double result = power(base, exponent);
        System.out.println(base + " raised to the power " + exponent + " is: " + result);
    }

    public static double power(double base, int exponent) {
        return (exponent == 0) ? 1 : base * power(base, exponent - 1);
    }
}