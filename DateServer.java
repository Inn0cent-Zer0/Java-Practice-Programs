import java.util.*;
import java.io.*;
import java.net.*;
public class DateServer {
    public static void main(String[]args) throws IOException
    {
        try(var listener= new ServerSocket(59090))
        {
            System.out.println("Date Server is Runnning!.....");
            while(true)
            {
                try(var Socket=listener.accept())
                {
                    var out = new PrintWriter(Socket.getOutputStream());
                    out.println(new Date().toString());
                }
            }
        }
    }
}