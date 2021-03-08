package ventanas;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class WindowW implements ChangeListener{

	private JFrame frame;
	JCheckBox c1, c2, c3;
	ButtonGroup group;
	JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowW window = new WindowW();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WindowW() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 678, 530);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setBounds(21, 11, 86, 21);
		textField.setEditable(false);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		c1 = new JCheckBox("1");
		c1.setBounds(21, 41, 93, 21);
		c1.addChangeListener(this);
		frame.getContentPane().add(c1);
		
		c2 = new JCheckBox("2");
		c2.setBounds(21, 113, 93, 21);
		c2.addChangeListener(this);
		frame.getContentPane().add(c2);
		
		c3 = new JCheckBox("3");
		c3.setBounds(21, 211, 93, 21);
		c3.addChangeListener(this);
		frame.getContentPane().add(c3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(117, 11, 378, 221);
		frame.getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		if(c1.isSelected()==true) {
			textField.setText("1");
		} else if (c2.isSelected() == true) {
			textField.setText("2");
		} else if (c3.isSelected() == true) {
			textField.setText("3");
		} else {
			textField.setText("");
		}
		
		
	}
}
