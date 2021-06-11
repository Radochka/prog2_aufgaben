package aufgaben.aufgabe6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.JOptionPane;



public class PizzaMenu {
	

	
//	System.out.println("-------------------------Punkt 3 ------------------------");
	
	public static boolean existingPizza(Map<String, Double> menu, String pizza) {
		//Set<Map.Entry<String, Double>> exist = menu.entrySet();
		//for(Map.Entry<String, Double> entry : exist) 
		for(Map.Entry<String, Double> entry : menu.entrySet()){
			if(entry.getKey() == pizza) return true;
		}
		return false;
	}

	public static void printPrice(Map<String, Double> menu, String pizza) {
		if(!existingPizza(menu, pizza)) {
			System.out.println(pizza + " : Diese Pizza gibt es nicht.");
		}
		else {
			for(Map.Entry<String, Double> entry : menu.entrySet()){
				if(pizza == entry.getKey()){
					System.out.printf("%s : %.2f Euro %n", pizza, entry.getValue());
				}

			}
		}
	}

	public static void printMenu(Map<String, Double> menu) {
		System.out.println("###################");
		if(menu.isEmpty()) {
			System.out.println("Das Menu enthält " + menu.size() + " Pizzen.");
		}
		else {
			System.out.println("Das Menu enthält " + menu.size() + " Pizzen.");
			for(Map.Entry<String, Double> entry : menu.entrySet()) {
				System.out.printf("Pizza %s : %.2f Euro %n", entry.getKey(), entry.getValue());
			}
		}
		System.out.println("###################");
	}
	
	public static double maxPrice() {
		boolean eingabeOk = false;
		double preis = 0.0;
		while(!eingabeOk) {
			String eingabe = JOptionPane.showInputDialog("Wie viel willst du ausgeben? : ");
			try {
				preis = Double.valueOf(eingabe);
				eingabeOk = true;
			}
			catch(NumberFormatException e) {
				System.out.println("Eingabe muss eine Zahl sein, z.B 3.5");
				eingabeOk = false;
			}

		}
		return preis;
	}
	public static void affordablePizza(Map<String, Double> menu, double maxPrice) {
		System.out.printf("Eingegebener Betrag  : %.2f Euro \n", maxPrice);
		Set<String> pizza = new HashSet<>();
		for(Map.Entry<String, Double> entry : menu.entrySet()) {
			if(entry.getValue().compareTo(maxPrice) <= 0) {
				pizza.add(entry.getKey());
			}
		}
			if(pizza.size() == 0){
				System.out.println("Leider gibt es zu diesem Preis keine Pizza");				
			}
			else {
				System.out.print("Mögliche Pizzen : [ ");
				for (String str : pizza) {
					System.out.print(str + " ");
				}
				System.out.println("]");
			}
		}
		
	
	
	public static void main(String[] args) {
		
		
		System.out.printf("%n-------------------------Punkt 1 ------------------------%n");
		
		long a = 1000;
		Integer b = 1000;
		Integer c = 1000;
		/*
		 *Auto-boxing - Der int-Wert 1000 wird zu einem Typ Integer
		 *und somit zu einem Referenztyp. Dafür sind alle Vorteile von referenztypen
		 *nutzbar, z.B. Objektmethoden, Vererbung usw.
		 */
		System.out.println(a == b); // vergleicht Werte, b wird zum long übertragen (hier findet unboxing statt)
		System.out.println(b == c); // hier werden Referenzobjekte verglichen, einer ist b und die andere c, nicht die werte
		System.out.println(b.intValue() == c.intValue()); // hier werden werte verglichen
	

		
		System.out.printf("%n-------------------------Punkt 2-4 ------------------------%n");
		Map<String, Double> menu = new HashMap<>();
		Map<String, Double> menu1 = new HashMap<>();
		menu.put("Margherita", 7.00);
		menu.put("Veggie", 7.50);
		menu.put("Salami", 8.50);
		menu.put("Schinken", 8.50);
		printPrice(menu, "Margherita");
		printPrice(menu, "Hawaii");
		
		System.out.printf("%n-------------------------Punkt 5 ------------------------%n");
		printMenu(menu);
		System.out.println();
		printMenu(menu1);
		
		System.out.printf("%n-------------------------Punkt 6 ------------------------%n");
		menu.put("Schinken", 8.20);
		printMenu(menu);
		
		System.out.printf("%n-------------------------Punkt 7 ------------------------%n");
		double maxPrice = maxPrice();
		affordablePizza(menu, maxPrice);
		
		System.out.printf("%n-------------------------Punkt 8 ------------------------%n");

		menu1 = menu;
		menu.clear();
		menu.put("Verde", 7.00);
		menu.put("Hawaii", 8.20);
		menu.put("Tradizionale", 8.50);
		printMenu(menu);
		
		System.out.printf("%n-------------------------Punkt 9 ------------------------%n");

		menu.remove("Hawaii");
		printMenu(menu);
		System.out.printf("%n-------------------------Punkt 10 ------------------------%n");
		
	}
}
