package vorlesungen.collections;


import java.util.*;



public class CollectionsHashSet {
	
	public static void main(String[] args) {
		List l1 = new ArrayList();
		List l2 = new LinkedList();
		
		Set ss1 = new HashSet();
		Set ss2 = new TreeSet();
		
		Set<String> menge = new HashSet<>();
		/*
		 * Wir deklarieren dafür den Typ Set und erzeugen unter Verwendung
		 * des parameterlosen Konstruktors von HashSet ein HashSet-Objekt.
		 * Die menge hat also den Compilertyp Set und mindestens
		 * den Laufzeittyp HashSet (natürlich noch weitere Laufzeittypen,
		 * z.B. Object).
		 */
		String s1 = "erster";
		String s2 = "zweiter";
		String s3 = "dritter";
		String s4 = "zweiter";
		
		System.out.println(menge.add(s1));
		System.out.println(menge.add(s2));
		System.out.println(menge.add(s3));
		System.out.println(menge.add(s4));
		
		System.out.println(menge.size());
		
		/*Iterator it = menge.iterator();
		System.out.println(menge.size());
		while(it.hasNext()) {
			System.out.println(it.next());
		}*/
		for(String s : menge) {
			System.out.println(s);
		}
		
		
	}
}
