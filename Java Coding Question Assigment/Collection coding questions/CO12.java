/*12. Write a Java program to check if a particular element exists in a linked list.*/
import java.util.*;
class CO12
{
	public static void main(String args[])
	{
		List<String> list = new ArrayList<String>();
		list.add("Priya");
		list.add("Blue");
		list.add("Mahesh");
		list.add("Ramesh");
		list.add("Maroon");
		list.add("Jack");
		list.add("Jill");
		list.add("Red");
		
		
		boolean b =list.contains("Maroon");
		System.out.println("Element Exist: True/False---> "+b);
		boolean b1 =list.contains("Lavender");
		System.out.println("Element Exist: True/False---> "+b1);
		
	}
}
/*
Element Exist: True/False---> true
Element Exist: True/False---> false
*/