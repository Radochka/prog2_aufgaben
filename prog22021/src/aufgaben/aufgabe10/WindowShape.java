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

	int points;
	int rot=0;
	int blau=0;
	double pi;

	public WindowShape()
	{
		super("Berechne PI");
		this.setSize(480, 500);
		this.setLocation(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.points = 50000;

		this.add(new Canvas());
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
		final int RADIUS = 400;
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g); // Implementierung von JPanel aufrufen
			Graphics2D g2 = (Graphics2D)g;
			g2.drawRect(30, 30, RADIUS, RADIUS);
			g2.drawArc(30, 30, RADIUS*2, RADIUS*2, 90, 90);
			final int ORIGIN = 430;
			g2.fillOval(ORIGIN, ORIGIN, 2, 2);

			Random r = new Random();

			for (int i = 0; i < WindowShape.this.points; i++) {
				int x=r.nextInt(401)+30;
				int y=r.nextInt(401)+30;

				if((x-ORIGIN) * (x-ORIGIN) + (y-ORIGIN) * (y-ORIGIN) <= RADIUS*RADIUS) {
					g2.setColor(Color.RED);
					WindowShape.this.rot++;
				}
				else {
					g2.setColor(Color.BLUE);
					WindowShape.this.blau++;
				}
				g2.fillOval(x, y, 2, 2);

			}


			WindowShape.this.pi = ((double)WindowShape.this.rot/
					(double)WindowShape.this.points)*4;
			System.out.println("Gesamt Punkte: " + WindowShape.this.points);
			System.out.println("Rote Punkte: " + WindowShape.this.rot);
			System.out.println("Blau Punkte: " + WindowShape.this.blau);
			System.out.println("PI ist: " + WindowShape.this.pi);
		}
	}
	public static void main(String[] args) {
		new WindowShape();
	}
}
