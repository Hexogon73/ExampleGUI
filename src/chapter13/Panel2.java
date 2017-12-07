package chapter13;

import javax.swing.*;
import java.awt.*;

public class Panel2 {

    public Panel2() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.yellow);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.darkGray);
//        panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.green);
//        panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS));

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.orange);
//        panel3.setLayout(new BoxLayout(panel3, BoxLayout.X_AXIS));

//        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
//        panel.setLayout(new BoxLayout(panel, BoxLayout.LINE_AXIS));
//        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));


        JButton button1 = new JButton("shock me");
        JButton button2 = new JButton("bliss");
        JButton button3 = new JButton("huh?");

        JButton button4 = new JButton("shock me");
        JButton button5 = new JButton("bliss");
        JButton button6 = new JButton("huh?");

        JButton button7 = new JButton("shock me");
        JButton button8 = new JButton("bliss");
        JButton button9 = new JButton("huh?");

        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        panel2.add(button4);
        panel2.add(button5);
        panel2.add(button6);
        panel3.add(button7);
        panel3.add(button8);
        panel3.add(button9);

        panel.add(panel1);
        panel.add(panel2);
        panel.add(panel3);

        frame.getContentPane().add(BorderLayout.EAST, panel);

        frame.setSize(250, 250);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Panel2 gui = new Panel2();
    }
}
