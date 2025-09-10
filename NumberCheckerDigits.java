import java.util.ArrayList;
import java.util.Arrays;
public class NumberCheckerDigits {
    // Methods: count digits, store digits in array, check duck, check armstrong,
    // largest & second largest, smallest & second smallest
    public static int countDigits(int n){
        n = Math.abs(n);
        if(n==0) return 1;
        int c=0; while(n>0){ c++; n/=10; } return c;
    }
    public static int[] digitsArray(int n){
        n = Math.abs(n);
        int c = countDigits(n);
        int[] d = new int[c];
        for(int i=c-1;i>=0;i--){ d[i]=n%10; n/=10; }
        return d;
    }
    public static boolean isDuck(int n){
        int[] d = digitsArray(n);
        for(int v: d) if(v!=0) return true;
        return false; // duck number defined in prompt: has a non-zero digit (this implementation returns true if any non-zero digit exists)
    }
    public static boolean isArmstrong(int n){
        int[] d = digitsArray(n);
        int p = d.length;
        int sum=0;
        for(int v:d) sum += Math.pow(v, p);
        return sum == Math.abs(n);
    }
    public static int[] largestTwo(int[] arr){
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for(int v: arr){
            if(v>first){ second=first; first=v; }
            else if(v>second && v!=first) second=v;
        }
        return new int[]{first, second==Integer.MIN_VALUE?first:second};
    }
    public static int[] smallestTwo(int[] arr){
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for(int v: arr){
            if(v<first){ second=first; first=v; }
            else if(v<second && v!=first) second=v;
        }
        return new int[]{first, second==Integer.MAX_VALUE?first:second};
    }
    public static void main(String[] args){
        int num = 153;
        System.out.println("Number: "+num);
        System.out.println("Digits count: "+countDigits(num));
        System.out.println("Digits array: "+Arrays.toString(digitsArray(num)));
        System.out.println("Is Armstrong? "+isArmstrong(num));
        System.out.println("Is Duck? "+isDuck(num));
        int[] sample = {5,9,2,9,7,1};
        System.out.println("Sample array: "+Arrays.toString(sample));
        System.out.println("Largest two: "+Arrays.toString(largestTwo(sample)));
        System.out.println("Smallest two: "+Arrays.toString(smallestTwo(sample)));
    }
}
