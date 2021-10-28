package com.apps;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingApp {
    private JButton buttonMsg;
    private JPanel mainPanel;

    public SwingApp() {
        buttonMsg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Barry Allen is the Flash!");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("SwingApp");
        frame.setContentPane(new SwingApp().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}