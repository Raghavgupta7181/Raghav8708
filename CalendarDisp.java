import java.util.Scanner;

public class CalendarDisp {

    /**
     * Returns the name of the month for a given month number (1-12).
     * @param month The month number (1-12).
     * @return The name of the month as a String.
     */
    public static String getMonthName(int month) {
        String[] months = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return months[month];
    }

    /**
     * Determines the number of days in a given month and year.
     * @param month The month number (1-12).
     * @param year The year.
     * @return The number of days in the specified month.
     */
    public static int getDaysInMonth(int month, int year) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (isLeapYear(year) && month == 2) {
            return 29;
        }
        return daysInMonth[month];
    }

    /**
     * Checks if a given year is a leap year.
     * @param year The year to check.
     * @return true if the year is a leap year, false otherwise.
     */
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    /**
     * Calculates the day of the week for the first day of the month
     * using the Gregorian calendar algorithm.
     * @param month The month number (1-12).
     * @param year The year.
     * @return The day of the week (0 for Sunday, 1 for Monday, ..., 6 for Saturday).
     */
    public static int getFirstDayOfMonth(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        // The algorithm gives 0 for Sunday, 1 for Monday, etc.
        int d0 = (1 + x + (31 * m0) / 12) % 7;
        return d0;
    }

    /**
     * Displays the calendar for a given month and year.
     * @param month The month number (1-12).
     * @param year The year.
     */
    public static void displayCalendar(int month, int year) {
        // Print the header with month and year
        System.out.println("\n  " + getMonthName(month) + " " + year);
        System.out.println("  Su  Mo  Tu  We  Th  Fr  Sa");

        int firstDay = getFirstDayOfMonth(month, year);
        int daysInMonth = getDaysInMonth(month, year);

        // Print leading spaces for the first day of the month
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%4d", day);
            // Move to the next line after Saturday or at the end of the month
            if ((day + firstDay) % 7 == 0 || day == daysInMonth) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        displayCalendar(month, year);
        scanner.close();
    }
}
