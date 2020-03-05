package Admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JLabel;
public class AdminHomePage extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTable table_4;
	private JTable table_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminHomePage frame = new AdminHomePage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AdminHomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 1100, 1500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("HOME");
		btnNewButton.setFont(new Font("Constantia", Font.BOLD, 16));
		btnNewButton.setBounds(10, 69, 105, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CREATE CAMPAIGN OWNER");
		btnNewButton_1.setFont(new Font("Constantia", Font.BOLD, 16));
		btnNewButton_1.setBounds(113, 69, 261, 35);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("CRAETE LEADS OWNER");
		btnNewButton_2.setFont(new Font("Constantia", Font.BOLD, 16));
		btnNewButton_2.setBounds(373, 69, 231, 35);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("ADD PRODUCTS");
		btnNewButton_3.setFont(new Font("Constantia", Font.BOLD, 16));
		btnNewButton_3.setBounds(602, 69, 169, 35);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("PURCHASE ORDER");
		btnNewButton_4.setFont(new Font("Constantia", Font.BOLD, 16));
		btnNewButton_4.setBounds(768, 69, 193, 35);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("GST");
		btnNewButton_5.setFont(new Font("Constantia", Font.BOLD, 16));
		btnNewButton_5.setBounds(959, 69, 115, 35);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("LOGOUT");
		btnNewButton_6.setFont(new Font("Constantia", Font.BOLD, 16));
		btnNewButton_6.setBounds(959, 115, 115, 35);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("View Campaign");
		btnNewButton_7.setFont(new Font("Constantia", Font.BOLD, 11));
		btnNewButton_7.setBounds(75, 174, 120, 23);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("View Leads");
		btnNewButton_8.setFont(new Font("Constantia", Font.BOLD, 11));
		btnNewButton_8.setBounds(375, 174, 105, 23);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("View Quotes");
		btnNewButton_9.setFont(new Font("Constantia", Font.BOLD, 11));
		btnNewButton_9.setBounds(675, 174, 105, 23);
		contentPane.add(btnNewButton_9);
		
		table = new JTable();
		table.setBounds(10, 208, 281, 169);
		contentPane.add(table);
		
		table_1 = new JTable();
		table_1.setBounds(301, 208, 281, 169);
		contentPane.add(table_1);
		
		table_2 = new JTable();
		table_2.setBounds(592, 208, 269, 169);
		contentPane.add(table_2);
		
		JButton btnNewButton_10 = new JButton("View Salesorder");
		btnNewButton_10.setFont(new Font("Constantia", Font.BOLD, 11));
		btnNewButton_10.setBounds(75, 421, 120, 23);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("View Invoice");
		btnNewButton_11.setFont(new Font("Constantia", Font.BOLD, 11));
		btnNewButton_11.setBounds(375, 421, 105, 23);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("View Products");
		btnNewButton_12.setFont(new Font("Constantia", Font.BOLD, 11));
		btnNewButton_12.setBounds(675, 421, 115, 23);
		contentPane.add(btnNewButton_12);
		
		table_3 = new JTable();
		table_3.setBounds(10, 464, 281, 169);
		contentPane.add(table_3);
		
		table_4 = new JTable();
		table_4.setBounds(301, 464, 281, 169);
		contentPane.add(table_4);
		
		table_5 = new JTable();
		table_5.setBounds(592, 464, 269, 169);
		contentPane.add(table_5);
		
		JLabel lblNewLabel = new JLabel("ADMIN HOMEPAGE");
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 20));
		lblNewLabel.setBounds(28, 11, 231, 35);
		contentPane.add(lblNewLabel);
	}
}
