package vorlesungen.abstrakteKlasse;

public class TestklasseShape 
{

    public static void printPerimeter(Shape s)
    {
        System.out.printf("perimeter : %.2f cm%n", s.perimeter());
    }

    public static void printArea(Shape s)
    {
        System.out.printf("area      : %.2f cm%n", s.area());
    }

    public static double sumPerimeters(Shape[] shapes)
    {
        double sum = 0.0;
        for(Shape s : shapes)
        {
            sum += s.perimeter();
        }
        return sum;
    }

    public static double sumAreas(Shape[] shapes)
    {
        double sum = 0.0;
        for(Shape s : shapes)
        {
            sum += s.area();
        }
        return sum;
    }
    
    public static void sortieren(Comparable[] unsorted)
    {   
        for(int bubble=1; bubble<unsorted.length; bubble++)
        {
            for(int index=0; index<unsorted.length-bubble; index++)
            {
                if(unsorted[index].compareTo(unsorted[index+1]) > 0) 
                {
                    Comparable tmp = unsorted[index];
                    unsorted[index] = unsorted[index+1];
                    unsorted[index+1] = tmp;            
                }
            }
        }
    }
    

    public static void main(String[] args) {
        Shape s1 = new Rectangle(10, 20);
        Shape s2 = new Circle(6.0);
        printPerimeter(s1);
        printPerimeter(s2);
        printArea(s1);
        printArea(s2);

        Shape[] shapes = new Shape[4];
        shapes[0] = s1;
        shapes[1] = s2;
        shapes[2] = new Rectangle(5,15);
        shapes[3] = new Circle(10.0);
        System.out.printf("sum of perimeters : %.2f cm%n", sumPerimeters(shapes));
        System.out.printf("sum of areas      : %.2f cm%n", sumAreas(shapes));
    
        Rectangle[] rectArr = new Rectangle[6];
        rectArr[0] = new Rectangle(9, 13);
        rectArr[1] = new Rectangle(4, 17);
        rectArr[2] = new Rectangle(12, 5);
        rectArr[3] = new Rectangle(8, 9);
        rectArr[4] = new Rectangle(10, 11);
        rectArr[5] = new Rectangle(5, 15);
        System.out.printf("%n%n------------------------ unsortiert --------------------------%n%n");
        for(Rectangle r : rectArr)
        {
            System.out.println(r.toString());
        }
        System.out.printf("%n%n------------------------- sortiert ---------------------------%n%n");
        sortieren(rectArr);
        for(Rectangle r : rectArr)
        {
            System.out.println(r.toString());
        }
    }
}