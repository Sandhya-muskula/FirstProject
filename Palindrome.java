package condittionalstatements;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        //  the user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check if the number is a palindrome
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
	}
    
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        
        // Reverse the number
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        
        // Check if the original number is equal to the reversed number
        return originalNumber == reversedNumber;
    }
}


	


