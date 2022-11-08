import java.util.*;
class CollectionFrameworkDemo
{
	static void display(List<String> list)
	{
		for(String s:list)
		{
			System.out.println(s);
		}
	}
	public static void main(String args[])
	{
		List<String> list1 = new ArrayList<String>();
		//container object created but its empty
		
		//add() method to add one element at a time
		list1.add("Taylor");
		list1.add("Fearless");
		list1.add("Speaknow");
		list1.add("Red");
		list1.add("1989");
		
		//Retrieving elements from collections using for each loop
		System.out.println("List1 elements: ");
		display(list1);
		
		List<String> list2 = new ArrayList<String>();
		list2.add("Reputation");
		list2.add("Lover");
		System.out.println("List2 elements: ");
		display(list2);
		
		//addAll() method to add one/more element at a time
		System.out.println("List1 elements after adding List2 elements:");
		list1.addAll(list2);
		display(list1);
		/*
		//clear() method to clear container
		list2.clear();
		System.out.println("List2 elements: ");
		display(list2);
		*/
		
		//contains(obj) returns true if the object is therer in the container
		boolean b = list1.contains("1989");
		System.out.println("list1.contains(\"1989\") : " + b);
		boolean c = list1.contains("Midnight");
		System.out.println("list1.contains(\"Midnight\") : " + c);
		
		List<String> list3 = new ArrayList<String>();
		list3.add("Folklore");
		list3.add("Evermore");
		System.out.println("List3 elements: ");
		display(list3);
		
		//containsAll(obj) returns true if the all objects form collection(list/set) is there in the container
		boolean d = list1.contains(list2);
		System.out.println("list1.contains(list2) : " + b);
		boolean e = list1.contains(list3);
		System.out.println("list1.contains(list3) : " + c);
		
		/*
		//remove() method to remove single element at atime
		list1.remove("Lover");
		System.out.println("List1 elements after removing Lover : ");
		display(list1);
		
		//removeAll() method to remove one/more element at a time
		list1.removeAll(list2);
		System.out.println("List1 elements after removing list2: ");
		display(list1);
		*/
		List<String> list4 = new ArrayList<String>();
		list4.add("Reputation");
		list4.add("Lover");
		list4.add("Folklore");
		list4.add("Evermore");
		/*
		list1.addAll(list4);
		display(list1);
		
		//retain() method  retains only common element between list1 & list3
		list1.retainAll(list3);
		System.out.println("List1 elements after retaining all list3 : ");
		display(list1);
		*/
		//size() number of element
		int size = list1.size();
		System.out.println("list1.size() : " + size);
		
		//toArray() method
		Object [] arr =  list1.toArray();
		System.out.println("Iterating arr after list1.toArray() : ");
		for(Object ob : arr)
		{
			System.out.print(ob);
		}
	}
}