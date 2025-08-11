import  java.awt.*;
import javax.swing.*;
public class Rectangle extends JFrame{
    public Rectangle()
    {
        super("Drawing Various Shapes");
        setSize(1500,1500);
        setVisible(true);
    }
    public void paint(Graphics g)
    {
        g.setColor(Color.CYAN);
        g.fillRect(100,100,100,100);
        g.setColor(Color.RED);
        g.fillOval(200,100,100,100);
        g.setColor(Color.ORANGE);
        g.fillArc(300,100,100,100,100,-180);
        g.setColor(Color.PINK);
        g.clearRect(400,100,100,100);
        g.setColor(Color.MAGENTA);
        g.fill3DRect(500,100,100,100,true);
        g.setColor(Color.GREEN);
        g.fillRoundRect(600,100,100,100,100,100);

    }
    public static void main(String[]args)
    {
        Rectangle application = new Rectangle();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}