package uebungen.uebung6;
import java.util.*;

public class Stadt implements Comparable
{
	String name;
	List<Integer> bevoelkerung;
	float flaeche;

	public Stadt(String name, List<Integer> bevoelkerung, float flaeche)
	{
		this.name = name;
		this.bevoelkerung = bevoelkerung;
		this.flaeche = flaeche;
	}

	public void print()
	{
		System.out.printf("%-20s %10.2f km2", this.name, this.flaeche);
		for(Integer el : this.bevoelkerung)
		{
			System.out.printf("%,15d", el);
		}
		System.out.println();
	}
		//Teil 2
		//1. Implementieren Sie in der Klasse Stadt die equals(Object)- und die hashCode()-Methode.
		//F�hren Sie danach die StadtTest-Klasse erneut aus. Was hat sich an der Menge ge�ndert?
		//Kommentieren Sie hashCode() wieder aus und f�hren StadtTest erneut aus. Was �ndert sich?
		//Kommentieren Sie equals() wieder aus und f�hren StadtTest erneut aus. Was �ndert sich?

@Override
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

		@Override
		public int hashCode()
		{
			return this.name.hashCode();
		}


//		//Festlegen, dass der Name des �bergebenen Stadt-Objekts o mit dem Namen des aktuellen Stadt-Objekts verglichen werden soll
		@Override
		public int compareTo(Object o)
		{
			Stadt stadt = (Stadt) o;
			return this.name.compareTo(stadt.name);
		}
	
}
