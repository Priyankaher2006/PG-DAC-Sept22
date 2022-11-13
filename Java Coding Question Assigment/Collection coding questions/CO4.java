import java.util.ArrayList;
import java.util.Collections;
class CO4

{
	public static void main(String args [])
	{
		ArrayList<Integer> list= new ArrayList<>();
		list.add(5);
		list.add(15);
		list.add(50);
		list.add(2);
		list.add(10);
		Collections.sort(list);
		System.out.println("list after sorting the elements : ");
		System.out.println(list);
	}
}