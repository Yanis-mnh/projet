import javax.swing.JPanel;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import net.miginfocom.swing.MigLayout;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AskQst_Panel extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public AskQst_Panel() {
		setLayout(new MigLayout("", "[grow][516.00,grow][grow]", "[71.00][242.00,grow][grow]"));
		
		textField = new JTextField();
		add(textField, "cell 1 1,grow");
		textField.setColumns(10);
		
		JButton submitBtn = new JButton("submit");
		
		// logique of submit go here me not backend so do youre stuff brozza 
		submitBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Question qst = new Question(getQstText());
			}
		});
		submitBtn.setBackground(new Color(121, 145, 151));
		submitBtn.setFont(new Font("Verdana", Font.BOLD, 12));
		submitBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				submitBtn.setBackground(new Color(51, 51, 51));
				submitBtn.setForeground(new Color(255, 255, 255));
				submitBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				submitBtn.setBackground(new Color(121, 145, 151));
				submitBtn.setForeground(new Color(0, 0, 0));
			}
		});
		submitBtn.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		submitBtn.setFocusPainted(false);
		submitBtn.setBorderPainted(false);
		submitBtn.setMargin(new Insets(1, 1, 1, 1));
		
		submitBtn.setPreferredSize(new Dimension(100,30));
		add(submitBtn, "cell 1 2,alignx right,aligny top");
		
		

	}


	public String getQstText() {
		return textField.getText();
	}

}
