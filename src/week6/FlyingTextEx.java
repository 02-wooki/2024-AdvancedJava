package week6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FlyingTextEx extends JFrame {

    JLabel lb = new JLabel("Hello");

    public FlyingTextEx() {
        setTitle("상,하,좌,우 키를 이용하여 텍스트 움직이기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);

        c.addKeyListener(new MyKeyListener());

        lb.setLocation(50, 50);
        lb.setSize(100, 20);
        c.add(lb);

        // 컨텐트팬에 포커스 주기
        c.setFocusable(true);
        c.requestFocus();

        // 마우스 클릭한 곳에 포커스 주기
        c.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Component com = (Component) e.getSource();
                com.setFocusable(true);
                com.requestFocus();
            }
        });

        setSize(300, 300);
        setVisible(true);
    }

    class MyKeyListener extends KeyAdapter {
        public void keyPressed (KeyEvent e) {

            int x = lb.getX();
            int y = lb.getY();

            int keycode = e.getKeyCode();
            if (keycode == KeyEvent.VK_LEFT)
                lb.setLocation(x - 10, y);
            else if (keycode == KeyEvent.VK_UP)
                lb.setLocation(x, y - 10);
            else if (keycode == KeyEvent.VK_RIGHT)
                lb.setLocation(x + 10, y);
            else if (keycode == KeyEvent.VK_DOWN)
                lb.setLocation(x, y + 10);
        }
    }

    public static void main(String[] args) {
        new FlyingTextEx();
    }
}
