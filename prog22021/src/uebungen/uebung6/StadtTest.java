package uebungen.uebung6;
import java.util.*;

public class StadtTest {
	//import 

	//4. Erstellen Sie eine Klasse StadtTest mit main()-Methode. 
	//Kopieren Sie in die Klasse die Methode public static Stadt[] staedte() hinein: 

	    public static Stadt[] staedte()
	    {
	        Stadt[] staedte = new Stadt[6];
	        List<Integer> berlinBevoelkerung = new ArrayList<>();
	        berlinBevoelkerung.add(3382169);    
	        berlinBevoelkerung.add(3460725);    
	        berlinBevoelkerung.add(3574830);
	        staedte[0] = new Stadt("Berlin", berlinBevoelkerung, 891.68f);

	        List<Integer> hamburgBevoelkerung = new ArrayList<>();
	        hamburgBevoelkerung.add(1715392);   
	        hamburgBevoelkerung.add(1786448);   
	        hamburgBevoelkerung.add(1810438);   
	        staedte[1] = new Stadt("Hamburg", hamburgBevoelkerung, 755.22f);

	        List<Integer> muenchenBevoelkerung = new ArrayList<>();
	        muenchenBevoelkerung.add(1210223);  
	        muenchenBevoelkerung.add(1353186);  
	        muenchenBevoelkerung.add(1464301);
	        staedte[2] = new Stadt("Muenchen", muenchenBevoelkerung, 310.70f);

	        List<Integer> koelnBevoelkerung = new ArrayList<>();
	        koelnBevoelkerung.add(962884);  
	        koelnBevoelkerung.add(1007119); 
	        koelnBevoelkerung.add(1075935); 
	        staedte[3] = new Stadt("Koeln", koelnBevoelkerung, 405.02f);

	        List<Integer> frankfurtBevoelkerung = new ArrayList<>();
	        frankfurtBevoelkerung.add(648550);  
	        frankfurtBevoelkerung.add(679664);  
	        frankfurtBevoelkerung.add(736414);
	        staedte[4] = new Stadt("Frankfurt/Main", frankfurtBevoelkerung, 248.31f);

	        berlinBevoelkerung = new ArrayList<>();
	        berlinBevoelkerung.add(3382169);    
	        berlinBevoelkerung.add(3460725);    
	        berlinBevoelkerung.add(3574830);
	        staedte[5] = new Stadt("Berlin", berlinBevoelkerung, 891.68f);

	        return staedte;
	    }

	    public static void main(String[] args)
	    {   
	        System.out.printf("%n------------ Liste --------------%n");

	        //1. Erstellen Sie in der main()-Methode eine List<Stadt> staedteListe = new ArrayList<>();. 
	        //Fügen Sie der staedteListe alle Städte aus dem durch Aufruf der staedte()-Methode erzeugtem Array zu.
	        List<Stadt> staedteListe = new ArrayList<>();
	        
	        //durch staedte iterieren und die Städte zur staedteListe hinzufügen
	        Stadt[] staedte = staedte();
	        for(Stadt stadt : staedte())
	        {
	        	staedteListe.add(stadt);
	        }
	        
	        //2. Geben Sie alle Informationen über alle Städte aus der Liste unter Verwendung 
	        //der print()-Methode aus der Klasse Stadt aus.

	        for(Stadt stadt : staedteListe)
	        {
	        	stadt.print();
	        }
	        
	        //durch staedteListe iterieren und für jeden Eintrag die print()-Methode aufrufen

	        System.out.printf("%n------------ Menge-HasSet --------------%n");

	        //1. Erstellen Sie in der main()-Methode eine Set<Stadt> staedteMenge = new HashSet<>();. 
	        Set<Stadt> staedteMenge1 = new HashSet<>();

	        //Fügen Sie der staedteMenge alle Städte aus dem durch Aufruf der staedte()-Methode erzeugtem Array zu.

	        for(Stadt stadt : staedte())
	        {
	        	staedteMenge1.add(stadt);
	        }
	        for(Stadt stadt : staedteMenge1) {
	        	stadt.print();
	        }
	        //analog zur gleichen Aufgabe mit der Liste oben

	            //Geben Sie alle Informationen über alle Städte aus der Liste unter Verwendung der 
	            //print()-Methode aus der Klasse Stadt aus.
	            //analog zur gleichen Aufgabe mit der Liste oben

	        //Berlin erscheint doppelt, obwohl eine Menge keine doppelten Elemente enthalten darf. Warum?
	        //Notieren Sie sich die Reihenfolge, in der Städte ausgegeben werden.
	        //Ändern Sie den Konstruktor von HashSet<>() in TreeSet<>(). Was passiert und warum?   
	        System.out.printf("%n------------ Menge-TreeSet --------------%n");
	        Set<Stadt> staedteMenge2 = new TreeSet<>();
	        //analog zu oben

	        for(Stadt stadt : staedte())
	        {
	        	staedteMenge2.add(stadt);
	        }
	        for(Stadt stadt : staedteMenge2) {
	        	stadt.print();
	        }

	        System.out.printf("%n------------ Maps --------------%n");

	        //1. Erstellen Sie in der main()-Methode eine Map<Integer, Stadt> staedteMap = new HashMap<>();. 
	        Map<Integer, Stadt> staedteMap = new HashMap<>();

	        Integer number = 1;
	        for(Stadt stadt : staedte())
	        {
	        	staedteMap.put(number, stadt);
	        	number++;
	        }
	        
	        
	        //Fügen Sie der staedteMap einen fortlaufenden, eindeutigen Integer-Wert beginnend mit 1 als Key 
	        //sowie alle alle Städte aus dem durch Aufruf der staedte()-Methode erzeugtem Array als Value hinzu.

	            //Geben Sie alle Informationen über alle Städte aus der Liste unter Verwendung der print()-Methode aus der Klasse Stadt aus. 
	            //Beginnen Sie die Zeile jeweils mit der Ausgabe des Keys.
	        
	       for(Map.Entry<Integer, Stadt> eintrag :  staedteMap.entrySet())
	       {
	    	   System.out.printf("%-3d", eintrag.getKey());
	    	   Stadt stadt = eintrag.getValue();
	    	   stadt.print();
	       }

	        //Beispiel, wie man eine Map durchgeht: https://freiheit.f4.htw-berlin.de/prog2/maps/#durch-eine-map-laufen
	        //erst den key ausgeben
	        //dann die Werte
	       System.out.printf("%n------------ Test compareTo --------------%n");
	        System.out.println("Berlin".compareTo("Anton"));
	        System.out.println("Anton".compareTo("Berlin"));
	        System.out.println("Berlin".compareTo("Berlin"));
	        System.out.println("Anton".compareTo("Zeppelin"));

	    }

	

}
