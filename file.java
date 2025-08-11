import java.io.*;
public class file {
    public static void main(String[]args)
    {
        try
        {
            File vais  = new File("jaishreeganesh.txt");
            if(vais.createNewFile())
            {
                System.out.println("\n\t\tFile Created"+vais.getName());
            }
            else
            {
                System.out.println("\n\t\tError:= File Already Exist");
            }
        }
        catch (IOException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}