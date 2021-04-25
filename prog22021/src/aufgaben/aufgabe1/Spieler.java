package aufgaben.aufgabe1;
import java.util.Random;

import javax.swing.JOptionPane;

public class Spieler {

	private String name;
	private int punkteStand;

	Spieler(String name){
		punkteStand = 0;
		this.name = name;
	}

	public boolean wuerfeln() {
		
		System.out.printf("%nSpieler %s ist dran. Der Punktestand ist %d Punkte. %n-----------------------------------------------%n",
				this.name, this.punkteStand);
		boolean wurfZuEnde = false;
		int punkteImVersuch = 0;
		int wurf = 0;
		Random r = new Random();

		while(!wurfZuEnde) {
			wurf = r.nextInt(6)+1;
			System.out.printf("%s hat eine %d geworfen!", this.name, wurf);
			if(wurf==6) {
				wurfZuEnde = true;
				this.punkteStand = 0;
				System.out.printf("%nDein Versuch ist zu Ende. %nDein gesamte Versuch ist mit 0 Punkten bewertet."
						+ "%nDein aktuelle Punktestand ist %d.%n", this.punkteStand);
				JOptionPane.showMessageDialog(null, "Der nächste Spieler ist dran!");
			}
			else if(wurf+punkteImVersuch+this.punkteStand >= Spiel.siegPunkte) {
				System.out.printf("%nDein aktueller Punktestand ist %d. %n", wurf+punkteImVersuch+punkteStand);
				JOptionPane.showMessageDialog(null, this.name + " hat gewonnen!");
				return true;
			}
			
			else {
				punkteImVersuch += wurf;
				System.out.printf("%nIn diesem Versuch bisher %d Punkte -- insgesamt reicht %d Punkte %n",
						punkteImVersuch, this.punkteStand+punkteImVersuch);
				int antwort = JOptionPane.showConfirmDialog(null, this.name + " , wollen Sie weiter wuerfeln?",
						"Weiter wuerfeln?", JOptionPane.YES_NO_OPTION);
				wurfZuEnde = (antwort==JOptionPane.NO_OPTION);
				if(wurfZuEnde) {
					punkteStand += punkteImVersuch;
				}
			}

		}
		return false;
	}
}
