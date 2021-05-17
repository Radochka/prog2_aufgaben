package vorlesungen.collections;

public class CollectionsWrapper {
	

	
	public static void main(String[] args) {
		//Wrapper-Klassen haben die Klassenmethide
		//valueOf(Wertetyp b) ...
		Integer iObject1 = Integer.valueOf(100);
		Boolean bObject1 = Boolean.valueOf(true);
		Double dObject1 = Double.valueOf(5.5);
		
		// ... oder valueOf(String s)
		
		Integer iObject2 = Integer.valueOf("100");
		Boolean bObject2 = Boolean.valueOf("true");
		Double dObject2 = Double.valueOf("5.5");
		
		// ... oder Auto-Boxing
		Integer   io1 = 100;
		Boolean   bo1 = true;
		Character co1 = 'a';
		Double    do1 = 5.5;
		Float     fo1 = 2.7f;
		Long      lo1 = 1234L;
		Integer i11 = 5000;
		Integer i22 = 5000;
		Integer i33 = 5001;
		System.out.println(i11 == i22); //wird verglichen, ob um den gleichen Referenzvariablen geht
		System.out.println(i11 >= i22);
	    System.out.println(i33 > i22);
		
		int     i1 = io1.intValue();        // 100
		boolean b1 = bo1.booleanValue();    // true
		char    c1 = co1.charValue();       // 'a'
		double  d1 = do1.doubleValue();     // 5.5
		float   f1 = fo1.floatValue();      // 2.7
		long    l1 = lo1.longValue();       // 1234
		
		//Auto-Boxing (UNboxing)
		int     i2 = io1;   // 100
		boolean b2 = bo1;   // true
		char    c2 = co1;   // 'a'
		double  d2 = do1;   // 5.5
		float   f2 = fo1;   // 2.7
		long    l2 = lo1;   // 1234
	}
}
