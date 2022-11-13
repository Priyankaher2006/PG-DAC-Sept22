//   Java Program to Illustrate Use of Abstract Class and Method

abstract class Shape{
	private double area;
	
	Shape(){ 
		area = 12.0;
	}
	
	abstract void calArea();
	
	void setArea(double area){
		this.area = area; 
	}
	
	double getArea(){
		return area;
	}
	
	void printArea(){
		System.out.println("Area: " + area);
	}
}

class Rectangle extends Shape{
	
	private double length;
	private double breadth;
	
	Rectangle(){
		length = 5;
		breadth = 15;
	}
	
	Rectangle(double length, double breadth){
		this();
		this.length = length;
		this.breadth = breadth;
	}
	
	void calArea(){
		double area = length * breadth;
		setArea(area);
	}
	
	void setLength(double length){
		this.length = length;
	}
	
	double getLength(){
		return length;
	}
	
	void setBreadth(double length){
		this.breadth = breadth;
	}
	
	double getBreadth(){
		return breadth;
	}

}

class CA02{
	public static void main(String[] args){
		
		Rectangle s = new Rectangle(12,15);
		System.out.println("Length: " + s.getLength());
		System.out.println("Breadth: " + s.getBreadth());
		s.calArea();
		double area = s.getArea();
	
		System.out.println("Area is: " + area);
	}
}
