import java.util.Scanner;

public class City {
    public static void main(String[]args)
    {
        int size;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        size= scanner.nextInt();
        int []array= new int[size];
        System.out.println("Enter"+size+"Elements");
        for(int i=0;i<size;i++)
        {
            array[i]=scanner.nextInt();
        }
        System.out.println("The given array is");
        for(int i=0;i<size;i++)
        {
           System.out.print("( ");
           System.out.print(array[i]);
            System.out.print(" )\n");
        }
    }
}