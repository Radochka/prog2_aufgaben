package aufgaben.aufgabe5;
import java.util.*;

public class SetOperation {

	static Set<Integer> numbers1 = new TreeSet<>();
	static Set<Integer> numbers2 = new TreeSet<>();
	static Set<Integer> both = new TreeSet<>();

	static void fill()
	{
		Random r = new Random();
		for(int i = 0; i<100; i++)
		{
			Integer number = Integer.valueOf(r.nextInt(100));
			if(!numbers1.contains(number))
			{
				numbers1.add(number);
			}
		}

		for(int i = 0; i<100; i++)
		{
			Integer number = Integer.valueOf(r.nextInt(100));
			if(!numbers2.contains(number))
			{
				numbers2.add(number);
			}
		}

	}
	static Set<Integer> fillBothUnion()
	{
		both.clear();
		both.addAll(numbers1);
		both.addAll(numbers2);
		//		numbers1.addAll(numbers2);
		//		both = numbers1;
		return both;
	}

	static Set<Integer> fillBothIntersection()
	{
		both.clear();
		for(Integer el : numbers1) {
			if(numbers2.contains(el)) {
				both.add(el);
			}
		}
		return both;
	}

	static Set<Integer> fillBothDifference()
	{
		both.clear();
		for(Integer el : numbers1)
		{
			if(!numbers2.contains(el)) {
				both.add(el);
			}
			
		}
		return both;
	}


	static void print(Set<Integer> b)
	{

		System.out.println("----------------------------------------------------------------------------");
		System.out.println("         A                         B                       A" + '\u222a' + " B             ");
		System.out.println("----------------------------------------------------------------------------");
		Integer countA = 0;
		Integer countB = 0;
		Integer countM = 0;
		for(Integer row = 0; row<10; row++)
		{
			for(Integer col = 0; col<10; col++) {
				if(numbers1.contains(countA)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				countA++;
			}
			System.out.print("     ");
			for(Integer col = 0; col<10; col++) {
				if(numbers2.contains(countB)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				countB++;
			}
			System.out.print("     ");
			for(Integer col = 0; col<10; col++) {
				if(b.contains(countM)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				countM++;
			}
			System.out.println();
		}

	}



	public static void main(String[] args) {

		fill();
		Set<Integer> b = fillBothUnion();
		print(b);
		b = fillBothIntersection();
		print(b);
		b = fillBothDifference();
		print(b);
//		Integer ziffer = 0;
//		for(Integer row = 0; row<10; row++)
//		{
//			for(Integer col = 0; col<10; col++) {
//				if(b.contains(ziffer)) {
//					System.out.printf("%2d ", ziffer);
//				}
//				else {
//					System.out.print("-- ");
//				}
//				ziffer++;
//			}
//			System.out.println();
//
//
//		}
	}
}
