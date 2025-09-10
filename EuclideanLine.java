public class EuclideanLine {
    public static double distance(double x1,double y1,double x2,double y2){
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }
    // returns {slope, intercept}. If vertical line, slope = Double.POSITIVE_INFINITY and intercept = x-intercept stored in second element
    public static double[] lineEquation(double x1,double y1,double x2,double y2){
        if(x1==x2){
            return new double[]{Double.POSITIVE_INFINITY, x1}; // vertical line x = intercept
        }
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m*x1;
        return new double[]{m,b};
    }
    public static void main(String[] args){
        double x1=1, y1=2, x2=4, y2=6;
        System.out.printf("Distance between (%.1f,%.1f) and (%.1f,%.1f) = %.3f%n", x1,y1,x2,y2, distance(x1,y1,x2,y2));
        double[] eq = lineEquation(x1,y1,x2,y2);
        if(Double.isInfinite(eq[0])) System.out.println("Line is vertical: x = "+eq[1]);
        else System.out.printf("Line: y = %.3f x + %.3f%n", eq[0], eq[1]);
    }
}
