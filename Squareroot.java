import java.util.Scanner;
import java.lang.Math;
public class Squareroot {
    public static void main(String[]args)
    {
        double Double;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number:");
        Double= scanner.nextDouble();
        if(Double<0)
        {
            System.out.println(Math.sqrt(Double)+"i");
        }
        if(Double>=0)
        {
            System.out.println(Math.sqrt(Double)+" ");
        }
    }
}