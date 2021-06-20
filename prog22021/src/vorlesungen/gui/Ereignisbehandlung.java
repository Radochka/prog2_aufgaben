package vorlesungen.gui;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ereignisbehandlung extends JFrame{

	JLabel unten;
	Integer anzKlicks = 0;
	
	public Ereignisbehandlung() {
		super();
		setTitle("Ereignisbehalndlung");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel mainPanel = this.unit(); // создаем панель
		this.getContentPane().add(mainPanel, BorderLayout.CENTER);//созданную панель приклепляем нашему окну
		
		setSize(200,150);
		setVisible(true); // делаем окно видимым

	}

	public JPanel unit() {
		JPanel panel = new JPanel(); // создаем панель
		panel.setLayout(new BorderLayout());//с layoutom borderLayout

		JPanel oben = new JPanel();
		JButton plus = new JButton("+");
		JButton minus = new JButton("-");
		
		//ActionHandler ah = new ActionHandler();
		plus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Ereignisbehandlung.this.anzKlicks++;
				System.out.println("Plus-Button geklickt ... " + Ereignisbehandlung.this.anzKlicks);
				Ereignisbehandlung.this.unten.setText(Ereignisbehandlung.this.anzKlicks.toString());
			}
		}); 
		
		minus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Ereignisbehandlung.this.anzKlicks--;
				System.out.println("Minus-Button geklickt ... " + Ereignisbehandlung.this.anzKlicks);
				Ereignisbehandlung.this.unten.setText(Ereignisbehandlung.this.anzKlicks.toString());
			}
		});
		
		
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
/*
	public class ActionHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Object quelle = e.getSource(); // hat ActionEvent ausgeloest
			if(quelle instanceof JButton) {
				JButton button = (JButton) quelle;
				if(button.getText().equals("+")) {
					Ereignisbehandlung.this.anzKlicks++;
					System.out.println("Plus-Button geklickt ... " + Ereignisbehandlung.this.anzKlicks);
				}
				else if(button.getText().equals("-")) {
					Ereignisbehandlung.this.anzKlicks--;
					System.out.println("Minus-Button geklickt ... " + Ereignisbehandlung.this.anzKlicks);
				}
			}
			Ereignisbehandlung.this.unten.setText(Ereignisbehandlung.this.anzKlicks.toString());
		}
		
	}
*/
	public static void main(String[] args) {
		new Ereignisbehandlung();
	}

}
