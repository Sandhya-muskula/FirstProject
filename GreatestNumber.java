package condittionalstatements;
import java.util.Scanner;
public class GreatestNumber {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //  the user for three numbers
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        
        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();
        
        // Find the largest number
        int largest = findLargest(number1, number2, number3);
        
        // Display the largest number
        System.out.println("The largest number is: " + largest);
        }   
    public static int findLargest(int num1, int num2, int num3) {
        int largest = num1;  // Assume num1 is the largest initially
        
        if (num2 > largest) {
            largest = num2;
        }
        
        if (num3 > largest) {
            largest = num3;
        }
        
        return largest;
    }
}

	

