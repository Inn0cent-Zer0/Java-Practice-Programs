import java.util.Scanner;

public class Arrival {
    public static void main(String[]args)
    {
        double Speed,Distance,Time;
        String Stop,Des;
        Scanner scanner = new Scanner(System.in);
        System.out.println("/=/=/=/=/=/=/=/=/=/=/Arrival Time/=/=/=/=/=/=/=/=/");
        System.out.println("Enter the Departure Place");
        Stop= scanner.nextLine();
        System.out.println("Enter the Arrival Place");
        Des= scanner.nextLine();
        System.out.println("Enter the Distance");
        Distance= scanner.nextDouble();
        System.out.println("Enter the  Constant Speed");
        Speed= scanner.nextDouble();
        Time=Distance/Speed;

        System.out.println("The Total Time Taken To Reach "+Des+" From "+Stop+" is "+Time+"Km/H");
    }
}