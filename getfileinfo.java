import java.io.*;
public class getfileinfo {
    public static void main(String[] args) throws IOException {
            File venkata = new File("jaishreeganesh.txt");
            if (venkata.exists()) {
                System.out.println("\n\t\t _+_+_+_+_+_+_+//Get File Information//+_+_+_+_+_+_+");
                System.out.println("File Name :=                               "+venkata.getName());
                System.out.println("File Location or Path :=                   "+venkata.getAbsolutePath());
                System.out.println(" is the File is in Writable Condtion:=     "+venkata.canWrite());
                System.out.println(" is the File is in Readable Condtion:=     "+venkata.canRead());
                System.out.println("is the File is in Executable Condtion:     "+venkata.canExecute());
                System.out.println(" Total Size of the File in Bytes :=        "+venkata.length());
            }
            else
            {
            System.out.println("\n\t\tError:= Unable to Find the File !...");
           }
    }
}
