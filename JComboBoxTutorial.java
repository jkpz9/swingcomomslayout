import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

public class JComboBoxTutorial {

	JFrame frame = new JFrame("JComboBox Demo");
	JPanel panel = new JPanel();

	JComboBox<String> comboBox = new JComboBox<String>();

	DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>();

	JTextField txtAdd = new JTextField(15);

	JButton btnAdd = new JButton("Add");

	JButton btnRemove = new JButton("Remove");

	String selectedValue;

	public JComboBoxTutorial() {
		comboBox.setModel(model);
		
		comboBox.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
				   	 selectedValue = model.getSelectedItem().toString();
				}
			}
		});

		// add event for buttons
		btnRemove.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				model.removeElement(selectedValue);
			}
		});

		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				model.addElement(txtAdd.getText().trim());			}
		});

		panel.add(txtAdd);
		panel.add(btnAdd);
		panel.add(comboBox);
		panel.add(btnRemove);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new JComboBoxTutorial();
			}
		});
	}
}