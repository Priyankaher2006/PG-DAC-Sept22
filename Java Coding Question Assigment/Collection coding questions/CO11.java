/*11. Write a Java program to display the elements and their positions in a linked list. */
import java.util.*;
class CO11
{
	public static void main(String args[])
	{
		List<String> list = new ArrayList<String>();
		list.add("Priya");
		list.add("Mahesh");
		list.add("Ramesh");
		list.add("Jack");
		list.add("Jill");
		System.out.println("List :- "+list);
		System.out.println("--------------------------------------------");
		for(int i=0;i<list.size();i++)
		{
			System.out.println("Element "+list.get(i)+" at index:"+i);
		}
	}
}
/*
List :- [Priya, Mahesh, Ramesh, Jack, Jill]
--------------------------------------------
Element Priya at index:0
Element Mahesh at index:1
Element Ramesh at index:2
Element Jack at index:3
Element Jill at index:4
*/