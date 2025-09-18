import java.util.Scanner;

class Employee{
    Scanner input=new Scanner(System.in);
    public String employeeId;
    protected String department;
    private double salary;
    Employee(){
        System.out.println("\n\nEnter employee details :\n");
        System.out.print("Enter employee ID : ");
        employeeId=input.next();
        System.out.print("Enter employee department : ");
        department=input.next();
        System.out.print("Enter employee salary (Rs.) : ");
        salary=input.nextDouble();
    }
    public void salaryUpdate(){
        System.out.print("\nCurrent employee salary : Rs. "+salary);
         System.out.print("\n\nEnter updated employee salary : ");
         salary=input.nextDouble();
         System.out.print("\nUpdated employee salary : Rs. "+salary);
    }
}

class  Manager extends Employee{
    void manage(){
        System.out.println("\nEmployee ID : "+employeeId);
        System.out.println("Employee department : "+department);
    }
}
public class employeeRecords{
    public static void main(String[] args) {
        Manager bank =new Manager();
        bank.salaryUpdate();
        bank.manage();
        
    }
}