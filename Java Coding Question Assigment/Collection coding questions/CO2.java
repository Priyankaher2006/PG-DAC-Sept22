import java.util.*;
class CO2
{
	public static void main (String args [])
	{
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		list.add(0, 5);
		System.out.println("list after adding a new element add first position;");
		System.out.println(list);
	}
}

/* OUTPUT= 
[10, 20, 30]
list after adding a new element add first position;
[5, 10, 20, 30]
*/