package aufgaben.aufgabe4;

import java.util.ArrayList;
import java.util.List;

public class SingleNumber {
	public static List<Integer> createList(int[] nums)
	{
		List<Integer> list = new ArrayList<>();

		for (int i : nums) {
			list.add(nums[i]);
		} 
		return list;
	}
	public static void printList(List<Integer> list)
	{
		System.out.print("Input : nums = [");
		for(int i = 0; i<list.size()-1; i++)
		{
			System.out.print(list.get(i) + ", ");
		}
		System.out.print(list.get(list.size()-1) + "]");
		System.out.println();
	}

	public static int singleNumber(int[] nums) {
		List<Integer> list=new ArrayList<>();
		final int NOT_FOUND = -1;
		int zahl = 0;
		for (int i : nums)
		{
			if (!list.contains(i))
			{
				list.add(i);
			}
			else
			{
				list.remove(new Integer(i));
			}
		}
		if(list.size() == 0) {
			System.out.println("Die Liste ist leer");
			zahl = NOT_FOUND;			
		}
		else
		{ 
			zahl = list.get(0);
		}

		return zahl;
	}
	

	public static void main(String[] args) {
		int [] input = {4,2,3,4,2};
		List<Integer> list = createList(input);
		printList(list);
		System.out.println("Output : " + singleNumber(input));

	}
}
