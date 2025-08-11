import java.util.*;
public class binpat {
    public static void main(String[]args)
    {
        int n;
        Scanner scan= new Scanner(System.in);
        System.out.println("\n\t\t\tEnter the range value:");
        n=scan.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print("1 ");
                }
                else
                {
                    System.out.print("0 ");
                }
            }
            System.out.println(" ");
        }

    }
}