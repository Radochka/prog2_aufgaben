package aufgaben.aufgabe2;


public class MyInteger {

	public static int MAX_VALUE = 2147483647;
	public static int MIN_VALUE = -2147483648;
	private int value;

	public static boolean istZahl(char c) {
		return (c >= '0' && c <= '9');
	}

	public static boolean isNumber(String s) {
		if(s.charAt(0) == '+' || s.charAt(0) == '-') {
			s = s.substring(1);
		}
		for (int i = 0; i < s.length(); i++) {
			if(!istZahl(s.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	public static int charToInt(char c) {
		return (c-48);
	}

	static int parseInt(String s) throws IllegalArgumentException {
		boolean negativ = false;
		if(s == "") {
			throw new IllegalArgumentException("leere Eingabe"); 
		}
		else if(!isNumber(s)) {
			throw new IllegalArgumentException("Eingabe ist keine Zahl");
		}
		else if (s.charAt(0) == '+'){
				s = s.substring(1);
			}
		else if(s.charAt(0) == '-') {
			s = s.substring(1);
			negativ = true;
		}
		int zahl = 0;
		int exp = 1;
		for (int i = s.length()-1; i >=0; i--) {
			
			zahl = zahl + charToInt(s.charAt(i))*exp;
			exp *= 10;
		}
		if(negativ) return -zahl;
		else return zahl;
	}

	MyInteger(int value){
		this.value = value;
	}
	MyInteger(String s) throws IllegalArgumentException {
		this.value = parseInt(s);
	}

	public int intValue() {
		return this.value;
	}

	public double doubleValue() {
		return (double) this.value;
	}

	static MyInteger valueOf(String s) throws IllegalArgumentException{
		return new MyInteger(s);
	}
	static MyInteger valueOf(int value) throws IllegalArgumentException{
		return new MyInteger(value);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + value;
		return result;
	}

	@Override
	public boolean equals(Object obj) throws IllegalArgumentException{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyInteger other = (MyInteger) obj;
		if (value != other.value)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MyInteger [value=" + value + "]";
	}





}
