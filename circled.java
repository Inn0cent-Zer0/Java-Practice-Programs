import java.util.Scanner;
import java.lang.Math;
public class circled {
    public static void main(String[]args)
    {
        double Radius,Circumference,Area,Diameter ;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the radius value of the circle");
        Radius= scanner.nextInt();
        Diameter=2*Radius;
        Circumference=2*Math.PI*Radius;
        Area=Math.PI*Math.pow(Radius,2);
        System.out.println("\n\t\t=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=Area of the circle=/=/=/=/=/=/=/=/=/=/=/=/=/=/= ");
        System.out.printf("\tThe Radius of the given circle           = %.2f\n",Radius);
        System.out.printf("\tThe Diameter of the given circle         = %.2f \n",Diameter) ;
        System.out.printf("\tThe Circumference of the given circle    = %.2f\n",Circumference);
        System.out.printf("\tThe Area of the given circle             = %.2f\n",Area);

    }
}