import java.io.*;
public class deletefolder {
    public static void main(String[]args)
    {
        File sel = new File("C:\\ram\\textfile\\filename.txt");
        if (sel.delete()) {
            System.out.println("Deleted the folder: " + sel.getName());
        } else {
            System.out.println("Failed to delete the folder.");
        }

    }
}