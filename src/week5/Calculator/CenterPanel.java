package week5.Calculator;

import javax.swing.*;
import java.awt.*;

public class CenterPanel extends JPanel {
    public CenterPanel() {
        setLayout(new GridLayout(4, 4, 3, 3));

        String[] buttonInnerText = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "CE", "계산", "+", "-", "*", "/"};
        for (int i = 0; i < 16; i++) {
            JButton b = new JButton(buttonInnerText[i]);

            if (i >= 12)
                b.setBackground(Color.CYAN);

            add(b);
        }
    }
}
