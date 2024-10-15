package Polymorphism;
class Volume2
{
	/*------ Method to calculate volume of cone ------*/
	public void CalculateVolume(float height,int radius)
	{
		float volume = (3.14f * radius * radius * height)/3;
		System.out.println("------ Cone --------");
		System.out.println(" Radius : "+radius+" cm");
		System.out.println(" Height : "+height+" cm");
		System.out.println("Volume : "+volume+" cubic cm");
	}
	/*------ Method to calculate volume of cylinder ------*/
	public void calculateVolume(int radius,float height)
	{
		float volume = 3.14f * radius * radius * height;
		System.out.println("------ Cylinder --------");
		System.out.println(" Radius : "+radius+" cm");
		System.out.println(" Height : "+height+" cm");
		System.out.println("Volume : "+volume+" cubic cm");
	}
	/*----- Method to calculate the volume of sphere ------*/
	public void calculateVolume(float radius)
	{
		float volume = (4 * 3.14f * radius * radius * radius)/3;
		System.out.println("---------- Sphere --------");
		System.out.println(" Radius : "+radius+" cm");
		System.out.println(" Volume : "+volume+" cubic cm");
	}
	/*----- Method to calculate the volume of Cube ------*/
	public void calculateVolume(int side)
	{
		float volume = side * side * side;
		System.out.println("------- Cube -------");
		System.out.println(" Side : "+side+" cm");
		System.out.println(" Volume : "+volume+ "cubic cm");
	}
}
public class MethodOverloadingExample3 {

	public static void main(String[] args) {
		//Creating the object of VolumeCalculator class
		Volume2 vc=new Volume2();
		vc.calculateVolume(5,3.0f);//cone
		vc.calculateVolume(15, 14.0f);//cylinder
		vc.calculateVolume(7.0f); // sphere
		vc.calculateVolume(10);   //cube
	}
}
