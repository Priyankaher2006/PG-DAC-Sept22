/*
16. You are given a list of words and asked to find the longest chain. Two words (or more) 
form a chain if a single letter can be added anywhere in a word, s, to form a word, t 
(where s and t are both words within the list of words you’re given). Return the length of 
the longest chain you can form.
Ex: Given the following words…
words = ["a", "ab", "abc"], return 3 ("a" can be transformed to "ab" by adding a "b" and 
"ab" can be transformed by adding a "c" giving a chain length of 3).
Ex: Given the following words…
words = ["a", "abc"], return 1 (both "a" or "abc" form their own chains of size one, they 
cannot be added together).
*/
import java.util.*;

public class SP16LongestChain
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String filtered = str.replaceAll("\\[|\\]|\"| ","");
		
		String data [] = filtered.split(",");
		int noOfChanges = 0;
		
		int max = 0;
		int maxIndex = 0;
		for(int i = 0;i < data.length; i++){
		   if(max<data[i].length()){
		       max = data[i].length();
		       maxIndex = i;
		   }
		}
		
		for(int i = 0;i<data.length;i++){
		    if(maxIndex!=i){
		        String temp = data[i];
		        noOfChanges += ( max - temp.length());
		    }
		}
		
		System.out.println(noOfChanges);
	}
}