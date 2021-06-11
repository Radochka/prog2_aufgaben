package vorlesungen.abstrakteKlasse;

public abstract class Shape implements Comparable<Shape>{

	public abstract double perimeter();
    public abstract double area();
    
    @Override
    public int compareTo(Shape o) 
    {   
        if(this.area() > o.area()) return 1;
        else if(this.area() < o.area()) return -1;
        else return 0; // this.area() == o.area()
    }
}
