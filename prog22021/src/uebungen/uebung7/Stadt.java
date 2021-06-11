package uebungen.uebung7;

import java.util.*;


public class Stadt implements Comparable<Stadt>{

	String name;
	List<Integer> bevoelkerung;
	float flaeche;

	public Stadt(String name, List<Integer> bevoelkerung, float flaeche)
	{
		super();
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
	@Override
	public int compareTo(Stadt o)
	{
		//um aufsteigend nach stadtnamen zu sortieren
		return this.name.compareTo(o.name);
		
		//um absteigend nach stadtname zu sortieren
		//return -this.name.compareTo(o.name);
		//um anhand der Fläche absteigend zu sortieren;
//		if(this.flaeche<o.flaeche) return 1;
//		else if(this.flaeche>o.flaeche)return -1;
//		else return 0;
		
		//Alternativ:
		
		//return this.flaeche < o.flaeche ? 1 : (this.flaeche == o.flaeche ? 0 : -1);
	}
}
