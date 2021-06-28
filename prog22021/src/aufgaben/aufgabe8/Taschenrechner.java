package aufgaben.aufgabe8;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Taschenrechner extends JFrame{

	
	public Taschenrechner() {
		super();
		setTitle("Taschenrechner");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel mainPanel = unit();
		
		this.getContentPane().add(mainPanel, BorderLayout.CENTER);
		setSize(300, 500);
		setVisible(true);
		
	}
	public JPanel unit() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		
		JPanel oben = new JPanel();
		oben.setLayout(new BorderLayout(30, 30));
//		JButton display = new JButton("0");
//        display.setEnabled(false);
//        display.setFont(display.getFont().deriveFont(30f));
//        oben.add(display);
        
		JTextField display = new JTextField("0");
		display.setEnabled(false);
		display.setFont(new Font("Verdana", Font.BOLD, 48));
		display.setHorizontalAlignment(JLabel.RIGHT);
		oben.add(display);
		
		JPanel mitte = new JPanel();
        mitte.setLayout(new GridLayout(6, 3, 20, 20));
        mitte.add(new JButton("1"));
        mitte.add(new JButton("2"));
        mitte.add(new JButton("3"));
        mitte.add(new JButton("4"));
        mitte.add(new JButton("5"));
        mitte.add(new JButton("6"));
        mitte.add(new JButton("7"));
        mitte.add(new JButton("8"));
        mitte.add(new JButton("9"));
        mitte.add(new JButton("("));
        mitte.add(new JButton("0"));
        mitte.add(new JButton(")"));
        mitte.add(new JButton("*"));
        mitte.add(new JButton("/"));
        mitte.add(new JButton("+"));
        mitte.add(new JButton("-"));
        mitte.add(new JButton(","));
        mitte.add(new JButton("="));

		panel.add(oben, BorderLayout.NORTH);
		panel.add(mitte, BorderLayout.CENTER);
		
		return panel;
	}
	
	public static void main(String[] args) {
		new Taschenrechner();
	}
	

}
