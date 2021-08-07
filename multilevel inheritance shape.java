import java.util.Scanner;
abstract class Shape {
    protected String name;

    public abstract double getArea();
    public abstract double getPerimeter();

  
    public String toString() {
        return "Shape: "+name + "\nArea: " + String.format("%.1f", getArea()) +
            "\nPerimeter: " + String.format("%.1f", getPerimeter());
    }
}

 class Rectangle extends Shape {
   private double side1;
   private double side2;

 public  Rectangle(double side1, double side2) {
        this.name = "Rectangle";
        this.side1= side1;
        this.side2 = side2;
    }

    public double getArea() {
        return side1 * side2;
    }

    public double getPerimeter() {
        return 2 * (side1 + side2);
    }
}
 class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
        this.name = "Square";
       
    }
}
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
     Square s=new Square(sc.nextDouble());
     System.out.println(s.toString());
	}
}
