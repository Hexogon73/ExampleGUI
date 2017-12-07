package Calculator;


import javax.swing.*;
import java.awt.*;

public class Calc2 {

    public Calc2() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        NumPanel numPanel = new NumPanel();

        frame.getContentPane().add(BorderLayout.CENTER, new NumPanel2());
//        frame.getContentPane().add(BorderLayout.NORTH, panel1);

        frame.setSize(500, 500);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Calc2 gui = new Calc2();
    }
}
