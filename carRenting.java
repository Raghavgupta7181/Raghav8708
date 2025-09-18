import java.util.Scanner;

class CarRental{
    Scanner input=new Scanner(System.in);
    String customerName;
    String carModel;
    int rentalDays;
    double totalCost;
    CarRental(){
        System.out.println("\nEnter car renting details :\n");
        System.out.print("Enter customer name : ");
        customerName=input.next();
        System.out.println("\n\nCar models available : \n1. Base\n2. Sports\n3. Upper\n");
        System.out.print("Enter an option number : ");
        int opt=input.nextInt();
        System.out.print("Enter number of days the car has to be rented : ");
        rentalDays=input.nextInt();
        switch(opt){
            case 1:
                carModel="Base";
                totalCost=2000*rentalDays;
                break;
            case 2:
                carModel="Sports";
                totalCost=3600*rentalDays;
                break;
            case 3:
                carModel="Upper";
                totalCost=5200*rentalDays;
                break;
            default:
                System.out.println("\nSorry, invalid option number.");
        }
    }

    void display(){
    System.out.println("\nCar rental details :\n");
    System.out.print("Customer name : "+customerName);
    System.out.print("\nCar model : "+carModel);
    System.out.print("\nNumber of days to rent the car : "+rentalDays+" days");
    System.out.print("\nTotal renting cost : Rs. "+totalCost);
    }
}

public class carRenting{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(1>0){
            CarRental car=new CarRental();
            car.display();
            System.out.print("\n\nPlease enter 1 to continue : ");
            int cont=scan.nextInt();
            if (cont!=1){break;}
        }
    }
}