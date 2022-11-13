/*13. Write a Java program to compare two linked lists.*/
import java.util.*;
class CO13
{
	public static void main(String args[])
	{
		LinkedList<String> list= new LinkedList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");
		list.add("Six");
		
		LinkedList<String> list1= new LinkedList<String>();
		list1.add("One");
		list1.add("Two");
		list1.add("Three");
		list1.add("Four");
		list1.add("Five");
		list1.add("Six");
		
		boolean b = list.containsAll(list1);		//true
		System.out.println("list.containsAll(list1) : " + b);
		boolean b1 = list.equals(list1);		//true
		System.out.println("list.equals(list1) : " + b1);
	}
}

/*
list.containsAll(list1) : true
list.equals(list1) : true
*/