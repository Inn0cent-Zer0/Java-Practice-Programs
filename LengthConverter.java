import java.util.Scanner;

public class LengthConverter {

    public static void main(String[]args)
    {
        double Double;

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number:");
        Double= scanner.nextDouble();
        double Feet= Double/3.2808399;
        double Meter= 3.2808399*Double;
        if(Double== Feet)
        {
            System.out.println(Double+"Feet(s)");
        }
        if(Double== Meter)
        {
            System.out.println(Double+"Meter(s)");
        }
    }
}