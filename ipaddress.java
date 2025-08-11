import java.util.*;
import java.io.*;
import java.net.*;
public class ipaddress {
    public static void main(String[]args) throws IOException
    {
        InetAddress IP = InetAddress.getLocalHost();
        System.out.println("\n\t\t|_|_||_|_|_|_|_|_|_|_| IP ADDRESS |_|_||_|_|_|_|_|_|_|_|_|_|");
        System.out.println("\n\t\tThe IP Address of this Machine is "+IP.getHostAddress());
        System.out.println("\n\t\t-----------------------------------------------------------\n");
        IP = InetAddress.getByName("www.dagdushethganpati.com");
        System.out.println("\n\t\tThe IP Address of this Dagdusheth Ganapthi Temple  is "+IP);
        System.out.println("\n\t\t--------------------------------------------------------------------------------------------\n");
        InetAddress[] ip = InetAddress.getAllByName("www.google.com");
        System.out.print("\n\t\tThe IP Address of this Google  is ");
        for (InetAddress inetAddress : ip) {
            System.out.print(inetAddress);
        }
        System.out.println("\n\t\t-----------------------------------------------------------------------------------------------------------\n");

    }
}