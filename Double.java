import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class Double extends JFrame {
    // create a constructor to display text in windows toolbar
    public Double() {
        // Use the super method to display text
        super("Draw 2D Shapes");
        // use the setSize method to fix the size of the content pane
        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        Double application = new Double();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(new GradientPaint(5, 30, Color.RED, 35, 100, Color.YELLOW, true));
        g2d.fill(new Ellipse2D.Double(15, 30, 65, 100));

        g2d.setPaint(Color.GREEN);
        g2d.draw(new Line2D.Double(395, 30, 320, 150));

    }
}