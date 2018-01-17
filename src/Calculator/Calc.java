package Calculator;


import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc {
    public static void main(String[] args) {
        Calc gui = new Calc();
    }

    private JTextField firstNumber;
    private JTextField secondNumber;
    private JTextField resultNumber;
    private JLabel label4;

    public Calc() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.decode("#cfddce"));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(new EmptyBorder(10, 10, 10, 10));
        JPanel panel1 = new JPanel();
        panel1.setBorder(new EmptyBorder(10, 10, 10, 10));
        JPanel panel2 = new JPanel();
        panel2.setBorder(new EmptyBorder(10, 10, 10, 10));
        panel2.setBackground(Color.green);
        JPanel panel3 = new JPanel();

        firstNumber = new JTextField("0", 8);
        secondNumber = new JTextField("0", 8);
        resultNumber = new JTextField(8);
        JLabel label1 = new JLabel("Первое число");
        JLabel label2 = new JLabel("Второе число");
        JLabel label3 = new JLabel("Результат");
        label4 = new JLabel("");

        panel1.setLayout(new GridLayout(3, 1, 10, 10));
        panel1.add(label1);
        panel1.add(firstNumber);
        panel1.add(label2);
        panel1.add(secondNumber);
        panel1.add(label3);
        panel1.add(resultNumber);

        panel2.setLayout(new GridLayout(2, 3, 10, 10));
        panel3.setLayout(new GridLayout(2, 3, 10, 10));
        panel3.add(label4);


        JButton bSum = new JButton("+");
        bSum.addActionListener(new SumListener());
        JButton bSubstract = new JButton("-");
        bSubstract.addActionListener(new SubListener());
        JButton bMultiple = new JButton("*");
        bMultiple.addActionListener(new MultipleListener());
        JButton bDivide = new JButton("/");
        bDivide.addActionListener(new DivideListener());
        JButton bSQRT = new JButton("" + '\u221A');
        bSQRT.addActionListener(new SqrtListener());
        JButton bClean = new JButton("C");
        bClean.addActionListener(new ClearFieldListener());
        bClean.setBackground(Color.red);

        Font BigFontTR = new Font("TimesRoman", Font.BOLD, 20);
        JButton[] operButtons = {bClean, bSum, bSubstract, bMultiple, bDivide, bSQRT};
        for (JButton ob : operButtons) {
            ob.setFont(BigFontTR);
            panel2.add(ob);
        }

        panel.add(panel1);
        panel.add(panel2);
        panel.add(panel3);

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setSize(300, 350);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    class ClearFieldListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            firstNumber.setText("");
            secondNumber.setText("");
            resultNumber.setText("");
        }
    }

    class SumListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double a = Double.parseDouble(firstNumber.getText());
                double b = Double.parseDouble(secondNumber.getText());
                double s = a + b;
                resultNumber.setText(String.format("%.2f", s));
            } catch (NumberFormatException e1) {
                resultNumber.setText("Err");
                label4.setText("Err: Неверный формат числа или пустое поле");
            }
        }
    }

    class SubListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double a = Double.parseDouble(firstNumber.getText());
                double b = Double.parseDouble(secondNumber.getText());
                double s = a - b;
                resultNumber.setText(String.format("%.2f", s));
            } catch (NumberFormatException e1) {
                resultNumber.setText("Err");
                label4.setText("Err: Неверный формат числа или пустое поле");
            }
        }
    }

    class MultipleListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double a = Double.parseDouble(firstNumber.getText());
                double b = Double.parseDouble(secondNumber.getText());
                double s = a * b;
                resultNumber.setText(String.format("%.2f", s));
            } catch (NumberFormatException e1) {
                resultNumber.setText("Err");
                label4.setText("Err: Неверный формат числа или пустое поле");
            }
        }
    }

    class DivideListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double a = Double.parseDouble(firstNumber.getText());
                double b = Double.parseDouble(secondNumber.getText());
                double s = a / b;
                resultNumber.setText(String.format("%.2f", s));
            } catch (ArithmeticException e1) {
                resultNumber.setText("Err");
                label4.setText("Err: Деление на ноль");
            } catch (NumberFormatException e1) {
                resultNumber.setText("Err");
                label4.setText("Err: Неверный формат числа или пустое поле");
            }
        }
    }

    class SqrtListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double a = Double.parseDouble(firstNumber.getText());
                secondNumber.setText("");
                resultNumber.setText(String.format("%.2f", Math.sqrt(a)));
            } catch (NumberFormatException e1) {
                resultNumber.setText("Err");
                label4.setText("Err: Неверный формат числа или пустое поле");
            }
        }
    }
}
