package uebungen.uebung6;
import java.util.*;

public class Stadt implements Comparable
{

	//import
	//1. Erstellen Sie eine Klasse Stadt mit folgenden Objektvariablen:
	// Der Teil mit "implements" wird nicht von Anfang an ben�tigt, es kann also auch erstmal mit "public class Stadt" begonnen werden. 
	// W�hrend es bei primitiven Datentypen meist eindeutig ist, ob ein Wert gr��er, kleiner oder gleich gro� ist wie ein anderer Wert, ist die Ordnung bei Objekten nicht so klar.
	// Daher muss Stadt Klasse ein bestimmtes Interface implementieren, um festzulegen, was verglichen werden soll. 

	String name;
	List<Integer> bevoelkerung;
	float flaeche;

	//2. Erstellen Sie f�r die Klasse Stadt einen parametrisierten Konstruktor 
	//public Stadt(String name, List<Integer> bevoelkerung, float flaeche), 
	//der die Objektvariablen initialisiert.
	public Stadt(String name, List<Integer> bevoelkerung, float flaeche)
	{
		//Da es sich um einen Konstruktor einer Kindklasse handelt, sollte zuerst explizit der Konstruktor der Elternklasse aufrufen werden
		//kann aber wie implements erst sp�ter erg�nzt werden

		//Objektvariablen initialisieren
		this.name = name;
		this.bevoelkerung = bevoelkerung;
		this.flaeche = flaeche;
	}

	//3. Erstellen Sie f�r die Klasse Stadt eine print()-Methode, 
	//so dass eine Ausgabe auf der Konsole in folgender Form erscheint (Bsp.): 
	//Berlin     891,68 km2    3.382.169   3.460.725   3.574.830
	public void print()
	{
		System.out.printf("%-15s %9.2f km2", this.name, this.flaeche);
		for(Integer el : this.bevoelkerung)
		{
			System.out.printf("%,10d", el);

			//Namen der Stadt, ihre Fl�che und "km2" ausgeben

			//mithilfe einer Schleife oder Iterator Eintr�ge der Bev�lkerungs-Liste ausgeben
			//Beispiel f�r Schleife: 
			//https://freiheit.f4.htw-berlin.de/prog2/collections/#die-for-each-schleife
			//Beispiel f�r Iterator:
			//https://freiheit.f4.htw-berlin.de/prog2/collections/#listen
		}
		System.out.println();
	}
		//Teil 2
		//1. Implementieren Sie in der Klasse Stadt die equals(Object)- und die hashCode()-Methode.
		//F�hren Sie danach die StadtTest-Klasse erneut aus. Was hat sich an der Menge ge�ndert?
		//Kommentieren Sie hashCode() wieder aus und f�hren StadtTest erneut aus. Was �ndert sich?
		//Kommentieren Sie equals() wieder aus und f�hren StadtTest erneut aus. Was �ndert sich?

/*	@Override
	public boolean equals(Object o)
		{
			//Es soll getestet werden, ob der Name des �bergebenen Stadt-Objekts o gleich dem Namen des aktuellen Stadt-Objekts ist
			//Vorher m�ssen erst ein paar F�lle abgekl�rt werden:       
			// wenn �bergebenes Objekt o null ist, gib false zur�ck
			// wenn �bergebenes Objekt o gleich dem aktuellen Objekt der Klasse ist, gib true zur�ck
			// wenn die Laufzeitklasse des �bergebenen Objekts o nicht gleich der Laufzeitklasse des aktuellen Objekts ist,
			// gib false zur�ck

			//Wenn diese drei F�lle nicht eingetreten sind:
			//Stadt-Objekt anlegen vom �bergebenen Objekt o     
			//testen ob der Name des �bergebenen Stadt-Objekts gleich dem Namen des aktuellen Stadt-Objekts ist
			//Ergebnis zur�ckgeben
		if(o==null)return false;
		if(this==o)return true;
		if(this.getClass()!=o.getClass())return false;
		Stadt stadt = (Stadt)o;
		return this.name.equals(stadt.name);
		}
*/
		@Override
		public int hashCode()
		{
			return this.name.hashCode();
		}
//
//
//		//Festlegen, dass der Name des �bergebenen Stadt-Objekts o mit dem Namen des aktuellen Stadt-Objekts verglichen werden soll
		@Override
		public int compareTo(Object o)
		{
			Stadt stadt = (Stadt) o;
			return this.name.compareTo(stadt.name);
		}
	
}
