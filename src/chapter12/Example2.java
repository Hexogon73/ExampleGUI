package chapter12;

import javax.swing.*;
import java.awt.*;

class BackgroundImageJFrame extends JFrame
{
    JButton b1;
    JLabel l1;
    public BackgroundImageJFrame()
    {
        setTitle("Background Color for JFrame");
        setSize(400,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon("C:\\Users\\Сергей\\IdeaProjects\\ExampleGUI\\src\\cat.jpeg")));
        setLayout(new FlowLayout());
        l1=new JLabel("Here is a button");
        b1=new JButton("I am a button");
        add(l1);
        add(b1);
        setSize(399,399);
        setSize(400,400);
    }
    public static void main(String args[])
    {
        new BackgroundImageJFrame();
    }
}