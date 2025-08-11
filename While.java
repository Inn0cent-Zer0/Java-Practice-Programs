import java.util.Scanner;

public class While {
    public static void  main(String[]args)
    {
        int num=0;
        int value;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a value");
        value= scanner.nextInt();
        System.out.print("[ ");
        while(num<value)
        {
            System.out.print(num+" ");
            System.out.print(",");
            num+=2;
        }
        System.out.print(" ]");
    }
}