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
		//Führen Sie danach die StadtTest-Klasse erneut aus. Was hat sich an der Menge geändert?
		//Kommentieren Sie hashCode() wieder aus und führen StadtTest erneut aus. Was ändert sich?
		//Kommentieren Sie equals() wieder aus und führen StadtTest erneut aus. Was ändert sich?

@Override
	public boolean equals(Object o)
		{
			//Es soll getestet werden, ob der Name des übergebenen Stadt-Objekts o gleich dem Namen des aktuellen Stadt-Objekts ist
			//Vorher müssen erst ein paar Fälle abgeklärt werden:       
			// wenn übergebenes Objekt o null ist, gib false zurück
			// wenn übergebenes Objekt o gleich dem aktuellen Objekt der Klasse ist, gib true zurück
			// wenn die Laufzeitklasse des übergebenen Objekts o nicht gleich der Laufzeitklasse des aktuellen Objekts ist,
			// gib false zurück

			//Wenn diese drei Fälle nicht eingetreten sind:
			//Stadt-Objekt anlegen vom übergebenen Objekt o     
			//testen ob der Name des übergebenen Stadt-Objekts gleich dem Namen des aktuellen Stadt-Objekts ist
			//Ergebnis zurückgeben
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


//		//Festlegen, dass der Name des übergebenen Stadt-Objekts o mit dem Namen des aktuellen Stadt-Objekts verglichen werden soll
		@Override
		public int compareTo(Object o)
		{
			Stadt stadt = (Stadt) o;
			return this.name.compareTo(stadt.name);
		}
	
}
