interface Shape
{
	
	double calArea();
}
class Rectangle implements Shape
{	
	double len,bre,area;
	
	Rectangle(){}
	
	Rectangle(double len, double bre)
	{
		this.len = len;
		this.bre = bre;
	}
	
	public double calArea()
	{
		  area = len*bre;
		  return area;
	}
}
class Circle implements Shape
{
	final double PI = 3.14159;
	double radius, area;
	
	Circle(){}
	
	Circle(double radius)
	{
		this.radius  = radius;
	}
	
	public double calArea()
	{
		area = PI*radius*radius;
		return area;
	}
}
class Square implements Shape
{
	double side, area;
	
	Square(){}
	
	Square(double side)
	{
		this.side = side;
	}
	public double calArea()
	{
		area = side*side;
		return area;
	}
}
class InterfaceDemo 
{
		public static void main(String []args)
		{
			Rectangle rc = new Rectangle(5,4);
		
			System.out.println("Rectangle Area: "+rc.calArea());
			
			Circle cr = new Circle(5);
			
			System.out.println("Circle Area: "+cr.calArea());
			
			Square sq = new Square(4);
			
			System.out.println("Rectangle Area: "+sq.calArea());
			
			
		}
}