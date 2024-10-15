package Encapsulation;
import java.util.Scanner;

public class DivisionProgram 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number (numerator): ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number (denominator): ");
        double num2 = scanner.nextDouble();

        // Check if the denominator is zero
        if (num2 == 0) 
        {
            System.out.println("Error: Cannot divide by zero.");
        }
        else
        {
            // Perform division
            double result = num1 / num2;
            // Displaying  the result
            System.out.println("The result of " + num1 + " divided by " + num2 + " is: " + result);
        }
    }
}
