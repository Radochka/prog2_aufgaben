package uebungen.uebung11;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class RechteckZeichnene extends JFrame implements MouseListener, MouseMotionListener {	
	    //	Objektvariablen 
		private Color aktColor;
		private Rechteck aktRechteck;
		private Canvas canvas;
		Map<Rechteck, Color> rechtecke;
	    
	    public RechteckZeichnene()
	    {
	        super();
	        this.setTitle("Rechtecke zeichnen");
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
		
		//Collection für die Rechtecke anlegen
	        this.rechtecke = new LinkedHashMap<>();
		//Leinwand anlegen und die Listener für Mausereignisse hinzufügen
	        this.canvas = new Canvas();
	        this.canvas.addMouseListener(this);
	        this.canvas.addMouseMotionListener(this);
	        this.getContentPane().add(this.canvas);
	        
	        this.setSize(400, 300);
	        this.setLocation(300,200);
	        this.setVisible(true);
	    }

	    private class Canvas extends JPanel
	    {    	
	        @Override
	        protected void paintComponent(Graphics g)
	        {
	            super.paintComponent(g);        
	            Graphics2D g2 = (Graphics2D)g;  
	            
	            //aktuelles Rechteck zeichnen (falls es aktuell eins gibt)            
	            if(RechteckZeichnene.this.aktRechteck != null)
	            {
	               g2.setColor(aktColor);
	               int x = RechteckZeichnene.this.aktRechteck.getX();
	               int y = RechteckZeichnene.this.aktRechteck.getY();
	               int wigth = RechteckZeichnene.this.aktRechteck.getWigth();
	               int heigth = RechteckZeichnene.this.aktRechteck.getHeigth();
	                g2.fillRect(x, y, wigth, heigth);
	            }
	            //gespecherte Rechtecke aus der Collection zeichnen
	            for (Map.Entry<Rechteck, Color> entry : RechteckZeichnene.this.rechtecke.entrySet()) {
	            	Rechteck r = entry.getKey();
	            	Color c = entry.getValue();
	            	g2.setColor(c);
	            	int x = r.getX();
	            	int y = r.getY();
	            	int width = r.getWigth();
	            	int height = r.getHeigth();
	            	g2.fillRect(x, y, width, height);
				}
	            
	        }
	    }

	    public static void main(String[] args) 
	    {
	        new RechteckZeichnene();
	    }

	    
		@Override
		public void mousePressed(MouseEvent e) {
			Point p = e.getPoint();
			//neues Rechteck erzeugen		
			this.aktRechteck = new Rechteck(p.x, p.y, 0, 0);
			//zufällige Farbe erzeugen - hatten wir letzte Woche
			Random r = new Random();
			int rot = r.nextInt(256);
			int gruen = r.nextInt(256);
			int blau = r.nextInt(256);
			this.aktColor = new Color(rot, gruen, blau);
		}
		
		@Override
		public void mouseDragged(MouseEvent e) {
		
			//Höhe und Breite des aktuellen Rechtecks setzen
			//je nachdem ob die Maus gerade nach rechts, links, oben oder unten gezogen wird		
			Point p = e.getPoint();
			if(p.x > this.aktRechteck.getX()) { // Maus nach rechts 
				int width = p.x - this.aktRechteck.getX();
				this.aktRechteck.setWigth(width);
				
			}
			else { //Maus nach links
				int width = (this.aktRechteck.getX()-p.x) + this.aktRechteck.getWigth();
				this.aktRechteck.setWigth(width);
				this.aktRechteck.setX(p.x);
			}
			
			if(p.y > this.aktRechteck.getY()) { // Maus nach unten 
				int height = p.y - this.aktRechteck.getY();
				this.aktRechteck.setHeigth(height);
				
			}
			else {//Maus nach oben
				int height = (this.aktRechteck.getY()-p.y)+this.aktRechteck.getHeigth();
				this.aktRechteck.setHeigth(height);
				this.aktRechteck.setY(p.y);
			}
			//Leinwand neu zeichnen
			this.canvas.repaint();
		}
		
		@Override
		public void mouseReleased(MouseEvent e) {
			//aktuelles Rechteck speichern
			this.rechtecke.put(this.aktRechteck, this.aktColor);
			
		}
		
		@Override public void mouseClicked(MouseEvent e) {}
		@Override public void mouseEntered(MouseEvent e) {}
		@Override public void mouseExited(MouseEvent e) {}
		@Override public void mouseMoved(MouseEvent e) {}
		
		
	}


