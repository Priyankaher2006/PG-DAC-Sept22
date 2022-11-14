import java.util.*;
class InitialOfName
{
	static void  nameintials(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')//string should be alphabet
			{
				if(i==0)//first letter i.e initial
				{
					System.out.print(s.charAt(i)+" ");
				}
				 else if (s.charAt(i-1)==' ')
				{
					System.out.print(s.charAt(i)+" ");
				}
			}	
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		nameintials(s);

	}
}
/*
else if (s.charAt(i-1)==' ')
	we are checking for blank space eg:- 
Jack Jill :- blank space is at index-4; so it will check for index comes after blank space i.e its new word in this case its 5
	(s.charAt(i-1)==' ') means 5-1=4 is ==' ' that is i is first letter of 2nd word.			
*/