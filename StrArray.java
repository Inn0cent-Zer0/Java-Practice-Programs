import java.util.Scanner;

public class StrArray {
    public static void main(String[]args)
    {
        int size;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the size of the string array");
        size= scanner.nextInt();
        String [] array= new String[size];
        System.out.println("Enter the " +size+"  elements ");
        for(int i=0;i<array.length;i++)
        {
            array[i]= scanner.nextLine();
        }
        System.out.print("{");
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]);
            System.out.print(",");
        }
        System.out.print("}");
    }

}