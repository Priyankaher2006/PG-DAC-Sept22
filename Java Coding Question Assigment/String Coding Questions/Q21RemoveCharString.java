/*
21. You need to write a Java method that will accept a String and a character to be removed and return a String, 
which doesn't has that character e.g remove(String word, char ch).
*/
class Q21RemoveCharString
{
	static void removeChar(String s, char c)
	{
		int j, count = 0, n = s.length();
		char []t = s.toCharArray();
		for (int i = j = 0; i < n; i++)
		{
			if (t[i] != c)
				t[j++] = t[i];
			else
				count++;
		}	
		while(count > 0)
		{
			t[j++] = '\0';
			count--;
		}
		System.out.println(t);
	}

	public static void main(String[] args)
	{
		String s = "javaprogramming";
		removeChar(s, 'g');
	}
}
/*javaprorammin*/