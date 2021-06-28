import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class RechteckeZeichnen extends JFrame implements MouseListener, MouseMotionListener {	
    //	Objektvariablen 
    
    public RechteckeZeichnen()
    {
        super();
        this.setTitle(...);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
	
	//Collection für die Rechtecke anlegen

	//Leinwand anlegen und die Listener für Mausereignisse hinzufügen
        
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
            
            //gespecherte Rechtecke aus der Collection zeichnen
            
        }
    }

    public static void main(String[] args) 
    {
        new RechteckeZeichnen();
    }

    
	@Override
	public void mousePressed(MouseEvent e) {
	
		//neues Rechteck erzeugen		
		
		//zufällige Farbe erzeugen - hatten wir letzte Woche
		
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
	
		//Höhe und Breite des aktuellen Rechtecks setzen
		//je nachdem ob die Maus gerade nach rechts, links, oben oder unten gezogen wird		
		
		//Leinwand neu zeichnen
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		//aktuelles Rechteck speichern
		
	}
	
	@Override public void mouseClicked(MouseEvent e) {}
	@Override public void mouseEntered(MouseEvent e) {}
	@Override public void mouseExited(MouseEvent e) {}
	@Override public void mouseMoved(MouseEvent e) {}
}
