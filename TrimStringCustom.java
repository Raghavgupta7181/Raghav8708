import java.util.Scanner;

public class TrimStringCustom {
    public static int[] trimIndexes(String s) {
        int start = 0, end = s.length() - 1;
        while (start <= end && s.charAt(start) == ' ') start++;
        while (end >= start && s.charAt(end) == ' ') end--;
        return new int[]{start, end};
    }

    public static String substringCustom(String s, int start, int end) {
        if (start > end) return "";
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) sb.append(s.charAt(i));
        return sb.toString();
    }

    public static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i=0;i<a.length();i++) if (a.charAt(i)!=b.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text with leading/trailing spaces: ");
        String inp = sc.nextLine();
        int[] idx = trimIndexes(inp);
        String custom = substringCustom(inp, idx[0], idx[1]);
        String builtin = inp.trim();
        System.out.println("Custom trimmed: '" + custom + "'");
        System.out.println("Built-in trimmed: '" + builtin + "'");
        System.out.println("Equal? " + compare(custom, builtin));
        sc.close();
    }
}
