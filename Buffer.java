import java.io.InputStream;
import java.util.Scanner;

public class Buffer {
    public static void main(String[]args)
    {
        int size;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the size of then string buffer");
        size= scanner.nextInt();
        StringBuffer stringBuffer= new StringBuffer(size);
        System.out.println(stringBuffer);
        System.out.println("the string capacity is "+ stringBuffer.capacity());
        System.out.println("the string length"+stringBuffer.length());
        System.out.println("enter the string to be displayed");

    }
}