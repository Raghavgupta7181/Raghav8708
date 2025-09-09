class Rectangle {
    private double length;
    private double width;
    
    //Constructor to initialize Rectangle class
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    public double area() {
        // Area = length*width
        return length * width;
    }
    
    public double perimeter() {
        // Perimeter = 2 * (length+width)
        return 2 * (length + width);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle rect = new Rectangle(5.0, 3.0);
        
        // Display area
        System.out.println("Area: " + rect.area());
        
        // Display perimeter
        System.out.println("Perimeter: " + rect.perimeter());
    }
}