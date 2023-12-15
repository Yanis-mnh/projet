import java.awt.EventQueue;

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
