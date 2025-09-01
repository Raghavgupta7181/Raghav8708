//Write a program to print default values of instance variables in a class
public class question7 {
    int intValue;
    float floatValue;
    double doubleValue;
    boolean booleanValue;
    char charValue;
    String stringValue;

    public static void main(String[] args) {
        DefaultValues obj = new DefaultValues();

        System.out.println("Default values of instance variables:");
        System.out.println("int: " + obj.intValue);
        System.out.println("float: " + obj.floatValue);
        System.out.println("double: " + obj.doubleValue);
        System.out.println("boolean: " + obj.booleanValue);
        System.out.println("char: [" + obj.charValue + "]");
        System.out.println("String: " + obj.stringValue);
    }
}
