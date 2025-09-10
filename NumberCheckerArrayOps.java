import java.util.Arrays;
public class NumberCheckerArrayOps {
    public static int[] storeDigits(int n){
        n = Math.abs(n);
        String s = Integer.toString(n);
        int[] d = new int[s.length()];
        for(int i=0;i<s.length();i++) d[i]=s.charAt(i)-'0';
        return d;
    }
    public static int[] reverseDigitsArray(int[] arr){
        int[] r = new int[arr.length];
        for(int i=0;i<arr.length;i++) r[i]=arr[arr.length-1-i];
        return r;
    }
    public static boolean arraysEqual(int[] a, int[] b){
        return Arrays.equals(a,b);
    }
    public static boolean isPalindromeNumber(int n){
        int[] d = storeDigits(n);
        return arraysEqual(d, reverseDigitsArray(d));
    }
    public static boolean isDuck(int n){
        int[] d = storeDigits(n);
        for(int x: d) if(x==0) return true; // classic duck number: has zero digit (not leading). Here we assume input no leading zeros.
        return false;
    }
    public static void main(String[] args){
        int n = 1221;
        System.out.println("Number: "+n);
        System.out.println("Digits: "+Arrays.toString(storeDigits(n)));
        System.out.println("Reversed digits: "+Arrays.toString(reverseDigitsArray(storeDigits(n))));
        System.out.println("Is palindrome? "+isPalindromeNumber(n));
        System.out.println("Is duck? "+isDuck(1023));
    }
}
