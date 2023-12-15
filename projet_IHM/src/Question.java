import javax.swing.JPanel;

public class Question extends JPanel {
	private String writer;
	private String subject;
	private String answer;
	
	public Question(String subject) {
		this.subject = subject;
		this.answer = null;
	}
	
	public Question(String subject, String answer) {
		this.subject = subject;
		this.answer = answer;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
}
