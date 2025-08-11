import java.util.Scanner;
import java.lang.Math;
public class Interest {
    public static void main(String[]args)
    {
      double Amount,Principal,Rate;
      int Year;
      Scanner scanner= new Scanner(System.in);
      System.out.println("Enter the Principal Amount ");
      Principal= scanner.nextDouble();
      System.out.println("Enter the Rate of Interest ");
      Rate= scanner.nextDouble();
      System.out.println("Enter the Number of Year  ");
      Year= scanner.nextInt();
      System.out.printf("%s%20s\n","Year","Amount on Deposit");
      for(int i=1;i<=Year;i++)
      {
          Amount= Principal*Math.pow(1.0+Rate,i);
          System.out.printf("%4d%,20.2f\n",i,Amount);
      }
    }
}