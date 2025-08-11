public class Root {
    public static void main(String[]args)
    {
        int num1;
        num1= Integer.parseInt(args[0]);
        if(num1<0)
        {
            System.out.println(Math.sqrt(-num1)+"i");
        }
        else
        {
            System.out.println(Math.sqrt(num1));
        }
    }
}