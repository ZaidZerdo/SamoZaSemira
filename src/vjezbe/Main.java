package vjezbe;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main extends JFrame {
	private static final long serialVersionUID = -3037227350838747481L;
	
	private JButton[] buttons = new JButton[5]; 
	private String[] textOnButtons = {"OK", "Close", "Exit", "Cancel", "Call"};
	
	public Main() {
		setLayout(new GridLayout(4, 2));
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(textOnButtons[i]);
			buttons[i].addActionListener(new Action());
			add(buttons[i]);
		}
		add(new JLabel());
		add(new JLabel());
		add(new JLabel());
		
		setTitle("GridLayout example");
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Main();
	}
	
	class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			for (int i = 0; i < buttons.length; i++) {
				if (e.getSource() == buttons[i]) {
					System.out.println(textOnButtons[i]);
				}
			}
		}
		
	}

}
