package uebungen.uebung3;

import javax.swing.JOptionPane;

public class Uebung3 {

	public static int inputInt(int min, int max, String message)
	{
		boolean inputOk = false;
		int zahl=0;
		//String message = "Geben Sie eine Zahl ein : ";
		while(!inputOk)
		{
			String eingabe = JOptionPane.showInputDialog(message);

			try {
				zahl = Integer.valueOf(eingabe);
				if(zahl>=min && zahl<=max)
				{
					inputOk = true;
				}
				else
				{
					message = "Zahl muss zwische "+min + " und " + max + " liegen";
				}
			} catch (NumberFormatException e) {

				message = "Eingabe war keine Zahl! Bitte Zahl eingeben";
			}
		}
		return zahl;
	}
	public static int inputInt(String message)
	{
		
		return inputInt(Integer.MIN_VALUE, Integer.MAX_VALUE, message);
	}

	public static int division(int divident, int divisor) throws ArithmeticException
	{ 
		int quotient = divident/divisor;
		return quotient;
	}
	
	public static void printDivison()
	{
		int zahl1 = Uebung3.inputInt("Geben Sie eine Zahl1 ein : ");
		boolean zahl2NotZero = false;
		String message = "Geben Sie eine Zahl2 ein : ";
		while(!zahl2NotZero)
		{
			int zahl2 = inputInt(message);
			int result =0;
			try {
				result = division(zahl1, zahl2);
				zahl2NotZero = true;
			} catch (ArithmeticException e) {
				message = "Zahl2 darf nicht 0 sein!";
			}
			System.out.println(zahl1 + " / " + zahl2 + " = " + result);
		}
	}
	
	public static int quersumme(int zahl) // z.b 12345 => 1+2+3+4+5 = 15
	{
		int ganz = zahl;
		int quersumme = 0;
		while(ganz>0)
		{
			int rest = ganz%10;
			quersumme += rest;
			ganz = ganz/10;
		}
		return quersumme;
	}
	
	public static void main(String[] args)
	{

		printDivison();
		int zahl = inputInt("Geben sie eine Zahl ein : ");
		System.out.println("Quersumme von " + zahl + " : " + quersumme(zahl));
		JOptionPane.showInternalMessageDialog(null, "Quersumme von " + zahl + " : " + quersumme(zahl));
		
	}

}
