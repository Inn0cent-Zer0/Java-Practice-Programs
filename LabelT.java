import javax.swing.*;
import java.awt.*;

public class LabelT extends JFrame {
    private final JLabel Label1;
    private final JLabel Label2;
    private final JLabel Label3;

    public LabelT() {
        super("Testing out JLabel");
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        Label1 = new JLabel("Jai Shree Ganesh");
        Label1.setToolTipText("This is the first Label");
        container.add(Label1);
        Icon ganu = new ImageIcon("jsg.jfif");
        Label2 = new JLabel("Jai Shree Ganeshaya Namaha ", ganu, SwingConstants.LEFT);
        Label2.setToolTipText("This is the second Label");
        container.add(Label2);
        Label3 = new JLabel();
        Label3.setText("Om Maha Gaanapathiya Namah");
        Label3.setIcon(ganu);
        Label3.setHorizontalTextPosition(SwingConstants.CENTER);
        Label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        Label3.setToolTipText("This is the third label ");
        container.add(Label3);
        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        LabelT application = new LabelT();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}