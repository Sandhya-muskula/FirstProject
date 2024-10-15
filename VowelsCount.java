package StringHandling;
import java.util.Scanner;

public class VowelsCount 
{
    public static void main(String[] args) 
    {
    	//creating object for scanner class
        Scanner scanner = new Scanner(System.in);
        //  the user to enter a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        // Initialize vowel count
        int count = 0;
        // Loop through each character in the sentence
        for (int i = 0; i < sentence.length(); i++) 
        {
            char ch = sentence.charAt(i);
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            {
                count++;
            }
        }
        // Display the result
        System.out.println("Number of vowels in the sentence: " + count);
    }        
}
