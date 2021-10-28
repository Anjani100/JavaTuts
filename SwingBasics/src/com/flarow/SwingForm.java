package com.flarow;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class SwingForm {

	private JFrame frame;
	private JTextField textField;
	private JLabel labelUpdatedName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingForm window = new SwingForm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SwingForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 470, 443);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel labelName = new JLabel("Name:");
		labelName.setHorizontalAlignment(SwingConstants.CENTER);
		labelName.setBounds(10, 10, 61, 28);
		frame.getContentPane().add(labelName);
		
		labelUpdatedName = new JLabel("");
		
		textField = new JTextField();
		textField.setBounds(81, 15, 259, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Say Hi!");
		btnNewButton.setFont(new Font("Mongolian Baiti", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelUpdatedName.setText("Hello " + textField.getText() + "!");
			}
		});
		btnNewButton.setBounds(350, 14, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		labelUpdatedName.setBounds(200, 62, 45, 13);
		frame.getContentPane().add(labelUpdatedName);
	}
}
