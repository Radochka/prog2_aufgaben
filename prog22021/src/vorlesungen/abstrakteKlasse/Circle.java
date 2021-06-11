package vorlesungen.abstrakteKlasse;

public class Circle extends Shape {
	
	private double radius;
	public Circle(double radius) {
		this.radius=radius;
	}

	@Override
	public double perimeter() {
		return Math.PI*2.0*this.radius;
	}

	@Override
	public double area() {
		return Math.PI*this.radius*this.radius;
	}

	
}
