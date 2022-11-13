/*
10. Given a string representing your stones and another string representing a list of jewels, 
return the number of stones that you have that are also jewels.
Ex: Given the following jewels and stones...
jewels = "abc", stones = "ac", return 2
jewels = "Af", stones = "AaaddfFf", return 3
jewels = "AYOPD", stones = "ayopd", return 0
*/
import java.util.*;

class SP10MatchChar
{
	public static int numJewelsInStones(String jewels, String stones) 
	{
        int count = 0;
        for(int i=0; i<stones.length();i++)
		{
            for(int j=0;j<jewels.length();j++)
			{
                if(stones.charAt(i) == jewels.charAt(j))
                    count++;
            }
        }
        return count;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
		String jewels = sc.next();
		System.out.println("Enter second string");
		String stones = sc.next();
		System.out.println(numJewelsInStones(jewels, stones));
	}
}