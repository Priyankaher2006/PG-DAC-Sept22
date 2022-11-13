/*22. How to convert Array to TreeSet in java ? */
import java.util.*;
class Q22ArrayToTreeSet 
{
    public static void main(String args[]) 
	{
        
		Integer[] n = {10,20,30,40,50,60,70,80};
		/*First we convert an Array to List using
		  Arrays.asList(), then pass the list as an
		  argument to the constructor of TreeSet */
		List<Integer> list = Arrays.asList(n);
		Set<Integer> set = new TreeSet<Integer>(list);
		// Show Set elements
		System.out.println("The TreeSet elements are :");
		for(Integer num : set)
			System.out.println(num);
  }
}