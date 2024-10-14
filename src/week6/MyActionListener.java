package week6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton)e.getSource();

        if(b.getText().equals("Action"))
            b.setText("액션");
        else if (b.getText().equals("액션"))
            b.setText("Action");
    }
}
