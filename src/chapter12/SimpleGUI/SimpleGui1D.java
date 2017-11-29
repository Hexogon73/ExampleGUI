package chapter12.SimpleGUI;

import javax.swing.JFrame;

public class SimpleGui1D {
    public static void main(String[] args) {
        SimpleGui1D gui = new SimpleGui1D();
        gui.go();
    }
    private void go(){
        JFrame frame = new JFrame();
        MyDrawPanel2 m = new MyDrawPanel2();
        frame.getContentPane().add(m);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
