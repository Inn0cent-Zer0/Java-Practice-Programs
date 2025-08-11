import java.io.*;
import java.util.Scanner;
public class SwimPool {

    static PrintWriter screen = new PrintWriter(System.out,true);
    public static void main(String[]args) throws IOException {
        // Declare the size of the pool using float
        float Width,Length,Depth;
        // Declare the capacity and volume
        float Volume, Capacity;
        // Declare the time taken to fill the pool
        float Time, Rate_of_flow;
        Scanner scan = new Scanner(System.in);
        // Getting User Inputs
        System.out.println("\n\t------//Enter The Details Asked Below //-------");
        screen.println("Enter the Length of The Swimming pool:");
        screen.flush();
        Length = scan.nextFloat();
        screen.println("Enter the Height of The Swimming pool:");
        screen.flush();
        Width = scan.nextFloat();
        screen.println("Enter the Depth of The Swimming pool:");
        screen.flush();
       Depth = scan.nextFloat();
        screen.println("Enter the Capacity of The Swimming pool:");
        screen.flush();
        Capacity = scan.nextFloat();
        screen.println("Enter the Capacity of The Swimming pool:");
        screen.flush();
       // Computations for the Program
        Rate_of_flow = scan.nextFloat();
        Volume = Length * Width * Depth;
        Capacity = Volume * Capacity;
        Time = Capacity / (Rate_of_flow * 60);
        // Display The Output
        System.out.println("\n\t------//Time Taken to Fill a Swimming Pool//-------");
        System.out.println("\n\tThe Volume of The Swimming Pool                :"+Volume+"Cubic Feet");
        System.out.println("\n\tThe Capacity of the Swimming Pool              :"+Capacity+"Gallons");
        System.out.println("\n\tTHe Time taken to fill the Swimming Pool       : "+Time+"hours");

    }

}