package week6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseListenerAllEx extends JFrame {

    private JLabel la = new JLabel("No Mouse Event");

    public MouseListenerAllEx() {
        setTitle("MouseListener와 MouseMotionListener 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();

        MyMouseListener listener = new MyMouseListener();
        la.addMouseListener(listener);
        la.addMouseMotionListener(listener);
        c.add(la);

        setSize(300, 300);
        setVisible(true);
    }

    class MyMouseListener implements MouseListener, MouseMotionListener {
        // MouseListener
        @Override
        public void mousePressed(MouseEvent e) {
            la.setText("mousePressed(" + e.getX() + "," + e.getY() + ")");
        }
        @Override
        public void mouseReleased(MouseEvent e) {
            la.setText("mouseReleased(" + e.getX() + "," + e.getY() + ")");
        }
        @Override
        public void mouseClicked(MouseEvent e) {

        }
        @Override
        public void mouseEntered(MouseEvent e) {
            Component c = (Component) e.getSource();
            c.setBackground(Color.orange);
            la.setText("mouseEntered");
        }
        @Override
        public void mouseExited(MouseEvent e) {
            Component c = (Component) e.getSource();
            c.setBackground(Color.pink);
            la.setText("mouseExited");
        }

        // MouseMotionListener
        @Override
        public void mouseDragged(MouseEvent e) {
            la.setText("mouseDragged(" + e.getX() + ", " + e.getY() + ")");
        }
        @Override
        public void mouseMoved(MouseEvent e) {
            la.setText("mouseMoved(" + e.getX() + ", " + e.getY() + ")");
        }
    }

    public static void main(String[] args) {
        new MouseListenerAllEx();
    }
}
