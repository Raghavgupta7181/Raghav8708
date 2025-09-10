// Utility class collecting many static methods for number checks.
public class NumberCheckerUtils {
    public static int countDigits(int n){
        if(n==0) return 1;
        n = Math.abs(n); int c=0; while(n>0){ c++; n/=10; } return c;
    }
    public static int[] digitsArray(int n){
        n = Math.abs(n);
        int c = countDigits(n);
        int[] d = new int[c];
        for(int i=c-1;i>=0;i--){ d[i]=n%10; n/=10; }
        return d;
    }
    public static boolean isPalindrome(int n){
        int[] d = digitsArray(n);
        for(int i=0;i<d.length/2;i++) if(d[i]!=d[d.length-1-i]) return false;
        return true;
    }
    // add more helper methods as needed
    public static void main(String[] args){
        System.out.println("Digits of 204: ");
        int[] d = digitsArray(204);
        for(int v: d) System.out.print(v+" ");
        System.out.println("\nIs 1221 palindrome? "+isPalindrome(1221));
    }
}
