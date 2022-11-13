import java.util.*;
class CO5
{
	public static void main(String args [])
	{
		ArrayList<Integer> list= new ArrayList<>();
		list.add(30);
		list.add(20);
		list.add(50);
		list.add(100);
		list.add(75);
		list.add(80);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("list after reverse sorting:");
		System.out.println(list);
	}
}
 /* OUTPUT= 
 list after reverse sorting:
[100, 80, 75, 50, 30, 20]
*/