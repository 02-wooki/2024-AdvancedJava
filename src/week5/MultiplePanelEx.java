package week5;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

class NorthPanel extends JPanel {
    public NorthPanel() {
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setBackground(Color.RED);
        add(new JButton("Open"));
        add(new JButton("Read"));
        add(new JButton("Close"));
    }
}

class CenterPanel extends JPanel {
    public CenterPanel() {
        setLayout(null);
        JLabel[] jb = { new JLabel("Hello"), new JLabel("Love"), new JLabel("Love") };

        Random r = new Random();
        for (int i = 0; i < jb.length; i++) {
            int x = r.nextInt(300);
            int y = r.nextInt(400);

            jb[i].setLocation(x, y);
            jb[i].setSize(100, 20);
            add(jb[i]);
        }

    }
}

public class MultiplePanelEx extends JFrame {

    public MultiplePanelEx() {
        setTitle("MultiPanel Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        c.add(new NorthPanel(), BorderLayout.NORTH);
        c.add(new CenterPanel(), BorderLayout.CENTER);

        setSize(300, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MultiplePanelEx();
    }
}
