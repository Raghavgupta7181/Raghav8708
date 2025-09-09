public class assign3ques5 {

    public static void main(String[] args) {
        // Expression to evaluate: 10 + 5 * 2 - 12 / 3
        
        // Manual Calculation (Multiplication and Division first)
        // 10 + (5 * 2) - (12 / 3)
        // 10 + 10 - 4
        // 20 - 4
        // 16

        // Programmatic calculation using variables
        int num1 = 10;
        int num2 = 5;
        int num3 = 2;
        int num4 = 12;
        int num5 = 3;

        int result = num1 + num2 * num3 - num4 / num5;

        // Print the result
        System.out.println("The result of the expression is: " + result);
    }
}