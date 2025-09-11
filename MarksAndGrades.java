import java.util.Scanner;

public class MarksAndGrades {
    public static int[][] generateScores(int n) {
        int[][] s = new int[n][3];
        for (int i=0;i<n;i++) {
            s[i][0] = (int)(Math.random()*100); // allow 0-99; user wanted 2-digit but keep general
            s[i][1] = (int)(Math.random()*100);
            s[i][2] = (int)(Math.random()*100);
        }
        return s;
    }

    public static double[][] calculateResults(int[][] s) {
        double[][] r = new double[s.length][3]; // total, avg, percent
        for (int i=0;i<s.length;i++) {
            int total = s[i][0]+s[i][1]+s[i][2];
            double avg = total/3.0;
            double perc = Math.round((total/300.0)*10000.0)/100.0;
            r[i][0] = total; r[i][1] = avg; r[i][2] = perc;
        }
        return r;
    }

    public static String[] calculateGrades(double[][] r) {
        String[] g = new String[r.length];
        for (int i=0;i<r.length;i++) {
            double p = r[i][2];
            if (p>=90) g[i] = "A+";
            else if (p>=80) g[i] = "A";
            else if (p>=70) g[i] = "B";
            else if (p>=60) g[i] = "C";
            else g[i] = "F";
        }
        return g;
    }

    public static void display(int[][] s, double[][] r, String[] g) {
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\tPerc\tGrade");
        for (int i=0;i<s.length;i++) {
            System.out.printf("%d\t%d\t%d\t%.0f\t%.2f\t%.2f\t%s\n", s[i][0], s[i][1], s[i][2], r[i][0], r[i][1], r[i][2], g[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] scores = generateScores(n);
        double[][] results = calculateResults(scores);
        String[] grades = calculateGrades(results);
        display(scores, results, grades);
        sc.close();
    }
}
