package ClassesAndObjects;
import java.util.Scanner;
class ShowRoom {
    // Instance variables to store customer and item details
    String name;
    long phno;
    double cost;
    double amount;
    double dis;

    // Method to input customer and item details
    public void input() {
        // Createing a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // taking the custoner name from keyboard
        System.out.println("Enter the name of the customer:");
        this.name = sc.nextLine();
        
        // taking the input from the keyboard
        System.out.println("Enter the cost of the item (between 10000 and 35000):");
        this.cost = sc.nextDouble();
        //taking the phone number from  keyboard
        System.out.println("Enter the phone number of the customer:");
        this.phno = sc.nextLong();
    }
    // Method to calculate the discount and final amount
    public void calculate() {
        // Determine the discount based on the cost
        if (cost > 10000 && cost <= 20000) {
            System.out.println("You may get a 10% discount.");
            dis = 10;
        } else if (cost > 20000 && cost <= 35000) {
            System.out.println("You may get a 15% discount.");
            dis = 15;
        } else {
            // Assuming costs above 35000 should receive a 20% discount
            System.out.println("You may get a 20% discount.");
            dis = 20;
        }
        
        // Calculate the final amount after applying the discount
        amount = cost - (cost * (dis / 100));
    }

    // Method to display the customer and item details
    public void display() {
        System.out.println("----------------------");
        
        // Displaying the final amount after discount
        System.out.println("The amount of the item is: " + amount);
        
        // Displaying the amount saved due to discount
        System.out.println("You can save up to: " + (cost - amount));
        
        // Displaying the customer's name and phone number
        System.out.println("The name of the customer: " + name);
        System.out.println("The phone number is: " + phno);
    }
}

// Main class to run the showroom application
public class SailingAndPurchasing {
    public static void main(String[] args) {
        // Create an object of the ShowRoom class
        ShowRoom obj = new ShowRoom();
        
        // Call methods to input data, calculate amount, and displaying results
        obj.input();
        obj.calculate();
        obj.display();
    }
}