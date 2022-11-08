import java.util.*;

class CollectionFrameworkDemo1
{
	
	public static void main(String args[])
	{
		Set<String> list1 = new HashSet<String>();
		//container object created but its empty
		
		//add() method to add one element at a time
		list1.add("Taylor");
		list1.add("Fearless");
		list1.add("Speaknow");
		list1.add("Red");
		list1.add("1989");
		
		//Retrieving elements from collections using Iterator
		System.out.println("List1 elements: ");
		Iterator<String> it = list1.iterator();
		while(it.hasNext()) //checks next element  in container
		{
			String s = it.next();//returns ref to string s
			System.out.println(s);
		}
		
		List<String> list2 = new ArrayList<String>();
		list2.add("Reputation");
		list2.add("Lover");
		//Retrieving elements from collections using Iterator
		System.out.println("List2 elements: ");
		ListIterator<String> lit = list2.listIterator();
		while(lit.hasNext())
		{
			String s = lit.next();
			System.out.println(s);
		}
		
		//Retrieving elements from collections using Enumeration
		List<String> list3 = new ArrayList<String>();
		list3.add("Folklore");
		list3.add("Evermore");
		System.out.println("List3 elements: ");
		Enumeration<String> em = Collections.enumeration(list3);
		while(em.hasMoreElements())
		{
			String s = em.nextElement();
			System.out.println(s);
		}
		
	}
}