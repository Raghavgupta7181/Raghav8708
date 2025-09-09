public class Level1ans2 {

    /**
     * The main method is the entry point of the program.
     * It holds the marks for Maths, Physics, and Chemistry,
     * calculates the average, and prints the result.
     */
    public static void main(String[] args) {

        // Define the marks for each subject.
        int mathsMark = 94;
        int physicsMark = 95;
        int chemistryMark = 96;

        // Calculate the sum of the marks.
        int totalMarks = mathsMark + physicsMark + chemistryMark;

        // Define the number of subjects.
        int numberOfSubjects = 3;

        // Calculate the average mark. Using a double for a more precise result
        // is good practice, but since the output format expects an integer, we can cast.
        double averageMark = (double) totalMarks / numberOfSubjects;

        // Print the result in the specified format.
        // We use Math.round to get a whole number as per the output format.
        System.out.println("Sam's average mark in PCM is " + Math.round(averageMark));
    }
}