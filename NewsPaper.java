import java.io.*;
public class NewsPaper {
    static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter screen = new PrintWriter(System.out,true);
    public static void main(String[]args) throws IOException {
        String name1,name2,name3;
        char pr1,pr2,pr3;
        int Total,Average;
        screen.println("\n\t=========//Enter The Details of the Newspaper//========");
        screen.println("\n\t Name of the First Newspaper                :");
        screen.flush();
        name1 = keyboard.readLine();
        screen.println("\n\tEnter the Price of  "+name1+"  newspaper    :");
        pr1 = (char) keyboard.read();
        screen.println("\n\t Name of the Second Newspaper               :");
        screen.flush();
        name2 = keyboard.readLine();
        screen.println("\n\tEnter the Price of  "+name2+"  newspaper    :");
        pr2 = (char) keyboard.read();
        screen.println("\n\t Name of the Third Newspaper                :");
        screen.flush();
        name3 = keyboard.readLine();
        screen.println("\n\tEnter the Price of  "+name3+"  newspaper    :");
        pr3 = (char) keyboard.read();
        Total = (int) pr1 + (int) pr2+ (int) pr3 ;
        Average =Total/3;
        screen.println("\n\t=========//Statistics about  The Details of the Newspaper//========");
        screen.println("\n\t Name of the First Newspaper            :   " +name1);
        screen.println("\n\tPrice of  "+name1+"  newspaper          :   " +pr1+" cents");
        screen.println("\n\t Name of the Second Newspaper           :   "+name2);
        screen.println(" \n\tPrice of  "+name2+"  newspaper         :   "+pr2+" cents");
        screen.println("\n\t Name of the Third Newspaper            :   "+name3);
        screen.println("\n\tPrice of  "+name3+"  newspaper          :   "+pr3+" cents");
        screen.println(" The Total Amount                           :   "+Total);
        screen.println(" The Average Price                          :   "+Average);
    }
}