import java.util.Arrays;

public class NumberChecker {

    // Method to find factors of a number
    public static int[] findFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) factors[index++] = i;
        }
        return factors;
    }

    // Method to find greatest factor (excluding the number itself)
    public static int findGreatestFactor(int[] factors, int num) {
        int greatest = 1;
        for (int f : factors) {
            if (f != num && f > greatest) {
                greatest = f;
            }
        }
        return greatest;
    }

    // Method to find sum of factors
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    // Method to find product of factors
    public static long findProductOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) product *= f;
        return product;
    }

    // Method to find product of cube of factors
    public s
