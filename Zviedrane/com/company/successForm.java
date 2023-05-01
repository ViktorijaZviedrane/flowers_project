package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class successForm extends JFrame{
    private JPanel successPanel;
    private JButton mainMenuButton;
    private JButton exitButton;

    public successForm() {
        setContentPane(successPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(300, 200);
        getContentPane().setPreferredSize(new Dimension(600, 400));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        mainMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new FlowerShop();
            }
        });
    }
    public static void main(String[] args) {new successForm();
    }
}

