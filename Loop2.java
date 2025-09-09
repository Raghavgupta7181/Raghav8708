public class Loop2 {
    public static void main(String[] args) {

        // 1. WHILE loop: Print numbers 1 to 5
        System.out.println("Using WHILE loop:");
        int i = 1;
        while (i <= 5) {
            System.out.println("While Loop i = " + i);
            i++;
        }

        // 2. DO-WHILE loop: Print numbers 6 to 10
        System.out.println("\nUsing DO-WHILE loop:");
        int j = 6;
        do {
            System.out.println("Do-While Loop j = " + j);
            j++;
        } while (j <= 10);

        // 3. FOR loop: Print numbers 11 to 15
        System.out.println("\nUsing FOR loop:");
        for (int k = 11; k <= 15; k++) {
            System.out.println("For Loop k = " + k);
        }
    }
}
