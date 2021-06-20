package uebungen.uebung10;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

//import 

public class Uebung10 extends JFrame{

	public Uebung10()
	{
		super();
		//Titel, Verhalten beim Schließen ...
		this.setTitle("Übung10");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.getContentPane().add(new Canvas());
		//Größe, Location, Sichtbarkeit
		this.setSize(400,300);
		this.setLocation(300,200);
		this.setVisible(true);
	}
	//neue Leinwand (Canvas) anlegen und dem Fenster hinzufügen
	private class Canvas extends JPanel
	{
		@Override
		protected void paintComponent(Graphics g)
		{
			super.paintComponent(g);// Implementierung von JPanel aufrufen
			Graphics2D g2 = (Graphics2D) g; // Methoden von Graphics2D nutzbar machen

			int abstand = this.getHeight()/20;
			
			int hoehe = this.getHeight() - 2*abstand;
			int breite = this.getWidth() - 2*abstand;

			Random r = new Random();
			int rot = r.nextInt(256);
			int gruen = r.nextInt(256);
			int blau = r.nextInt(256);
			Color myColor = new Color(rot, gruen, blau);

			g2.setColor(myColor);
			//g2.fillRect(abstand, abstand, breite, hoehe);

			if(hoehe<breite) { //quadrat zeichnen
				int abstandLinks = (this.getWidth() - hoehe)/2;
				g2.fillRect(abstandLinks, abstand, hoehe, hoehe);
			}
			else {
				int abstandOben = (this.getHeight() - breite)/2;
				g2.setStroke(new BasicStroke(5.0f));
				g2.drawRect(abstand, abstandOben, breite, breite);
			}



			//Zufällige Werte für Rot, Grün und Blau erzeugen
			//Kleine Hilfe:
			//https://www.tutorialspoint.com/java/util/random_nextint_inc_exc.htm
			//public Color(int r, int g, int b)

			//falls die Höhe des Fensters kleiner ist, als die Breite
			//Länge der Seiten an Höhe anpassen
			//Quadrat ausgefüllt

			//sonst 
			//Länge der Seiten an Breite anpassen
			//Quadrat nicht ausgefüllt, Linienstärke 5.0f 
		}           

	}

	public static void main(String[] args) 
	{
		new Uebung10();
	}

}
