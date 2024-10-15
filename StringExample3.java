package StringHandling;
import java.util.Scanner;
public class StringExample3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input the first string
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();
        // Input the second string
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();
        // Checking if the strings are equal
        if (firstString.equals(secondString)) {
            System.out.println("Both strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }
    }
        
}
