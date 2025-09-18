import java.util.Scanner;

class Book{
    Scanner scan=new Scanner(System.in);
  String author;
  String title;
  double price;
  Book(){
        System.out.println("\n\nEnter Book details : ");
        System.out.print("\nEnter book title : ");
        title=scan.next();
        System.out.print("Enter book author : ");
        author=scan.next();
        System.out.print("Enter book price : ");
        price=scan.nextDouble();
  }

  Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
  }
  void display(){
    System.out.println("\n\nBook details :\n");
    System.out.print("\nBook title : "+title);
    System.out.print("\nBook author : "+author);
    System.out.print("\nBook price : Rs. "+price+"\n");
  }
}

public class bookConstructor{
  public static void main(String[] args) {
      Scanner inpt=new Scanner(System.in);
      System.out.println("\nCreating book-object using default constructor :\n");
      while (1>0){
        Book book=new Book();
        book.display();

        System.out.print("\n\nEnter 1 to continue : ");
        int cont=inpt.nextInt();
        if (cont!=1){break;}
      }

      System.out.println("\nCreating book-object using parameterized constructor :\n");
      while (1>0){
        
        
        System.out.println("\n\nEnter Book details : ");
        System.out.print("\nEnter book title : ");
        String t=inpt.next();
        System.out.print("Enter book author : ");
        String a=inpt.next();
        System.out.print("Enter book price : ");
        Double p=inpt.nextDouble();
        Book book=new Book(t,a,p);

        book.display();

        System.out.print("\n\nEnter 1 to continue : ");
        int cont=inpt.nextInt();
        if (cont!=1){break;}
      }
  }
}