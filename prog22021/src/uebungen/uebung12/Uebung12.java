package uebungen.uebung12;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Uebung12 extends JFrame {
	JPanel content;
	MyPanel[][]panels;
	int meistenKlicks = 0;
	
	public Uebung12(int hoehe, int breite)
    {
        super();
        this.setTitle("Klicks zaehlen");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    

        this.content = this.initCenter(hoehe, breite);
        this.getContentPane().add(this.content, BorderLayout.CENTER);

        // von den folgenden vier Zeilen werden eventuell eine oder mehrere oder alle auskommentiert
        this.getContentPane().add(this.initSouth(), BorderLayout.SOUTH);
 
        this.setSize(400, 300);
        this.setLocation(300,200);
        this.setVisible(true);
    }

    private JPanel initCenter(int hoehe, int breite) 
    {
        JPanel center = new JPanel();
        center.setBackground(Color.BLACK);
        center.setLayout(new GridLayout(hoehe, breite, 2,2));
        // hier das JPanel fuer CENTER befuellen
        this.panels = new MyPanel[hoehe][breite];
        for (int i = 0; i < hoehe; i++) {
			for (int j = 0; j < breite; j++) {
				panels[i][j] = new MyPanel();
				panels[i][j].setBackground(Color.RED);
				panels[i][j].addMouseListener(panels[i][j]);
				center.add(panels[i][j]);
			}
		}
        
        return center;
    }


    private JPanel initSouth() 
    {
        JPanel south = new JPanel();
        // hier das JPanel fuer SOUTH befuellen
        JButton resetB = new JButton("reset");
        resetB.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < Uebung12.this.panels.length; i++) {
					for (int j = 0; j < Uebung12.this.panels[i].length; j++) {
						Uebung12.this.panels[i][j].nrOfClicks=0;
						Uebung12.this.panels[i][j].label.setText("0");
						Uebung12.this.panels[i][j].setBackground(Color.LIGHT_GRAY);
						Uebung12.this.meistenKlicks =0;
					}
				}
			}
		});
        south.add(resetB);
        return south;
    }

    class MyPanel extends JPanel implements MouseListener{
    	int nrOfClicks;
    	JLabel label;
    	
    	MyPanel(){
    		this.nrOfClicks = 0;
    		this.setLayout(new GridLayout(1,1));
    		this.label = new JLabel("0");
    		this.label.setFont(new Font("Verdana", Font.BOLD, 40));
    		this.label.setForeground(Color.WHITE);
    		this.label.setHorizontalAlignment(JLabel.CENTER);
    		
    		this.add(label);
    		this.addMouseListener(this);
    	}

		@Override
		public void mouseClicked(MouseEvent e) {
			MyPanel mp = (MyPanel)e.getSource();
			mp.nrOfClicks++;
			mp.label.setText(String.valueOf(nrOfClicks));
			
			if(mp.nrOfClicks > Uebung12.this.meistenKlicks) {
				Uebung12.this.meistenKlicks = mp.nrOfClicks;
			}
			//int meistenKlicks = 0;
			for (int i = 0; i < Uebung12.this.panels.length; i++) {
				for (int j = 0; j < Uebung12.this.panels[i].length; j++) {
					
					if(Uebung12.this.panels[i][j].nrOfClicks==Uebung12.this.meistenKlicks) {
						Uebung12.this.panels[i][j].setBackground(Color.RED);
					}
					else {
						Uebung12.this.panels[i][j].setBackground(Color.LIGHT_GRAY);
					}
				}
			}
			
//			for (int i = 0; i < Uebung12.this.panels.length; i++) {
//				for (int j = 0; j < Uebung12.this.panels[i].length; j++) {
//					
//					if(Uebung12.this.panels[i][j].nrOfClicks==meistenKlicks) {
//						Uebung12.this.panels[i][j].setBackground(Color.RED);
//					}
//					else {
//						Uebung12.this.panels[i][j].setBackground(Color.LIGHT_GRAY);
//					}
//				}
//			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			
		}
    	
    }

    public static void main(String[] args) 
    {
        new Uebung12(4,3);
    }
}


