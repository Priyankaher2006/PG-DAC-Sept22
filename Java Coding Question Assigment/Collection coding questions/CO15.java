/*15. Write a Java program to iterate through all elements in a hash list.*/
import java.util.*;
class CO15
{
	public static void main(String args[])
	{
		//Create a empty hash set
		 HashSet<String> set = new HashSet<String>();
	    //use add() method to add values in the hash set
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		set.add("Six");
		Iterator<String> it = set.iterator();
		while(it.hasNext())
		{
			String s=it.next();
			System.out.println(s);
		}
	}
}