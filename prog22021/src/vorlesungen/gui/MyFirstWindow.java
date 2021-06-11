package vorlesungen.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class MyFirstWindow extends JFrame{

	public MyFirstWindow() {
		super();
		this.setTitle("My first window");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel content = this.initContent();
		this.getContentPane().add(content);
		//this.getContentPane().setBackground(Color.CYAN);
		this.setSize(400, 300);
		this.setVisible(true);
	}

	/* 3 Varianten von JPanel
	 * FlowLayout == alles nebeneinander, so lange es passt, sonst untereinander
	 * GridLayout == Gitterstruktur (Zeilen und Spalten)
	 * BorderLayout == NORTH,  EAST, WEST, Center
	*/
	
	
	private JPanel initContent() {
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		
		JPanel center1 = new JPanel();
		center1.setLayout(new GridLayout(3, 2));
		
		JButton cb1 = new JButton("EAST");
		JButton cb2 = new JButton("WEST");
		JButton cb3 = new JButton("NORTH");
		JButton cb4 = new JButton("SOUTH");
		JButton cb5 = new JButton("CENTER");
		//JButton b6 = new JButton("SEXTER");
		
		center1.add(cb1);
		center1.add(cb2);
		center1.add(cb3);
		center1.add(cb4);
		center1.add(cb5);
		
		JButton b1 = new JButton("EAST");
		JButton b2 = new JButton("WEST");
		JButton b3 = new JButton("NORTH");
		JButton b4 = new JButton("SOUTH");
		JButton b5 = new JButton("CENTER");
		
		mainPanel.add(b1, BorderLayout.EAST);
		mainPanel.add(b3, BorderLayout.NORTH);
		mainPanel.add(center1, BorderLayout.CENTER);
		mainPanel.add(b4, BorderLayout.SOUTH);
		mainPanel.add(b2, BorderLayout.WEST);
		
		/*
		mainPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		
		JButton b1 = new JButton("EAST");
		JButton b2 = new JButton("WEST");
		JButton b3 = new JButton("NORTH");
		JButton b4 = new JButton("SOUTH");
		JButton b5 = new JButton("CENTER");
		
		mainPanel.add(b1);
		mainPanel.add(b2);
		mainPanel.add(b3);
		mainPanel.add(b4);
		mainPanel.add(b5);
		*/
		
		/*
		
		JButton b1 = new JButton("EAST");
		JButton b2 = new JButton("WEST");
		JButton b3 = new JButton("NORTH");
		JButton b4 = new JButton("SOUTH");
		JButton b5 = new JButton();
		//b1.setBackground(Color.CYAN);
		JLabel l1 = new JLabel("Test ");
		JPanel east = new JPanel();
		east.setLayout(new FlowLayout());
		east.add(b1);
		east.add(l1);
		east.add(b2);
		
		//b1.add(new JLabel("Name : "));
		
		mainPanel.add(east, BorderLayout.EAST);
		mainPanel.add(b2, BorderLayout.WEST);
		mainPanel.add(b3, BorderLayout.NORTH);
		mainPanel.add(b4, BorderLayout.SOUTH);
		mainPanel.add(b5, BorderLayout.CENTER);
		*/
		
		/*// hier Steuerelemente hinzufuegen
		JLabel label = new JLabel("Name : ");
		JTextField input = new JTextField(10);
		JButton button = new JButton("Klick mich!");
		JCheckBox cb = new JCheckBox();
		JRadioButton rb = new JRadioButton();
		
		mainPanel.add(label);
		mainPanel.add(input);
		mainPanel.add(button);
		mainPanel.add(cb);
		mainPanel.add(rb);
		*/
		return mainPanel;
	}
	
	public static void main(String[] args) {
		new MyFirstWindow();
	}
}
