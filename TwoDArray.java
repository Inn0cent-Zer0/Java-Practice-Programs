import java.util.Scanner;

public class TwoDArray {
    public static void main(String[]args)
    {
        int row,column;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the  row size of the array");
        row= scanner.nextInt();
        System.out.println("Enter the Column size of the array");
        column= scanner.nextInt();
        int [][]array= new int[row][column];
        System.out.println("Enter the "+(row*column)+" elemenets  of the array");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
              array[i][j]= scanner.nextInt();
            }
        }
        for(int i=0;i<row;i++)
        {
            System.out.print("[");
            for(int j=0;j<column;j++)
            {
                System.out.print("\t");
                System.out.print(array[i][j]);
                System.out.print("\t");

            }
            System.out.print("]");
            System.out.print("\n");
        }
    }
}