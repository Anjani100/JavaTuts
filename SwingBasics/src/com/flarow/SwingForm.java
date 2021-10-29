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
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class SwingForm {

	private JFrame frame;
	JLabel radioLabel = new JLabel("");
	private final ButtonGroup buttonGroup = new ButtonGroup();

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
	
	public class RadioListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JRadioButton btn = (JRadioButton) e.getSource();
			radioLabel.setText(btn.getText());
		}
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
		
		JLabel labelUpdatedName = new JLabel("");
		labelUpdatedName.setBounds(81, 62, 233, 28);
		frame.getContentPane().add(labelUpdatedName);
		
		JTextField textField = new JTextField();
		textField.setBounds(81, 15, 259, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("Say Hi!");
		button.setFont(new Font("Mongolian Baiti", Font.PLAIN, 14));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelUpdatedName.setText("Hello " + textField.getText());
			}
		});
		button.setBounds(350, 14, 85, 21);
		frame.getContentPane().add(button);
		
		JLabel toggleLabel = new JLabel("");
		toggleLabel.setBounds(23, 152, 98, 28);
		frame.getContentPane().add(toggleLabel);
		
		JCheckBox toggle = new JCheckBox("Toggle On/Off");
		toggle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				toggleLabel.setText((toggle.isSelected()) ? "On" : "Off");
			}
		});
		toggle.setBounds(23, 109, 171, 21);
		frame.getContentPane().add(toggle);
		
		RadioListener listener = new RadioListener();
		
		radioLabel.setBounds(160, 185, 203, 28);
		frame.getContentPane().add(radioLabel);
		
		JRadioButton item1 = new JRadioButton("Item 1");
		buttonGroup.add(item1);
		item1.setBounds(44, 159, 103, 21);
		frame.getContentPane().add(item1);
		item1.addActionListener(listener);
		
		JRadioButton item2 = new JRadioButton("Item 2");
		buttonGroup.add(item2);
		item2.setBounds(44, 192, 103, 21);
		frame.getContentPane().add(item2);
		item2.addActionListener(listener);
		
		JRadioButton item3 = new JRadioButton("Item 3");
		buttonGroup.add(item3);
		item3.setBounds(44, 226, 103, 21);
		frame.getContentPane().add(item3);
		item3.addActionListener(listener);
		
		JButton addButton = new JButton("Add Label");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel addLabel = new JLabel("Label Added!");
				addLabel.setHorizontalAlignment(SwingConstants.CENTER);
				addLabel.setBounds(44, 301, 77, 28);
				frame.getContentPane().add(addLabel);
				frame.revalidate();
				frame.repaint();
			}
		});
		addButton.setBounds(36, 253, 111, 26);
		frame.getContentPane().add(addButton);
		
		JLabel removeLabel = new JLabel("Label Removed!");
		removeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		removeLabel.setBounds(255, 309, 145, 28);
		frame.getContentPane().add(removeLabel);
		
		JButton removeButton = new JButton("Remove Label");
		removeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.remove(removeLabel);
				frame.revalidate();
				frame.repaint();
			}
		});
		removeButton.setBounds(255, 253, 145, 28);
		frame.getContentPane().add(removeButton);
	}
}
