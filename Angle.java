import java.util.Scanner;
import java.lang.Math;
public class Angle {
    public static void main(String[]args)
    {
        double Double,Radian;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the value     :");
        Double=scanner.nextDouble();
        if(Double>0) {
            Radian = Double * Math.PI / 180;
            System.out.println("The Cosine          :" + Math.cos(Radian));
            System.out.println("The Sine            :" + Math.sin(Radian));
            System.out.println("The Tangent         :" + Math.tan(Radian));
        }
        else
        {
           System.out.println("Enter a valid angle in degrees");
        }

    }
}