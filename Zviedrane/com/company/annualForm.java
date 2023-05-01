package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class annualForm extends JFrame {
    private JTextField color;
    private JTextField flowerHeight;
    private JTextField name;
    private JTextField quantity;
    private JTextField price;
    private JButton createButton;
    private JButton backButton;
    private JPanel annualPanel;

    public annualForm(){
        setContentPane(annualPanel);
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
                    Annual annual = new Annual(name.getText(), color.getText(), Integer.parseInt(quantity.getText()), Integer.parseInt(price.getText()), Integer.parseInt(flowerHeight.getText()));
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
        new annualForm();
    }
}
