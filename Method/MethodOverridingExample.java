package Polymorphism;
/*----- Base Class -------*/
class TwoDFigure 
{
	public void description()
	{
		System.out.println("This is Two Dimensional Figure");
	}
	public void area()
	{
		System.out.println("Area is defined as the region bounded by the outer bounadry of the two d figure");
	}
}
/*-----------------------------------------------------------------*/
/*------ Derived Class definition ---------*/
class Rectangle30 extends TwoDFigure
{
	float length,breadth;
	/*----- Overriding the methods -------*/
	public void description()
	{
		System.out.println("Rectangle is 2d Figure which have length and breadth");
	}
	public void area()
	{
		length = 5;
		breadth = 10;
		System.out.println("----- Rectangle -----");
		System.out.println("Length : "+length);
		System.out.println("Breadth : "+breadth);
		float a = length * breadth;
		System.out.println("Area : "+a);
	}
}
/*-----------------------------------------------------------------*/
public class MethodOverridingExample {

	public static void main(String[] args) 
	{
		//Creating the object of derived class
		Rectangle30 rect=new Rectangle30();
		rect.description();
		rect.area();
	}

}
