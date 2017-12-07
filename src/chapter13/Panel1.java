package chapter13;

import javax.swing.*;
import java.awt.*;

public class Panel1 {

    public Panel1() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("shock me");
        JButton button2 = new JButton("bliss");
        JButton button3 = new JButton("huh?");

        panel.add(button);
        panel.add(button2);
        panel.add(button3);
        frame.getContentPane().add(BorderLayout.EAST, panel);

        frame.setSize(250, 250);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Panel1 gui = new Panel1();
    }
}
