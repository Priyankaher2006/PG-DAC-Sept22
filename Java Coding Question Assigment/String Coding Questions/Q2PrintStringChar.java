/*2. For example, if String is "Java" then the program should print "a"*/

class Q2PrintStringChar
{
	public static void main(String args[])
	{
		String s = "Java";
		  
        //Converts given string into character array  
		char string[] = s.toCharArray();
		System.out.println("Print character 'a': "+string[1]);
	}
}
/*
a
*/