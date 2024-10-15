package Polymorphism;
/*------- defining a class for Area calculation------*/
class CalculateArea
{
	/*----- Method to calculate the area of rectangle ------*/
    public void calculateArea(int length,float width)
    {
	    float Area = length * width;
	    System.out.println("------- rectangle -------");
	    System.out.println(" length : "+length+" m");
	    System.out.println(" width : "+width+ "cubic m");
	    System.out.println("area is :"+Area);
    }

    /*----- Method to calculate the area   of Cube ------*/
     public void calculateArea(int base,int hight)
     { 
	    double Area = (base * hight)/2;
	    System.out.println("---------- Triangle --------");
	    System.out.println(" base : "+base+" m");
	    System.out.println(" height : "+hight+"  m");
	    System.out.println("area is :"+Area);
        }
    /*----- Method to calculate area of square ------ */
    public void calculateArea(int side)
    {
    	int area = side*side;
	    System.out.println("------ Square --------");
	    System.out.println("side : "+side+" m");
	    System.out.println("side :"+side+" m");
	    System.out.println("area is :"+area);
    }

    /*------ Method to calculate area of circle ------*/
    public void CalculateArea(int radius)
    {
	    int Area = 22/7 * radius;
	    System.out.println("------ Circle --------");
	    System.out.println(" Radius : "+radius+" m");
	    System.out.println("area is :"+Area);
    }
}
public class MethodOverloadingExample2
{
	public static void main(String[] args) 
	{
		//Creating the object of AreaCalculator class
		CalculateArea Ar = new CalculateArea();
		Ar.calculateArea(6,2.4f); // rectanle
		Ar.calculateArea(2,4);   //triangle
		Ar.calculateArea(2,4);//square
		Ar.calculateArea(4);//circle

	}

}