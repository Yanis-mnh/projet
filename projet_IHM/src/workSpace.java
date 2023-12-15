import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.ScrollPaneConstants;
import javax.swing.JList;
import javax.swing.BoxLayout;

public class workSpace extends JPanel {

	
	
	public workSpace() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
	}
	
	public void SetAskQst()
	{	
		JPanel panel = new AskQst_Panel();
		this.add(panel);
	}
	public void setAllQst()
	{
		
	}

}
