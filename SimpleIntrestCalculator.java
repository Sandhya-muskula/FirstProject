package ClassesAndObjects;
import java.util.Scanner;

public class SimpleIntrestCalculator {

    // Fields for principal, rate, and time
    private double principal;
    private double rate;
    private double time;

    // Constructor to initialize the fields
    public SimpleIntrestCalculator(double principal, double rate, double time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    // Method to calculate simple interest
    public double calculateInterest() {
        return (principal * rate * time) / 100;
    }

    // Main method to test the SimpleIntrestCalculator class
    public static void main(String[] args) {
    	// creating object of scanner class
        Scanner sc = new Scanner(System.in);

        // Get input from keyboard for principal
        System.out.print("Enter the principal amount: ");
        double principal = sc.nextDouble();

        // Get input from keyboard for rate
        System.out.print("Enter the rate of interest: ");
        double rate = sc.nextDouble();

        // Get input from keyboard for time
        System.out.print("Enter the time period in years: ");
        double time = sc.nextDouble();

        // Creating an object of SimpleIntrestCalculator with keyboard
        SimpleIntrestCalculator calculator = new SimpleIntrestCalculator(principal, rate, time);

        // Calculate simple interest
        double interest = calculator.calculateInterest();

        // Print the result
        System.out.println("Simple Interest: " + interest);

       }
}
