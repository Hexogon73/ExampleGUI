import javax.swing.*;

public class Example {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("OK");
        frame.getContentPane().add(button);

        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
