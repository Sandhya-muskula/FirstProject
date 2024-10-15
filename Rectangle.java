package Encapsulation;
public class Rectangle 
{
    private double length;
    private double width;

    // Constructor to initialize length and width
    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    // Method to calculate the area of  rectangle
    public double area()
    {
        return length * width;
    }

    // Method to calculate the perimeter of  rectangle
    public double perimeter()
    {
        return 2 * (length + width);
    }

    // Main method
    public static void main(String[] args)
    {
        Rectangle rectangle = new Rectangle(5, 3);
        System.out.println("Length: " + rectangle.length);
        System.out.println("Width: " + rectangle.width);
        System.out.println("Area: " + rectangle.area());               
        System.out.println("Perimeter: " + rectangle.perimeter());     
    }
}
