import java.io.*;
public class deletefile {
    public static void main(String[]args)
    {
        File sel = new File("filename.txt");
        if (sel.delete()) {
            System.out.println("Deleted the file: " + sel.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }

    }
}