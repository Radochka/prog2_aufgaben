package aufgaben.aufgabe4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class SingleNumberTest {

	int [] nums = {5,1,2,1,2};
	int [] nums1 = {1,2,1,2};
	int [] nums2 = {1};
	
	
	@Test
	void testSingleNumber()
	{
		SingleNumber sn = new SingleNumber();
		int zahl = sn.singleNumber(nums);		
		assertEquals(zahl, 5, "Der Found ist fehlerhaft");
	}
	
	@Test
	void testSingleNumber2()
	{
		SingleNumber sn = new SingleNumber();
		int zahl = sn.singleNumber(nums2);		
		assertEquals(zahl, 1, "Der Found ist fehlerhaft");
	}


	@Test
	void testSingleNumber1()
	{
		
		assertEquals(SingleNumber.singleNumber(nums1), 6, "Der Found ist fehlerhaft");
	}
	
}
