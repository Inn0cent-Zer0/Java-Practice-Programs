import java.util.Scanner;
public class Number {
    public static void main(String[]args)
    {
        Scanner scanner= new Scanner(System.in);
        int number,d;
        System.out.println("Enter a five digit number   :");
        number= scanner.nextInt();
        while(number!=0)
        {
            d=number%10;
            number=number/10;
            System.out.print(number);
        }
    }
}