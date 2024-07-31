package Arrays;
import java.util.Scanner;
public class EvenNumbers {
			public static void main(String[] args) {
			/*creating scanner class*/
			Scanner sc=new Scanner(System.in);
			/*creating of array with size 10*/
			int[] numbers=new int[10];
	      System.out.println("enter the 10 elemennt");
	      /*for loop for taking 10 numbers*/
	for(int i=0;i<10;i++)
	{
		System.out.println("");
		
		numbers[i]=sc.nextInt();
		
		}
	/*printing those 10 numbers*/
	
	for(int i=0;i<10;i++)
	{
		System.out.println(numbers[i]);
	} 
	/*printing even numbers using if conditional statement and for loop*/
	System.out.println("the even numbers are");

	for(int i=0;i<10;i++)
	{
	if((numbers[i]%2)==0)
	{
		System.out.println(numbers[i]);
	} 
	}
			}
}
