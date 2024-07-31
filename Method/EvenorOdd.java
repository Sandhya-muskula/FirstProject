package Method;

import java.util.Scanner;
public class EvenorOdd {
    public static void main(String[] args) {
    	//object of scanner class
    	Scanner sc = new Scanner(System.in);
    	//taking input through keyboard
    	System.out.println("enter a number");
    
    	int number=sc.nextInt();
    	//checking whether a given number is odd or even
    	checkOddorEven(number);
    }
        //creating method
		public static void checkOddorEven(int number){
			if(number%2==0)
			{
				System.out.println("number is even");
			}
			else
			{
				System.out.println("number is odd");
			}
		}
}
