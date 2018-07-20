import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutTutorial {

	JFrame frame = new JFrame("CardLayout Demo");

	JPanel panelCont = new JPanel();
	JPanel panelFirst = new JPanel();
	JPanel panelSecond = new JPanel();

	JButton buttonOne = new JButton("Switch to sencond panel/workspace");
	JButton buttonTwo = new JButton("Switch to first panel/workspace");

	CardLayout cl = new CardLayout();

	public CardLayoutTutorial() {
		panelCont.setLayout(cl);

		panelFirst.setBackground(new Color(35, 155, 86));
		panelFirst.add(buttonOne);
		panelSecond.setBackground(new Color(33, 47, 61));
		panelSecond.add(buttonTwo);

		panelCont.add(panelFirst, "1");
		panelCont.add(panelSecond, "2");

		cl.show(panelCont, "1");

		// button event
		buttonOne.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				cl.show(panelCont, "2");
			}
		});

		buttonTwo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				cl.show(panelCont, "1");
			}
		});

		frame.add(panelCont);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

	}


	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new CLayout();
			}
		});
	}
}