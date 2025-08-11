import java.io.*;
import java.net.*;
import java.util.*;
public class DateServer {
    public static void main(String[]args) throws IOException
    {
      /*
      * This code creates a server socket on port 59090 and listens for incoming connections
      *  When a connection is established, the current date is sent back to the client.
      *  The program runs in an infinite loop and sends the current date for each connection.*/
        try(var listener= new ServerSocket(59090))
        {
            System.out.println("\n\t\t The Date Server is Running......");
            while(true)
            {
              try(var Socket= listener.accept())
              {
                  var out = new PrintWriter(Socket.getOutputStream(),true);
                  out.println(new Date().toString());
              }
            }
        }
    }
}