import java.io.*;
public class writefile {
    public static void main(String[] args) throws IOException {
        try {
            FileWriter venkata = new FileWriter("jaishreeganesh.txt");
            for (int i = 1; i <= 100; i++) {
                venkata.write(" Jai Shree Ganesh\n ");
            }
            for (int i = 1; i <= 100; i++) {
                venkata.append(" Jai Shree Ram \n");
            }
            venkata.close();

            System.out.println("\n\t\t Wrote to the File Successfully...");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}