package week5.Calculator;

import javax.swing.*;
import java.awt.*;

public class SouthPanel extends JPanel {
    public SouthPanel() {
        setLayout(new FlowLayout(FlowLayout.LEFT));

        JLabel l = new JLabel("계산 결과");
        JTextField t = new JTextField(15);
        t.setSize(100, 20);

        add(l);
        add(t);

        setBackground(Color.YELLOW);
    }
}
