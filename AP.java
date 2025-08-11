import java.util.Scanner;

public class AP {
    public static void main(String[]args)
    {
        int value;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a value");
        value= scanner.nextInt();
        System.out.print("[ ");
        for(int num=1;num<value;num+=num)
        {

            System.out.print(num+" ");
            System.out.print(",");
        }
        System.out.print(" ]");

    }
}