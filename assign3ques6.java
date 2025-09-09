public class assign3ques6 {

    public static void main(String[] args) {
        // Widening Conversion (int to double)
        int myInt = 9;
        double myDouble = myInt; // Automatic conversion
        System.out.println("Original int value: " + myInt);
        System.out.println("Widened double value: " + myDouble);

        System.out.println("\n--------------------------\n");

        // Narrowing Conversion (double to int)
        double largeDouble = 9.99;
        int narrowInt = (int) largeDouble; // Explicit casting
        System.out.println("Original double value: " + largeDouble);
        System.out.println("Narrowed int value: " + narrowInt);
    }
}