import java.awt.*;

public class DrawSmiley {
    public static void main(String[] args) {

    }

    public void paintComponent(Graphics g) {
        Color color = new Color(255, 125, 216);
        g.setColor(color);
        g.fillOval(10, 10, 200, 200);
        g.setColor(Color.BLACK);
        g.fillOval(55, 65, 30, 30);
        g.fillOval(135, 65, 30, 30);
        g.fillOval(50, 110, 120, 60);
        g.setColor(Color.YELLOW);
        g.fillRect(50, 110, 1200, 30);
        g.fillOval(50, 120, 120, 40);
    }
}