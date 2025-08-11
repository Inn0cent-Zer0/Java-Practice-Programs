import java.util.Scanner;

public class sum {
    public static void main(String[] args) {

        int num, d, sum = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number:");
        num = s.nextInt();
        while (num != 0) {
            d = num % 10;
            sum = sum + d;
            num = num ;
            if (num != 0) System.out.print(d + "+");
            else System.out.print(d + "=" + sum);

        }
        while(sum<=9)
        {
            d = num % 10;
            sum = sum + d;
            num = num / 10;
            if (num != 0) System.out.print(d + "+");
            else System.out.print(d + "=" + sum);
        }

        System.out.println("\nSum of Digits :=" + sum);
    }

}