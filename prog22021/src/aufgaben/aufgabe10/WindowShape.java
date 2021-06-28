package aufgaben.aufgabe10;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.util.Random;

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
        this.setSize(300, 300);
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
			g2.setStroke(new BasicStroke(2.0f));
			g2.drawRect(50, 50, 200, 200);
			
			Shape arc2 = new Arc2D.Double(50.0, 50.0, 400.0, 400.0, 180.0, -90.0, Arc2D.OPEN);
			
			g2.setStroke(new BasicStroke(2.0f));//dickere Linie
			g2.setColor(Color.RED);
			g2.draw(arc2);
		
			int x = 0;
			int y = 0;
			Random r = new Random();
//			x=r.nextInt(200)+50;
//			y=r.nextInt(200)+50;
//			g2.setColor(Color.BLUE);
//			g2.fillOval(x, y, 5, 5);
			
			for (int i = 0; i < 5000; i++) {
				x=r.nextInt(200)+50;
				y=r.nextInt(200)+50;
				g2.setColor(Color.BLUE);
				g2.fillOval(x, y, 2, 2);
				
			}
		    
		
		}
	}
	public static void main(String[] args) {
		new WindowShape();
	}
}
