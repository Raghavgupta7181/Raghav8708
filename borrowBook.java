import java.util.Scanner;

class Book{
    Scanner scan=new Scanner(System.in);
  String author;
  String title;
  double price;
  boolean availibility=true;
  Book(){
        System.out.println("\n\nEnter Book details : ");
        System.out.print("\nEnter book title : ");
        title=scan.next();
        System.out.print("Enter book author : ");
        author=scan.next();
        System.out.print("Enter book price : ");
        price=scan.nextDouble();
  }

  void display(){
    System.out.println("\nBook details :\n");
    System.out.print("Book title : "+title);
    System.out.print("\nBook author : "+author);
    System.out.print("\nBook price : Rs. "+price+"\n");
    System.out.print("\nBook availibility : "+availibility+"\n");
  }

  void borrowBook(){
       if (availibility){
        availibility=false;
       System.out.println("\n\""+title+"\" by "+author+" has been borrowed and isn't available anymore.");
       }
       else {
        System.out.println("\n\""+title+"\" by "+author+" is already borrowed and isn't available.");
       }
  }
}

public class borrowBook{
  public static void main(String[] args) {
      Scanner inpt=new Scanner(System.in);
      while (1>0){
        Book book1=new Book();
        book1.display();
        book1.borrowBook();

        Book book2=new Book();
        book2.display();
        book2.borrowBook();
        System.out.println("\n\nBorrowing an unavailable book :\n");
        book2.borrowBook();

        System.out.print("\n\nEnter 1 to continue : ");
        int cont=inpt.nextInt();
        if (cont!=1){break;}
      }
  }
}