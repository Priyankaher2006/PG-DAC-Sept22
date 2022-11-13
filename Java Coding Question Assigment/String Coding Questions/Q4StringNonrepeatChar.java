/*4. How to program to print the first non repeated character from String?*/

import java.util.*;
 
class Q4StringNonrepeatChar
{
	//Function which repeats first Nonrepeating character
	public static void FirstNonRepeat(String s)
	{

	for (int i = 0; i < s.length(); i++) 
	{

	  if (s.indexOf(s.charAt(i), s.indexOf(s.charAt(i)) + 1) == -1) 
	  {
		System.out.println("First non-repeating character is "+ s.charAt(i));
		break;
	  }
	}
	return;
	}
	public static void main (String[] args) 
	{
	String s = "cdackharghar";
	FirstNonRepeat(s);
	}
}
/*
First non-repeating character is d
*/