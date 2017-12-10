package chapter13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MyJCheckBox {
    JTextField textField;
    JCheckBox checkBox;

    public MyJCheckBox() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textField = new JTextField(10);
        textField.setText("text in field");
//        textField.setText("");
        textField.addActionListener(new TextFieldListener());

        checkBox = new JCheckBox("Check it");
        checkBox.addItemListener(new CheckListener());

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.darkGray);
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));

        panel1.add(textField);
        panel1.add(checkBox);

        frame.getContentPane().add(BorderLayout.NORTH, panel1);

        frame.setSize(350, 350);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        MyJCheckBox myJTextField = new MyJCheckBox();
    }

    class TextFieldListener implements ActionListener {
        int i;

        @Override
        public void actionPerformed(ActionEvent e) {
            i++;
            textField.setText("Text changed! " + i);
        }
    }

    class CheckListener implements ItemListener {
        int i;
        @Override
        public void itemStateChanged(ItemEvent e) {
            if (checkBox.isSelected()){
                i++;
            }
            textField.setText("Check box is checked!" + i);
        }
    }
}
