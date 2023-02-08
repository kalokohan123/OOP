package Main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Login {

	private JFrame frame;
	private JTextField txtUserName;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frame = new JFrame("Login");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\THIRD\\OOP Calculator\\IMG\\3706.png_300.png"));
		frame.setBounds(100, 100, 318, 344);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblUsername.setBounds(80, 192, 86, 14);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPassword.setBounds(80, 240, 86, 14);
		frame.getContentPane().add(lblPassword);
		
		txtUserName = new JTextField();
		txtUserName.setBounds(80, 165, 141, 26);
		frame.getContentPane().add(txtUserName);
		txtUserName.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(80, 217, 141, 26);
		frame.getContentPane().add(txtPassword);
		
//Login Button
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName = txtUserName.getText();
				String password = txtPassword.getText();
				
				if (userName == null || userName.isEmpty() || password == null || password.isEmpty()) {
					JOptionPane.showMessageDialog(frame, "Please enter username and password", "Warning", JOptionPane.WARNING_MESSAGE);
					
				}else if (userName.contains("admin") && password.contains("admin123")) {
					txtUserName.setText(null);
					txtPassword.setText(null);
					
					frame.dispose();	
					calc calculator = new calc();	
					calculator.setVisible(true);
					System.out.println("Succes");
				}else {
					JOptionPane.showMessageDialog(null, "Invalid Login Details", "Login Error", JOptionPane.ERROR_MESSAGE);
				}	
			}	
		});
		
		btnLogin.setBounds(135, 265, 86, 23);
		frame.getContentPane().add(btnLogin);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\THIRD\\OOP Calculator\\IMG\\istockphoto-952969676-612x612.png"));
		lblNewLabel.setBounds(94, 11, 114, 132);
		frame.getContentPane().add(lblNewLabel);
	}
}
