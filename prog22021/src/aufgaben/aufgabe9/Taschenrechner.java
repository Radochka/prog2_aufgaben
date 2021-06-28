package aufgaben.aufgabe9;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Taschenrechner extends JFrame{

	private boolean start;
	private String lastCommand;
	private double result;
	JButton display;

	public Taschenrechner() {
		super();
		setTitle("Taschenrechner");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel mainPanel = unit();
		this.getContentPane().add(mainPanel, BorderLayout.CENTER);
		setSize(300, 400);
		setVisible(true);
	}

	public JPanel unit() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		
		result = 0;
		lastCommand = "=";
		start = true;

		//верхнее полу для показа результата
		JPanel oben = new JPanel();
		oben.setLayout(new BorderLayout(30, 30));
		this.display = new JButton("0");
		this.display.setEnabled(false);
		this.display.setFont(this.display.getFont().deriveFont(30f));
		oben.add(this.display);

		ActionListener insert = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// liest ab, welche button gedruckt wurde
				String input = e.getActionCommand();
				if(start) {
					display.setText("");
					start = false;
				}
				display.setText(display.getText() + input);
			}
		};
		
		ActionListener command = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// rechnet
				String command = e.getActionCommand();
				if(start) {
					if(command.equals("-")) {
						display.setText(command);
						start = false;
					}
					else lastCommand = command;
				}
				else
				{
					//berechnung ausführen
					calculate(Double.parseDouble(display.getText()));
					lastCommand = command;
					start=true;
				}

			}
		};

		JPanel mitte = new JPanel();
		mitte.setLayout(new GridLayout(5, 4,5, 5));

		mitte.add(addButton("CE", command));//löscht die letzte eingegebene Zahl
		mitte.add(addButton("C", command)); //löscht alles
		mitte.add(addButton("(", insert));
		mitte.add(addButton(")", insert));
		mitte.add(addButton("7", insert));
		mitte.add(addButton("8", insert));
		mitte.add(addButton("9", insert));
		mitte.add(addButton("/", command));
		mitte.add(addButton("4", insert));
		mitte.add(addButton("5", insert));
		mitte.add(addButton("6", insert));
		mitte.add(addButton("*", command));



		mitte.add(addButton("1", insert));
		mitte.add(addButton("2", insert));
		mitte.add(addButton("3", insert));
		mitte.add(addButton("-", command));

		mitte.add(addButton("0", insert));
		mitte.add(addButton(".", insert));
		mitte.add(addButton("=", command));
		mitte.add(addButton("+", command));

		panel.add(oben, BorderLayout.NORTH);
		panel.add(mitte, BorderLayout.CENTER);

		return panel;

	}
	private JButton addButton(String label, ActionListener listener) {
		JButton button = new JButton(label);
		button.setFont(button.getFont().deriveFont(20f));
		button.addActionListener(listener);
		return button;

	}
	public void calculate(double x) {
		if(this.lastCommand.equals("+")) result += x;
		else if(this.lastCommand.equals("+")) result += x;
		else if(this.lastCommand.equals("-")) result -= x;
		else if(this.lastCommand.equals("*")) result *= x;
		else if(this.lastCommand.equals("/")) result /= x;
		else if(this.lastCommand.equals("=")) result = x;
		this.display.setText("" + result);
	}

	public static void main(String[] args) {
		new Taschenrechner();
	}
}
