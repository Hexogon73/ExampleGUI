package Calculator;

import javax.swing.*;
import java.awt.*;

public class NumPanel2 extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        NumPanel2 panel = new NumPanel2();
    }

    public NumPanel2(){
        JPanel panel = new JPanel();
//        NumPanel2 panel = new NumPanel2();
        panel.setBackground(Color.yellow);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.darkGray);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.green);

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.orange);

        JPanel panel4 = new JPanel();
        panel3.setBackground(Color.GRAY);


        JTextField textField = new JTextField(20);

        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");

        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");

        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");

        panel1.add(textField);

        panel2.add(button1);
        panel2.add(button2);
        panel2.add(button3);
        panel3.add(button4);
        panel3.add(button5);
        panel3.add(button6);
        panel4.add(button7);
        panel4.add(button8);
        panel4.add(button9);

        panel.add(panel2);
        panel.add(panel3);
        panel.add(panel4);
    }

}
