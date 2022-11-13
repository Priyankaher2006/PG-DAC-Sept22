/*
15. Given a string, s, return the length of the longest substring that contains every vowel 
occurring an even number of times.
Note: You may assume s only contains lowercase alphabetical characters and the vowels 
you must account for are a, e, i, o, and u.
Ex: Given the following string s…
s = "aeiouaeioua", return 10 (the last 'a' cannot count).
Ex: Given the following string s…
s = "bbb", return 3 (all vowels occur an even number of times, i.e. zero times each).
*/

import java.util.*;

class SP15LongestSubstring
{
    public static int findLongestSubstring(String s) 
	{
        int[] map = new int[32];
        Arrays.fill(map, -1);
        int state = 0;
        map[state] = 0;
        int maxLength = 0;
        int length = s.length();
        for (int i = 0; i < length; i++) 
		{
            char c = s.charAt(i);
            if (c == 'a')
                state ^= (1 << 0);
            else if (c == 'e')
                state ^= (1 << 1);
            else if (c == 'i')
                state ^= (1 << 2);
            else if (c == 'o')
                state ^= (1 << 3);
            else if (c == 'u')
                state ^= (1 << 4);
            if (map[state] >= 0)
                maxLength = Math.max(maxLength, i + 1 - map[state]);
            else
                map[state] = i + 1;
        }
		System.out.println(maxLength);
        return maxLength;
    }
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		
		String str = sc.next();
		
		findLongestSubstring(str);
	}
}