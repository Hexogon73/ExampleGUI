package Calculator;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Calc {
    public static void main(String[] args) {
        Calc gui = new Calc();
    }

    JTextField textField;

    public Calc() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.yellow);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.darkGray);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.green);

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.orange);

        JPanel panel4 = new JPanel();
        panel4.setBackground(Color.GRAY);

        textField = new JTextField(20);
        textField.addActionListener(new TextFieldListener());

        ArrayList<JButton> jButtons = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            jButtons.add(new JButton(Integer.toString(i)));
        }
//        JButton button1 = new JButton("1");
//        JButton button2 = new JButton("2");
//        JButton button3 = new JButton("3");
//
//        JButton button4 = new JButton("4");
//        JButton button5 = new JButton("5");
//        JButton button6 = new JButton("6");
//
//        JButton button7 = new JButton("7");
//        JButton button8 = new JButton("8");
//        JButton button9 = new JButton("9");
        panel1.add(textField);

        int i = 0;
        for (JButton jb : jButtons) {
            if (i < 3) { panel2.add(jButtons.get(i)); }
            if (i >= 3 & i < 6) { panel3.add(jButtons.get(i)); }
            if (i >= 6 & i < 9) { panel4.add(jButtons.get(i)); }
            i++;
        }
//        panel2.add(button1);
//        panel2.add(button2);
//        panel2.add(button3);
//        panel3.add(button4);
//        panel3.add(button5);
//        panel3.add(button6);
//        panel4.add(button7);
//        panel4.add(button8);
//        panel4.add(button9);
//        panel.add(panel1);
        panel.add(panel2);
        panel.add(panel3);
        panel.add(panel4);

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.getContentPane().add(BorderLayout.NORTH, panel1);

        frame.setSize(250, 250);
        frame.setVisible(true);
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
