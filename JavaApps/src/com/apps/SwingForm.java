package com.apps;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingForm {
    private JPanel mainPanel;
    private JTextField nameField;
    private JButton updateNameButton;
    private JLabel updatedName;

    public SwingForm() {
        updateNameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updatedName.setText("Hello " + nameField.getText());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("SwingForm");
        frame.setContentPane(new SwingForm().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
