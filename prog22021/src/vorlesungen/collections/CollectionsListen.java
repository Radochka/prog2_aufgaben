package vorlesungen.collections;
import java.util.*;
public class CollectionsListen {

	static void fillList(List<String> list)
	{
		for (int i = 0; i < 10; i++) {
			list.add(String.valueOf(i));
		}
	}
	
	static void printList(List<String> list) {
		/*Iterator<String> il = list.iterator();
		while(il.hasNext()) {
			System.out.print(il.next() + " ");
		}*/
		for (String s : list) {
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("End of list");
	}
	
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		fillList(list1);
		printList(list1);
		
		List<String> list2 = new LinkedList<>();
        fillList(list2);
        list2.remove("3");
        printList(list2);
        list2.remove(6);
        printList(list2);
        list1.removeAll(list2);
        printList(list2);
        printList(list1);
	
	
	  Set<Integer> s1 = new HashSet<>();
	  Set<Integer> s2 = new HashSet<>();

	  for (int i = 10; i >= 1; i--) { 
		  s1.add(i);
		  System.out.print(i + " "); 
		  }
	  System.out.println();
	  for (int i = 9; i <= 12; i++) { 
		  s2.add(i); 
		  System.out.print(i + " ");
		  }
	  System.out.println();
	  
	  s1.addAll(s2);
	  for(int i : s1) {
		  System.out.print(i + " ");
	  }
	  
}
}
