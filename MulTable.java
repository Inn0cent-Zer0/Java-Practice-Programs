import java.util.Scanner;

public class MulTable {
    public static void main(String[]args)
    {
        int rows,columns;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number of Rows");
        rows= scanner.nextInt();
        System.out.println("Enter the number of Columns");
        columns= scanner.nextInt();
        int [][]Product= new int[rows][columns];
        System.out.println("");
        for(int i=10;i<rows;i++)
        {
            System.out.print("[\t");
            for(int j=10;j<columns;j++)
            {
                Product[i][j]=i*j;
                System.out.print(Product[i][j]+"\t");
            }
            System.out.print("\t]");
            System.out.println("\n");
        }
    }
}