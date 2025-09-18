import java.util.Scanner;

class BankAccount{
    Scanner input=new Scanner(System.in);
    public String accountNumber;
    protected String accountHolder;
    private double balance;
    BankAccount(){
        System.out.println("\n\nEnter bank account details :\n");
        System.out.print("Enter account number : ");
        accountNumber=input.next();
        System.out.print("Enter account holder : ");
        accountHolder=input.next();
        System.out.print("Enter account balance (Rs.) : ");
        balance=input.nextDouble();
    }
    public void balanceUpdate(){
        System.out.print("\nCurrent account balance : Rs. "+balance);
         System.out.print("\n\nEnter updated balance : ");
         balance=input.nextDouble();
         System.out.print("\nUpdated account balance : Rs. "+balance);
    }
}

class  SavingsAccount extends BankAccount{
    void numberAndHolder(){
        System.out.println("\nAccount number : "+accountNumber);
        System.out.println("Account holder : "+accountHolder);
    }
}
public class bankAccountManagement{
    public static void main(String[] args) {
        SavingsAccount bank =new SavingsAccount();
        bank.balanceUpdate();
        bank.numberAndHolder();
        
    }
}