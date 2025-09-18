import java.util.Scanner;

class Vehicle{
    Scanner input=new Scanner(System.in);
    String ownerName;
    String vehicleType;
    static double registrationFee=5000;
    Vehicle(){
        System.out.println("\n\nEnter vehicle details : ");
        System.out.print("\nEnter owner name : ");
        ownerName=input.next();
        System.out.println("\n\nVehicle types available : \n1. Two wheeler\n2. Four whheler\n");
        System.out.print("Enter an option number : ");
        int opt=input.nextInt();
        switch(opt){
            case 1:
                vehicleType="Single";
                break;
            case 2:
                vehicleType="Double";
                break;
            default:
                System.out.println("\nSorry, invalid option number.");
        }
  }
    void displayVehicleDetails(){
        System.out.println("\n\nVehicle details :\n");
        System.out.println("Name of the powner : "+ownerName);
        System.out.println("Type of the vehicle : "+vehicleType);
        System.out.println("Vehicle registration fee : Rs. "+registrationFee);
    }

    void updateRegistrationFee(){
        System.out.print("\nEnter new registration fee (Rs.) : ");
        registrationFee=input.nextDouble();
        System.out.println("Updated vehicle registration fee : Rs. "+registrationFee);
    }
}

public class vehicleRegistration{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("\n\nEnter number of vehicle registrations : ");
        int num=scan.nextInt();
        Vehicle[] vehicles=new Vehicle[num];
        System.out.println("\nEnter details of the products :\n");
        for (int i=0;i<num;i++){
            vehicles[i]=new Vehicle(); 
        }
        System.out.println("\nDetails of the vehicle registrations :\n");
        for (int i=0;i<num;i++){
            vehicles[i].displayVehicleDetails();
        }
        vehicles[0].updateRegistrationFee();
        System.out.println("\nDetails of the vehicle registrations after updating registration fee :");
        for (int i=0;i<num;i++){
            vehicles[i].displayVehicleDetails();
        }
    }
}