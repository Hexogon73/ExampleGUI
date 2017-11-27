package chapter12;

import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        Image image = new ImageIcon("C:\\Users\\Сергей\\IdeaProjects\\ExampleGUI\\src\\chapter12\\cat.jpeg").getImage();
        g.drawImage(image, 10,10, this);
        g.setColor(Color.red);
        g.fillRect(50, 50, 100, 100);
        g.setColor(Color.green);
        g.fillRect(100, 100, 100, 100);
        g.setColor(Color.blue);
        g.fillOval(150, 150, 100, 100);
    }
}
