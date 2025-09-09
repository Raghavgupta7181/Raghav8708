public class level3assignment1answer11 {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Please provide month, day, and year as command line arguments.");
            return;
        }

        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        // Adjust months and year for Jan and Feb
        if (m == 1 || m == 2) {
            m += 12;
            y -= 1;
        }

        int K = y % 100;
        int J = y / 100;

        int h = (d + (13 * (m + 1)) / 5 + K + (K / 4) + (J / 4) + 5 * J) % 7;

        // h = 0 means Saturday, but we want 0 = Sunday, 1 = Monday, etc.
        // So, convert:
        int dayOfWeek = (h + 6) % 7;

        System.out.println(dayOfWeek);
    }
}
