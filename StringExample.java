package StringHandling;
import java.util.Scanner;
public class StringExample {
	public static void main(String[] args) {
		        Scanner Scanner = new Scanner(System.in);
		        
		        System.out.print("Enter a sentence: ");
		        String input = Scanner.nextLine();
		        
		        int upperCount = 0;
		        int lowerCount = 0;
		        
		        for (char c : input.toCharArray()) {
		            if (Character.isUpperCase(c)) {
		                upperCount++;
		            } else if (Character.isLowerCase(c)) {
		                lowerCount++;
		            }
		        }
		        
		        System.out.println("Number of uppercase characters: " + upperCount);
		        System.out.println("Number of lowercase characters: " + lowerCount);
		    }
		}
