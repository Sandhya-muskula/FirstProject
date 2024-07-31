package Method;
import java.util.Scanner;
public class AmountCalculator {
	/*method to calculate simple interest*/
	public static float calculatesimpleinterest(float principal,float rate,int time)
	{
		float si;
		/*calculating simple interest*/
		si=(principal+rate+time)/100;
		/*returning simple interest*/
		return si;
	}
    public static void main(String[] args) {
    	/*creating object of scanner class*/
    	Scanner sc=new Scanner(System.in);
    	/*variable to store principal,rate and time*/
    	float principle,rate;
    	int time;
    	/* input from keyboard */
    	System.out.println("enter priciplal(in Rs):");
    	Float principal = sc.nextFloat();
    	System.out.print("enter rate(in %):");
    	rate = sc.nextFloat();
    	System.out.println("enter time(in year):");
    	time=sc.nextInt();
    	/*------------------------------------------*/
    	/*--calculate simple interest*/
    	float interest = calculatesimpleinterest(principal,rate,time);
    	/* to calculate amount */
    	float amount = principal + interest;
    	System.out.println("---------------------");
    	System.out.println("Amount to be paid after charging simple interest:Rs" +amount);
	}

}
