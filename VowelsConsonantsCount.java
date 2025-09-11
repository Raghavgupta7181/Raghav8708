import java.util.Scanner;

public class VowelsConsonantsCount {
    public static String charType(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
        if (c >= 'a' && c <= 'z') {
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') return "Vowel";
            else return "Consonant";
        }
        return "NotLetter";
    }

    public static int[] count(String text) {
        int v=0, con=0;
        for (int i=0;i<text.length();i++) {
            String t = charType(text.charAt(i));
            if (t.equals("Vowel")) v++;
            else if (t.equals("Consonant")) con++;
        }
        return new int[]{v, con};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        int[] res = count(text);
        System.out.println("Vowels: " + res[0]);
        System.out.println("Consonants: " + res[1]);
        sc.close();
    }
}
