package vorlesungen.abstrakteKlasse;

public class Rectangle extends Shape{
	
	private int width, height;
	
	public Rectangle(int width, int height) {
		super();
		this.width=width;
		this.height=height;
	}
	@Override
	public double perimeter() {
		
		return 2.0*(this.width+this.height);
	}

	@Override
	public double area() {
		return this.width*this.height;
	}
	
	@Override
    public String toString()
    {   String s = String.format("[ %2d x %2d = %6.2f ] ", this.width, this.height, this.area()); 
        return s;
    }
	

}
