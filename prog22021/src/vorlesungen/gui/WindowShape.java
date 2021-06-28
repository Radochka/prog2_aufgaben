package vorlesungen.gui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Arc2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowShape extends JFrame{

	public WindowShape()
    {
        super();
        this.setTitle("Wir zeichnen");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    

        //this.getContentPane().add(this.initContent());
        this.getContentPane().add(new Canvas());
        this.setSize(400, 300);
        this.setLocation(300,200);
        this.setVisible(true);
    }
	/*
	private JPanel initContent() {
		JPanel mainPanel = new JPanel();
		return mainPanel;
	}
	*/
	private class Canvas extends JPanel
	{
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g); // Implementierung von JPanel aufrufen
			Graphics2D g2 = (Graphics2D)g; 
			
			Shape arc1 = new Arc2D.Double(50.0, 50.0, 200.0, 200.0, 180.0, 90.0, Arc2D.OPEN);
			Shape arc2 = new Arc2D.Double(50.0, 50.0, 200.0, 200.0, 180.0, -90.0, Arc2D.OPEN);
			Shape arc3 = new Arc2D.Double(50.0, 50.0, 200.0, 200.0, 20.0, 45.0, Arc2D.PIE);
			Shape arc4 = new Arc2D.Double(60.0, 63.0, 180.0, 180.0, 0.0, -180.0, Arc2D.PIE);
		
			g2.setStroke(new BasicStroke(4.0f));//dickere Linie
			g2.setColor(Color.YELLOW);
			g2.draw(arc1);
			g2.setColor(Color.RED);
			g2.draw(arc2);
			g2.setColor(Color.YELLOW);
			g2.setColor(Color.BLUE);                    
		    g2.draw(arc3);
		    g2.setColor(Color.GREEN);                   
		    g2.draw(arc4);
		    
		    g2.setStroke(new BasicStroke(20, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER));
		    g2.drawLine(30, 50, 200, 50);
		    g2.setStroke(new BasicStroke(20, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER));
		    g2.drawLine(30, 100, 200, 100);
		    g2.setStroke(new BasicStroke(20, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_MITER));
		    g2.drawLine(30, 150, 200, 150);
		    
//		    g2.setStroke(new BasicStroke(20, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER));
//		    g2.drawLine(150, 150, 200, 150);
//		    g2.setStroke(new BasicStroke(20, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER));
//		    g2.drawLine(150, 200, 200, 200);
//		    g2.setStroke(new BasicStroke(20, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_MITER));
//		    g2.drawLine(150, 250, 200, 250);
		}
	}
	public static void main(String[] args) {
		new WindowShape();
	}
}
