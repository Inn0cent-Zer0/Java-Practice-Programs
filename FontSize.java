import java.awt.*;
import javax.swing.*;
public class FontSize extends JFrame{
    public FontSize()
    {
        super("Font Metrics");
        setSize(500,500);
        setVisible(true);
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        g.setFont(new Font("Times",Font.BOLD,12));
        FontMetrics metrics=g.getFontMetrics();
        g.drawString("Current font"+g.getFont(),10,40);
        g.drawString("Ascent"+metrics.getAscent(),10,55);
        g.drawString("Descent"+metrics.getDescent(),10,70);
        g.drawString("Height"+metrics.getHeight(),10,85);
        g.drawString("Leading"+metrics.getLeading(),10,100);
        g.setFont(new Font("Times",Font.ITALIC,12));
         metrics=g.getFontMetrics();
        g.drawString("Current font"+g.getFont(),10,120);
        g.drawString("Ascent  "+metrics.getAscent(),10,130);
        g.drawString("Descent "+metrics.getDescent(),10,150);
        g.drawString("Height  "+metrics.getHeight(),10,170);
        g.drawString("Leading "+metrics.getLeading(),10,190);
        g.setFont(new Font("Courier New",Font.BOLD,12));
         metrics=g.getFontMetrics();
        g.drawString("Current font"+g.getFont(),10,240);
        g.drawString("Ascent  "+metrics.getAscent(),10,255);
        g.drawString("Descent "+metrics.getDescent(),10,270);
        g.drawString("Height  "+metrics.getHeight(),10,285);
        g.drawString("Leading "+metrics.getLeading(),10,300);
    }
    public static void main(String[]args)
    {
        FontSize application = new FontSize();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}