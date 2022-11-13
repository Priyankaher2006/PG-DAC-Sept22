/*
17. You are given two string arrays, queries and words. For any string, s, f(s) is equal to the 
number of times the smallest lexicographical characters occurs in s. For each query, 
queries[i] count the total number of words where f(queries[i]) < f(word) and return the 
answer as an array.
Note: Both queries and words will only contain lowercase alphabetical characters and 
contain at most ten strings each.
Ex: Given the following queries and words…
queries = ["abc"], words = ["def"], return 0 ('a' and 'd' both occur once so f("abc") and 
f("def") are equal).
Ex: Given the following queries and words…
queries = ["abc"], words = ["ddef", "xxyz"], return 2 ('a' appears once and 'd' and 'x' 
appear twice so f("abc") is less than both f("ddef") and f("xxyz")).
*/
import java.util.*;
  
public class SP17AlphabeticalChar
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter queries");
		String str1 = sc.nextLine();
		
		String filtered1 = str1.replaceAll("\\[|\\]|\"| ","");
		
		String queries [] = filtered1.split(",");
		
		System.out.println("Enter words");
		String str2 = sc.nextLine();
		
		String filtered2 = str2.replaceAll("\\[|\\]|\"| ","");
		
		String words [] = filtered2.split(",");
		
		HashMap<Character,Integer> queriesMap=new HashMap<Character,Integer>();
		
		HashMap<Character,Integer> wordsMap=new HashMap<Character,Integer>();
		
		int totalWords = 0;
		int totalQueries = 0;
		for(int i = 0;i<queries.length;i++){
		    String temp = queries[i];
		    for(int j = 0; j<temp.length();j++){
		        char ch = temp.charAt(j);
		        if(queriesMap.containsKey(ch)){
		            int total = queriesMap.get(ch);
		            queriesMap.put(ch,++total);
		            if(totalQueries<total){
		                totalQueries = total;
		            }
		        }else{
		            queriesMap.put(ch,1);
		        }
		    }
		}
		
		for(int i = 0;i<words.length;i++){
		    String temp = words[i];
		    for(int j = 0; j<temp.length();j++){
		        char ch = temp.charAt(j);
		        if(wordsMap.containsKey(ch)){
		            int total = wordsMap.get(ch);
		            wordsMap.put(ch,++total);
		            if(totalWords<total){
		                totalWords = total;
		            }
		        }else{
		            wordsMap.put(ch,1);
		        }
		    }
		}
		
		if(totalWords==totalQueries){
		    System.out.println(0);
		}else if (totalQueries<totalWords){
		    System.out.println(totalWords);
		}else{
		    System.out.println(totalQueries);
		}
	}
}