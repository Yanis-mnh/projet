

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import java.awt.BorderLayout;

import javax.security.auth.login.LoginContext;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JMenuBar;
import javax.swing.SwingConstants;
import javax.swing.JToolBar;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Insets;

import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import java.awt.Component;

public class MainPageEtudiant extends JFrame {

	private JPanel contentPane;
	private Dimension buttonSize = new Dimension(100,30);
	private JFrame self = this;
	private int currentStat = 0;
	
	/**
	 * Create the frame.
	 */
	public MainPageEtudiant() {
		//resolution 1366 x 768
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1092, 614);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(188, 188, 188));
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));

		setContentPane(contentPane);
	    contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
	    
	    JPanel mainPanel = new JPanel();
	    mainPanel.setBackground(new Color(188, 188, 188));
	    contentPane.add(mainPanel);
	    mainPanel.setLayout(new MigLayout("", "[left][768.00,grow,fill][trailing][pref!,grow]", "[top][397.00,grow,fill][pref!,grow]"));
	    
	    JLabel space_2 = new JLabel("New label");
	    space_2.setVisible(false);
	    
	    JButton logoutBtn = new JButton("Log out");
	    logoutBtn.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mousePressed(MouseEvent e) {
	    		login frame = new login();
	    		frame.setLocationRelativeTo(self);
	    		self.dispose();
	    	}
	    });
	    logoutBtn.setForeground(new Color(188, 188, 188));
	    logoutBtn.setFont(new Font("Verdana", Font.BOLD, 15));
	    logoutBtn.setBackground(new Color(80, 99, 103));
	    logoutBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
	    logoutBtn.setBorder(new LineBorder(new Color(0, 0, 0), 2));
	    logoutBtn.setFocusPainted(false);
	    logoutBtn.setBorderPainted(false);
	    logoutBtn.setPreferredSize(buttonSize);
	    logoutBtn.setMargin(new Insets(1, 1, 1, 1));
	    
	    mainPanel.add(logoutBtn, "cell 2 0,alignx center");
	    mainPanel.add(space_2, "cell 0 1");
	    
	    JPanel workSpace = new JPanel();
	    workSpace.setBorder(new LineBorder(new Color(51, 51, 51), 2, true));
	    mainPanel.add(workSpace, "cell 1 1 2 1,grow");
	    MigLayout layout = new MigLayout("fillx", "[686.00,grow]", "[grow 1][grow]");
	    workSpace.setLayout(layout);
	    
	    JPanel butonMenuContainer = new JPanel();
	    butonMenuContainer.setBackground(new Color(255, 255, 255, 0));
	    workSpace.add(butonMenuContainer, "cell 0 0,grow");
	    FlowLayout fl_butonMenuContainer = new FlowLayout(FlowLayout.LEFT, 2, 1);
	    fl_butonMenuContainer.setAlignOnBaseline(true);
	    butonMenuContainer.setLayout(fl_butonMenuContainer);
	    
	    
	    JPanel mainPanelWork = new workSpace();
	    mainPanelWork.setBorder(new LineBorder(new Color(192, 192, 192), 2, true));
	    mainPanelWork.setBackground(new Color(0, 0, 64));
	    workSpace.add(mainPanelWork, "cell 0 1,growy,growx");
	    mainPanelWork.setLayout(new BoxLayout(mainPanelWork, BoxLayout.X_AXIS));
	    
	   
	    //buton logic go here
	    
	    JButton qst = makeBnt("Quetion");
	    butonMenuContainer.add(qst);
	    qst.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(currentStat == 0 )
					return;
				JPanel panel = new AskQst_Panel();
				mainPanelWork.removeAll();
;				mainPanelWork.add(panel);
				mainPanelWork.revalidate();
				mainPanelWork.repaint();
				System.out.println("potato");
				currentStat = 0;
			}
		});
	    
	    
	    
	    
	    JButton askQst = makeBnt("Ask Quetion");
	    butonMenuContainer.add(askQst);
	    askQst.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(currentStat == 1 )
					return;
				JPanel panel = new AskQst_Panel();
				mainPanelWork.removeAll();
;				mainPanelWork.add(panel);
				mainPanelWork.revalidate();
				mainPanelWork.repaint();
				System.out.println("potato");
				currentStat = 1;
			}
		});
	    
	    
	    
	    
	    JButton yQst =  makeBnt("Your Quetion");
	    butonMenuContainer.add(yQst);
	    
	    
	    
	    
	    JButton file = makeBnt("TP/TD/Cours");
	    butonMenuContainer.add(file);
	    
	    
	   
	    
	    
	    
	    JLabel space_1 = new JLabel("New label");
	    mainPanel.add(space_1, "cell 3 1");
	    space_1.setVisible(false);
	    
		setVisible(true);
	}
	
	
	private JButton makeBnt(String name)
	{
		JButton btn = new JButton(name);
		btn.setBackground(new Color(121, 145, 151));
		btn.setFont(new Font("Verdana", Font.BOLD, 12));
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn.setBackground(new Color(51, 51, 51));
				btn.setForeground(new Color(255, 255, 255));
				btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btn.setBackground(new Color(121, 145, 151));
				btn.setForeground(new Color(0, 0, 0));
			}
		});
		btn.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		btn.setFocusPainted(false);
		btn.setBorderPainted(false);
		btn.setMargin(new Insets(1, 1, 1, 1));
		
		btn.setPreferredSize(new Dimension(buttonSize));
		return btn;
	}
}
