import java.util.Scanner;

class Book{
    Scanner input=new Scanner(System.in);
    public String ISBN;
    protected String title;
    private String author;
    Book(){
        System.out.println("\n\nEnter book details :\n");
        System.out.print("Enter book title : ");
        title=input.next();
        System.out.print("Enter book ISBN code : ");
        ISBN=input.next();
    }
    void setAuthor(){
         System.out.print("\n\nEnter name of the author : ");
         author=input.next();
         System.out.print("\nName of the author : "+author);
    }
}

class  EBook extends Book{
    void showName(){
        System.out.println("\n\nTitle of the book : "+title);
        System.out.println("ISBN code of the book : "+ISBN);
    }
}
public class bookLibrary{
    public static void main(String[] args) {
        EBook book=new EBook();
        book.setAuthor();
        book.showName();
        
    }
}