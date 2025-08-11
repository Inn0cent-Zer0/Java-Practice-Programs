import java.util.Scanner;

public class Spanish {
    public static void main(String[]args)
    {
        int num;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the value within (1-5) to  be translated to Spanish");
        num= scanner.nextInt();
        switch(num)
        {
            case 1:
                System.out.println("Uno");
                break;
            case 2 :
                System.out.println("Dos");
                break;
            case 3 :
                System.out.println("Tres");
                break;
            case 4 :
                System.out.println("Questro");
                break;

            case 5  :
                System.out.println("Cinco");
                break;
            default:
                System.out.println("Please, Enter a number within 5 ");

        }
    }
}