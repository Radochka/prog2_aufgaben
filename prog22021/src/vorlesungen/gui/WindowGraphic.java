package vorlesungen.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowGraphic extends JFrame{

	public WindowGraphic()
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
			Graphics2D g2 = (Graphics2D)g; // Methoden von Graphics2D nutzbar
			// hier koennen wir zeichnen
			g2.drawRect(40, 30, 200, 200);
			g2.drawOval(40, 30, 200, 200);
			//beispiel
			for(int i=0; i<10; i++)
			{
				g2.drawOval(50+i*10, 50, 80, 80);
				g2.drawOval(50+i*10, 150, 80, 180);
			}

			int diffX = 200;
			int diffY = 130;
			Color color;
			color = new Color(205,107,117,127);
			g2.setColor(color);
			g2.fillRect(50, 50, 150, 100);

			color = new Color(205,107,117,255);
			g2.setColor(color);
			g2.fillRect(50, 50+diffY, 150, 100);

			g2.setColor(Color.WHITE);
			g2.fillRect(50, 50+2*diffY, 150, 100);

			color = new Color(100,255,100,127);
			g2.setColor(color);
			g2.fillRect(50+diffX, 50, 150, 100);

			color = new Color(100,255,100,255);
			g2.setColor(color);
			g2.fillRect(50+diffX, 50+diffY, 150, 100);

			g2.setColor(Color.GREEN);
			g2.fillRect(50+diffX, 50+2*diffY, 150, 100);


			color = new Color(100,100,255,127);
			g2.setColor(color);
			g2.fillRect(50+2*diffX, 50, 150, 100);

			color = new Color(100,100,255,255);
			g2.setColor(color);
			g2.fillRect(50+2*diffX, 50+diffY, 150, 100);

			g2.setColor(Color.BLUE);
			g2.fillRect(50+2*diffX, 50+2*diffY, 150, 100);


		}
	}
	public static void main(String[] args) {
		new WindowGraphic();
	}
}
