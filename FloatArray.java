import java.util.Scanner;

public class FloatArray {
    public static void main(String[]args)
    {

        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        size= scanner.nextInt();
        float []myarray=new float[size];
        System.out.println("Enter the "+size+" elemenets  of the array");
        for(int i=0;i<myarray.length;i++)
        {
            myarray[i]= scanner.nextFloat();
        }
        System.out.print("{");
        for(int i=0;i<myarray.length;i++)
        {
            System.out.print(myarray[i]);
            System.out.print(",");
        }
        System.out.print("}");
    }
}