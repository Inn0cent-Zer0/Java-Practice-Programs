import java.util.Scanner;

public class Personal {
    public static void main(String[]args)
    {
        String Name;
        double Height,Weight,Inch,Pound;
        Scanner scanner= new Scanner(System.in);
        System.out.println("=/=/=/=/=/=/=/=/=/=/=/=//Enter personal details//=/=/=/=/=/=/=/=/=/=/=");
        System.out.println("Enter Name");
        Name=scanner.nextLine();
        System.out.println("Enter Height in inches");
        Height= scanner.nextDouble();
        System.out.println("Enter Weight in pounds");
        Weight= scanner.nextDouble();
        Inch=Height*2.54;
        Pound= Weight*0.04546;
        System.out.println("=/=/=/=/=/=/=/=/=/=/=/=//Personal details//=/=/=/=/=/=/=/=/=/=/=");
        System.out.println("Name         :  "+Name);
        System.out.println("Height       :  "+Inch);
        System.out.println("Weight       :  "+Pound);

    }
}