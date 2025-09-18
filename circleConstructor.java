import java.util.Scanner;
class circle{
    Scanner input =new Scanner(System.in);
    double radius;
    final double pi=3.14;
    double area=0;
    double circm=0;
    circle(double radius){
        this.radius=radius;
        System.out.print("\n\nEnter radius of the circle : ");
        double r=input.nextDouble();
    }
    circle(){
        this(0); 
    }
    
    void calcArea(){
         area=pi*radius*radius;
    }
    void calcCircm(){
         circm=2*pi*radius;
    }
    void display(){
        System.out.println("\n\nRadius of the circle : "+radius+" cm");
        System.out.println("\nArea of the circle : "+area+" cm^2");
        System.out.println("\nCircumference of the circle : "+circm+" cm");
    }
}
public class circleConstructor{
   public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    while (1>0){
        
        circle obj=new circle();
        obj.calcArea();
        obj.calcCircm();
        obj.display();
        System.out.print("\n\nenter 1 to continue : ");
        int cont=scan.nextInt();
        if (cont!=1){break;}
      }
        
   }
}