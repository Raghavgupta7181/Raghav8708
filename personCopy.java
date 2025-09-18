import java.util.Scanner;
class Person{
    Scanner input =new Scanner(System.in);
    double height;
    double weight;
    int age;
    String gender;
    String name;

    Person(){
      System.out.println("\nEnter person's attributes :\n");
        System.out.print("Enter person's name : ");
        name=input.next();
        System.out.print("Enter person's gender : ");
        gender=input.next();
        System.out.print("Enter person's age : ");
        age=input.nextInt();
        System.out.print("Enter person's height : ");
        height=input.nextDouble();
        System.out.print("Enter person's weight : ");
        weight=input.nextDouble();
    
    }

    Person(Person individual){
        this.name=individual.name;
        this.gender=individual.gender;
        this.age=individual.age;
        this.height=individual.height;
        this.weight=individual.weight;
    }
    
    void display(){
        System.out.println("\n\nPerson's attributes :\n");
        System.out.println("Person's name : "+name);
        System.out.println("Person's gender : "+gender);
        System.out.println("Person's age : "+age+" years");
        System.out.println("Person's height : "+height+" cms");
        System.out.println("Person's weight : "+weight+" kgs");
    }
}
public class personCopy{
   public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    while (1>0){
        Person indv1=new Person();
        indv1.display();
        Person indv2=new Person(indv1);
        System.out.print("\n\nCreating copy of first person :\n");
        indv2.display();
        System.out.print("\n\nEnter 1 to continue : ");
        int cont=scan.nextInt();
        if (cont!=1){break;}
      }
        
   }
}