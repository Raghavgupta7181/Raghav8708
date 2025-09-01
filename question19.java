//Write a program to check if a long value can be stored in a float variable and display the result
public class question19 {
    public static void main(String[] args) {
        long longValue = 123456789012345L;

        float floatValue = (float) longValue;

        if (longValue == (long) floatValue) {
            System.out.println("The long value " + longValue + " can be safely stored in a float variable.");
        } else {
            System.out.println("The long value " + longValue + " cannot be safely stored in a float variable.");
        }
    }
}

