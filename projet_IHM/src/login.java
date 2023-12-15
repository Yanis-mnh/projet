import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;
import javax.swing.JRadioButton;
import javax.swing.DropMode;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
public class login extends JFrame {

	private JPanel login_container;
	private JPasswordField password;
	private JTextField email;
	private login self = this;

	/**
	 * Create the frame.
	 */
	public login() {
		setResizable(false);
		setTitle("Login");
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setBounds(100, 100, 920, 540);
	    login_container = new JPanel();
	    login_container.setBackground(new Color(225, 225, 225));
	    login_container.setBorder(new EmptyBorder(5, 5, 5, 5));

	    setLocationRelativeTo(null);

	    setContentPane(login_container);
	    login_container.setLayout(null);
	    
	    JPanel panel = new JPanel();
	    panel.setForeground(new Color(0, 0, 0));
	    panel.setBorder(new LineBorder(new Color(51, 51, 51), 3, true));
	    panel.setBackground(new Color(255, 255, 255) );
	    panel.setBounds(192, 99, 536, 286);
	    login_container.add(panel);
	    panel.setLayout(null);
	    
	    password = new JPasswordField();
	    password.setForeground(new Color(26, 26, 26));
	    password.setBackground(new Color(255, 255, 255));
	    password.setFont(new Font("Verdana", Font.PLAIN, 15));
	    password.setBounds(174, 137, 285, 30);
	    panel.add(password);
	    
	    email = new JTextField();
	    email.setForeground(new Color(26, 26, 26));
	    email.setBackground(new Color(255, 255, 255));
	    email.setFont(new Font("Verdana", Font.PLAIN, 15));
	    email.setBounds(174, 81, 285, 30);
	    panel.add(email);
	    email.setColumns(10);
	    
	    
	    int xPos = (getWidth() - panel.getPreferredSize().width) / 2;
	    int yPos = (getHeight() - panel.getPreferredSize().height) / 3;
	    
	    panel.setLocation(xPos, yPos);
	    
	    JLabel EmailLbl = new JLabel("Email: ");
	    EmailLbl.setForeground(new Color(26, 26, 26));
	    EmailLbl.setFont(new Font("Verdana", Font.PLAIN, 18));
	    EmailLbl.setHorizontalAlignment(SwingConstants.LEFT);
	    EmailLbl.setBounds(55, 80, 90, 30);
	    panel.add(EmailLbl);
	    
	    JLabel passLbl = new JLabel("Password: ");
	    passLbl.setForeground(new Color(26, 26, 26));
	    passLbl.setHorizontalAlignment(SwingConstants.LEFT);
	    passLbl.setFont(new Font("Verdana", Font.PLAIN, 18));
	    passLbl.setBounds(56, 134, 114, 30);
	    panel.add(passLbl);
	    
	    JLabel new_user = new JLabel("dont have an acount");
	    new_user.setBounds(304, 191, 167, 14);
	    panel.add(new_user);
	    new_user.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseEntered(MouseEvent e) {
	    		new_user.setCursor(new Cursor(Cursor.HAND_CURSOR));
	    	}
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		signin frameRegister =  new signin();
	    		frameRegister.setLocationRelativeTo(self);
	    		dispose();
	    		
	    	}
	    });
	    new_user.setForeground(new Color(0, 0, 160));
	    new_user.setFont(new Font("Verdana", Font.PLAIN, 15));	    
	    	    
	    JButton loginBtn = new JButton("Login");
	    
	    loginBtn.setForeground(new Color(188, 188, 188));
	    loginBtn.setBounds(174, 228, 167, 30);
	    panel.add(loginBtn);
	    loginBtn.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseEntered(MouseEvent e) {
	    		loginBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
	    	}
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		
	    		login();
	    	}
	    });
	    loginBtn.setBackground(new Color(95, 95, 95));
	    loginBtn.setFont(new Font("Verdana", Font.BOLD, 17));
	    
	    JRadioButton rdbtnNewRadioButton = new JRadioButton("remember me");
	    rdbtnNewRadioButton.setFont(new Font("Verdana", Font.PLAIN, 13));
	    rdbtnNewRadioButton.setBackground(new Color(255, 255, 255));
	    rdbtnNewRadioButton.setBounds(55, 186, 121, 24);
	    panel.add(rdbtnNewRadioButton);
	    
	    
	    
	    
	    
	    
	    setVisible(true);
	    
	}
	

	private void login()
	{
		if( !(this.email.getText().isBlank()) && !(this.password.getPassword().length == 0))
		{
	
	
			MainPageEtudiant page =  new MainPageEtudiant();
			page.setLocationRelativeTo(self);
			//database shit go here brrrrrrrrrrrrrrrrrr
			// we have user name(Email) and password so we need to get the rest of the info to create an instance of the user class
			// User user = new User(name,username,email,password);
			dispose();
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
