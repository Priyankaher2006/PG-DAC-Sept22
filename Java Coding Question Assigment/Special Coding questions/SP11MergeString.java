/*
11. Given two strings, s and t, merge the two strings together alternating characters starting 
with s.
Note: If one string is longer than the other, append the remaining characters of the longer 
string at the end of the merged string.
s = "abc", t = "def", return "adbecf".
*/
import java.util.*;

class SP11MergeString
{
	static String mergeString(String s, String t)
	{
		String ans = "";
		int i=0,j=0;
		while(i<s.length() && j<t.length())
		{
			ans += s.charAt(i);
			i++;
			ans+= t.charAt(j);
			j++;
		}
		while(i<s.length())
		{
			ans+=s.charAt(i++);
		}
		while(j<t.length())
		{
			ans+=s.charAt(j++);
		}
		return ans;
	}
	public static void main(String args[])
	{
		
		System.out.println("first String :");
		String s = "abc";
		System.out.println(s);
		System.out.println("second String :");
		String t = "def";
		System.out.println(t);
		String result = mergeString(s, t);
		System.out.println(s+" + "+t+" = "+result);
	}
}
/*
first String :
abc
second String :
def
abc + def = adbecf
*/
