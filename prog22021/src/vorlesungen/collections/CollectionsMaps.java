package vorlesungen.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CollectionsMaps {
	
	public static void main(String[] args) {
		
		Map<String, Double> m = new HashMap<>();
		m.put("s0512346", 1.7);
		m.put("s0587654", 1.7);
		m.put("s0512346", 2.7);
		m.put("s0555555", 3.0);
		
		Set<String> keys = m.keySet();
		Collection<Double> values = m.values();
		Set<Map.Entry<String, Double>> entries = m.entrySet();
		
		for (Map.Entry<String, Double> entry : entries) { // oder for (Map.Entry<String, Double> entry : m.entrySet())
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		for (String schluesel : m.keySet()) {
			System.out.println("key : " + schluesel);
		}
		
		for(Double wert : m.values()) {
			System.out.println("value : " + wert.toString());
		}
		
		Map<String, String> accounts = new HashMap<>();

		accounts.put("anton", "anton@email.de");
		accounts.put("berta", "berta@email.de");
		accounts.put("caesar", "caesar@email.de");
		accounts.put("anton", "antonius@email.de");

		// Iteration ueber alle Eintraege (Map.Entry) der Map
		for(Map.Entry<String, String> entry : accounts.entrySet()) 
		{
		    System.out.println("Account : " + entry.getKey() + " E-Mail : " + entry.getValue());
		}
	}

}
