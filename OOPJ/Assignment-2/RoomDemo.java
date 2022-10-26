/*
4. Create a class Room which will hold the height, width and breadth of the room in three fields. This class 
also has a method volume() to calculate the volume of this room. Create another class RoomDemo which will 
use the earlier class, create instances of rooms, and display the volume of room. 
*/

class Room
{
	static double height;
	static double width;
	static double breadth;
	Room()
	{}
	Room(double height,double width,double breadth)
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
}
class RoomDemo
{
	public static void main(String args[])
	{
		Room r1 = new Room();
		
		System.out.println("***********************************************************************************************");
		System.out.println();
		System.out.println(r1.getVolume(3.0,2.0,3.0));
	}
}