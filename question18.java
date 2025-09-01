//Write a program to demonstrate numeric overflow in Java
public class question18 {
    public static void main(String[] args) {
        
        int maxInt = Integer.MAX_VALUE;
        System.out.println("Maximum Integer Value: " + maxInt);

        
        int overflowedValue = maxInt + 1;
        System.out.println("After Overflow (maxInt + 1): " + overflowedValue);

        
        int minInt = Integer.MIN_VALUE;
        System.out.println("Minimum Integer Value: " + minInt);

        
        int underflowedValue = minInt - 1;
        System.out.println("After Underflow (minInt - 1): " + underflowedValue);
    }
}
