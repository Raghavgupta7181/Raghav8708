import java.util.Scanner;

public class Level1ans16 {

    public static void main(String[] args) {
        
        // Create a Scanner object to read input from the console.
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the number of students.
        System.out.print("Enter the number of students: ");
        
        // Read the integer input from the user.
        int numberOfStudents = input.nextInt();
        
        // Check if the number of students is non-negative.
        if (numberOfStudents >= 0) {
            // Calculate the number of handshakes using the formula: n * (n - 1) / 2.
            long handshakes = (long) numberOfStudents * (numberOfStudents - 1) / 2;
            
            // Display the result.
            System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is " + handshakes + ".");
        } else {
            // Handle invalid input (negative number).
            System.out.println("Please enter a non-negative number of students.");
        }
        
        // Close the scanner to prevent resource leaks.
        input.close();
    }
}
