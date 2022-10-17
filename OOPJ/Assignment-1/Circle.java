/*
	Write a program that takes radius of a circle as input. 
	Read the entered radius using Scanner class. 
	Then calculate and print the area and circumference of the circle
*/
import java.util.Scanner;

class Circle 
{
 
    public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
}