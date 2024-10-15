package StringHandling;
import java.util.Scanner;
public class StringExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the first string
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();
        
        // Input the second string
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();
        
        // Combine the two strings
        String combinedString = firstString + secondString;
        
        // Display the combined result
        System.out.println("Combined string: " + combinedString);
        
    }
}
