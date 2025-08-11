import java.util.Scanner;

public class MulDouble {
    public static void main(String[]args) throws Exception
    {
        double num1,num2;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the first value");
        num1= scanner.nextDouble();
        System.out.println("Enter the second value");
        num2= scanner.nextDouble();
        System.out.println("The Sum           is "+(num1+num2));
        System.out.println("The Product       is "+(num1*num2));
        System.out.println("The Difference    is "+(num1-num2));
        System.out.println("The Quotient      is "+(num1/num2));
        System.out.println("The Remainder     is "+(num1%num2));
    }
}