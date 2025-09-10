import java.util.ArrayList;
public class NumberFactors {
    public static int[] factors(int n){
        n = Math.abs(n);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++) if(n%i==0) list.add(i);
        return list.stream().mapToInt(i->i).toArray();
    }
    public static int greatestFactor(int n){
        int[] f = factors(n);
        return f.length==0?1:f[f.length-1];
    }
    public static int sumFactors(int n){
        int[] f = factors(n); int s=0; for(int v:f) s+=v; return s;
    }
    public static long productFactors(int n){
        int[] f = factors(n); long p=1; for(int v:f) p*=v; return p;
    }
    public static long productCubesOfFactors(int n){
        int[] f = factors(n); long p=1; for(int v:f) p *= (long)v*v*v; return p;
    }
    public static void main(String[] args){
        int n = 12;
        System.out.println("Factors of "+n+": ");
        for(int v: factors(n)) System.out.print(v+" ");
        System.out.println();
        System.out.println("Greatest factor: "+greatestFactor(n));
        System.out.println("Sum of factors: "+sumFactors(n));
        System.out.println("Product of factors: "+productFactors(n));
        System.out.println("Product of cubes of factors: "+productCubesOfFactors(n));
    }
}
