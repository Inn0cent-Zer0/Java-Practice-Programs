public class Exceed {
    public static void main(String[]args)
    {
        int sum=10;
        sum+=Math.random();
        while(sum <15)
        {
            sum+=Math.random();
            System.out.println();
            System.out.print("[ ");
            System.out.print(sum+" ");
            System.out.print(" ]");
            if(sum>20)
            {
                System.out.println("Termianting!...");
                break;
            }
        }
    }
}