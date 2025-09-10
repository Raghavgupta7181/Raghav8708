import java.util.Random;
import java.util.Arrays;
public class FootballHeights {
    // Generates 11 random heights (150-250), finds min, max, mean
    public static int[] generateHeights(int n) {
        Random r = new Random();
        int[] h = new int[n];
        for (int i=0;i<n;i++) h[i] = 150 + r.nextInt(101); // 150..250
        return h;
    }
    public static int sum(int[] arr){
        int s=0; for(int v:arr) s+=v; return s;
    }
    public static double mean(int[] arr){ return (double)sum(arr)/arr.length; }
    public static int min(int[] arr){ int m=arr[0]; for(int v:arr) if(v<m)m=v; return m;}
    public static int max(int[] arr){ int m=arr[0]; for(int v:arr) if(v>m)m=v; return m;}
    public static void main(String[] args){
        int[] heights = generateHeights(11);
        System.out.println("Heights: "+Arrays.toString(heights));
        System.out.println("Sum = "+sum(heights));
        System.out.printf("Mean = %.2f%n", mean(heights));
        System.out.println("Shortest = "+min(heights));
        System.out.println("Tallest = "+max(heights));
    }
}
