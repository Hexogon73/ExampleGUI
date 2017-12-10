package chapter13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/*
* TextArea and ScrollPane
*
 */

public class MyJTextArea {
    JTextArea textArea;

    public MyJTextArea() {
        JFrame frame = new JFrame();
        frame.setBackground(Color.BLUE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button = new JButton("Click me");
        button.addActionListener(new ButtonKlickListener());

        textArea = new JTextArea(10,20);
        textArea.setText("text in area \n");
//        textArea.addFocusListener(new TextAreaListener());
        textArea.append("app line \n");
        textArea.setLineWrap(true);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.darkGray);

        panel1.add(scrollPane);

        frame.getContentPane().add(BorderLayout.CENTER, panel1);
        frame.getContentPane().add(BorderLayout.SOUTH, button);

        frame.setSize(350, 350);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        MyJTextArea myJTextField = new MyJTextArea();
    }

    class TextAreaListener implements FocusListener {
        int i;

        @Override
        public void focusGained(FocusEvent e) {
            textArea.setText("get focus! " + i);
        }

        @Override
        public void focusLost(FocusEvent e) {
textArea.setText("focus lost!" + i);
        }
    }

    class ButtonKlickListener implements ActionListener {
        int i;
        @Override
        public void actionPerformed(ActionEvent e) {
            i++;
            textArea.append("Text append! " + i + "\n");
        }
    }
}
