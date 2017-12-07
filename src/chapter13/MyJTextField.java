package chapter13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJTextField {
    JTextField textField;

    public MyJTextField() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textField = new JTextField(20);
        textField.setText("text in field");
//        textField.setText("");
        textField.addActionListener(new TextFieldListener());

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.darkGray);
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));

        panel1.add(textField);

        frame.getContentPane().add(BorderLayout.NORTH, panel1);

        frame.setSize(350, 350);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        MyJTextField myJTextField = new MyJTextField();
    }

    class TextFieldListener implements ActionListener {
        int i;
        @Override
        public void actionPerformed(ActionEvent e) {
            i++;
            textField.setText("Text changed! " + i);
        }
    }
}
