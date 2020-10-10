package com.Pr10;

import javax.swing.*;

public class Loader
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(480,320); // Размер окна

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Выход при закрытии окна

        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        JButton button = new JButton("Lox"); // Кнопка с надписью
        frame.add(button); // Создание кнопки

        button.setBounds(10, 10, 100, 30); // Положение кнопки
    }
}
