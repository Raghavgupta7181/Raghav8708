import java.util.Arrays;

/**
 * A program to find the largest and smallest elements in an array.
 */
public class largestsmalllest {

    public static void main(String[] args) {
        // Sample array of integers
        int[] numbers = {10, 5, 20, 15, 8, 30, 2};

        // Initialize largest and smallest with the first element of the array
        int largest = numbers[0];
        int smallest = numbers[0];

        // Iterate through the array starting from the second element
        for (int i = 1; i < numbers.length; i++) {
            // Check if the current element is larger than the current largest
            if (numbers[i] > largest) {
                largest = numbers[i];
            }

            // Check if the current element is smaller than the current smallest
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        // Print the original array and the results
        System.out.println("Original array: " + Arrays.toString(numbers));
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
    }
}
