package Admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import User.UserSignIn;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignUp extends JFrame {
    public static SignUp frame;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new SignUp();
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
	public SignUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeToCrm = new JLabel("WELCOME TO CRM APPLICATION");
		lblWelcomeToCrm.setForeground(Color.BLUE);
		lblWelcomeToCrm.setFont(new Font("Constantia", Font.BOLD, 20));
		lblWelcomeToCrm.setBounds(285, 28, 332, 26);
		contentPane.add(lblWelcomeToCrm);
		
		JLabel lblNewLabel = new JLabel("SIGN UP");
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 18));
		lblNewLabel.setBounds(377, 95, 75, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("EMAIL");
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1.setBounds(220, 280, 79, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("NAME");
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_2.setBounds(220, 200, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("PASSWORD");
		lblNewLabel_3.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_3.setBounds(220, 240, 79, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("MOBILE");
		lblNewLabel_4.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_4.setBounds(220, 320, 79, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("ROLE");
		lblNewLabel_5.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_5.setBounds(220, 360, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(350, 188, 175, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(350, 231, 175, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(350, 271, 175, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(350, 311, 175, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(350, 354, 175, 26);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				SignUp.main(new String[] {});	
			}
		});
		btnNewButton.setFont(new Font("Constantia", Font.BOLD, 14));
		btnNewButton.setBounds(240, 412, 89, 23);
		contentPane.add(btnNewButton);
		
		
		JButton btnNewButton_2 = new JButton("RESET");
		btnNewButton_2.setFont(new Font("Constantia", Font.BOLD, 14));
		btnNewButton_2.setBounds(500, 412, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_6 = new JLabel("Or Existing User");
		lblNewLabel_6.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_6.setBounds(376, 474, 115, 14);
		contentPane.add(lblNewLabel_6);
		
		JButton btnNewButton_3 = new JButton("ADMIN SIGN IN");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				login.main(new String[] {});
			}
		});
		btnNewButton_3.setFont(new Font("Constantia", Font.BOLD, 14));
		btnNewButton_3.setBounds(266, 519, 145, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("USER SIGN IN");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				UserSignIn.main(new String[] {});
			}
		});
		btnNewButton_4.setFont(new Font("Constantia", Font.BOLD, 14));
		btnNewButton_4.setBounds(441, 519, 145, 23);
		contentPane.add(btnNewButton_4);
		
		
	}
}
