package Polymorphism;
/*------- defining a class for volume calculation------*/
class VolumeCalculator
{
	/*----- Method to calculate the volume of Cube ------*/
	public void calculateVolume(int side)
	{
		float volume = side * side * side;
		System.out.println("------- Cube -------");
		System.out.println(" Side : "+side+" cm");
		System.out.println(" Volume : "+volume+ "cubic cm");
	}
	
	/*----- Method to calculate volume of cuboid ------ */
	public void calculateVolume(int length,int width,int height)
	{
		float volume = length * width * height;
		System.out.println("------ Cuboid --------");
		System.out.println("Length : "+length+" cm");
		System.out.println("Width :"+width+" cm");
		System.out.println("Height : "+height+" cm");
		System.out.println("Volume : "+volume+" cubic cm");
	}
}
/*---------------------------------------------------------------*/
public class MethodOverloading {

	public static void main(String[] args) 
	{
		//Creating the object of VolumeCalculator class
		VolumeCalculator vc=new VolumeCalculator();
		vc.calculateVolume(10);   //cube
		vc.calculateVolume(10, 12, 20);//cuboid
	}
}
