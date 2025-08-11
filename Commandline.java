public class Commandline {
    public static void main(String[]args) throws Exception
    {
        System.out.println("args length  = "+args.length);
        for(int i=0;i<5;i++)
        {
            System.out.println("args  [ "+i+" ]  = "+args[i]);
        }
    }
}