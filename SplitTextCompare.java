import java.util.Arrays;
import java.util.Scanner;

public class SplitTextCompare {
    public static int getLength(String s) {
        int c = 0;
        try {
            while (true) { s.charAt(c); c++; }
        } catch (IndexOutOfBoundsException e) {}
        return c;
    }

    public static String[] customSplit(String text) {
        int n = getLength(text);
        if (n == 0) return new String[0];
        // count words
        int words = 1;
        for (int i = 0; i < n; i++) if (text.charAt(i) == ' ') words++;
        String[] arr = new String[words];
        int idx = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                arr[idx++] = sb.toString();
                sb.setLength(0);
            } else sb.append(ch);
        }
        arr[idx] = sb.toString();
        return arr;
    }

    public static boolean compareArrays(String[] a, String[] b) {
        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String text = sc.nextLine();
        String[] custom = customSplit(text);
        String[] builtin = text.split(" ");
        System.out.println("Custom split: " + Arrays.toString(custom));
        System.out.println("Built-in split: " + Arrays.toString(builtin));
        System.out.println("Equal? " + compareArrays(custom, builtin));
        sc.close();
    }
}
