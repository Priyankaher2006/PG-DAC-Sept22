/*23. Write a Java program to convert a priority queue to an array containing all of the elements of the queue*/
import java.util.*;
public class CO23
{
	public static void main(String[] args) 
	{
		PriorityQueue<String> pq1 = new PriorityQueue<String>();  
  
        pq1.add("Red");
        pq1.add("Green");
        pq1.add("Black");
        pq1.add("White");
		System.out.println("Original Priority Queue: "+pq1);
   
    
		List<String> array_list = new ArrayList<String>(pq1);
		System.out.println("Array containing all of the elements in the queue: "+array_list);
 }
}
/*
Original Priority Queue: [Black, Red, Green, White]
Array containing all of the elements in the queue: [Black, Red, Green, White]
*/