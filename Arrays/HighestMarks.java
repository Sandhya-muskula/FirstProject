package Arrays;
import java.util.Scanner;
public class HighestMarks {

	public static void main(String[] args) {
			// Create a Scanner object for taking input from the user
	        Scanner scanner = new Scanner(System.in);

	        // Number of students
	        int numberOfStudents = 20;

	        // Create an array to store the marks of 20 students
	        int[] marks = new int[numberOfStudents];
	        
	        //  enter marks for each student
	        System.out.println("Please enter the marks for " + numberOfStudents + " students (out of 100):");

	        // Loop to take input from the teacher
	        for (int i = 0; i < marks.length; i++) {
	            System.out.print("Enter marks for student " + (i + 1) + ": ");
	            marks[i] = scanner.nextInt(); // Read the next integer from the user
	        }

	        // Close the scanner as it is no longer needed
	        scanner.close();

	        // Variable to store the highest marks
	        int highestMarks = marks[0];

	        // Loop through the array to find the highest marks
	        for (int i = 1; i < marks.length; i++) {
	            if (marks[i] > highestMarks) {
	                highestMarks = marks[i];
	            }
	        }

	        // Print the highest marks
	        System.out.println("The highest marks are: " + highestMarks);
	}
}




