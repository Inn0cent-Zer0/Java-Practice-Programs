import java.util.*;
public class fibo {
    public static void main(String[]args)
    {
        int prev=0,current=1,range;
        int newterm = prev+current;
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\t\t+_+_+_+_+_||Fibonacci Series ||+_+_+_+_+_+");
        System.out.println("\n\t\tEnter the range of the fibonacci series:");
        range = scan.nextInt();
        System.out.print("{ ");
        System.out.print(prev+" ");
        System.out.print(",");
        System.out.print(current+" ");
        System.out.print(",");
        System.out.print(newterm+" ");
        System.out.print(",");
        for(int i=0;i<=range;i++)
        {
            prev = current;
            current = newterm;
            newterm = current+prev;
             System.out.print(newterm);
             System.out.print(",");
        }
        System.out.print("}");
    }
}