package Arrays;
import java.util.Scanner;
public class AverageNumber {

		    public static void main(String[] args) {
	        // Create a Scanner object for taking input from the user
	        Scanner scanner = new Scanner(System.in);

	        // Create an array of 15 numbers
	        int[] numbers = new int[15];
	         System.out.println("Please enter 15 numbers:");

	        // Loop to take input from the user
	        for (int i = 0; i < numbers.length; i++) {
	            System.out.print("Enter number " + (i + 1) + ": ");
	            numbers[i] = scanner.nextInt();
	        }

	        // Variable to store the sum of the numbers
	        int sum = 0;

	        // Loop through the array to calculate the sum
	        for (int number : numbers) {
	            sum += number;
	        }

	        // Calculate the average
	        double average = (double) sum / numbers.length;

	        // Print the average
	        System.out.println("The average of the numbers is: " + average);
	    }
	}

