/*21. How to convert Array to ArrayList in java ?*/
import java.util.*;
class Q21ArraytoArraylist
{
	public static void main(String args[])
	{
		String[] s={"Ramesh","Mahesh","Priya"};
		List<String> list = new ArrayList<String>();
		for(String s1:s)
		{
			list.add(s1);
		}
		System.out.println(list);
	}
}

/*
String[] s = {"Ramesh","Mahesh","Priya"};
 
List<String> al =new ArrayList<String>(Arrays.asList(geeks));
System.out.println(al);

// Adding some more values to the List.
al.add("Shashi");
al.add("Jack");

System.out.println(al);

*/