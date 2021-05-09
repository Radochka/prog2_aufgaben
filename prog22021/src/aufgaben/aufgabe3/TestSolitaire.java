package aufgaben.aufgabe3;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;


class TestSolitaire {
	
	static Solitaire s;
	
	@BeforeAll
	public void setup() {
		s = new Solitaire();
		
	}
	@BeforeEach
	public void printBeforeTest() {
		System.out.print("%n %n --------------------------Test ------------------------%n");
		s.print();
	}

//	@Test
//	void test() {
//		
//	}

}
