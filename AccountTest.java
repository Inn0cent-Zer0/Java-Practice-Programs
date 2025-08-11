import java.util.Scanner;
public class AccountTest {
    public static void main(String[]args)
    {
       double initial, initial2;
       Scanner scanner= new Scanner(System.in);
       System.out.println("Enter the initial amount of rupees for the first account");
       initial= scanner.nextDouble();
        Account account1= new Account(initial);
       System.out.println("Enter the initial amount of rupees for the second account");
       initial2= scanner.nextDouble();
        Account account2= new Account(initial2);
        System.out.println("The initial balance of the first account is  "+account1.getBalance());
        System.out.println("The initial balance of the second account is  "+account2.getBalance());
        double DepositAmount1, DepositAmount2;
        System.out.println("Enter the deposit amount for account 1");
        DepositAmount1= scanner.nextDouble();
        System.out.println("Enter the deposit amount for account 2");
        DepositAmount2= scanner.nextDouble();
        account1.credit(DepositAmount1);
        account2.credit(DepositAmount2);
        System.out.println("The  balance of the first account is  "+account1.getBalance());
        System.out.println("The  balance of the second account is  "+account2.getBalance());
    }
}