package chapter12;

import javax.swing.*;
import java.awt.event.*;

public class SimpleGui1B implements ActionListener {
    JButton button;
    MyDrawPanel drawPanel;

    public static void main(String[] args) {
        SimpleGui1B gui = new SimpleGui1B();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame("Simple_Gui_1B");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);

        button = new JButton("Click me");
        button.setSize( 150, 50);

        drawPanel = new MyDrawPanel();

        button.addActionListener(this);

        frame.getContentPane().add(button);
        frame.getContentPane().add(drawPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("I've been clicked!");
    }
}
