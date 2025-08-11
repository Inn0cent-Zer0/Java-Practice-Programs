import java.util.Scanner;

public class Down {
    public static void main(String[]args)
    {
        int num;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the  value");
        num= scanner.nextInt();
        for(int j=num;j>0;j--)
        {

            System.out.println();
            System.out.print("[ ");
            System.out.print(j+" ");
            System.out.print(" ]");
        }
        System.out.println("\n\u0007 Bell");
    }
}