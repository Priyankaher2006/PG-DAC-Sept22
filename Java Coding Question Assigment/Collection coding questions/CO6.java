/*6. Write a Java program of swap two elements in an array list.*/

import java.util.*;
public class CO6
{
	public static void main(String args[])
	{
		List<String> list_Strings=new ArrayList<String>();
		list_Strings.add("red");
		list_Strings.add("green");
		list_Strings.add("yellow");
		list_Strings.add("blue");
		list_Strings.add("violet");
		System.out.println(list_Strings);
	
	 System.out.println("Array list before Swap:");
          for(String a: list_Strings)
		  {
          System.out.println(a);
		  }
		  Collections.swap(list_Strings, 0, 2);
          System.out.println("Array list after swap:");
          for(String b: list_Strings)
		  {
          System.out.println(b);
		  }
	
	}
}
/*
[red, green, yellow, blue, violet]
Array list before Swap:
red
green
yellow
blue
violet
Array list after swap:
yellow
green
red
blue
violet
*/