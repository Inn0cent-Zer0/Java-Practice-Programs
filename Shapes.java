import java.awt.*;

class Shapes
{
    private final int Choice;
    public Shapes(int UserChoice)
    {
        Choice= UserChoice;
    }
    public void paintComponent(Graphics g)
    {
        for(int i=0;i<10;i++)
        {
            switch (Choice) {
                case 1 -> g.drawRect(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
                case 2 -> g.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
            }
        }
    }
}