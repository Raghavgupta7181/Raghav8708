import java.util.Arrays;
import java.util.Random;
public class RandomHeightsWithMethods {
    public static int[] generateHeights(int n, int min, int max){
        Random r = new Random();
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i]=min + r.nextInt(max-min+1);
        return a;
    }
    public static int sum(int[] a){ int s=0; for(int v:a) s+=v; return s;}
    public static double mean(int[] a){ return (double)sum(a)/a.length; }
    public static int min(int[] a){ int m=a[0]; for(int v:a) if(v<m)m=v; return m;}
    public static int max(int[] a){ int m=a[0]; for(int v:a) if(v>m)m=v; return m;}
    public static void main(String[] args){
        int[] h = generateHeights(11,150,250);
        System.out.println("Heights: "+Arrays.toString(h));
        System.out.println("Min: "+min(h)+" Max: "+max(h)+" Mean: "+String.format("%.2f", mean(h)));
    }
}
