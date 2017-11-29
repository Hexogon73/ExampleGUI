package chapter12.SimpleGUI;

import javax.swing.*;
import java.awt.*;

public class MyDrawPanelE extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        Color startColor = getColor();
        Color endColor = getColor();

        GradientPaint gradient = new GradientPaint(70, 70, startColor, 150, 150, endColor);
//        GradientPaint gradient = new GradientPaint(70, 70, Color.blue, 150, 150, Color.orange);
        g2d.setPaint(gradient);
        g2d.fillOval(70, 70, 100, 100);
        g2d.fillRect(170, 170, 100, 100);
    }

    private Color getColor(){
        Color color;
        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        return color = new Color(red, green, blue);
    }
}
