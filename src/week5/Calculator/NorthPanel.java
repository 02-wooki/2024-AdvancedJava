package week5.Calculator;

import javax.swing.*;
import java.awt.*;

public class NorthPanel extends JPanel {
    public NorthPanel() {
        setLayout(new FlowLayout(FlowLayout.CENTER));

        JLabel l = new JLabel("수식입력");
        JTextField t = new JTextField(15);
        t.setSize(100, 20);

        add(l);
        add(t);

        setBackground(Color.GRAY);
    }
}
