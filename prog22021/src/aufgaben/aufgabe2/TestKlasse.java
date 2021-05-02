package aufgaben.aufgabe2;

public class TestKlasse {

	public static void main(String[] args) {
	
		MyInteger mi1=null, mi2=null, mi3=null, mi4=null, mi5=null, mi6=null, mi7=null;
		
		try {
			mi1 = new MyInteger("2147483750");
			System.out.println("mi1 : " + mi1.intValue());
			System.out.println(mi1.toString());
		} catch (IllegalArgumentException e) {
			System.out.println("mi1 : " + e.getMessage());
		}
		
		try {
			mi2 = new MyInteger(-456);
			System.out.println("mi2 : " + mi2.doubleValue());
		} catch (IllegalArgumentException e) {
			System.out.println("mi2 : " + e.getMessage());
		}
		
		try {
			mi3 = new MyInteger("");
			System.out.println("mi3 : " + mi3.intValue());
		} catch (IllegalArgumentException e) {
			System.out.println("mi3 : " + e.getMessage());
		}
		try {
			mi4 = new MyInteger("+4578900");
			System.out.println("mi4 : " + mi4.intValue());
		} catch (IllegalArgumentException e) {
			System.out.println("mi4 : " + e.getMessage());
		}
		
		try {
			mi5 = new MyInteger("-0000004578900");
			System.out.println("mi5 : " + mi5.intValue());
		} catch (IllegalArgumentException e) {
			System.out.println("mi5 : " + e.getMessage());
		}
		
		try {
			mi6 = new MyInteger("Hallo");
			System.out.println("mi6 : " + mi6.intValue());
		} catch (IllegalArgumentException e) {
			System.out.println("mi6 : " + e.getMessage());
		}
		
		try {
			System.out.println("mi1 equals mi2 ? : " + mi1.equals(mi2));
			System.out.println("mi3 equals mi4 ? : " + mi3.equals(mi4));
			System.out.println("mi1 equals mi4 ? : " + mi1.equals(mi4));
		} catch (IllegalArgumentException e) {
			System.out.println("Der Vergleich ist nicht möglich");
		}
	}
	

}
