import java.io.*;
import java.util.*;
public class Readfile {
    public static void main(String[]args) throws FileNotFoundException {
        try {
            File maha = new File("jaishreeganesh.txt");

            Scanner scan = new Scanner(maha);
            while (scan.hasNextLine()) {
                String ven = scan.nextLine();
                System.out.println(ven);
            }
            scan.close();
        }

        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}