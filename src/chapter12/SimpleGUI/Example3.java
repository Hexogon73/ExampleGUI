package chapter12.SimpleGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example3 extends JFrame implements ActionListener {
    JButton b1;
    JLabel l1;
//    MyDrawPanel dp1;

    public Example3() {
        setTitle("Background Color for JFrame");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setBackground(Color.GRAY);

        setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon("C:\\Users\\Сергей\\IdeaProjects\\ExampleGUI\\src\\cat.jpeg")));
        setLayout(new FlowLayout());
        l1 = new JLabel("Here is a button");
        b1 = new JButton("I am a button");

        b1.addActionListener(this);

//        dp1 = new MyDrawPanel();
//        dp1.setSize(200, 200);


        add(l1);
        add(b1);
//        add(dp1);
        setSize(399, 399);
        setSize(400, 400);
    }

    public static void main(String args[]) {
        new Example3();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        b1.setText("I've been clicked!");
    }
}
