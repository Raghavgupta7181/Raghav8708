import java.util.Scanner;

public class ShortestLongestWord {
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

    public static String[] wordsWithLengths(String[] words) {
        String[][] tmp = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            tmp[i][0] = words[i];
            tmp[i][1] = String.valueOf(getLength(words[i]));
        }
        String shortest = words[0], longest = words[0];
        for (String w : words) {
            if (getLength(w) < getLength(shortest)) shortest = w;
            if (getLength(w) > getLength(longest)) longest = w;
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();
        String[] words = customSplit(input);
        String[] res = wordsWithLengths(words);
        System.out.println("Shortest: " + res[0]);
        System.out.println("Longest: " + res[1]);
        sc.close();
    }
}
