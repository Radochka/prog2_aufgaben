package vorlesungen.wrapper;
import java.util.*;
public class Wrapper {
	public static void main(String[] args) {
		Set<String> s1 = new HashSet<>();
		Set<MyInteger> s2 = new HashSet<>();
		
		MyInteger i1 = new MyInteger(7);
		s2.add(i1);
		
		for(MyInteger i : s2)
		{
			System.out.println(i.getValue());
		}
		
		/*
		 * 3. Möglichkeit der Objecterzeugung
		 * 
		 * 1. Konstruktor - deprecated - - > nicht verwenden
		 * 2. valueOf()
		 * 3. "Boxing"
		 */
		
		// 1. zwei Konstruktoren - sind verältet
		int iWert1 = 12;
		Integer iRef1 = new Integer(iWert1);
		System.out.println(iRef1.toString());
		String iString1 = "12";
		Integer iRef2 = new Integer(iString1);
		System.out.println(iRef2.toString());
		
		// 2. valueOf()-statische Methode, erfolg über die Klassenname
		
		Integer iRef3 = Integer.valueOf(iWert1);
		Integer iRef4 = Integer.valueOf(iString1);
		
		System.out.println(iRef3.toString());
		System.out.println(iRef4.toString());
		
		// 3. Auto-Boxing
		
		Integer iRef5 = 1000;
		Integer iRef6 = 1000;
		System.out.println(iRef5.toString());
		System.out.println(iRef6.toString());
		
		System.out.println(iRef5 >= iRef6); //vergleicht Werte Auto-Unboxing, weil die Werte mit dem Operator entpackt werden.
		System.out.println(iRef5 == iRef6); // zeigen auf verschiedene Referenzen ( vergleicht nicht den Wert) - zwei verschiedene Objecte
		System.out.println(iRef5.equals(iRef6));
		
		// alles Auto-Boxing
		Double d1 = 5.5;
		Float f1 = 3.4f;
		Long l1 = 12345L;
		Boolean b1 = true;
		
		
	}
	
	
}
