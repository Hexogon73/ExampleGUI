package chapter12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleGui1E implements ActionListener {

    JFrame frame;

    public static void main(String[] args) {
        SimpleGui1E gui = new SimpleGui1E();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Repaint");
        button.addActionListener(this);

        MyDrawPanelE m = new MyDrawPanelE();

        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, m);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.repaint();
    }
}
