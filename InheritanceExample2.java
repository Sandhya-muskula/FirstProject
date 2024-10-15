package Inheritance;
import java.util.Scanner;

/*---------Superclass--------*/
class Car 
{
	/*-------Member variable---------*/
    String carName;
    /*------Method in the superclass to start the engine-----*/
    void startEngine() 
    {
     System.out.println(carName + " engine starts.");
    }
    /*------- Method in the superclass to stop the engine------*/
    void stopEngine() 
    {
     System.out.println(carName + " engine stops.");
    }
}
/*---------Subclass--------*/
class Mahindra extends Car
{
	/*-----Member variable-----*/
    String model;
    /*------ Method in the subclass to display the model-----*/
    void showModel()
    {
     System.out.println("This is a Mahindra " + model + " model.");
    }
    void stopEngine()
    {
     System.out.println("The Mahindra " + model + " engine stops.");
    }
}
/*-----Main class-----*/
public class InheritanceExample2 
{
    public static void main(String[] args) 
    {
	    /*-----creating object of scanner class------*/
        Scanner sc = new Scanner(System.in);
        /*----- Creating an object of Mahindra subclass------*/
        Mahindra m = new Mahindra();
        /*------Taking the name of car from the user-----*/
        System.out.print("Enter the car name: ");
        m.carName = sc.nextLine();
        /*-----Taking model of car from the user------*/
        System.out.print("Enter the Mahindra model: ");
        m.model = sc.nextLine();
        /*-----Calling methods-----*/
        m.startEngine();   
        m.showModel();    
        m.stopEngine(); 
    }
}






