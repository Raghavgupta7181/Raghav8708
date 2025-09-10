public class CollinearPoints {
    public static boolean collinearBySlope(double x1,double y1,double x2,double y2,double x3,double y3){
        double slopeAB = (y2-y1)/(x2-x1);
        double slopeBC = (y3-y2)/(x3-x2);
        double slopeAC = (y3-y1)/(x3-x1);
        // compare with tolerance
        double eps = 1e-9;
        return Math.abs(slopeAB - slopeBC) < eps && Math.abs(slopeAB - slopeAC) < eps;
    }
    public static boolean collinearByArea(double x1,double y1,double x2,double y2,double x3,double y3){
        // area = 0 => collinear
        double area = x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2);
        return Math.abs(area) < 1e-9;
    }
    public static void main(String[] args){
        // Example: A(2,4), B(4,6), C(6,8)
        System.out.println("Collinear by area? "+collinearByArea(2,4,4,6,6,8));
        System.out.println("Collinear by area? "+collinearByArea(0,0,1,1,2,2));
    }
}
