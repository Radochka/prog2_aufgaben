package aufgaben.aufgabe4;

import java.util.ArrayList;
import java.util.List;

public class SingleNumber {

	public static int singleNumber(int[] nums) {
		List<Integer> list = new ArrayList<>();
		final int NOT_FOUND = -1;

		if(list.size()==0) //isEmpty()
		{
			System.out.println("No unique number is found.");
			return NOT_FOUND;
		}
		
		for (int i : nums) {
			if (!list.contains(i)) {
				list.add(i);
			} else {
				list.remove(new Integer(i));
			}
		}
		

		return list.get(0);
	}


	public static void printList(int[] nums) {

		System.out.print("Input : [");
		for (int i : nums) {
			System.out.print(i + " ");
		}
		System.out.print("]");
		System.out.println();

	}


	public static void main(String[] args) {

		int [] input = {4,2,3,4,2};
		printList(input);
		System.out.println("Output : " + singleNumber(input));
	
	}
}
