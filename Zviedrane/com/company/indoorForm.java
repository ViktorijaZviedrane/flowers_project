package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class indoorForm extends JFrame {
    private JTextField color;
    private JTextField price;
    private JTextField quantity;
    private JTextField name;
    private JTextField temperature;
    private JButton backButton;
    private JButton createButton;
    private JPanel indoorPanel;

    public indoorForm(){
        setContentPane(indoorPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(300, 200);
        getContentPane().setPreferredSize(new Dimension(600, 400));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new FlowerShop();
            }
        });
        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    FileWriter fw = new FileWriter("db.txt", true);
                    Annual annual = new Annual(name.getText(), color.getText(), Integer.parseInt(quantity.getText()), Integer.parseInt(price.getText()), Integer.parseInt(temperature.getText()));
                    fw.write(annual.printInfo() + "\n");
                    fw.close();
                    setVisible(false);
                    new successForm();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
        });
    }

    public static void main(String[] args) {
        new indoorForm();
    }
}


