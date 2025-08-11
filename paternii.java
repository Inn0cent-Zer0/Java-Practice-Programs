import java.util.*;
public class paternii {
    public static void main(String[]args)
    {
        int n,m=1;
        Scanner scan= new Scanner(System.in);
        System.out.println("\n\t\t\tEnter the row range value:");
        n=scan.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
            {
                    System.out.print(m+" ");
                     m++;
            }
            System.out.println();
        }
    }
}