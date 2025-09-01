//Write a program to show memory allocation difference between primitive and reference variables
public class question15 {
    public static void main(String[] args) {

        int primitiveVar = 42;
        System.out.println("Primitive Variable Value: " + primitiveVar);

        String referenceVar = new String("Hello, World!");
        System.out.println("Reference Variable Value: " + referenceVar);

        System.out.println("\nModifying values...");

        int anotherPrimitiveVar = primitiveVar;
        anotherPrimitiveVar = 100;
        System.out.println("Original Primitive Variable: " + primitiveVar);
        System.out.println("Modified Primitive Variable Copy: " + anotherPrimitiveVar);

        String anotherReferenceVar = referenceVar;
        anotherReferenceVar = "New String";
        System.out.println("Original Reference Variable: " + referenceVar);
        System.out.println("Modified Reference Variable Copy: " + anotherReferenceVar);
    }
}
