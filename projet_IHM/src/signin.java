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
import javax.swing.JFormattedTextField;

public class signin extends JFrame {

	private JPanel login_container;
	private JPasswordField passwordField;
	private JTextField textField;
	private JFrame self = this;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;

		/**
		 * Create the frame.
		 */
	public signin() {
		setResizable(false);
		setTitle("Register");
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setBounds(100, 100, 920, 540);
	    login_container = new JPanel();
	    login_container.setBackground(new Color(188, 188, 188));
	    login_container.setBorder(new EmptyBorder(5, 5, 5, 5));

	    setLocationRelativeTo(null);

	    setContentPane(login_container);
	    login_container.setLayout(null);
	    
	    JPanel panel = new JPanel();
	    panel.setBorder(new LineBorder(new Color(51, 51, 51), 3, true));
	    panel.setBackground(new Color(255, 255, 255) );
	    panel.setBounds(184, 40, 551, 451);
	    login_container.add(panel);
	    panel.setLayout(null);
	    
	    passwordField = new JPasswordField();
	    passwordField.setFont(new Font("Verdana", Font.PLAIN, 15));
	    passwordField.setBounds(212, 148, 247, 30);
	    panel.add(passwordField);
	    
	    textField = new JTextField();
	    textField.setFont(new Font("Verdana", Font.PLAIN, 15));
	    textField.setBounds(212, 104, 247, 30);
	    panel.add(textField);
	    textField.setColumns(10);
	    
	    //center the panel to the screen
	    
	    int xPos = (getWidth() - panel.getPreferredSize().width) / 2;
	    int yPos = (getHeight() - panel.getPreferredSize().height) / 3;
	    
	    panel.setLocation(xPos, yPos);
	    
	    JLabel UsernameLbl = new JLabel("Username:");
	    UsernameLbl.setFont(new Font("Verdana", Font.BOLD, 15));
	    UsernameLbl.setHorizontalAlignment(SwingConstants.LEFT);
	    UsernameLbl.setBounds(58, 104, 90, 30);
	    panel.add(UsernameLbl);
	    	    
	    JButton loginBtn = new JButton("SIGN IN");
	    loginBtn.setBounds(146, 355, 241, 39);
	    panel.add(loginBtn);
	    loginBtn.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseEntered(MouseEvent e) {
	    		loginBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
	    	}
	    });
	    loginBtn.setBackground(new Color(255, 255, 255));
	    loginBtn.setFont(new Font("Verdana", Font.BOLD, 15));
	    
	    JRadioButton genderMale = new JRadioButton("Male");
	    genderMale.setFont(new Font("Verdana", Font.PLAIN, 13));
	    genderMale.setBackground(new Color(255, 255, 255));
	    genderMale.setBounds(58, 283, 121, 24);
	    panel.add(genderMale);
	    
	    JLabel loginLbl = new JLabel("< login?");
	    loginLbl.setForeground(new Color(0, 0, 128));
	    loginLbl.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		login loginFrame = new login();
	    		loginFrame.setLocationRelativeTo(self);
	    		dispose();
	    	}
	    	@Override
	    	public void mouseEntered(MouseEvent e) {
	    		loginLbl.setCursor(new Cursor(Cursor.HAND_CURSOR));
	    	
	    	}
	    });
	    loginLbl.setFont(new Font("Verdana", Font.BOLD, 13));
	    loginLbl.setBounds(10, 11, 70, 24);
	    panel.add(loginLbl);
	    
	    JRadioButton genderFemale = new JRadioButton("Female");
	    genderFemale.setHorizontalAlignment(SwingConstants.RIGHT);
	    genderFemale.setFont(new Font("Verdana", Font.PLAIN, 13));
	    genderFemale.setBackground(Color.WHITE);
	    genderFemale.setBounds(360, 283, 99, 24);
	    panel.add(genderFemale);
	    
	    JLabel EmailLbl = new JLabel("Email:");
	    EmailLbl.setHorizontalAlignment(SwingConstants.LEFT);
	    EmailLbl.setFont(new Font("Verdana", Font.BOLD, 15));
	    EmailLbl.setBounds(58, 148, 90, 30);
	    panel.add(EmailLbl);
	    
	    JLabel EmailLbl_1 = new JLabel("password: ");
	    EmailLbl_1.setHorizontalAlignment(SwingConstants.LEFT);
	    EmailLbl_1.setFont(new Font("Verdana", Font.BOLD, 15));
	    EmailLbl_1.setBounds(58, 193, 90, 30);
	    panel.add(EmailLbl_1);
	    
	    JLabel EmailLbl_1_1 = new JLabel("confirm password: ");
	    EmailLbl_1_1.setHorizontalAlignment(SwingConstants.LEFT);
	    EmailLbl_1_1.setFont(new Font("Verdana", Font.BOLD, 15));
	    EmailLbl_1_1.setBounds(58, 234, 156, 30);
	    panel.add(EmailLbl_1_1);
	    
	    passwordField_1 = new JPasswordField();
	    passwordField_1.setFont(new Font("Verdana", Font.PLAIN, 15));
	    passwordField_1.setBounds(212, 234, 247, 30);
	    panel.add(passwordField_1);
	    
	    passwordField_2 = new JPasswordField();
	    passwordField_2.setFont(new Font("Verdana", Font.PLAIN, 15));
	    passwordField_2.setBounds(212, 189, 247, 30);
	    panel.add(passwordField_2);
	    
	    
	    
	    
	    setVisible(true);
	    
	    
	}
}

