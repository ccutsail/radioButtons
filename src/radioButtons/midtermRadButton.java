package radioButtons;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JRadioButton;

public class midtermRadButton {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					midtermRadButton window = new midtermRadButton();
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
	public midtermRadButton() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 150, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		JRadioButton small = new JRadioButton("Small");
		panel.add(small);
		small.setSelected(true);
		
		JRadioButton medium = new JRadioButton("Medium");
		panel.add(medium);
		
		JRadioButton large = new JRadioButton("Large");
		panel.add(large);
		
		ButtonGroup btnGroup = new ButtonGroup();
		btnGroup.add(large);
		btnGroup.add(medium);
		btnGroup.add(small);
	}

}
