package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlowerShop extends JFrame {
    private JLabel title;
    private JButton CREATEButton;
    private JButton CREATEButton1;
    private JButton CREATEButton2;
    private JPanel flowerpanel;


    public FlowerShop() {
        setContentPane(flowerpanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(300, 200);
        getContentPane().setPreferredSize(new Dimension(600, 700));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        CREATEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new annualForm();

            }
        });
        CREATEButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new indoorForm();
            }
        });
    }

    public static void main(String[] args) {
        new FlowerShop();

    }
}
