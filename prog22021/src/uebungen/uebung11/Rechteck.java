package uebungen.uebung11;

public class Rechteck {
	private int x, y, wigth, heigth;
	
	public Rechteck( int x, int y, int width, int heigth) {
		this.x = x;
		this.y = y;
		this.heigth = heigth;
		this.wigth = width;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {//überschreibt unsere this.y -  objectvariable
		this.y = y;
	}

	public int getWigth() {
		return wigth;
	}

	public void setWigth(int wigth) {
		this.wigth = wigth;
	}

	public int getHeigth() {
		return heigth;
	}

	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}
	
	public void printRechteck() {
		
	}
	
//	public static void main(String[] args) {
//		Rechteck r1 = new Rechteck(3, 3, 10, 20);
//		
//	}
//	

}
