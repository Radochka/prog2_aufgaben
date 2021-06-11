package vorlesungen.gui;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ereignisbehandlung extends JFrame implements ActionListener{

	JLabel unten;
	Integer anzKlicks = 0;
	
	public Ereignisbehandlung() {
		super();
		setTitle("Ereignisbehalndlung");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel mainPanel = unit();

		this.getContentPane().add(mainPanel, BorderLayout.CENTER);
		setSize(200,150);
		setVisible(true);

	}

	public JPanel unit() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());

		JPanel oben = new JPanel();
		JButton plus = new JButton("+");
		JButton minus = new JButton("-");
		plus.addActionListener(this);
		minus.addActionListener(this);
		oben.add(minus);
		oben.add(plus);
		
		

		//JLabel unten = new JLabel("0");
		this.unten = new JLabel(this.anzKlicks.toString());
		unten.setFont(new Font("Verdana", Font.BOLD, 48));
		unten.setHorizontalAlignment(JLabel.CENTER);

		panel.add(oben, BorderLayout.NORTH);
		panel.add(unten, BorderLayout.CENTER);

		return panel;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object quelle = e.getSource();
		if(quelle instanceof JButton) {
			JButton button = (JButton) quelle;
			if(button.getText().equals("+")) {
				this.anzKlicks++;
			}
			else if(button.getText().equals("-")) {
				this.anzKlicks--;
			}
		}
		this.unten.setText(this.anzKlicks.toString());
	}


	public static void main(String[] args) {
		new Ereignisbehandlung();
	}

}
