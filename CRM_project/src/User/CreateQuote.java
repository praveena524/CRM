package User;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Admin.SignUp;

public class CreateQuote extends JFrame {
	public static CreateQuote frame;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new CreateQuote();
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
	public CreateQuote() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 0, 1200, 788);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnHome = new JButton("HOME");
		btnHome.setBounds(0, 0, 170, 40);
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.setLayout(null);
		btnHome.setFont(new Font("Constantia", Font.BOLD, 13));
		contentPane.add(btnHome);
		
		
		
		JButton btnCampaingn = new JButton("CAMPAIGN");
		btnCampaingn.setBounds(158, 0, 170, 40);
		btnCampaingn.setFont(new Font("Constantia", Font.BOLD, 13));
		btnCampaingn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		contentPane.add(btnCampaingn);
		
		JButton btnNewButton_1 = new JButton("LEADS");
		btnNewButton_1.setBounds(327, 0, 170, 40);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent  e) {
			}
		});
		btnNewButton_1.setFont(new Font("Constantia", Font.BOLD, 13));
		contentPane.add(btnNewButton_1);
		
		JButton btnQuotes = new JButton("QUOTES");
		btnQuotes.setBounds(495, 0, 170, 40);
		btnQuotes.setFont(new Font("Constantia", Font.BOLD, 13));
		btnQuotes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent  e) {
			}
		});
		contentPane.add(btnQuotes);
		
		JButton btnNewButton_2 = new  JButton("SALESORDER");
		btnNewButton_2.setBounds(482, 0, 122, 40);
		btnNewButton_2.setFont(new Font("Constantia", Font.BOLD, 13));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("INVOICE");
		btnNewButton_3.setBounds(662, 0, 170, 40);
		btnNewButton_3.setFont(new Font("Constantia", Font.BOLD, 13));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnNewButton_3);
		
		JButton btnProduct = new JButton("PRODUCT");
		btnProduct.setBounds(830, 0, 170, 40);
		btnProduct.setFont(new Font("Constantia", Font.BOLD, 13));
		btnProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnProduct);
		
		JButton btnPurchaseOrder = new JButton("LOGOUT");
		btnPurchaseOrder.setBounds(998, 0, 174, 40);
		btnPurchaseOrder.setFont(new Font("Constantia", Font.BOLD, 13));
		btnPurchaseOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnPurchaseOrder);
		
		JLabel lblCreateQuotes = new JLabel(" Create Quotes");
		lblCreateQuotes.setBounds(0, 54, 192, 35);
		lblCreateQuotes.setFont(new Font("Constantia", Font.BOLD, 20));
		contentPane.add(lblCreateQuotes);
		
		JLabel lblNewLabel = new JLabel("Quote No");
		lblNewLabel.setBounds(888, 55, 75, 35);
		lblNewLabel.setFont(new Font("Constantia", Font.PLAIN, 15));
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(1028, 62, 86, 20);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Quote Date");
		lblNewLabel_1.setBounds(888, 119, 75, 35);
		lblNewLabel_1.setFont(new Font("Constantia", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(1028, 126, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel(" Quote Name");
		lblNewLabel_2.setBounds(91, 106, 101, 25);
		lblNewLabel_2.setFont(new Font("Constantia", Font.PLAIN, 17));
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(236, 106, 248, 25);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Lead Name");
		lblNewLabel_3.setBounds(91, 167, 122, 25);
		lblNewLabel_3.setFont(new Font("Constantia", Font.PLAIN, 17));
		contentPane.add(lblNewLabel_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(236, 354, 245, 23);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel_4 = new JLabel("Email I.d");
		lblNewLabel_4.setBounds(91, 224, 75, 25);
		lblNewLabel_4.setFont(new Font("Constantia", Font.PLAIN, 17));
		contentPane.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(236, 224, 248, 25);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblMobileNo = new JLabel("Contact No");
		lblMobileNo.setBounds(91, 291, 101, 25);
		lblMobileNo.setFont(new Font("Constantia", Font.PLAIN, 17));
		contentPane.add(lblMobileNo);
		
		textField_3 = new JTextField();
		textField_3.setBounds(236, 291, 248, 25);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Product");
		lblNewLabel_5.setBounds(91, 353, 75, 25);
		lblNewLabel_5.setFont(new Font("Constantia", Font.PLAIN, 17));
		contentPane.add(lblNewLabel_5);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(236, 167, 245, 25);
		contentPane.add(comboBox_2);
		
		JLabel lblNewLabel_6 = new  JLabel("Unit Price");
		lblNewLabel_6.setBounds(91, 423, 101, 25);
		lblNewLabel_6.setFont(new Font("Constantia", Font.PLAIN, 17));
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Quantity");
		lblNewLabel_7.setBounds(91, 490, 101, 25);
		lblNewLabel_7.setFont(new Font("Constantia", Font.PLAIN, 17));
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Quote Valid Till");
		lblNewLabel_8.setBounds(91, 555, 122, 20);
		lblNewLabel_8.setFont(new Font("Constantia", Font.PLAIN, 17));
		contentPane.add(lblNewLabel_8);
		
		textField_4 = new JTextField();
		textField_4.setBounds(236, 423, 245, 25);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(236, 491, 245, 23);
		contentPane.add(comboBox_3);
		
		textField_5 = new JTextField();
		textField_5.setBounds(236, 553, 248, 25);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		Button button = new Button("Save");
		button.setBounds(143, 636, 86, 35);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UserHomePage.main(new String[] {});
				frame.dispose();
			
			}
		});
		contentPane.add(button);
		
		Button button_1 = new Button("Cancel");
		button_1.setBounds(379, 636, 70, 35);
		contentPane.add(button_1);
		
		Button button_2 = new Button("Save and New");
		button_2.setBounds(254, 636, 86, 35);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) 
					     {
						 String q_n = textField_1.getText();
						 String e   = textField_2.getText();
						 String m   = textField_3.getText();
						 String u_p = textField_4.getText();
						 String q   = textField_5.getText();
						 
						// String a = textArea.getText();
						 //String ci= comboBox.getSelectedItem().toString();
						 //String st= comboBox_1.getSelectedItem().toString();
						 //String co= comboBox_2.getSelectedItem().toString();
						 //String cn= textField_6.getText();
			
						 int status;
						 try {
						 status=CreateQuoteDB.saveAccount(q_n, e, m, u_p, q);
						 if(status==0)
						 {
						 JOptionPane.showMessageDialog(null, "Details is not saved");
						 }
						 else
						 {
						 JOptionPane.showMessageDialog(null,"Details has been Saved");
						 
						 textField_1.setText("");
						 textField_2.setText("");
						 textField_3.setText("");
						 textField_4.setText("");
						 textField_5.setText("");
						// textArea.setText("");
						 //comboBox.setSelectedItem("");
						 //comboBox_1.setSelectedItem("");
						 //comboBox_2.setSelectedItem("");
						 //textField_6.setText("");
						 }
						 }
						 catch(Exception e1) {
						 e1.printStackTrace();
						 }
					     }
					     });
			
				//CreateQuote.main(new String[] {});
				//frame.dispose();
			
			}
		});
		contentPane.add(button_2);
		
		Button button_3 = new Button("Generate Sales order");
		button_3.setBounds(495, 636, 170, 35);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(button_3);

	}

}
