package Encapsulation;
public class Square
{
    private double side;
    // Constructor to initialize the side length
    public Square(double side) 
    {
        this.side = side;
    }
    // Method to calculate the area of square
    public double area()
    {
        return side * side;
    }
    // Method to calculate the perimeter of square
    public double perimeter() 
    {
        return 4 * side;
    }
    // Main method 
    public static void main(String[] args)
    {
        Square square = new Square(5);
        System.out.println("Side length: " + square.side);
        System.out.println("Area: " + square.area());          
        System.out.println("Perimeter: " + square.perimeter()); 
    }
}
