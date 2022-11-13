/*14. Write a Java program to replace an element in a linked list.*/
import java.util.*;
class CO14
{
	public static void main(String args[])
	{
		List<String> list = new ArrayList<String>();
		list.add("Priya");
		list.add("Mahesh");
		list.add("Ramesh");
		list.add("Jack");
		list.add("Jill");
		
		System.out.println("List :- \n"+list);
		System.out.println("--------------------------------------------");
		//replacing element 
		list.set(1,"Rakesh");
		System.out.println("List after replacing element:- \n"+list);
	}
}
/*
List :-
[Priya, Mahesh, Ramesh, Jack, Jill]
--------------------------------------------
List after replacing element:-
[Priya, Rakesh, Ramesh, Jack, Jill]
*/