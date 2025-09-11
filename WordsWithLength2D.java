import java.util.Scanner;

public class WordsWithLength2D {
    public static int getLength(String s) {
        int c = 0;
        try { while (true) { s.charAt(c); c++; } } catch (IndexOutOfBoundsException e) {}
        return c;
    }

    public static String[] customSplit(String text) {
        int n = getLength(text);
        if (n == 0) return new String[0];
        int words = 1;
        for (int i = 0; i < n; i++) if (text.charAt(i) == ' ') words++;
        String[] arr = new String[words];
        int idx = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char ch = text.charAt(i);
            if (ch == ' ') { arr[idx++] = sb.toString(); sb.setLength(0); }
            else sb.append(ch);
        }
        arr[idx] = sb.toString();
        return arr;
    }

    public static String[][] wordsWithLengths(String[] words) {
        String[][] res = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            res[i][0] = words[i];
            res[i][1] = String.valueOf(getLength(words[i]));
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String text = sc.nextLine();
        String[] words = customSplit(text);
        String[][] table = wordsWithLengths(words);
        System.out.println("Word\tLength");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }
        sc.close();
    }
}
