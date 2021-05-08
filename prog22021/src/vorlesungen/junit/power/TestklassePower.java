package vorlesungen.junit.power;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestklassePower {
	
	static Power p1,p2,p3,p4;
	static int testnr = 1;
	
	@BeforeAll
	public static void setup() {
		p1 = new Power(2,3);
		p2 = new Power(2,3);
		p3 = new Power(-2,3);
		p4 = new Power(2,-3);
	}
	
	@BeforeEach
	public void printBeforeTests() {
		System.out.printf("%n %n --------------------------Test %d ------------------------%n", testnr);
		p1.print();
		p2.print();
		testnr++;
	}

	@Test
	void testToString() {
		String s = p1.toString();
		assertEquals("(2^3)", s, "Strings are not equal!");
	}
	@Test
	void testValue() {
		double value = p1.value();
		assertEquals(value, 8.0, "2^3 should be 8.0");
	}
	@Test
	public void testEqualsObject() {
		assertTrue(p1.equals(p2), "2^3 should be equal to 2^3!");
	}

}
