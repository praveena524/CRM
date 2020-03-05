package Admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class PurchaseOrder extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PurchaseOrder frame = new PurchaseOrder();
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
	public PurchaseOrder() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 979, 527);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPurchaseOrder = new JLabel("Purchase Order");
		lblPurchaseOrder.setFont(new Font("Times New Roman", Font.BOLD, 23));
		lblPurchaseOrder.setBounds(10, 0, 306, 34);
		contentPane.add(lblPurchaseOrder);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton.setBounds(10, 50, 122, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Campaign");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton_1.setBounds(130, 50, 122, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnLeads = new JButton("Leads");
		btnLeads.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnLeads.setBounds(250, 50, 122, 25);
		contentPane.add(btnLeads);
		
		JButton btnQuotes = new JButton("Quotes");
		btnQuotes.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnQuotes.setBounds(370, 50, 122, 25);
		contentPane.add(btnQuotes);
		
		JButton btnSalesorer = new JButton("SalesOrder");
		btnSalesorer.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnSalesorer.setBounds(490, 50, 122, 25);
		contentPane.add(btnSalesorer);
		
		JButton btnInvoice = new JButton("Invoice");
		btnInvoice.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnInvoice.setBounds(610, 50, 122, 25);
		contentPane.add(btnInvoice);
		
		JButton btnProucts = new JButton("Proucts");
		btnProucts.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnProucts.setBounds(730, 50, 122, 25);
		contentPane.add(btnProucts);
		
		JButton btnPurchaseorder = new JButton("Logout");
		btnPurchaseorder.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnPurchaseorder.setBounds(853, 9, 75, 25);
		contentPane.add(btnPurchaseorder);
		
		JLabel lblCompanName = new JLabel("Compan Name");
		lblCompanName.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblCompanName.setBounds(10, 100, 129, 18);
		contentPane.add(lblCompanName);
		
		JLabel lblVenorName = new JLabel("Venor Name");
		lblVenorName.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblVenorName.setBounds(10, 150, 129, 23);
		contentPane.add(lblVenorName);
		
		textField = new JTextField();
		textField.setBounds(200, 100, 250, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(200, 150, 250, 30);
		contentPane.add(textField_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(10, 200, 538, 114);
		contentPane.add(table);
		
		textField_2 = new JTextField();
		textField_2.setBounds(462, 325, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(462, 356, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(462, 387, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblSubTotal = new JLabel("Sub total");
		lblSubTotal.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblSubTotal.setBounds(359, 325, 86, 20);
		contentPane.add(lblSubTotal);
		
		JLabel lblGst = new JLabel("GST");
		lblGst.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblGst.setBounds(356, 359, 75, 17);
		contentPane.add(lblGst);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblTotal.setBounds(359, 390, 46, 14);
		contentPane.add(lblTotal);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnCancel.setBounds(316, 424, 89, 23);
		contentPane.add(btnCancel);
		
		JButton btnSave = new JButton("Save");
		btnSave.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnSave.setBounds(139, 424, 89, 23);
		contentPane.add(btnSave);

	}

}
