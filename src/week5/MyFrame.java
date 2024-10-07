package week5;

import javax.swing.*;
import java.awt.*;

class MyPanel extends JPanel {
    //...
}

public class MyFrame extends JFrame {

    public MyFrame() {
        setTitle("Swing Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        JButton b = new JButton("버튼을 눌러주세요");
        c.add(b);   // 컨텐트팬에 버튼 컴포넌트 붙이기

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setContentPane(new MyPanel());
    }
}
