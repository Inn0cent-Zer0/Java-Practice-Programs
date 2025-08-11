public class BreakTest {
    public static void main(String[]args)
    {
        System.out.println("The below loop is for continue");
        System.out.print("{");
        for(int i=1;i<=10;i++)
        {
            System.out.print(i);
            System.out.print(",");
            if(i==5)
            {
                continue;
            }
        }
        System.out.print("}");
        System.out.println("\nThe below loop is for break");
        System.out.print("{");
        for(int i=1;i<=10;i++)
        {
            System.out.print(i);
            System.out.print(",");
            if(i==5)
            {
                break;
            }
        }
        System.out.print("}");
    }
}