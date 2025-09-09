public class Level1ans5 {

    /**
     * The main method is the entry point of the program.
     * It defines the total number of pens and students, calculates
     * the number of pens per student and the remainder, and then
     * prints the results.
     */
    public static void main(String[] args) {

        // Define the total number of pens and students.
        int totalPens = 14;
        int numberOfStudents = 3;

        // Use the division operator (/) to find the number of pens each student gets.
        // Integer division automatically discards the fractional part.
        int pensPerStudent = totalPens / numberOfStudents;

        // Use the modulus operator (%) to find the remaining pens.
        int remainingPens = totalPens % numberOfStudents;

        // Use a single print statement to display the required output.
        // The format specifiers %d are used for integer values.
        String output = String.format(
            "The Pen Per Student is %d and the remaining pen not distributed is %d",
            pensPerStudent, remainingPens
        );
        System.out.println(output);
    }
}
