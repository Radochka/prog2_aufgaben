package vorlesungen.junit.zeit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ZeitUmrechnenTest {

	@Test
	void testConvert1amTo1() { // umbennen so, dass man versteht was getestet wird
		//given (preperation) etwas gegebn
		ZeitUmrechnen utz = new ZeitUmrechnen();
		//when (execution) wenn
		String zeit = utz.convert("1:00 am");
		// than (verification) dann
		assertEquals(zeit, "1:00", "1:00 am to 1:00 not working"); //soll vergliechen werden und es sollte true sein!!! und gibt eine Fehlmeldung
	}

}
