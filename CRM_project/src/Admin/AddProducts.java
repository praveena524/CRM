package Admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.Button;

public class AddProducts extends JFrame {

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
					AddProducts frame = new AddProducts();
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
	public AddProducts() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 730, 642);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddProduct = new JLabel("Add Product");
		lblAddProduct.setFont(new Font("Constantia", Font.BOLD, 20));
		lblAddProduct.setBounds(291, 23, 251, 48);
		contentPane.add(lblAddProduct);
		
		JLabel lblProductId = new JLabel("Product I .D");
		lblProductId.setFont(new Font("Constantia", Font.PLAIN, 17));
		lblProductId.setBounds(69, 96, 151, 31);
		contentPane.add(lblProductId);
		
		textField = new JTextField();
		textField.setBounds(292, 101, 185, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Product Name");
		lblNewLabel.setFont(new Font("Constantia", Font.PLAIN, 17));
		lblNewLabel.setBounds(69, 164, 151, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Status");
		lblNewLabel_1.setFont(new Font("Constantia", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(70, 231, 150, 31);
		contentPane.add(lblNewLabel_1);
		
		JRadioButton rdbtnActive = new JRadioButton("Active");
		rdbtnActive.setFont(new Font("Constantia", Font.PLAIN, 14));
		rdbtnActive.setBounds(136, 269, 66, 23);
		contentPane.add(rdbtnActive);
		
		JRadioButton rdbtnInactive = new JRadioButton("Inactive");
		rdbtnInactive.setFont(new Font("Constantia", Font.PLAIN, 14));
		rdbtnInactive.setBounds(246, 269, 86, 23);
		contentPane.add(rdbtnInactive);
		
		JLabel lblUnitPrice = new JLabel("Unit Price");
		lblUnitPrice.setFont(new Font("Constantia", Font.PLAIN, 17));
		lblUnitPrice.setBounds(69, 332, 133, 31);
		contentPane.add(lblUnitPrice);
		
		textField_1 = new JTextField();
		textField_1.setBounds(291, 337, 185, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(291, 167, 185, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblQuantityInStock = new JLabel("Quantity in Stock");
		lblQuantityInStock.setFont(new Font("Constantia", Font.PLAIN, 17));
		lblQuantityInStock.setBounds(69, 400, 151, 26);
		contentPane.add(lblQuantityInStock);
		
		textField_3 = new JTextField();
		textField_3.setBounds(291, 406, 185, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Atomatically Generate to Vendor");
		chckbxNewCheckBox.setFont(new Font("Constantia", Font.PLAIN, 14));
		chckbxNewCheckBox.setBounds(155, 458, 251, 31);
		contentPane.add(chckbxNewCheckBox);
		
		Button button = new Button("Save");
		button.setBounds(320, 529, 86, 31);
		contentPane.add(button);
	}
}
