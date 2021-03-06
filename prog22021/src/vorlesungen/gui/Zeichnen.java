package vorlesungen.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Arc2D;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Zeichnen extends JFrame {
	public Zeichnen() {
		super();
		//Titel, Verhalten beim Schlie?en ...
		this.setTitle("Wir Zeichnen!");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel oben = new JPanel();
		JTextField tf = new JTextField(10);
		oben.add(tf);
		this.getContentPane().add(oben, BorderLayout.NORTH);

		Canvas content = new Canvas();
		this.getContentPane().add(content, BorderLayout.CENTER);
		
		JPanel unten = new JPanel();
		JButton b1 = new JButton("ok");
		unten.add(b1);
		this.getContentPane().add(unten, BorderLayout.SOUTH);
		//Gr??e, Location, Sichtbarkeit
		this.setSize(500,500);
		this.setVisible(true);
	}
	
	public class Canvas extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D) g;
			g2.setColor(new Color(134, 56, 34));
			//g2.fillOval(40, 30, 200, 200);
			g2.fillRect(40, 30, 200, 200);
			g2.setColor(new Color(34, 56, 34));
			Shape arc=new Arc2D.Double(40, 30, 200, 200, 45, -90, Arc2D.PIE);
			g2.draw(arc);
			
		}
	}
	
	public static void main(String[] args) {
		new Zeichnen();
	}
	

}
