/*9. Write a Java program to insert the specified element at the specified position in the linked list.*/

import java.util.*;
class CO9
{
	public static void main(String args[])
	{
	List<String> list_Strings=new ArrayList<String>();
	list_Strings.add("red");
	list_Strings.add("green");
	list_Strings.add("orange");
	list_Strings.add("blue");
	list_Strings.add("violet");
	System.out.println("list="+list_Strings);
	
	System.out.println(" add the Yellow color after the Red Color: " + list_Strings);
	list_Strings.add(1, "Yellow");
	System.out.println("list="+list_Strings);


	
	}
}
/*
list=[red, green, orange, blue, violet]
 add the Yellow color after the Red Color: [red, green, orange, blue, violet]
list=[red, Yellow, green, orange, blue, violet]
*/