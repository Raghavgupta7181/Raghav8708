import java.util.Scanner;

public class VotingEligibility {
    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        for (int i=0;i<n;i++) ages[i] = (int)(Math.random()*90)+1;
        return ages;
    }

    public static String[][] checkVoting(int[] ages) {
        String[][] res = new String[ages.length][2];
        for (int i=0;i<ages.length;i++) {
            res[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) res[i][1] = "Invalid";
            else if (ages[i] >= 18) res[i][1] = "Can Vote";
            else res[i][1] = "Cannot Vote";
        }
        return res;
    }

    public static void display(String[][] arr) {
        System.out.println("Age\tEligibility");
        for (String[] r : arr) System.out.println(r[0] + "\t" + r[1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] ages = generateAges(n);
        String[][] res = checkVoting(ages);
        display(res);
        sc.close();
    }
}
