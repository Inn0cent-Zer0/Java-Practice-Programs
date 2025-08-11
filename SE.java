import java.util.*;
public class SE {
     public static void main(String[]args)
     {
         float a,b,c,p,q,r;
         Scanner scan = new Scanner(System.in);
         System.out.println("\n\t\t+_+_+_+_+_+|||Solution of Simultaneous Equations||+_+_+_+_+_+");
         System.out.println("\n\t\tEnter the value for a");
         a = scan.nextFloat();
         System.out.println("\n\t\tEnter the value for b");
         b = scan.nextFloat();
         System.out.println("\n\t\tEnter the value for c");
         c = scan.nextFloat();
         System.out.println("\n\t\tEnter the value for p");
         p = scan.nextFloat();
         System.out.println("\n\t\tEnter the value for q");
         q =scan.nextFloat();
         System.out.println("\n\t\tEnter the value for r");
         r = scan.nextFloat();
         q = q-(p*b/a);
         r = r-(p*c/a);
         if(q == 0)
         {
            System.out.println("\n\t\t  No Solution");
         }
         else
         {
            float y=r/q;
            float x = (c-b*y)/a;
             System.out.println("\n\t\t The value of x is "+x);
             System.out.println("\n\t\t The value of y is "+y);
         }
     }
}