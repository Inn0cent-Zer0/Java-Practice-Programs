import java.util.Scanner;
public class Prime {
    public static void main(String[]args)
    {
        int integer;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the integer value :");
        integer= scanner.nextInt();
        boolean prime= true;
        if(integer%2!=0)
        {
            prime=true;
            System.out.println("The given number is "+ prime);
        }
        else if(integer%2==0)
        {
            prime= false;
            System.out.println("The given number is "+prime);
        }

    }
}