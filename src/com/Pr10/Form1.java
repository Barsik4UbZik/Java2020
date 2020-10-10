package com.Pr10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Form1 {
    private JButton button1;
    private JPanel panel1;
    private JTextArea textArea1;

    public JButton getButton1()
    {
        return button1;
    }

    public JPanel getPanel1()
    {
        return panel1;
    }

    public JTextArea getTextArea1()
    {
        return textArea1;
    }

    Form1()
    {
        button1.addActionListener(new ActionListener());
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println(textArea1.getText());
            }
        }
    };

    textArea1.addMouseListener(new MouseListener())
    {
        @Override
        public void mouseClicked(MouseEvent e)
        {
            textArea1.setBackground(Color.magenta);
        }
    }
}
