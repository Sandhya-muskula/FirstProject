package Method;
import java.util.Scanner;
public class Sumoftwonumbers {
	// Method to calculate the sum of two numbers
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
    	//creating scanner class
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        
                // Call the sum method and store the result
                int result = sum(num1, num2);

                //  result
                System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
            }
        }
        