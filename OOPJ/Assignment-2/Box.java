/*
	6. Write a class Box that with three member-variables  height,  width and  breadth. Write suitable 
constructors to initialize them. Add functions like  getVolume and  getArea  that will return volume and surface 
area respectively. Instantiate two arbitrary boxes and then print their volume and surface area.
volume = l*w*h
surface area = 2*(l*w + l*h + w*h)
*/
import java.util.*;
class Box
{
	static double height;
	static double width;
	static double breadth;
	Box()
	{}
	Box(double height,double width,double breadth)
	{
		this.height=height;
		this.width=width;
		this.breadth=breadth;
	}
	double getVolume(double height, double width, double breadth)
	{
		double volume = (height * width * breadth);
		return volume;
	}
	double getArea(double height, double width, double breadth)
	{
		double area = 2*((height * width)+ (height * breadth) + (width * breadth));
		return area;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double height = sc.nextDouble();
		double width = sc.nextDouble();
		double breadth = sc.nextDouble();
		Box box = new Box();
		System.out.println("***********************************************************************************************");
		System.out.println();
		
		System.out.print("Area of Box-1: ");
		System.out.println(box.getArea(height,width,breadth));
		System.out.print("Voulum of Box-1: ");
		System.out.println(box.getVolume(height,width,breadth));
		System.out.println();
		
		System.out.println("***********************************************************************************************");
		System.out.println();
		
		double height1 = sc.nextDouble();
		double width1 = sc.nextDouble();
		double breadth1 = sc.nextDouble();
		Box box1 = new Box();
				
		System.out.print("Area of Box-2: ");
		System.out.println(box1.getArea(height1,width1,breadth1));
		System.out.print("Voulum of Box-2: ");
		System.out.println(box1.getVolume(height1,width1,breadth1));
		System.out.println();
		
		System.out.println("***********************************************************************************************");
		System.out.println();
	}
}