package uebungen.uebung4;

import javax.swing.JOptionPane;

public class StrIndexOutput {
	
	String input;
	
	public StrIndexOutput() {
		this.eingabeString();
	}
	
	public void eingabeString() {
		boolean eingabeOk = false;
		while(!eingabeOk) {
			String eingabe = JOptionPane.showInputDialog("Geben Sie ein Wort ein:");
			try {
				this.input = eingabe;
				eingabeOk = true;
			}
			catch(NumberFormatException e) {
				System.out.println("Eingabe muss eine Wort sein");
				eingabeOk = false;
			}
		}
	}
	
	
	public boolean findeZweiBuchstaben() {
		boolean gefunden = false;
		for (int i = 0; i < this.input.length() && !gefunden; i++) {
			if(this.input.charAt(i) == this.input.charAt(i+1)) {
				gefunden = true;
			}
		}
		return gefunden;
	}
	
	public int getIndex() {
		int StrIndex = 0;
		boolean ok = false;
		if(this.input.length() == 0) return 0;
		else if(!findeZweiBuchstaben()) return -1;
		else {
			for (int i = 0; i < this.input.length() && !ok; i++) {
				if(this.input.charAt(i) == this.input.charAt(i+1)) {
					StrIndex = i;
					ok = true;
				}
			}
		}
		return StrIndex;
	}
	
//	@Override
//	public String toString() {
//		if(this.getIndex() == 0)
//	}

}
