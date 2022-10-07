/*
	Demonstration of creating a class

	property/data/state
	behivour/methods/functions
	instance/object
	
	Student class
	Data - int roll, String name, double marks;
	Method - printDetails, changeMarks, addDetails;
*/
import java.util.*;
public class Student
{
	static int roll;
	static String name;
	static double marks;
	
	Scanner s = new Scanner(System.in);
	
	Student()
	{
		roll=101;
		name="Jack";
		marks=85.5;
	}
	
	static void printDetails()
	{
		System.out.println("Roll no= "+roll);
		System.out.println("Name= "+name);
		System.out.println("Marks= "+marks);
	}
	
	static void addDeatils()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Roll no:-");
		roll = s.nextInt();
		System.out.println("Enter Name:-");
		name = s.next();
		System.out.println("Enter Marks");
		marks = s.nextDouble();
		printDetails();
	}
	
	static void changeMarks()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks");
		marks = sc.nextDouble();
		printDetails();
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();
		char ch='y';
		while(ch=='y')
		{
			System.out.println("---------------------");
			System.out.println("1. Print Details");
			System.out.println("2. Add deatils");
			System.out.println("3. changeMarks");
			System.out.println("---------------------");
			System.out.println();
			//Scanner s = new Scanner(System.in);	
			int num = sc.nextInt();
			switch(num)
			{
				case 1: 
						s1.printDetails();
						break;
					
				case 2: 
						addDeatils();
						break;
					
				case 3: 
						changeMarks();
						break;
					
				default:System.out.println(" ");
						break;
			}
			System.out.println("Do you want to continue? (y/n): ");
			ch=sc.next().charAt(0);
		}
		
		
	}
}