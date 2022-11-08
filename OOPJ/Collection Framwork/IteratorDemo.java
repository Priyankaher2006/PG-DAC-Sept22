import java.util.*;
class IteratorDemo
{
	public static void main(String args [])
	{
		List<String> list1=new ArrayList<String>();
		list1.add("Rohit");
		list1.add("Mukesh");
		list1.add("Radha");
		list1.add("Geeta");
		// Using for-each loop
		System.out.println("Using fo-each list1 elements");
		for(String s :list1)
		{
			System.out.println(s);
		}
		// Using Iterator 
		System.out.println("Using Iterator list1 elements");
		Iterator<String> it = list1.iterator();
		while(it.hasNext()) //checks next element  in container
		{
			String s = it.next();//returns ref to string s
			System.out.println(s);
		}
	}
}