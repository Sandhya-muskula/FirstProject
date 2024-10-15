package ClassesAndObjects;
import java.util.Scanner;
class circle
{ 
	float radius;
	
	public void inputForRadius()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the radius for the circle");
		radius=sc.nextInt();
	}
	public void areaOfCircle()
	{
		float area=(22/7)*(radius*radius);
		System.out.println("the area of the circle is::"+area);
	}
	public void cperimeter()
	{
		float perimeter=2*(22/7)*radius;
		System.out.println("the perimeter is::"+perimeter);
	}
}
public class CircleAreaPerimeter {

	public static void main(String[] args) {
		circle obj=new circle();
		obj.inputForRadius();
		obj.areaOfCircle();
		obj.cperimeter();
	}

}