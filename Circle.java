package Encapsulation;
public class Circle 
{
    private double radius;

    // Constructor to initialize the radius
    public Circle(double radius) 
    {
        this.radius = radius;
    }

    // Method to calculate the area of circle
    public double area() 
    {
        return Math.PI * radius * radius;
    }

    // Method to calculate the circumference of circle
    public double perimeter()
    {
        return 2 * Math.PI * radius;
    }

    // Main method 
    public static void main(String[] args) 
    {
        Circle circle = new Circle(3);
        System.out.println("Radius: " + circle.radius);
        System.out.println("Area: " + circle.area());           
        System.out.println("Perimeter (Circumference): " + circle.perimeter()); 
    }
}
