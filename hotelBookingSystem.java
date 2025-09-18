import java.util.Scanner;

class HotelBooking{
    Scanner input=new Scanner(System.in);
    String guestName="";
    String roomType="";
    int nights=0;

    HotelBooking(){
        System.out.println("\nEnter hotel booking details :\n");
        System.out.print("Enter the name of guest : ");
        guestName=input.next();
        System.out.println("\n\nRoom types available : \n1. Single \n2. Double \n3. Large\n4. Luxury\n");
        System.out.print("Enter an option number : ");
        int opt=input.nextInt();
        switch(opt){
            case 1:
                roomType="Single";
                break;
            case 2:
                roomType="Double";
                break;
            case 3:
                roomType="Large";
                break;
            case 4:
                roomType="Luxury";
                break;
            default:
                System.out.println("\nSorry, invalid option number.");
        }
        System.out.print("Enter the number of nights stayed (days) : ");
        nights=input.nextInt();
    }

    HotelBooking(String guestName,String roomType,int nights){
        this.guestName=guestName;
        this.roomType=roomType;
        this.nights=nights;
    }

    HotelBooking(HotelBooking room){
        this.guestName=room.guestName;
        this.roomType=room.roomType;
        this.nights=room.nights;
    }

    void show(){
        System.out.println("\n\nHotel room details :\n");
        System.out.println("Name of the guest : "+guestName);
        System.out.println("Type of the room : "+roomType);
        System.out.println("Number of nights stayed : "+nights+" days");
    }
}

public class hotelBookingSystem{
 public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);


     while(1>0){
        System.out.println("\n\nHotel booking using default constructor :\n");
        HotelBooking obj=new HotelBooking();
        obj.show();
        System.out.print("\nEnter 1 to continue : ");
        int cont=scan.nextInt();
        if (cont!=1){break;}
     }

     while(1>0){
        System.out.println("\n\nHotel booking using parameterized constructor :\n");
        System.out.println("\nEnter hotel booking details :\n");
        System.out.print("Enter the name of guest : ");
        String guestName=scan.next();
        System.out.println("\n\nRoom types available : \n1. Single \n2. Double \n3. Large\n4. Luxury\n");
        System.out.print("Enter an option number : ");
        int opt=scan.nextInt();
        String roomType="";
        switch(opt){
            case 1:
                roomType="Single";
                break;
            case 2:
                roomType="Double";
                break;
            case 3:
                roomType="Large";
                break;
            case 4:
                roomType="Luxury";
                break;
            default:
                System.out.println("\nSorry, invalid option number.");
        }
        System.out.print("Enter the number of nights stayed (days) : ");
        int nights=scan.nextInt();

        HotelBooking obj=new HotelBooking(guestName,roomType,nights);
        obj.show();
        System.out.print("\nEnter 1 to continue : ");
        int cont=scan.nextInt();
        if (cont!=1){break;}
     }

     while(1>0){
        System.out.println("\n\nHotel booking using copy constructor :\n");
        HotelBooking obj1=new HotelBooking();
        obj1.show();
        System.out.println("\nCopy of the previous booking :\n");
        HotelBooking obj2=new HotelBooking(obj1);
        obj2.show();
        System.out.print("\nEnter 1 to continue : ");
        int cont=scan.nextInt();
        if (cont!=1){break;}
     }
 }
}