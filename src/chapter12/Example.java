package chapter12;

import javax.swing.*;

public class Example {
    public static void main(String[] args) {
        JFrame frame = new JFrame(); //создаем фрейм
        JButton button = new JButton("OK"); //создаем кнопку с надписью "ОК"

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //при закрытии окна завершаем программу

        frame.getContentPane().add(button); //добавляем созданную кнопку на фрейм

        frame.setSize(300, 300); //задаем размеры фрейма
        frame.setVisible(true); //делаем фрейм видимым
    }

    public void changeIt() {
        //button.setText("I've been clicked!");
    }
}
