package littleExos.rockPaperScissor;

import javax.swing.SwingUtilities;

public class App {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Frontend frontEnd = new Frontend();
				frontEnd.setVisible(true);
			}
			
		});
	}

}
