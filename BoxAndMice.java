class Mouse extends Thread
{
    Box box;
    Mouse(Box box)
    {
        this.box = box;
    }
    public void run()
    {
        try
        {
            while(true)
            {
                long out = (long)(10000*Math.random()+10000);
                Thread.sleep(out);
                box.enter(this);
                Thread.sleep(in);
                box.exit(this);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
class Box
{
    private static int CAPACITY = 4;
    int count;
    synchronized  void enter(Mouse mouse)
    {
        try
        {
            while(count==CAPACITY)
            {
                wait();
            }
        }
    }
}
public class BoxAndMice {
}