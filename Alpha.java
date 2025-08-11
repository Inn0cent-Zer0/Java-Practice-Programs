import java.io.PrintWriter;

public class Alpha
{
    static PrintWriter screen = new PrintWriter(System.out,true);

       static void writeeBackwards(StringBuffer alphaString, int index)
        {
            if(index>=0)
            {
                screen.print(alphaString.charAt(index));
                screen.flush();
            }

        }

    public static void main(String[]args)
    {

    }
}