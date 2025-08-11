import java.io.PrintWriter;

public class Recur {
    static  PrintWriter screen = new PrintWriter(System.out,true);
    static  void output(int level)
    {
        level++;
        screen.println("recursice call to level "+ level);
        if(level<5)
        {
            output(level);
        }
        else
        {
            return;
        }
        screen.println("returning through level "+level);
    }
    public static void main(String[]args)
    {
        output(0);
    }
}