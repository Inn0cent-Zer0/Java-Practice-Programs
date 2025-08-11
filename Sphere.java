import java.util.Scanner;

public class Sphere {
    public static void main(String[]args)
    {
        double Radius,Surface_Area,Volume;
        Scanner scanner= new Scanner(System.in);
        System.out.println("=/=/=/=/=/=/=/=/=/=/=/=//Sphere//=/=/=/=/=/=/=/=/=/=/=");
        System.out.println("Enter the Radius of the Sphere");
        Radius=scanner.nextDouble();
        Surface_Area =4*(Math.PI)*(Math.pow(Radius,2));
        Volume=(Radius/3)*Surface_Area;
        System.out.println("=/=/=/=/=/=/=/=/=/=/=/=//Sphere//=/=/=/=/=/=/=/=/=/=/=");
        System.out.println("Radius        :     "+Radius);
        System.out.println("Surface Area  :     "+Surface_Area);
        System.out.println("Volume        :     "+Volume);
    }
}