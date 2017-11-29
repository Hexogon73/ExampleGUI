package chapter12.SimpleGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TwoButtons {
    JFrame frame;
    JLabel label;
    JButton colorButton;

    public static void main(String[] args) {
        TwoButtons gui = new TwoButtons();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        colorButton = new JButton("Repaint");
        colorButton.addActionListener(new ColorListener());

        JButton labelButton = new JButton("east");
        labelButton.addActionListener(new LabelListener());

        label = new JLabel("I'm a label");

        MyDrawPanelE m = new MyDrawPanelE();

        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.WEST, label);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.CENTER, m);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }

    class ColorListener implements ActionListener {
        int count = 0;

        public void actionPerformed(ActionEvent e) {
            frame.repaint();
            count++;
            colorButton.setText("Repaint ( " + count + " )");
        }
    }

    class LabelListener implements ActionListener {
        int i = 0;

        @Override
        public void actionPerformed(ActionEvent e) {
            i++;
            label.setText("Text changed! ( " + i + " )");
        }
    }
}
