//Write a program to show the difference between static and instance variables
class question13 {
    
    static int staticVariable = 0;

    
    int instanceVariable = 0;

    
    void displayValues() {
        System.out.println("Static Variable: " + staticVariable);
        System.out.println("Instance Variable: " + instanceVariable);
    }
}

public class StaticVsInstance {
    public static void main(String[] args) {
        
        Example obj1 = new Example();
        obj1.staticVariable++;
        obj1.instanceVariable++;
        System.out.println("Object 1:");
        obj1.displayValues();

        Example obj2 = new Example();
        obj2.staticVariable++;
        obj2.instanceVariable++;
        System.out.println("\nObject 2:");
        obj2.displayValues();

        System.out.println("\nObject 1 (After Object 2 changes):");
        obj1.displayValues();
    }
}
