package vorlesungen.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class MyWindow extends JFrame{ // wir erben von Klasse JFrame

	public MyWindow() {
		super(); // Konstruktor von JFrame
		
		this.setTitle("My first Window"); // Name des Fensters 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // was soll passieren, bei x drucken
		this.getContentPane().setBackground(Color.CYAN);
		this.getContentPane().add(this.initContent());
		
		this.setSize(400, 300); // die Größe des Fensters
		this.setLocation(300, 200); // Position des Fensters auf dem Desktop
		this.setVisible(true); // veröffentlichung des Fensters		
		
				//dieses Teil ist ohne super(); und extends
				//JFrame window = new JFrame(); // ein fenster erstellt
				//window.setTitle("My first Window"); // Name des Fensters 
				//window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // was soll passieren, bei x drucken
				//window.getContentPane().setBackground(Color.CYAN);
				//window.setSize(400, 300); // die Größe des Fensters
				//window.setLocation(300, 200); // Position des Fensters auf dem Desktop
				//window.setVisible(true); // veröffentlichung des Fensters	
	}
	
	public JPanel initContent() {
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		
		JPanel oben = new JPanel();
		oben.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		oben.add(new JLabel("Name:"));
		oben.add(new JTextField(10));
		oben.setBackground(Color.LIGHT_GRAY);
		
		JPanel mitte = new JPanel();
		mitte.setLayout(new GridLayout(3,2,10,10));
		mitte.add(new JButton("Button 1"));
		mitte.add(new JButton("Button 2"));
		mitte.add(new JButton("Button 3"));
		mitte.add(new JButton("Button 4"));
		mitte.add(new JButton("Button 5"));
		mitte.add(new JButton("Button 6"));
		mitte.setBackground(Color.GREEN);
		
		JPanel unten = new JPanel();
		unten.setLayout(new FlowLayout(FlowLayout.RIGHT, 5,5));
		unten.add(new JButton("Abbruch"));
		unten.add(new JButton("OK"));
		unten.setBackground(Color.LIGHT_GRAY);
		
		mainPanel.add(oben, BorderLayout.NORTH);
		mainPanel.add(mitte, BorderLayout.CENTER);
		mainPanel.add(unten, BorderLayout.SOUTH);
		
		/*JLabel label = new JLabel("Name: ");
		JTextField input = new JTextField(10);
		JButton button = new JButton("NORTH");
		JButton button1 = new JButton("CENTER");
		JButton button2 = new JButton("SOUTH");
		JButton button3 = new JButton("WEST");
		JButton button4 = new JButton("EAST");
		JButton button5 = new JButton("Klick mich!");
		JButton button6 = new JButton("Klick mich!");
		*/
		
		//mainPanel.add(label);
		//mainPanel.add(input);
		//mainPanel.add(button, BorderLayout.NORTH);
		//mainPanel.add(button1, BorderLayout.CENTER);
		//mainPanel.add(button2, BorderLayout.SOUTH);
		//mainPanel.add(button3, BorderLayout.WEST);
		//mainPanel.add(button4, BorderLayout.EAST);
		//mainPanel.add(button5);
		//mainPanel.add(button6);
		
		//mainPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
		//mainPanel.setLayout(new GridLayout(3,1, 20, 30)); //row=3 - zeile, col=1 - spalte(egal), hgap=20, vgap=30
		
		
		return mainPanel;
	}
	
	
	
	
	public static void main(String[] args) {
		new MyWindow();

	}

}
