import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.*;

public class JButtonTutorial {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame();
				JButton button = new JButton("Accept");
				button.setPreferredSize(new Dimension(300,100));
				frame.add(button);

				button.setIcon(new ImageIcon(getClass().getResource(
                        "com/icon/icons8-checked-48.png")));

				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame.pack();
				frame.setVisible(true);
			}
		});
	}
}
