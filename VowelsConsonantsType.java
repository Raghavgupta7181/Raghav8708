import java.util.Scanner;

public class VowelsConsonantsType {
    public static String charType(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
        if (c >= 'a' && c <= 'z') {
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }

    public static String[][] classify(String text) {
        String[][] res = new String[text.length()][2];
        for (int i=0;i<text.length();i++) {
            res[i][0] = String.valueOf(text.charAt(i));
            res[i][1] = charType(text.charAt(i));
        }
        return res;
    }

    public static void display(String[][] arr) {
        System.out.println("Char\tType");
        for (String[] r : arr) System.out.println(r[0] + "\t" + r[1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[][] out = classify(text);
        display(out);
        sc.close();
    }
}
