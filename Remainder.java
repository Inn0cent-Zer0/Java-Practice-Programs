import java.util.Scanner;
public class Remainder {
    public static void main(String[]args)
    {
        int num1,num2;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the value of first integer       :    ");
        num1= scanner.nextInt();
        System.out.print("Enter the value of second integer      :    ");
        num2= scanner.nextInt();
        if(num1%num2==0)
        {
            System.out.println("The number "+num1+" is a multiple of the number "+num2);
        }
        else
        {
            System.out.println("The number "+num1+" is not  a multiple of the number "+num2);
        }
    }
}