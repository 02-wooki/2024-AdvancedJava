package week6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerEx extends JFrame {

    private JLabel lb = new JLabel("Hello");

    public MouseListenerEx() {
        setTitle("마우스 이벤트 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.addMouseListener(new MyMouseListener());
        c.setLayout(null);

        lb.setSize(50, 20);
        lb.setLocation(100, 100);
        c.add(lb);

        setSize(300, 300);
        setVisible(true);
    }

//    private class MyMouseListener implements MouseListener {
    class MyMouseListener extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            lb.setLocation(x - 20, y - 10);
        }
//        @Override
//        public void mouseClicked(MouseEvent e) {
//
//        }
//        @Override
//        public void mouseReleased(MouseEvent e) {
//
//        }
//        @Override
//        public void mouseEntered(MouseEvent e) {
//
//        }
//        @Override
//        public void mouseExited(MouseEvent e) {
//
//        }
    }

    public static void main(String[] args) {
        new MouseListenerEx();
    }
}

