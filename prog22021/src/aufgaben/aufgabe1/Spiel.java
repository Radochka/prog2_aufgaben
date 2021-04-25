package aufgaben.aufgabe1;
import javax.swing.JOptionPane;

public class Spiel {

	public static int siegPunkte;
	private Spieler[] spieler;

	Spiel(){
		anzahlSpieler();
		anzahlPunkte();
		spielerName();
	}

	public void anzahlSpieler() {
		boolean eingabeOk = false;
		int zahl = 0;
		while(!eingabeOk) {
			String eingabe = JOptionPane.showInputDialog("Geben Sie eine Zahl der Spieler ein:");
			try {
				zahl = Integer.valueOf(eingabe);
				eingabeOk = true;
			}
			catch(NumberFormatException e) {
				System.out.println("Eingabe muss eine Zahl sein");
				eingabeOk = false;
			}

		}
		this.spieler = new Spieler[zahl];
	}

	public void anzahlPunkte() {
		boolean eingabeOk = false;
		while(!eingabeOk) {
			String eingabe = JOptionPane.showInputDialog("Legen Sie die Siegepunkte fest:");
			try {
				siegPunkte = Integer.valueOf(eingabe);
				eingabeOk = true;
			}
			catch(NumberFormatException e) {
				System.out.println("Eingabe muss eine Zahl sein");
				eingabeOk = false;
			}

		}
	}

	public void spielerName() {

		for (int i = 0; i < this.spieler.length; i++) {

			String eingabe = JOptionPane.showInputDialog(null,"Name des Spielers" + (i+1) + ": ",
					"Name des Spielers",
					JOptionPane.PLAIN_MESSAGE);
			this.spieler[i] = new Spieler(eingabe);
		}
	}

	public void spielen() {
		int index = 0;
		boolean gewonnen = false;
		while(!gewonnen) {
			gewonnen = this.spieler[index].wuerfeln();
			index = (index < this.spieler.length-1) ? index+1 : 0;
		}
	}



	public static void main(String[] args) {

		Spiel spiel = new Spiel();
		spiel.spielen();
	}

}
