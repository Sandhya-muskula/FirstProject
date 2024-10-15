package Polymorphism;
import java.util.*;
class Person
{
	String name;
	int age;
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
		
	}
}
class Employee1 extends Person 
{
    int empid;
    Employee1(String name,int age,int empid)
    {
    	
	    //assigning the values to the super class varaibles using the super keyword
	    super(name, age);
	    this.empid=empid;
	    System.out.println("------employee-----");
	    System.out.println("name: "+name);
	    System.out.println("age: "+age);
	    System.out.println("employee ID: "+empid);
    }
}
public class EmployeeExample 
{

	public static void main(String[] args)
	{
		//scanner class for input
		Scanner sc=new Scanner(System.in);
		//taking name of three employee
	    System.out.println("ENTER THE NAME OF THE EMPLOYEE :");
	    String name=sc.nextLine();
	    //taking age of three employee
	    System.out.println("ENTER THE AGE OF THE EMPLOYEE :");
	    //taking id of three employee
	    int age=sc.nextInt();
	    System.out.println("ENTER THE ID OF THE EMPLOYEE :");
	    int id=sc.nextInt();
	    //creating object for employee class
		Employee1 obj=new Employee1(name,age,id);

	}

}