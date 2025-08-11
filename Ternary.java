import java.util.Scanner;

public class Ternary {
    public static void main(String[]args)
    {
        int num1,num2;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the first value");
        num1= scanner.nextInt();
        System.out.println("Enter the Second value");
        num2= scanner.nextInt();
        System.out.println((num1>num2)? num1+" is greater than "+num2:num2+" is greater than "+num1);
    }
}