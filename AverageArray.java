import java.util.Scanner;

public class AverageArray {
    public static void main(String[]args)
    {

        int size,total = 0;
        float average=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        size= scanner.nextInt();
        int []myarray=new int[size];
        System.out.println("Enter the "+size+" elemenets  of the array");
        for(int i=0;i<myarray.length;i++)
        {
            myarray[i]= scanner.nextInt();
        }

        System.out.print("{");
        for(int i=0;i<myarray.length;i++)
        {
            total= total+myarray[i];

            System.out.print(myarray[i]);
            System.out.print(",");
        }
        System.out.print("}");
        average=total/size;
        System.out.println("\nThe total of the given array is "+total);
        System.out.println("The average of the given array is "+average);

    }
}