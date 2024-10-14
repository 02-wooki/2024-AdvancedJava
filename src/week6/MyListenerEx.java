package week6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListenerEx extends JFrame {

    public MyListenerEx() {
        setTitle("ActionListener sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JButton btn = new JButton("Action");
//        MyActionListener listener = new MyActionListener();
//        btn.addActionListener(listener);

        // 익명 클래스로 이벤트 리스너 만들기
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton)e.getSource();

                if(b.getText().equals("Action"))
                    b.setText("액션");
                else if (b.getText().equals("액션"))
                    b.setText("Action");
            }
        });

        c.add(btn);

        setSize(350, 200);
        setVisible(true);
    }

    // 내부 클래스로 리스너 만들기
    private class MyActionListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton)e.getSource();

            if(b.getText().equals("Action"))
                b.setText("액션");
            else if (b.getText().equals("액션"))
                b.setText("Action");
        }
    }

    public static void main(String[] args) {
        new MyListenerEx();
    }
}
