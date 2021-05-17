package uebungen.uebung5;

import java.util.*;

public class ArrayListUebung5 {
	
	public static List<String> createArrayList(String[] words){
		List<String> list = new ArrayList<>();
		
		for (int i = 0; i < words.length; i++) {
			list.add(words[i]);
			
		} 
		
		return list;
	}
	
	public static void printList(List<String> list) {
		
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("Anzahl der Elemente in der Liste : " + list.size());
	}
	
	
	public static Set<String> createHashSet(String[] words){
		Set<String> set = new HashSet<>();
		for(String s : words) {
			set.add(s);
		}
		return set;
	}
	
	public static void printSet(Set<String> set) {
		for (String s : set) {
			System.out.println(s);
		}
		System.out.println("Anzahl der Elemente im Set : " + set.size());
	}
	
	public static Set<String> createTreeSet(String[] words){
		Set<String> set2 = new TreeSet<>();
		for(String s : words) {
			set2.add(s);
		}
		return set2;
	}
	
	public static List<String> findDoublets(List<String> list){
		List<String> single	= new ArrayList<>();
		List<String> copy = new ArrayList<>();
		for(String s : list) {
			if(list.indexOf(s) == list.lastIndexOf(s)) single.add(s);
		}
		for(String s : list) {
			copy.add(s);
		}
		
		copy.removeAll(single);
		return copy;
		
	}
	
	public static void main(String[] args) {
		String[] words = {"Linux", "Apple", "Facebook", "Amazon", "IBM", "Lenovo", "Google",
				"IBM", "Microsoft", "Apple", "Google", "Twitter", "Skype", "Chrome", "Linux", "Firefox"};
		System.out.println("-----------------------A-------------------------");
		List<String> li = createArrayList(words); // dies ist eine Variable, und nicht Objekt
		printList(li);
		System.out.println();
		System.out.println("Index des ersten Auftretens von Apple : " + li.indexOf("Apple"));
		System.out.println("Index des letzten Auftretens von Apple : " + li.lastIndexOf("Apple"));
		System.out.println("erstes Element der Liste : " + li.get(0));
		System.out.println("letztes Element der Liste : " + li.get(li.size()-1));
		li.remove("Apple");
		li.remove("Google");
		li.remove("Facebook");
		System.out.println("-----------------nach Remove---------------------");
		printList(li);
		
		System.out.println("-----------------HashSet---------------------");
		Set<String> setH = createHashSet(words);
		printSet(setH);
		
		System.out.println("-----------------TreeSet---------------------");
		Set<String> setT = createTreeSet(words);
		printSet(setT);
		
		System.out.println("--------------------Duplikagte---------------------");
		List<String> l2 = createArrayList(words);
		List<String> d = findDoublets(l2);
		printList(d);
		printList(l2);
		
		
	}

}
