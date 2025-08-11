import java.util.Scanner;

public class MonthName
{
    public static void main(String[]args)
    {
        int Month;
        System.out.println("Enter the Number of the Month ");
        Scanner scanner =  new Scanner(System.in);
        Month = scanner.nextInt();
        switch (Month) {
            case 1 -> System.out.println("The Month is January");
            case 2 -> System.out.println("The Month is February");
            case 3 -> System.out.println("The Month is March");
            case 4 -> System.out.println("The Month is April");
            case 5 -> System.out.println("The Month is May");
            case 6 -> System.out.println("The Month is June");
            case 7 -> System.out.println("The Month is July");
            case 8 -> System.out.println("The Month is August");
            case 9 -> System.out.println("The Month is September");
            case 10 -> System.out.println("The Month is October");
            case 11 -> System.out.println("The Month is November");
            case 12 -> System.out.println("The Month is December");
            default -> System.out.println("Please Enter Any Number between 1-12");
        }
    }
}