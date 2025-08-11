import java.util.*;
public class iterative {
    public static void main(String[]args)
    {
        float xmin,xmax,difx;
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\t\t+_+_+_+_+_||Iterative Methods ||+_+_+_+_+_+");
        System.out.println("\n\t\tEnter the value for xim");
        xmin = scan.nextFloat();
        System.out.println("\n\t\tEnter the value for xmax");
        xmax = scan.nextFloat();
        System.out.println("\n\t\tEnter the value for  diff x");
        difx = scan.nextFloat();
        float x = xmin;
        while(x<=xmax)
        {
            float y = x;
            System.out.println("\n\t\t The value of x:"+x);
            System.out.println("\n\t\t The value of y:"+y);
            x= x+difx;
        }
    }
}