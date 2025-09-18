import java.util.Scanner;

class Product{
    Scanner input=new Scanner(System.in);
    String ProductName;
    double price;
    static int totalProducts=0;
    static double totalPrice=1;
    Product(){
        System.out.println("\n\nEnter product details : ");
        System.out.print("\nEnter product name : ");
        ProductName=input.next();
        System.out.print("Enter product price (Rs.) : ");
        price=input.nextDouble();
        totalProducts++;
        totalPrice+=price;
  }
    void displayProductDetails(){
        System.out.println("\n\nProduct details :\n");
        System.out.println("Name of the product : "+ProductName);
        System.out.println("Price of the product : Rs. "+price);
    }

    void displayTotalProducts(){
        System.out.println("\nTotal products = "+totalProducts);
        System.out.println("\nTotal products price = Rs. "+totalPrice);
    }
}

public class productInventory{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("\n\nEnter number of products : ");
        int num=scan.nextInt();
        Product[] items=new Product[num];
        System.out.println("\nEnter details of the products :\n");
        for (int i=0;i<num;i++){
            items[i]=new Product(); 
        }
        System.out.println("\nDetails of the products :\n");
        for (int i=0;i<num;i++){
            items[i].displayProductDetails();
        }
        items[0].displayTotalProducts();
    }
}