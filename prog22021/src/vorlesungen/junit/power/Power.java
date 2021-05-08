package vorlesungen.junit.power;

public class Power {
	private int base;
	private int exp;
	
	public Power(int base, int exp) {
		this.base = base;
		this.exp = exp;
		
	}
	
	public double value() {
		double value = 1.0;
		if(exp > 0) {
			for (int i = 0; i < exp; i++) {
				value*=base;
			}
		}
		else {
			for (int i = 0; i < -exp; i++) {
				value*=base;
			}
			value = 1.0/value;
		}
		return value;
	}
	
	@Override
	public String toString() {
		return "(" + this.base + "^" + this.exp + ")";
	}
	
	public void print() {
		System.out.println(this.toString());
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == null) return false;
		if(this ==o) return true;
		if(this.getClass() != o.getClass()) return false;
		Power p = (Power)o;
		return (this.base == p.base && this.exp == p.exp);
	}
	@Override
	public int hashCode() {
		return 7*this.base + 11*this.exp;
	}

}
