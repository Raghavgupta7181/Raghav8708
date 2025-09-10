public class NumberCheckerPrimesOthers {
    public static boolean isPrime(int n){
        if(n<=1) return false;
        if(n<=3) return true;
        if(n%2==0) return false;
        for(int i=3;i*i<=n;i+=2) if(n%i==0) return false;
        return true;
    }
    public static boolean isNeon(int n){
        int sq = n*n;
        int sum=0;
        while(sq>0){ sum+=sq%10; sq/=10; }
        return sum==n;
    }
    public static boolean isSpy(int n){
        int sum=0, prod=1, t=Math.abs(n);
        if(t==0) prod=0;
        while(t>0){ int d=t%10; sum+=d; prod*=d; t/=10; }
        return sum==prod;
    }
    public static boolean isAutomorphic(int n){
        int sq = n*n;
        String s = Integer.toString(sq);
        return s.endsWith(Integer.toString(Math.abs(n)));
    }
    public static boolean isBuzz(int n){
        return n%7==0 || Math.abs(n)%10==7;
    }
    public static void main(String[] args){
        System.out.println("Prime 17? "+isPrime(17));
        System.out.println("Neon 9? "+isNeon(9));
        System.out.println("Spy 1124? "+isSpy(1124));
        System.out.println("Automorphic 5? "+isAutomorphic(5));
        System.out.println("Buzz 14 and 27? "+isBuzz(14)+" , "+isBuzz(27));
    }
}
