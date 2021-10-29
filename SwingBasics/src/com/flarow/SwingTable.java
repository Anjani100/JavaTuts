package com.flarow;

import java.awt.EventQueue;
import java.io.IOException;
import java.nio.file.*;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.JScrollPane;

public class SwingTable {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingTable window = new SwingTable();
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
	public SwingTable() {
		initialize();
	}
	
	class TableData extends AbstractTableModel {

		private static final long serialVersionUID = -2063217959381487137L;
		
		int[][] allData; // = new int[3][3];
		
		public TableData() {
//			allData[0] = new int[] {1, 2, 3};
//			allData[1] = new int[] {4, 5, 6};
//			allData[2] = new int[] {7, 8, 9};
			loadFile("data.csv");
		}
		
		void loadFile(String fileName) {
			Path file = FileSystems.getDefault().getPath("", fileName);
			try {
				List<String> lines = Files.readAllLines(file);
				for (int i = 0; i < lines.size(); i++) {
					String line = lines.get(i);
					String[] lineArray = line.split(",");
					if (allData == null) {
						allData = new int[lines.size()][lineArray.length];
					}
					for (int j = 0; j < lineArray.length; j++) {
						allData[i][j] = Integer.parseInt(lineArray[j]);
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		@Override
		public int getRowCount() {
			// TODO Auto-generated method stub
			return allData.length;
		}

		@Override
		public int getColumnCount() {
			// TODO Auto-generated method stub
			return allData[0].length;
		}

		@Override
		public Object getValueAt(int rowIndex, int columnIndex) {
			// TODO Auto-generated method stub
			return allData[rowIndex][columnIndex];
		}
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 416, 66);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		TableData data = new TableData();
		table.setModel(data);
	}
}
