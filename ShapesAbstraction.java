//Abstraction
abstract class Shape // calculate the area of some shapes // abstract class
{
	//variable declaration
	double l;
	double a;
	double w;
	double r;
	double b;
	double h;
	double pi=3.14d;

	abstract void area(); 	//Abstract method

}


class Circle extends Shape

{
	
	public Circle(double r) //constructor for passing values
	
	{ 
	
		this.r=r;
	
	}
	
	void area() //definition of abstract method
	
	{

		System.out.println("Area of Circle :"+pi*r*r);
	
	}
}

class Rectangle extends Shape

{
	
	public Rectangle(double l, double w) //constructor for passing values
	
	{
	
	this.l=l;
	this.w=w;
	
	}
	
	void area() //definition of abstract method
	
	{
	
		System.out.println("Area of Rectangle :"+l*w);
	}
}

class Square extends Shape

{
	
	public Square(double a) //constructor for passing values 
	
	{
	
		this.a=a;
	
	}
	
	void area() //definition of abstract method
	
	{
	
		System.out.println("Area of Square :"+a*a);
	
	}
}
class Triangle extends Shape
{
	
	public Triangle(double b,double h)  //constructor for passing values
	
	{
		
	this.b=b;
	this.h=h;
	
	}
	
	void area() //definition of abstract method
	
	{
		
		System.out.println("Area of Triangle :"+(0.5*b*h));
	
	}
}


public class Shapes {
	public static void main(String[] args) {
		
		//object created by dynamic binding 
		//values passing through constructor
		
		Shape c=new Circle(5);
		Shape r=new Rectangle(5,5);
		Shape s=new Square(5);
		Shape t=new Triangle(5,5);
		
		c.area();
		System.out.println();
		
		r.area();
		System.out.println();
		
		s.area();
		System.out.println();
		
		t.area();
		
		
	}

}
