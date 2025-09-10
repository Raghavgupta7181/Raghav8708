import java.util.Scanner;
public class CalendarDisplay {
    // Simple calendar printer for given month and year using Zeller-like method for first day
    static String[] months = {"","January","February","March","April","May","June","July","August","September","October","November","December"};
    static int[] daysInMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
    public static boolean isLeap(int y){
        return (y%4==0 && y%100!=0) || (y%400==0);
    }
    // returns day of week 0=Sunday ...6=Saturday
    public static int firstDayOfMonth(int m, int y){
        int d = 1;
        if(m<3){
            m+=12; y-=1;
        }
        int K = y % 100;
        int J = y / 100;
        int h = (d + (13*(m+1))/5 + K + (K/4) + (J/4) + 5*J) % 7; // Zeller's congruence
        int dow = ((h + 6) % 7); // convert to 0=Sunday
        return dow;
    }
    public static void printMonth(int month, int year){
        System.out.println("     "+months[month]+" "+year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int dim = daysInMonth[month];
        if(month==2 && isLeap(year)) dim=29;
        int start = firstDayOfMonth(month, year);
        for(int i=0;i<start;i++) System.out.print("    ");
        for(int d=1; d<=dim; d++){
            System.out.printf("%3d ", d);
            if((start + d) % 7 == 0) System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args){
        // Example print for July 2005
        printMonth(7,2005);
        // Interactive (comment/uncomment as needed)
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int m = sc.nextInt();
        System.out.print("Enter year: ");
        int y = sc.nextInt();
        printMonth(m,y);
        sc.close();
        */
    }
}
